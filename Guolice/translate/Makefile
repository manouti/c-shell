files = ../src/ParseTree.cpp ../src/Node.cpp nodefactory.cpp translator.cpp StandardGraphFactory.cpp Visitors.cpp


ARCHIVER = ar
CPP      = g++
TARGET_STATIC  = libtranslate.a
TARGET_SHARED  = libtranslate.so
CPPFLAGS       = -pipe #-Wall -W

SOURCES       = ${wildcard ./*.cpp}
OBJECTS       = $(SOURCES:.cpp=.o)

INCPATH        = -I. -I../third/antlr/libantlr3c-3.2/include -I../include -I../third/antlr/libantlr3c-3.2/ -I../src/grmr
LIBS           = -L../third/antlr/libantlr3c-3.2/.libs -lantlr3c


ifeq ($(findstring shared_lib,$(MAKECMDGOALS)),shared_lib)
    BUILDFLAG += -fPIC
endif

all:
	clear
	g++ -o translateGraph $(files) -I../include -I.
	./translateGraph


static_lib : $(TARGET_STATIC)

shared_lib : $(TARGET_SHARED)

$(TARGET_STATIC) :  $(OBJECTS)
	$(ARCHIVER) rcs $@ $<
	mv -f $@ ../lib
	mkdir -p ../.objs
	mv -f $(OBJECTS) ../.objs
	
$(TARGET_SHARED) :  $(OBJECTS) 
	$(CPP) -shared -Wl,-soname,libtranslate.so.1 -o libtranslate.so.1.0.1 $(OBJECTS)
	mv -f $@ ../lib
	mkdir -p ../.objs
	mv -f $(OBJECTS) ../.objs
	
%.o : %.cpp
	$(CPP) -c $(BUILDFLAG) $(CPPFLAGS) $(INCPATH) $< -o $@
	