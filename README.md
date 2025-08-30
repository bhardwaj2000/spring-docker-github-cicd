# spring-docker-github-cicd

This repository contains a Spring Boot application with Docker support and CI/CD automation via GitHub Actions.

## 🚀 Getting Started

### 1. Clone the Repository

```sh
git clone https://github.com/bhardwaj2000/spring-docker-github-cicd.git
cd spring-docker-github-cicd
```

### 2. Pull the Docker Image

The application is available as a Docker image. You can pull the pre-built image from Docker Hub:

```sh
docker pull manish172000/spring-docker-github-cicd:latest
```

> **Note:** If the image is not published, you can build it locally (see below).

### 3. Run the Application with Docker

Start the container (update the image name as needed):

```sh
docker run -d -p 8080:8080 manish172000/spring-docker-github-cicd:latest
```

This will run the app in detached mode and map port 8080 of your host to the container.

#### Build and Run Locally (if needed)

If you want to build the Docker image from source:

```sh
docker build -t spring-docker-github-cicd .
docker run -d -p 8080:8080 spring-docker-github-cicd
```

---

## 📡 API Endpoints

The application exposes the following endpoints by default:

| Method | Endpoint     | Description                    |
|--------|--------------|--------------------------------|
| GET    | `/{name}`    | {name} deployed spring app with github cicd action!! |

### Example Usage

- Visit [http://localhost:8080/manish](http://localhost:8080/manish)  
  - Should return 'manish deployed spring app with github cicd action!!'

---

## ⚙️ CI/CD

- The repository is configured to use GitHub Actions for CI/CD.
- On every push, the workflow will:
  - Build the Spring Boot application
  - Build and optionally push the Docker image

You can find the workflow file in `.github/workflows/`.

---

## 📝 Customization

- **Docker image name:** Update the repository and image name as per your Docker Hub account.
- **Application properties:** Configure Spring Boot properties in `src/main/resources/application.properties`.

---

## 📄 License

This project is licensed under the @MKS License.

---

**Happy Coding!**
