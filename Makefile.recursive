#
# Compiles all '.java' files at once
#

SRC = $(shell find . -name '*.java')
OBJ = $(SRC:.java=.class)

JC = javac

JFLAGS =

.SUFFIXES: .java .class
.PHONY: classes


default: classes

classes: $(OBJ) $(SRC)

$(OBJ): %.class: %.java
	javac $(JFLAGS) $<

clean:
	-$(RM) $(OBJ) *~

