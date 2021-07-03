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

# soot generate file .jimple
java -jar [path-from-soot.jar] -process-dir [path-from-classes] -f J 
[sample]: java -jar lib/soot-4.2-full.jar -process-dir /usr/app/class/hello/ -f J






# interesting sources

- https://o2lab.github.io/710/p/a1.html#quickstart-soot
- https://www.sable.mcgill.ca/soot/tutorial/usage/
- https://www.sable.mcgill.ca/soot/index.html
- https://github.com/soot-oss/soot