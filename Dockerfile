FROM openjdk:11

ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /opt/spring_boot

COPY /target/estoque*.jar estoque.jar

SHELL ["/bin/sh", "-c" ]

EXPOSE 8080

CMD java ${ADDITIONAL_OPTS} -jar estoque.jar --spring.profiles.active=${PROFILE}