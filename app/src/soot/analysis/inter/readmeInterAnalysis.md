# generate .class
javac -cp [path-from-soot.jar] [path-from-file-.java]  
javac -cp '/usr/app/lib/soot-4.2-full.jar' src/soot/analysis/inter/FileName.java 

# run soot inter analysis
java -cp [your-path][:][path-from-soot.jar] [path-from-custom-soot-file-.java] [-W] -process-dir [path-from-classes]

java -cp '.:lib/soot-4.2-full.jar' src/soot/analysis/inter/FileName -W -process-dir /usr/app/src/java/hello/

watch out: [-w] enable whole-program packs 