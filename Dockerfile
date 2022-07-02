FROM java:8
EXPOSE 8080
ADD vueblog2-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-jar", "/apllp.jar", "--spring.profiles.active=pro"]