FROM openjdk:8-jdk

VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ENV DISPLAY=:0

# set working directory
WORKDIR /usr/app

# copy java files to container]  
COPY ./app /usr/app/

# expose port
EXPOSE 3000

# create user with non root privilegies
RUN useradd -u 1000 java
USER 1000

