# generate .class
javac -cp '/usr/app/lib/soot-4.2-full.jar'  sootFizzBuzz.java

# run soot analysis
java -cp .:/usr/app/lib/soot-4.2-full.jar sootFizzBuzz /usr/app/class/java/fizzbuzz FizzBuzz printFizzBuzz

you need 3 parameters

- class path folder
- class name
- method name

watch out: the file.java to be analysed must have its .class