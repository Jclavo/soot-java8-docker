# generate .class
javac -cp '/usr/app/lib/soot-4.2-full.jar' src/soot/analysis/intra/cfa/DominatorFinder.java

javac -cp '/usr/app/lib/soot-4.2-full.jar' src/soot/analysis/intra/cfa/SampleDominatorFinder.java

# run soot inter analysis
java -cp '.:lib/soot-4.2-full.jar' src/soot/analysis/intra/FileName -process-dir /usr/app/src/java/hello/




