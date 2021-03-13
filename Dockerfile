FROM adoptopenjdk/openjdk11:latest

RUN mkdir -p /software

ADD target/springBootService.jar /software/springBootService.jar

CMD java -Dserver.port=$PORT $JAVA_OPTS -jar /software/springBootService.jar

