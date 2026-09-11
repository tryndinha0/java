# ---------- Estagio de build ----------
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn -B dependency:go-offline
COPY src ./src
RUN mvn -B clean package -DskipTests

# ---------- Estagio de execucao ----------
# Mesma imagem final e usada em AWS (EC2), Azure (VM) e Google Cloud (Compute Engine).
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
RUN useradd -r -u 1001 -g root appuser
COPY --from=build /app/target/cloud-compare-api.jar app.jar
USER appuser
EXPOSE 8080
ENTRYPOINT ["java", "-XX:+UseContainerSupport", "-XX:MaxRAMPercentage=75.0", "-jar", "app.jar"]
