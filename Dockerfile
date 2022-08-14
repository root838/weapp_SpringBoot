FROM openjdk:latest
VOLUME /tmp
COPY ./target/weapp_springboot.jar weapp_springboot.jar
ENTRYPOINT ["java","-jar","/weapp_springboot.jar", "&"]
