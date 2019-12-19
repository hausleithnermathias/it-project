FROM openjdk:11

COPY . /usr/app

WORKDIR /usr/app

RUN ./mvnw package -Dmaven.javadoc.skip=true -DskipTests verify

CMD ["java", "-jar", "app/target/app-0.0.1-SNAPSHOT.jar"]
