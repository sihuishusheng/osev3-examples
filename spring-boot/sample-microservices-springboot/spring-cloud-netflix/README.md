Forked from https://github.com/spring-cloud-samples

Inspried from https://githu.com/jpuigsegur/spring-cloud-netflix-sample

Maven build _Eureka_
```
[vagrant@localhost eureka]$ mvn clean install spring-boot:repackage docker:build -DskipTests=true
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Eureka Server 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.6.1:clean (default-clean) @ eureka ---
[INFO] Deleting /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/eureka/target
[INFO] 
[INFO] --- git-commit-id-plugin:2.1.11:revision (default) @ eureka ---
[info] dotGitDirectory /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/eureka/.git
[info] git.build.user.name "Spencer Gibb"
[info] git.build.user.email "spencer@gibb.us"
[info] git.branch master
[info] git.commit.id.describe 
[info] git.commit.id ff513fe311ba3ce262027f40238a66ed2a164a6a
[info] git.commit.id.abbrev ff513fe
[info] git.commit.user.name "Spencer Gibb"
[info] git.commit.user.email "spencer@gibb.us"
[info] git.commit.message.full "remove unneeded `@EnableDiscoveryClient`"
[info] git.commit.message.short "remove unneeded `@EnableDiscoveryClient`"
[info] git.commit.time "2017-02-28 11:14:10 -0700"
[info] git.remote.origin.url https://github.com/spring-cloud-samples/eureka
[info] git.tags grafted,,->,origin/master,origin/
[info] git.build.time 2017-07-22T10:28:11+0000
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
[info] Writing properties file to [ /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/eureka/target/classes/git.properties ] (for module  Eureka Server )...
[info] Eureka Server ] project Eureka Server
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ eureka ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 2 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ eureka ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/eureka/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ eureka ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/eureka/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ eureka ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/eureka/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ eureka ---
[INFO] Tests are skipped.
[INFO] 
[INFO] --- maven-jar-plugin:2.6:jar (default-jar) @ eureka ---
[INFO] Building jar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/eureka/target/eureka-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.4.3.RELEASE:repackage (default) @ eureka ---
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ eureka ---
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/eureka/target/eureka-0.0.1-SNAPSHOT.jar to /home/vagrant/.m2/repository/org/demo/eureka/0.0.1-SNAPSHOT/eureka-0.0.1-SNAPSHOT.jar
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/eureka/pom.xml to /home/vagrant/.m2/repository/org/demo/eureka/0.0.1-SNAPSHOT/eureka-0.0.1-SNAPSHOT.pom
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.4.3.RELEASE:repackage (default-cli) @ eureka ---
[INFO] 
[INFO] --- docker-maven-plugin:0.2.3:build (default-cli) @ eureka ---
[INFO] Copying /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/eureka/target/eureka-0.0.1-SNAPSHOT.jar -> /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/eureka/target/docker/eureka-0.0.1-SNAPSHOT.jar
[INFO] Copying src/main/docker/Dockerfile -> /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/eureka/target/docker/Dockerfile
[INFO] Building image springcloud/eureka
Step 1 : FROM openjdk:8-jre
---> d18ae8f18728
Step 2 : VOLUME /tmp
---> Using cache
---> 234005e57fea
Step 3 : ADD eureka-0.0.1-SNAPSHOT.jar /app.jar
---> e971a0cd87d7
Removing intermediate container ca28b4f77925
Step 4 : RUN bash -c 'touch /app.jar'
---> Running in 03b02c3366ca
---> 7541b6fb373b
Removing intermediate container 03b02c3366ca
Step 5 : EXPOSE 8761
---> Running in a3cba67ed722
---> 61b8c786b70e
Removing intermediate container a3cba67ed722
Step 6 : ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar /app.jar
---> Running in c3fbedea5e72
---> 571d99c7ca44
Removing intermediate container c3fbedea5e72
Successfully built 571d99c7ca44
[INFO] Built springcloud/eureka
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 57.225 s
[INFO] Finished at: 2017-07-22T10:28:46+00:00
[INFO] Final Memory: 52M/333M
[INFO] ------------------------------------------------------------------------
```

Maven build Zuul-Server
```
[vagrant@localhost zuul-server]$ mvn clean install spring-boot:repackage docker:build -DskipTests=true
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Spring Cloud Netflix Zuul Server 1.0.0.BUILD-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.6.1:clean (default-clean) @ zuul-server ---
[INFO] Deleting /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/zuul-server/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ zuul-server ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ zuul-server ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/zuul-server/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ zuul-server ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/zuul-server/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ zuul-server ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ zuul-server ---
[INFO] Tests are skipped.
[INFO] 
[INFO] --- maven-jar-plugin:2.6:jar (default-jar) @ zuul-server ---
[INFO] Building jar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/zuul-server/target/zuul-server-1.0.0.BUILD-SNAPSHOT.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.4.1.RELEASE:repackage (default) @ zuul-server ---
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ zuul-server ---
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/zuul-server/target/zuul-server-1.0.0.BUILD-SNAPSHOT.jar to /home/vagrant/.m2/repository/org/demo/zuul-server/1.0.0.BUILD-SNAPSHOT/zuul-server-1.0.0.BUILD-SNAPSHOT.jar
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/zuul-server/pom.xml to /home/vagrant/.m2/repository/org/demo/zuul-server/1.0.0.BUILD-SNAPSHOT/zuul-server-1.0.0.BUILD-SNAPSHOT.pom
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.4.1.RELEASE:repackage (default-cli) @ zuul-server ---
[INFO] 
[INFO] --- docker-maven-plugin:0.4.13:build (default-cli) @ zuul-server ---
[INFO] Copying /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/zuul-server/target/zuul-server-1.0.0.BUILD-SNAPSHOT.jar -> /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/zuul-server/target/docker/zuul-server-1.0.0.BUILD-SNAPSHOT.jar
[INFO] Copying src/main/docker/Dockerfile -> /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/spring-cloud-netflix/zuul-server/target/docker/Dockerfile
[INFO] Building image springcloud/zuul-server
Step 1 : FROM openjdk:8-jre
 ---> d18ae8f18728
Step 2 : ADD zuul-server-1.0.0.BUILD-SNAPSHOT.jar app.jar
 ---> b249041b56d5
Removing intermediate container 3a20963566e3
Step 3 : VOLUME /tmp
 ---> Running in e64ad7e88931
 ---> ba4e00fa5a29
Removing intermediate container e64ad7e88931
Step 4 : VOLUME /target
 ---> Running in f92578b0be5f
 ---> 748217b91fbd
Removing intermediate container f92578b0be5f
Step 5 : RUN bash -c 'touch /app.jar'
 ---> Running in 9e8c07690fb0
 ---> 24878f6fa389
Removing intermediate container 9e8c07690fb0
Step 6 : EXPOSE 8765
 ---> Running in dd43aad1370b
 ---> a99940007ab9
Removing intermediate container dd43aad1370b
Step 7 : ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar /app.jar
 ---> Running in d7b7d6e7bdb6
 ---> 8a194e419a14
Removing intermediate container d7b7d6e7bdb6
Successfully built 8a194e419a14
[INFO] Built springcloud/zuul-server
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 47.426 s
[INFO] Finished at: 2017-07-22T10:35:18+00:00
[INFO] Final Memory: 49M/346M
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
