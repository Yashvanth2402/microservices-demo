# syntax=docker/dockerfile:1

FROM eclipse-temurin:21.0.5_11-jdk as builder
WORKDIR /app

COPY ["build.gradle", "gradlew", "./"]
COPY gradle gradle
COPY src src

RUN chmod +x gradlew
RUN ./gradlew build --no-daemon

FROM eclipse-temurin:21.0.5_11-jre-alpine
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
