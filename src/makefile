# Keagan Chasenski
# CHSKEA001
# Makefile for projectOne - assingment one (Power)
# 05/03/19

JFLAGS = - g
JC = javac

JAVAC=/usr/bin/javac

.SUFFIXES: .java .class
.java.class:
    javac *.java

SRCDIR=src
BINDIR=bin
DOCDIR=doc

CLASSES = \
    *.java

CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

run:
	java -cp $(BINDIR) PowerArrayApp

docs:
	javadoc -d $(DOCDIR) $(SRCDIR)/*.java

clean:
	rm $(BINDIR)/*.class