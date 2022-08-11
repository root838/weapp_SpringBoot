FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY ./target/weapp_SpringBoot.jar weapp_SpringBoot.jar
ENTRYPOINT ["java","-jar","/weapp_SpringBoot", "&"]
