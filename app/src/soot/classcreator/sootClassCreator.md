# generate .class
javac -cp '/usr/app/lib/soot-4.2-full.jar' src/soot/classcreator/ClassCreator.java

# run soot
java -cp .:/usr/app/lib/soot-4.2-full.jar src/soot/classcreator/ClassCreator 