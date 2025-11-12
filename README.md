# Ameen's First FTG Demo Project  

This is a simple **Java Spring Boot** application connected to a **PostgreSQL** database using **Docker** and **Docker Compose**.

---
## 🧠 Tech Stack Used  
- Java 21 (Spring Boot)  
- PostgreSQL (Dockerized)  
- Maven  
- Docker & Docker Compose  
---

## ⚙️ How I Built It  

1. **Created a new Spring Boot project** using Maven (with Java 21).  
2. **Wrote a simple REST controller** that prints a message to confirm DB connection.  
3. **Configured `application.properties`** to connect to a PostgreSQL database.  
4. **Set up a Dockerfile** to build the Java app into an image.  
5. **Created a `docker-compose.yml`** file to run both the app and PostgreSQL together.  
6. **Tested locally** by running:
   docker compose up --build
Then opened http://localhost:8080 to confirm the app works.