############################## Makefile for building: Guolice ##############################
#
# Targets marked as phony have been added for convenience in case the user would build
# step-by-step (generating the lexer and parser code from Antlr, then building the lexer and
# parser, then linking). They basically do the same tasks of the intermediate targets that
# the "all" target depends on, but they are treated as independent steps. In particular, if the
# user chooses the target "compile", for example, it will compile the source and place it in the
# bin directory, whereas if he chooses main.o, it will create it without placing it in
# bin (all the placement would be done at the end of the "all" rule; in this manner we can
# think of compile as one independent targets whereas "main.o" is an intermediate target).
# The library to be linked to is assumed to be for Linux 32-bit. The phony targets are:
#
#     antlr-generate           generate lexer and parser
#     compile                  compile source into object files
#     link                     link object with library
#     build                    build a specific configuration
#     clean                    remove built files
#     all                      build everything
#     help                     print help message
#  

# Debug configuration
ARTIFACT_DIR_Debug = dist/Debug
ARTIFACT_NAME_Debug = Guolice
ARTIFACT_PATH_Debug = dist/Debug/Guolice

# Release configuration
ARTIFACT_DIR_Release = ./dist/Release/
ARTIFACT_NAME_Release = Guolice
ARTIFACT_PATH_Release = ./dist/Release/Guolice


BUILDFLAG = 
ifeq ($(findstring debug,$(MAKECMDGOALS)),debug)
    BUILDFLAG = $(DBGFLAG)
endif
 
ifeq ($(findstring release,$(MAKECMDGOALS)),release)
    BUILDFLAG = -O3
endif

####### Compiler, tools and options
JAVA           = java
ANTLR          = org.antlr.Tool
JAVAFLAGS      = -cp ./antlr/antlr-3.2.jar
CPP            = g++
CPPFLAGS       = -pipe -Wall -W
DBGFLAG        = -g
INCPATH        = -I. -I./antlr/libantlr3c-3.2/include -I./include -I./antlr/libantlr3c-3.2/
LIBS           = -L./antlr/libantlr3c-3.2/.libs -lantlr3c
COPY           = cp -f
LINK           = g++
COPY_FILE      = $(COPY)
COPY_DIR       = $(COPY) -r
DEL_FILE       = rm -f
DEL_DIR        = rm -r -f
MOVE           = mv -f
CHK_DIR_EXISTS = test -d
MKDIR          = mkdir -p
DOC            = doxygen


####### Output directory
OBJECTS_DIR   = ./bin
ARTIFACT_DIR  = ./dist
DOC_DIR       = ./doc

####### Files
GRAMMARFILE   = Guolice.g
SOURCES       = ./src/GuoliceLexer.c ./src/GuoliceParser.c ./src/ParseTree.cpp ./src/Node.cpp ./src/FunctionNode.cpp ./src/main.c
ANTLROUTPUT_H = GuoliceLexer.h GuoliceParser.h
ANTLROUTPUT_C = GuoliceLexer.c GuoliceParser.c Guolice.tokens
OBJECTS       = GuoliceLexer.o GuoliceParser.o ParseTree.o Node.o FunctionNode.o main.o
TARGET        = Guolice
DOXYFILE      = DoxyFile



all : $(TARGET)
	$(CHK_DIR_EXISTS) $(OBJECTS_DIR)
	$(CHK_DIR_EXISTS) $(OBJECTS_DIR)
	#$(DOC) $(DOXYFILE)

$(PCONFIG):
	$(AG) --gen_config -o $@


$(TARGET) : $(OBJECTS)
	$(MKDIR) $(OBJECTS_DIR)
	$(MKDIR) $(ARTIFACT_DIR)
	$(LINK) -o $@ $(BUILDFLAG) $(LIBS) $(OBJECTS)
	$(MOVE) $(ANTLROUTPUT_C) ./src
	$(MOVE) $(ANTLROUTPUT_H) ./include
	$(MOVE) $(OBJECTS) $(OBJECTS_DIR)
	$(MOVE) $@ $(ARTIFACT_DIR)

%.o : %.c %.h 
	$(CPP) -c $(BUILDFLAG) $(CPPFLAGS) $(INCPATH) $< -o $@
	
GuoliceParser.o : GuoliceParser.c ./include/Node.h 
	$(CPP) -c $(BUILDFLAG) $(CPPFLAGS) $(INCPATH) $< -o $@

ParseTree.o : ./src/ParseTree.cpp ./include/ParseTree.h
	$(CPP) -c $(BUILDFLAG) $(CPPFLAGS) $(INCPATH) $< -o $@

Node.o : ./src/Node.cpp ./include/Node.h
	$(CPP) -c $(BUILDFLAG) $(CPPFLAGS) $(INCPATH) $< -o $@
	
FunctionNode.o : ./src/FunctionNode.cpp ./include/FunctionNode.h
	$(CPP) -c $(BUILDFLAG) $(CPPFLAGS) $(INCPATH) $< -o $@
	
main.o : ./src/main.c ./include/Guolice.h
	$(CPP) -c $(BUILDFLAG) $(CPPFLAGS) $(INCPATH) $< -o $@
 
GuoliceLexer.c GuoliceLexer.h GuoliceParser.c GuoliceParser.h Guolice.tokens : $(GRAMMARFILE)
	$(JAVA) $(JAVAFLAGS) $(ANTLR) $<

debug : all
	$(MKDIR) $(ARTIFACT_DIR_Debug)
	$(MOVE) $(ARTIFACT_DIR)/$(TARGET) $(ARTIFACT_PATH_Debug)

release : all
	$(MKDIR) $(ARTIFACT_DIR_Release)
	$(MOVE) $(ARTIFACT_DIR)/$(TARGET) $(ARTIFACT_PATH_Release)

############# Generate Lexer and Parser Target #############
. PHONY : antlr-generate

antlr-generate : $(GRAMMARFILE)
	$(JAVA) $(JAVAFLAGS) $(ANTLR) $<
	$(MOVE) $(ANTLROUTPUT_C) ./src
	$(MOVE) $(ANTLROUTPUT_H) ./include
	
###################### Compile Target ######################
. PHONY : compile

compile : $(SOURCES) GuoliceLexer.h GuoliceParser.h Guolice.tokens
	$(MKDIR) $(OBJECTS_DIR)
	$(CPP) -c $(CPPFLAGS) $(INCPATH) $(SOURCES) -o $(SOURCES:.c=.o)
	$(MOVE) $(<:.c=.o) $(OBJECTS_DIR)
	
####################### Link Target ########################
. PHONY : link

link : $(OBJECTS)
	$(MKDIR) $(ARTIFACT_DIR)
	$(LINK) -o $(TARGET) $(LIBS) $(OBJECTS)
	$(MOVE) $(TARGET) $(ARTIFACT_DIR)

####################### Doc Target #######################
. PHONY : doc

doc :
	$(DOC) $(DOXYFILE)

###################### Aspect Target#######################

aspect:
	$(MKDIR) $(ARTIFACT_DIR)
	cp $(SOURCES) ./GuoliceAspect
	cp -r ./include  ./GuoliceAspect
	cd ./GuoliceAspect; make
	
	
	
####################### Clean Target #######################
. PHONY : clean

clean :
	$(DEL_DIR) $(OBJECTS_DIR) $(ARTIFACT_DIR) $(DOC_DIR)
	cd ./GuoliceAspect; make clean
	clear

####################### Help Option ########################
. PHONY : help

help :
	@echo "Makefile for Guolice; must be invoked from the root directory that contains src, bin, ..."
	@echo "Available targets: all, antlr-generate, compile, link, clean, and help."
	@echo
	@echo "- all will build all the necessary files needed to run the program against the input file written in Guolice."
	@echo
	@echo "- antlr-generate creates the lexer and parser out of your grammar file using the Antlr jar tool."
	@echo
	@echo "- compile will preprocess, compile and assemble the source files to object files and put them in the bin directory."
	@echo
	@echo "- link will link the generated object files against the runtime library to produce a single executable file in the dist directory."
	@echo
	@echo "- clean will delete all generated object files and program generated from source."
	@echo
	@echo "- help will display this message."
