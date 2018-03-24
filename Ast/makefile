
JC = javac
JV = java

default: Jagger.jj
				$(JV) -cp javacc.jar javacc Jagger.jj
				$(JC) Jagger.java

check: test1.txt default
				$(JV) Jagger test1.txt

clean:
				$(RM) *.class *.ctxt
