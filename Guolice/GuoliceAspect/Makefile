ACFLAGS ?= -v1 -k
AC      ?= ../lib/ac++
AG      ?= ../lib/ag++
PCONFIG ?= ../lib/puma.config
INCPATH ?= -I. -I../antlr/libantlr3c-3.2/include/ -I../antlr/libantlr3c-3.2/ -I./include
files	?= GuoliceLexer.cc GuoliceParser.cc ParseTree.cc Node.cc FunctionNode.cc main.cc 
dollar	?= $

all:
	rename 's/.cpp'$(dollar)'/.cc/' *.cpp; 
	mv GuoliceLexer.c GuoliceLexer.cc
	mv GuoliceParser.c GuoliceParser.cc
	mv main.c main.cc
	$(AC) $(ACFLAGS) --config $(PCONFIG) $(INCPATH) -p . -d ../GuoliceAspect-out
	cp MakeToCopy ../GuoliceAspect-out/Makefile
	cd ../GuoliceAspect-out; make

$(PCONFIG):
	$(AG) --gen_config -o $@

clean:
	rm -f $(files)
	rm -r ../GuoliceAspect-out
	mkdir -p ../GuoliceAspect-out
