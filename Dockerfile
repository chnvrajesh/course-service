FROM openjdk:11
ADD build/libs/course-service-0.0.1-SNAPSHOT.jar course-service-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "course-service-0.0.1-SNAPSHOT.jar"]