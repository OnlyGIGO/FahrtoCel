FROM maven:latest

WORKDIR /app

COPY . /app/
RUN mvn package
CMD ["-jar", "target/interconversions.jar"]
ENTRYPOINT ["java"]

