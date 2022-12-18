FROM openjdk:17
COPY target/ /tmp
WORKDIR /tmp
CMD java -jar passenger-1.0.jar