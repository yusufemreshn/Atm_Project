FROM openjdk:17-jdk-slim

WORKDIR /app

COPY src/Class_01.java .

RUN javac Class_01.java

CMD ["java", "Class_01"]
