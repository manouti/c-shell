ARCHIVER = ar
CPP      = g++
TARGET   = libgrmr.a
CPPFLAGS       = -pipe #-Wall -W

SOURCES       = ${wildcard ./*.c}
OBJECTS       = $(SOURCES:.c=.o)

INCPATH        = -I. -I../../third/antlr/libantlr3c-3.2/include -I../../include -I../../third/antlr/libantlr3c-3.2/ -I../../src/grmr
LIBS           = -L../../third/antlr/libantlr3c-3.2/.libs -lantlr3c

all : $(TARGET)

$(TARGET) :  $(OBJECTS) 
	$(ARCHIVER) rcs $@ $<
	mv -f $@ ../../lib
	mkdir -p ../../.objs
	mv -f $(OBJECTS) ../../.objs
	
%.o : %.c
	$(CPP) -c $(BUILDFLAG) $(CPPFLAGS) $(INCPATH) $< -o $@
	
clean :
	cd ../../lib
	rm -f $(TARGET)