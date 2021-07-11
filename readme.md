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
[sample]: java -jar lib/soot-4.2-full.jar -process-dir /usr/app/class/hello/

# soot generate file .class, 2da way
java -cp [path-from-soot.jar] soot.main -process-dir [path-from-classes]
[sample]: java -cp lib/soot-4.2-full.jar soot.Main -process-dir /usr/app/class/hello/

# soot generate file .jimple
java -jar [path-from-soot.jar] -process-dir [path-from-classes] -f J 
[sample]: java -jar lib/soot-4.2-full.jar -process-dir /usr/app/class/hello/ -f J


# # run java file importing soot 

# generate file .class
javac -cp [path-from-soot.jar] [path-from-file-.java]  
[sample]: javac -cp '/usr/app/lib/soot-4.2-full.jar' /usr/app/class/soot/Main.java 

# run it
java -cp [path-from-soot.jar] [path-from-java-class-name]  
[sample]: java -cp .:/usr/app/lib/soot-4.2-full.jar Main




# interesting sources

- https://o2lab.github.io/710/p/a1.html#quickstart-soot
- https://www.sable.mcgill.ca/soot/tutorial/usage/
- https://www.sable.mcgill.ca/soot/index.html
- https://github.com/soot-oss/soot

https://www.taufique.me/posts/2017-12-22-first-step-with-custom-analysis-in-soot-framework/

http://www.bodden.de/tag/soot-tutorial/
