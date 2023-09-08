FROM openjdk:8
EXPOSE 8080
ADD target/webshopify-ecomm3-0.0.1-snapshot.jar webshopify-ecomm3-0.0.1-snapshot.jar
ENTRYPOINT ["java","-jar","/webshopify-ecomm3-0.0.1-snapshot.jar"]