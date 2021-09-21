FROM openjdk:11-jre
RUN mkdir app
ARG JAR_FILE
ADD /target/${JAR_FILE} /app/estoque-0.0.1-SNAPSHOT
WORKDIR /app
ENTRYPOINT java -jar estoque-0.0.1-SNAPSHOT