FROM openjdk:17
EXPOSE 8000
ADD target/aws-deploy-new-0.0.1-SNAPSHOT.jar aws-deploy-new-0.0.1-SNAPSHOT
ENTRYPOINT ["java","-jar","/aws-deploy-new-0.0.1-SNAPSHOT"]