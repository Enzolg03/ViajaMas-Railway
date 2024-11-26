FROM openjdk:21-slim

WORKDIR /app

COPY target/app-security-backoffice-0.0.1-SNAPSHOT.jar /app/app-security-backoffice.jar

EXPOSE 3000

CMD ["java","-jar", "/app/app-security-backoffice.jar"]