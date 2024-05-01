# Usar una imagen base con JDK 11 y Maven
FROM ubuntu:latest AS build

RUN apt-get install openjdk-19-jdk -y
# Establecer un directorio de trabajo
COPY . .

# Ejecutar Maven para construir el proyecto
RUN mvn clean package

# Crear una nueva imagen basada en OpenJDK 11
FROM openjdk:19-slim-buster

# Exponer el puerto que utilizará la aplicación
EXPOSE 8080

# Copiar el archivo JAR construido desde la etapa anterior
COPY --from=build /build/libs/backportafolio-0.0.1-SNAPSHOT.jar /app/backportafolio-0.0.1-SNAPSHOT.jar

# Establecer el punto de entrada para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "backportafolio-0.0.1-SNAPSHOT.jar"]