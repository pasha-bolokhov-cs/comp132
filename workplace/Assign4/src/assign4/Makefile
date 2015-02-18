#
# Compiles all '.java' files at once
#

SRC = $(wildcard *.java)
OBJ = $(SRC:.java=.class)

JC = javac

JFLAGS =

.SUFFIXES: .java .class
.PHONY: classes


default: classes

classes: $(OBJ) $(SRC)

$(OBJ): $(SRC)
	javac $(JFLAGS) $(SRC)

clean:
	-$(RM) *.class *~
