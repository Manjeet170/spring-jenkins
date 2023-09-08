FROM openjdk:8
EXPOSE 8080
ADD target/webshopify-ecomm3-0.0.1-SNAPSHOT.jar webshopify-ecomm3-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/webshopify-ecomm3-0.0.1-SNAPSHOT.jar"]