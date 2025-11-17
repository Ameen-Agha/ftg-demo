# Ameen's First FTG Demo Project  

This is a simple **Java Spring Boot** application connected to a **PostgreSQL** database using **Docker & Docker Compose**, and later deployed to **Kubernetes** using **Minikube** and **Helm chart**.

---
## 🧠 Tech Stack Used  
- Java 21 (Spring Boot)  
- PostgreSQL (Dockerized)  
- Maven  
- Docker & Docker Compose
- Kubernetes
- Helm
---

## ⚙️ How I Built It  
**Part 1:**
1. **Created a new Spring Boot project** using Maven (with Java 21).  
2. **Wrote a simple REST controller** that prints a message to confirm DB connection.  
3. **Configured `application.properties`** to connect to a PostgreSQL database.  
4. **Set up a Dockerfile** to build the Java app into an image.  
5. **Created a `docker-compose.yml`** file to run both the app and PostgreSQL together.  
6. **Tested locally** by running:
   docker compose up --build
Then opened http://localhost:8080 to confirm the app works.

**Part 2:**
1. **Installed Minikube** → creates a local Kubernetes cluster.
2. **Installed Helm** → a templating tool to deploy apps into Kubernetes.
3. **Generated a Helm chart** → helm create ftg-chart
4. **Modified the chart** → Added services, environment variables, and deployments for the postgres and the app.
5. **Installed the chart and forwarded the app port** → helm install ftg-demo . and kubectl port-forward <app-pod> 8080:8080
6. **Visited:👉 http://localhost:8080** → Same message: **"Hello World! - Connected to DB successfully"**


🏗️ **Kubernetes, Minikube & Helm — Simple Explanation:**
- Kubernetes is a system that automatically runs, manages, and scales containerized applications. Instead of manually starting Docker containers yourself, Kubernetes keeps them running, restarts them if they fail, and replaces them if they crash.
- Minikube gives us a small, local Kubernetes cluster on our laptop so we can test exactly how an app would run in a real production environment.
- Helm makes this easier by packaging all the Kubernetes files (Deployments, Services, ConfigMaps, etc.) into one reusable “chart,” allowing us to deploy the entire application—our Java service and its PostgreSQL database—with a single command.
- Together, Kubernetes + Minikube + Helm provide an automated, organized, and repeatable way to deploy and manage applications.
