#Imagen base que vamos a usar
FROM openjdk:17
#copiar archivos y directorios dentro de un contenedor
#Empaquetado de nuestra aplicacion
COPY ./target/facturacion-0.0.1-SNAPSHOT.jar app.jar
#Exponer le puerto de la aplicacion
EXPOSE 8080
#Serie de Comandos para ejecutar la aplicacion
CMD ["java", "-jar", "app.jar"]
#Comando para Construir la imagen (Esto va en la terminal)
#  docker build -t "app-factura" .
# Comando Verificar que nuestra imagen se genero
# docker images
#Comando para ejecutar nuestra imagen
# docker run --name java-app-factura -p 8081:8080 app-factura












