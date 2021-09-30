FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/*.jar /app/carteira-api.jar

EXPOSE 8080

CMD java -XX:+UseContainerSupport -Xmx512m -Dserver.port=${PORT} -Dspring.profiles.active=${SPRING_PROFILES_ACTIVE} -jar carteira-api.jar