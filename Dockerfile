FROM openjdk:8-jdk

VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ENV DISPLAY=:0

#set working directory
WORKDIR /usr/app

# copy java files to container]  
COPY ./app /usr/app/

EXPOSE 3000

# # run a .jar
# ENTRYPOINT exec java $JAVA_OPTS -jar uppaal.jar
# # check java version
# ENTRYPOINT exec java -version

# # run a file java
### to avoid problem, do not bind volumes in yml file
# RUN javac Hello.java
# CMD ["java", "Hello"]

