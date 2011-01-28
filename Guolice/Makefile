############################## Makefile for building: Guolice ##############################
#
# Targets marked as phony have been added for convenience in case the user would build
# step-by-step (generating the lexer and parser code from Antlr, then building the lexer and
# parser, then linking). They basically do the same tasks of the intermediate targets that
# the "all" target depends on, but they are treated as independent steps. In particular, if the
# user chooses the target "compile", for example, it will compile the source and place it in the
# .objs directory, whereas if he chooses main.o, it will create it without placing it in
# .objs (all the placement would be done at the end of the "all" rule; in this manner we can
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
ARTIFACT_DIR_Debug = bin/Debug
ARTIFACT_PATH_Debug = bin/Debug/Guolice

# Release configuration
ARTIFACT_DIR_Release = ./bin/Release/
ARTIFACT_PATH_Release = ./bin/Release/Guolice

ARTIFACT_DIR_64 = ./bin/build64
ARTIFACT_PATH_64 = ./bin/build64/Guolice

BUILDFLAG = 
ifeq ($(findstring debug,$(MAKECMDGOALS)),debug)
    BUILDFLAG += $(DBGFLAG)
endif
 
ifeq ($(findstring release,$(MAKECMDGOALS)),release)
    BUILDFLAG += -O3
endif

BUILDFLAG = 
ifeq ($(findstring 32b,$(MAKECMDGOALS)),32b)
    BUILDFLAG += -m32
endif
 
ifeq ($(findstring 64b,$(MAKECMDGOALS)),64b)
    BUILDFLAG += -m64
endif

####### Compiler, tools and options #######
JAVA           = java
ANTLR          = org.antlr.Tool
JAVAFLAGS      = -cp ./third/antlr/antlr-3.2.jar
CPP            = g++
CPPFLAGS       = -pipe #-Wall -W
DBGFLAG        = -g
INCPATH        = -I. -I./third/antlr/libantlr3c-3.2/include -I./include -I./third/antlr/libantlr3c-3.2/ -I./src/grmr
LIBS           = -L./third/antlr/libantlr3c-3.2/.libs -lantlr3c
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
MV           = mv 
####### Source directories #######
GRMR_DIR      = ./src/grmr
GRAPH_DIR     = ./src/graph
MAIN_DIR      = ./src/guolice
VISUAL_DIR    = ./src/hr
TRANSLATE_DIR = ./src/translate
CHECK_DIR     = ./src/check

####### Output directories #######
OBJECTS_DIR   = ./.objs
ARTIFACT_DIR  = ./bin
DOC_DIR       = ./doc

####### Files #######
SOURCES       		= ${wildcard $(CHECK_DIR)/*.cpp} ${wildcard $(GRAPH_DIR)/*.cpp} 
MAINSOURCES		= $(SOURCES) ${wildcard $(MAIN_DIR)/*.cpp} 
TRANSLATESOURCES 	= $(SOURCES) ${wildcard $(TRANSLATE_DIR)/*.cpp} $(MAIN_DIR)/Driver.cpp
ASPECTSOURCES 		= $(MAINSOURCES) ${wildcard $(GRMR_DIR)/*.c} 
ANTLROUTPUT_H 		= $(GRMR_DIR)/GuoliceLexer.h $(GRMR_DIR)/GuoliceParser.h
OBJECTS       		= GuoliceLexer.o GuoliceParser.o $(MAINSOURCES:.cpp=.o)
TRANSLATEOBJECTS 	= GuoliceLexer.o GuoliceParser.o $(TRANSLATESOURCES:.cpp=.o);
GRAMMARFILE   		= $(GRMR_DIR)/Guolice.g
TARGET        		= Guolice
DOXYFILE      		= DoxyFile

DIRECTORIES = ${wildcard ./src/*} .

all :  $(TARGET) 
	$(CHK_DIR_EXISTS) $(OBJECTS_DIR)
	$(CHK_DIR_EXISTS) $(OBJECTS_DIR)
	#$(DOC) $(DOXYFILE)
	cd $(GRMR_DIR) ; make;
	cd $(GRAPH_DIR) ; make;
	cd $(MAIN_DIR) ; make;
	cd $(TRANSLATE_DIR) ; make;
	cd $(CHECK_DIR) ; make;
	


	cd bin; export LD_LIBRARY_PATH=../third/antlr/libantlr3c-3.2/.libs:$(LD_PATH); ./Guolice
	

$(TARGET) : $(OBJECTS)
	$(MKDIR) $(OBJECTS_DIR)
	$(MKDIR) $(ARTIFACT_DIR)
	$(LINK) -o $@ $(BUILDFLAG) $(INCPATH) $(LIBS) $(OBJECTS)
	$(MOVE) $(OBJECTS) $(OBJECTS_DIR)
	$(MOVE) $@ $(ARTIFACT_DIR)


	
%.o : %.cpp
	$(CPP) -c $(BUILDFLAG) $(CPPFLAGS) $(INCPATH) $< -o $@

%.o : %.c
	$(CPP) -c $(BUILDFLAG) $(CPPFLAGS) $(INCPATH) $< -o $@

GuoliceLexer.o : $(GRMR_DIR)/GuoliceLexer.c
	$(CPP) -c $(BUILDFLAG) $(CPPFLAGS) $(INCPATH) $< -o $@

GuoliceParser.o : $(GRMR_DIR)/GuoliceParser.c
	$(CPP) -c $(BUILDFLAG) $(CPPFLAGS) $(INCPATH) $< -o $@




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
	$(DOC) $(DOC_DIR)/$(DOXYFILE)

###################### Aspect Target#######################

aspect: $(GRAMMARFILE)
	$(JAVA) $(JAVAFLAGS) $(ANTLR) $<
	$(MKDIR) $(ARTIFACT_DIR)
	cp $(ASPECTSOURCES) $(VISUAL_DIR)/viz_aspect
	cp -r ./include  $(VISUAL_DIR)/viz_aspect
	cp $(ANTLROUTPUT_H) $(VISUAL_DIR)/viz_aspect/include
	cd $(VISUAL_DIR)/viz_aspect; make
	cd ./bin; export LD_LIBRARY_PATH=../third/antlr/libantlr3c-3.2/.libs:$(LD_PATH); ./GuoliceGraph ; dot -Tsvg Graph.dot -o G.svg
		
####################### Translate Target #######################

translate: $(TRANSLATEOBJECTS)
	$(MKDIR) $(OBJECTS_DIR)
	$(MKDIR) $(ARTIFACT_DIR)
	$(LINK) -o $@ $(BUILDFLAG) $(INCPATH) $(LIBS) $(TRANSLATEOBJECTS)
	mv $< $(OBJECTS_DIR)
	$(MOVE) $@ $(ARTIFACT_DIR)
	cd bin; export LD_LIBRARY_PATH=../third/antlr/libantlr3c-3.2/.libs:$(LD_PATH); ./translate

	
####################### Clean Target #######################
. PHONY : clean

clean :
	$(DEL_DIR) $(OBJECTS_DIR) $(ARTIFACT_DIR)
	cd $(VISUAL_DIR)/viz_aspect; make clean
	clear

####################### Help Option ########################
. PHONY : help

help :
	@echo $(SOURCES)
	@echo $(OBJECTS)
	@echo $(DEPENDS)
	@echo "Makefile for Guolice; must be invoked from the root directory that contains src, .objs, ..."
	@echo "Available targets: all, antlr-generate, compile, link, clean, and help."
	@echo
	@echo "- all will build all the necessary files needed to run the program against the input file written in Guolice."
	@echo
	@echo "- antlr-generate creates the lexer and parser out of your grammar file using the Antlr jar tool."
	@echo
	@echo "- compile will preprocess, compile and assemble the source files to object files and put them in the .objs directory."
	@echo
	@echo "- link will link the generated object files against the runtime library to produce a single executable file in the bin directory."
	@echo
	@echo "- clean will delete all generated object files and program generated from source."
	@echo
	@echo "- help will display this message."

