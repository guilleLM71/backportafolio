# Crear una nueva imagen basada en OpenJDK 11
FROM openjdk:19-slim-buster

# Copiar el archivo JAR construido desde la etapa anterior
COPY ./tarjet/backportafolio-0.0.1-SNAPSHOT.jar app.jar

# Establecer el punto de entrada para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]