# generate .class
javac -cp [path-from-soot.jar] [path-from-file-.java]  
javac -cp '/usr/app/lib/soot-4.2-full.jar' src/soot/analysis/intra/PrintUnits.java 

# run soot inter analysis
java -cp [your-path][:][path-from-soot.jar] [path-from-custom-soot-file-.java] [-W] -process-dir [path-from-classes]

java -cp '.:lib/soot-4.2-full.jar' src/soot/analysis/intra/PrintUnits -process-dir /usr/app/src/java/hello/


# run soot inter analysis using Extends
java -cp .:/usr/app/lib/soot-4.2-full.jar src/soot/analysis/intra/PrintStatementExtend /usr/app/src/java/fizzbuzz FizzBuzz

you need 2 parameters

- class path folder
- class name

watch out: the file.java to be analysed must have its .class


