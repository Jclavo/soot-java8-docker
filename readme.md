# generate bytecode
javac [file.java]
[sample]: javac Hello.java

# check soot options
java -jar [path-from-soot.jar] -help
[sample]: java -jar lib/soot-4.2-full.jar -help

# output folder from soot
./sootOutput 

# soot generate file .class
java -jar [path-from-soot.jar] -process-dir [path-from-classes]
[sample]: java -jar lib/soot-4.2-full.jar -process-dir /usr/app/src/java/hello/

# soot generate file .class, 2da way
java -cp [path-from-soot.jar] soot.main -process-dir [path-from-classes]
[sample]: java -cp lib/soot-4.2-full.jar soot.Main -process-dir /usr/app/src/java/hello/

# soot generate file .jimple
java -jar [path-from-soot.jar] -process-dir [path-from-classes] -f J 
[sample]: java -jar lib/soot-4.2-full.jar -process-dir /usr/app/src/java/hello/ -f J


# # run java file importing soot 

# generate file .class
javac -cp [path-from-soot.jar] [path-from-file-.java]  
[sample]: javac -cp '/usr/app/lib/soot-4.2-full.jar' src/soot/fizzbuzz/SootFizzBuzz.java 

# run it
java -cp [path-from-soot.jar] [path-from-java-class-name]  
[sample]: java -cp .:/usr/app/lib/soot-4.2-full.jar src/soot/fizzbuzz/SootFizzBuzz /usr/app/src/java/fizzbuzz FizzBuzz printFizzBuzz



## SOURCES

# About soot

- https://o2lab.github.io/710/p/a1.html#quickstart-soot
- https://www.sable.mcgill.ca/soot/tutorial/usage/
- http://www.bodden.de/tag/soot-tutorial/
- https://pt.slideshare.net/lleraromero/soot-for-dummies

# Control Flow Analysis: CFA

- https://github.com/soot-oss/soot/wiki/Implementing-an-intra-procedural-data-flow-analysis-in-Soot
- http://www.cs.toronto.edu/~aamodkore/notes/dfa-tutorial.html
