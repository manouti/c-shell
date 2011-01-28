ACFLAGS 	?= -v1 -k
AC      	?= ../../../third/aspect/ac++
AG      	?= ../../../third/aspect/ag++
PCONFIG 	?= ../../../third/aspect/puma.config
INCPATH 	?= -I. -I../../../third/antlr/libantlr3c-3.2/include/ -I../../../third/antlr/libantlr3c-3.2/ -I./include
Cfiles		?= ${wildcard ./*.cpp}
Cleanfiles	?= ${wildcard ./*.cc} 
CCfiles		?= $(Cfiles:.cpp=.cc)
dollar		?= $

all:	$(CCfiles)
	mv GuoliceLexer.c GuoliceLexer.cc
	mv GuoliceParser.c GuoliceParser.cc
	$(AC) $(ACFLAGS) --config $(PCONFIG) $(INCPATH) -p . -d ../GuoliceAspect-out
	cp MakeToCopy ../GuoliceAspect-out/Makefile
	cd ../GuoliceAspect-out; make

$(PCONFIG):
	$(AG) --gen_config -o $@

clean:
	rm -f $(Cleanfiles)
	rm  -r ./include
	rm -r ../GuoliceAspect-out
	mkdir -p ../GuoliceAspect-out



%.cc : %.cpp
	mv $< $@
