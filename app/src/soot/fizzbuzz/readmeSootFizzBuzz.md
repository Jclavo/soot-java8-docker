# generate .class
javac -cp '/usr/app/lib/soot-4.2-full.jar' src/soot/fizzbuzz/SootFizzBuzz.java 

# run soot analysis
java -cp .:/usr/app/lib/soot-4.2-full.jar src/soot/fizzbuzz/SootFizzBuzz /usr/app/src/java/fizzbuzz FizzBuzz printFizzBuzz

you need 3 parameters

- class path folder
- class name
- method name

watch out: the file.java to be analysed must have its .class