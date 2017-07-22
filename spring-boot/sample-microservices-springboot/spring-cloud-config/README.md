Forked from https://github.com/spring-cloud-samples

Inspired from https://cloud.spring.io/spring-cloud-config/spring-cloud-config.html

Maven build
```
[vagrant@localhost configserver]$ mvn clean install spring-boot:repackage docker:build -DskipTests=true
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Config Server 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.6.1:clean (default-clean) @ configserver ---
[INFO] Deleting /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/target
[INFO] 
[INFO] --- git-commit-id-plugin:2.1.11:revision (default) @ configserver ---
[info] dotGitDirectory /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/.git
[info] git.build.user.name "Spencer Gibb"
[info] git.build.user.email "spencer@gibb.us"
[info] git.branch master
[info] git.commit.id.describe 
[info] git.commit.id 911f79dccaabecbec7594bbecc8072abddb692b3
[info] git.commit.id.abbrev 911f79d
[info] git.commit.user.name "GitHub"
[info] git.commit.user.email "noreply@github.com"
[info] git.commit.message.full "Merge pull request #19 from markfisher/rabbit-instead-of-redisrabbitmq instead of redis in docker-compose.yml"
[info] git.commit.message.short "Merge pull request #19 from markfisher/rabbit-instead-of-redis"
[info] git.commit.time "2016-11-07 14:29:33 -0500"
[info] git.remote.origin.url https://github.com/spring-cloud-samples/configserver
[info] git.tags grafted,,->,origin/master,origin/
[info] git.build.time 2017-07-22T10:23:59+0000
[info] git.commit.id.describe-short 
[info] found property git.tags
[info] found property git.commit.id.abbrev
[info] found property git.commit.user.email
[info] found property git.commit.message.full
[info] found property git.commit.id
[info] found property git.commit.id.describe-short
[info] found property git.commit.message.short
[info] found property git.commit.user.name
[info] found property git.build.user.name
[info] found property git.commit.id.describe
[info] found property git.build.user.email
[info] found property git.branch
[info] found property git.commit.time
[info] found property git.build.time
[info] found property git.remote.origin.url
[info] Writing properties file to [ /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/target/classes/git.properties ] (for module  Config Server )...
[info] Config Server ] project Config Server
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ configserver ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 3 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ configserver ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ configserver ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ configserver ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/target/test-classes
[WARNING] /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/src/test/java/demo/ApplicationTests.java: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/src/test/java/demo/ApplicationTests.java使用或覆盖了已过时的 API。
[WARNING] /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/src/test/java/demo/ApplicationTests.java: 有关详细信息, 请使用 -Xlint:deprecation 重新编译。
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ configserver ---
[INFO] Tests are skipped.
[INFO] 
[INFO] --- maven-jar-plugin:2.6:jar (default-jar) @ configserver ---
[INFO] Building jar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/target/configserver-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.4.1.BUILD-SNAPSHOT:repackage (default) @ configserver ---
Downloading: https://repo.spring.io/libs-snapshot-local/org/springframework/boot/spring-boot-loader-tools/1.4.1.BUILD-SNAPSHOT/maven-metadata.xml
Downloading: http://172.17.4.50:8081/content/repositories/allsynced/org/springframework/boot/spring-boot-loader-tools/1.4.1.BUILD-SNAPSHOT/maven-metadata.xml
Downloading: http://172.17.4.50:8081/content/repositories/snapshots/org/springframework/boot/spring-boot-loader-tools/1.4.1.BUILD-SNAPSHOT/maven-metadata.xml
Downloaded: https://repo.spring.io/libs-snapshot-local/org/springframework/boot/spring-boot-loader-tools/1.4.1.BUILD-SNAPSHOT/maven-metadata.xml (3 KB at 0.5 KB/sec)
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ configserver ---
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/target/configserver-0.0.1-SNAPSHOT.jar to /home/vagrant/.m2/repository/org/demo/configserver/0.0.1-SNAPSHOT/configserver-0.0.1-SNAPSHOT.jar
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/pom.xml to /home/vagrant/.m2/repository/org/demo/configserver/0.0.1-SNAPSHOT/configserver-0.0.1-SNAPSHOT.pom
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.4.1.BUILD-SNAPSHOT:repackage (default-cli) @ configserver ---
[INFO] 
[INFO] --- docker-maven-plugin:0.2.3:build (default-cli) @ configserver ---
[INFO] Copying /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/target/configserver-0.0.1-SNAPSHOT.jar -> /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/target/docker/configserver-0.0.1-SNAPSHOT.jar
[INFO] Copying src/main/docker/Dockerfile -> /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-config/configserver/target/docker/Dockerfile
[INFO] Building image springcloud/configserver
Step 1 : FROM openjdk:8-jre
---> d18ae8f18728
Step 2 : ADD configserver-0.0.1-SNAPSHOT.jar app.jar
---> 7518effa06c5
Removing intermediate container dfbe3c33f7bb
Step 3 : VOLUME /tmp
---> Running in 668ffa96ffcf
---> ac3380c4d0b4
Removing intermediate container 668ffa96ffcf
Step 4 : VOLUME /target
---> Running in b542816bb146
---> f3495fb8482e
Removing intermediate container b542816bb146
Step 5 : RUN bash -c 'touch /app.jar'
---> Running in 03e1ce0ab312
---> 65740544f8f4
Removing intermediate container 03e1ce0ab312
Step 6 : EXPOSE 8888
---> Running in 8ee20656b05c
---> 26135b4cdcd1
Removing intermediate container 8ee20656b05c
Step 7 : ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar /app.jar
---> Running in 9adb0c150081
---> 9c349afbd9bb
Removing intermediate container 9adb0c150081
Successfully built 9c349afbd9bb
[INFO] Built springcloud/configserver
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 53.373 s
[INFO] Finished at: 2017-07-22T10:24:44+00:00
[INFO] Final Memory: 55M/416M
[INFO] ------------------------------------------------------------------------
```

Images
```
[vagrant@localhost zuul-server]$ docker images springcloud/*
REPOSITORY                 TAG                 IMAGE ID            CREATED             SIZE
springcloud/zuul-server    latest              8a194e419a14        49 seconds ago      353.6 MB
springcloud/eureka         latest              571d99c7ca44        7 minutes ago       355.1 MB
springcloud/configserver   latest              9c349afbd9bb        11 minutes ago      360 MB
```