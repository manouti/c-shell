ARCHIVER = ar
CPP      = g++
TARGET_STATIC  = libtranslate.a
TARGET_SHARED  = libtranslate.so
CPPFLAGS       = -pipe #-Wall -W

SOURCES       = ${wildcard ./*.cpp}
OBJECTS       = $(SOURCES:.cpp=.o)

INCPATH        = -I. -I../../third/antlr/libantlr3c-3.2/include -I../../include -I../../third/antlr/libantlr3c-3.2/ -I../../src/grmr
LIBS           = -L../../third/antlr/libantlr3c-3.2/.libs -lantlr3c


ifeq ($(findstring shared_lib,$(MAKECMDGOALS)),shared_lib)
    BUILDFLAG += -fPIC
endif

shared_lib : $(TARGET_SHARED)

static_lib : $(TARGET_STATIC)



$(TARGET_STATIC) :  $(OBJECTS)
	$(ARCHIVER) rcs $@ $<
	mv -f $@ ../../lib
	mkdir -p ../../.objs
	mv -f $(OBJECTS) ../../.objs
	
$(TARGET_SHARED) :  $(OBJECTS) 
	$(CPP) $(BUILDFLAG) $(CPPFLAGS) $(INCPATH) -shared -Wl,-soname,libtranslate.so -o libtranslate.so $(OBJECTS)
	mv -f $@ ../../lib
	mkdir -p ../../.objs
	mv -f $(OBJECTS) ../../.objs
	
%.o : %.cpp
	$(CPP) -c $(BUILDFLAG) $(CPPFLAGS) $(INCPATH) $< -o $@
	
