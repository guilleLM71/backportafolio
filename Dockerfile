# Crear una nueva imagen basada en OpenJDK 11
FROM openjdk:19-slim-buster
EXPOSE 6060
# Copiar el archivo JAR construido desde la etapa anterior
COPY target/backportafolio-0.0.1-SNAPSHOT.jar app.jar

ADD target/classes/application.properties application.properties
# Establecer el punto de entrada para ejecutar la aplicación
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom --spring.config.location=classpath:file:/app/application-properties","-jar", "/app.jar"]