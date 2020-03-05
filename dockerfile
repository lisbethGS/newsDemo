FROM openjdk:8-jdk-alpine
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/demo-0.0.1.jar
ENTRYPOINT ["java","-jar","/app/demo-0.0.1.jar"]