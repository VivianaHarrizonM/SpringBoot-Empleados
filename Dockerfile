# Usa una imagen oficial de Java 21
FROM eclipse-temurin:21-jdk

# Crea un directorio para la aplicación
WORKDIR /app

# Copia todos los archivos del proyecto al contenedor
COPY . .

# Da permisos de ejecución al wrapper de Maven
RUN chmod +x mvnw

# Construye el proyecto, omitiendo tests
RUN ./mvnw clean package -DskipTests

# Expone el puerto dinámico que Render asignará
EXPOSE 8080

# Comando para arrancar la aplicación
CMD ["java", "-jar", "target/empleados-0.0.1-SNAPSHOT.jar"]
