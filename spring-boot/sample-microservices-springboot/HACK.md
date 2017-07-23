# Intruduction

## Table of Contents

Maven, Gradle and Wrappers

Build with Java project tools

Jenkins CI 

Docker Compose CD

### Maven, Gradle and Wrappers

For `mvn`
```
fanhonglingdeMacBook-Pro:sample-microservices-springboot fanhongling$ mvn --version
Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-10T08:41:47-08:00)
Maven home: /opt/apache-maven-3.3.9
Java version: 1.8.0_91, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_91.jdk/Contents/Home/jre
Default locale: zh_CN, platform encoding: UTF-8
OS name: "mac os x", version: "10.10.4", arch: "x86_64", family: "mac"
```

For `gradle`
```
fanhonglingdeMacBook-Pro:sample-microservices-springboot fanhongling$ gradle --version

------------------------------------------------------------
Gradle 3.5
------------------------------------------------------------

Build time:   2017-04-10 13:37:25 UTC
Revision:     b762622a185d59ce0cfc9cbc6ab5dd22469e18a6

Groovy:       2.4.10
Ant:          Apache Ant(TM) version 1.9.6 compiled on June 29 2015
JVM:          1.8.0_91 (Oracle Corporation 25.91-b14)
OS:           Mac OS X 10.10.4 x86_64
```

For `mvnw`
```
fanhonglingdeMacBook-Pro:sample-microservices-springboot fanhongling$ mvn -N io.takari:maven:wrapper -Dmaven=3.5.0
[INFO] Scanning for projects...
Downloading: http://172.17.4.50:8081/content/groups/public/io/takari/maven/maven-metadata.xml
Downloading: http://172.17.4.50:8081/content/repositories/allsynced/io/takari/maven/maven-metadata.xml
[WARNING] Could not transfer metadata io.takari:maven/maven-metadata.xml from/to my-synced (http://172.17.4.50:8081/content/repositories/allsynced): Connect to 172.17.4.50:8081 [/172.17.4.50] failed: Connection refused
[WARNING] Could not transfer metadata io.takari:maven/maven-metadata.xml from/to my-mirror (http://172.17.4.50:8081/content/groups/public): Connect to 172.17.4.50:8081 [/172.17.4.50] failed: Connection refused
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building microservices-demo 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[WARNING] Failure to transfer io.takari:maven/maven-metadata.xml from http://172.17.4.50:8081/content/repositories/allsynced was cached in the local repository, resolution will not be reattempted until the update interval of my-synced has elapsed or updates are forced. Original error: Could not transfer metadata io.takari:maven/maven-metadata.xml from/to my-synced (http://172.17.4.50:8081/content/repositories/allsynced): Connect to 172.17.4.50:8081 [/172.17.4.50] failed: Connection refused
[WARNING] Failure to transfer io.takari:maven/maven-metadata.xml from http://172.17.4.50:8081/content/groups/public was cached in the local repository, resolution will not be reattempted until the update interval of my-mirror has elapsed or updates are forced. Original error: Could not transfer metadata io.takari:maven/maven-metadata.xml from/to my-mirror (http://172.17.4.50:8081/content/groups/public): Connect to 172.17.4.50:8081 [/172.17.4.50] failed: Connection refused
[INFO] 
[INFO] --- maven:0.4.1:wrapper (default-cli) @ microservices-demo-springboot ---
[INFO] 
[INFO] The Maven Wrapper version 0.2.1 has been successfully setup for your project.
[INFO] Using Apache Maven 3.5.0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.145 s
[INFO] Finished at: 2017-07-01T21:10:33-07:00
[INFO] Final Memory: 10M/245M
[INFO] ------------------------------------------------------------------------

fanhonglingdeMacBook-Pro:sample-microservices-springboot fanhongling$ ./mvnw --version
/Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot
Downloading https://repo1.maven.org/maven2/org/apache/maven/apache-maven/3.5.0/apache-maven-3.5.0-bin.zip
..................................................................................................................................................................................................................................................................................................................................................................................................................................................
Unzipping /Users/fanhongling/.m2/wrapper/dists/apache-maven-3.5.0-bin/6ps54u5pnnbbpr6ds9rppcc7iv/apache-maven-3.5.0-bin.zip to /Users/fanhongling/.m2/wrapper/dists/apache-maven-3.5.0-bin/6ps54u5pnnbbpr6ds9rppcc7iv
Set executable permissions for: /Users/fanhongling/.m2/wrapper/dists/apache-maven-3.5.0-bin/6ps54u5pnnbbpr6ds9rppcc7iv/apache-maven-3.5.0/bin/mvn
Apache Maven 3.5.0 (ff8f5e7444045639af65f6095c62210b5713f426; 2017-04-03T12:39:06-07:00)
Maven home: /Users/fanhongling/.m2/wrapper/dists/apache-maven-3.5.0-bin/6ps54u5pnnbbpr6ds9rppcc7iv/apache-maven-3.5.0
Java version: 1.8.0_91, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_91.jdk/Contents/Home/jre
Default locale: zh_CN, platform encoding: UTF-8
OS name: "mac os x", version: "10.10.4", arch: "x86_64", family: "mac"

```

For `gradlew`
```
fanhonglingdeMacBook-Pro:sample-microservices-springboot fanhongling$  gradle wrapper --gradle-version 3.3
:wrapper

BUILD SUCCESSFUL

Total time: 2.13 secs

fanhonglingdeMacBook-Pro:sample-microservices-springboot fanhongling$ ./gradlew --version
Downloading https://services.gradle.org/distributions/gradle-3.3-bin.zip
..................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................
Unzipping /Users/fanhongling/.gradle/wrapper/dists/gradle-3.3-bin/64bhckfm0iuu9gap9hg3r7ev2/gradle-3.3-bin.zip to /Users/fanhongling/.gradle/wrapper/dists/gradle-3.3-bin/64bhckfm0iuu9gap9hg3r7ev2
Set executable permissions for: /Users/fanhongling/.gradle/wrapper/dists/gradle-3.3-bin/64bhckfm0iuu9gap9hg3r7ev2/gradle-3.3/bin/gradle

------------------------------------------------------------
Gradle 3.3
------------------------------------------------------------

Build time:   2017-01-03 15:31:04 UTC
Revision:     075893a3d0798c0c1f322899b41ceca82e4e134b

Groovy:       2.4.7
Ant:          Apache Ant(TM) version 1.9.6 compiled on June 29 2015
JVM:          1.8.0_91 (Oracle Corporation 25.91-b14)
OS:           Mac OS X 10.10.4 x86_64

```

### Build

With `gradle build`, notice the output may different with it because this building is not the first time
```
fanhonglingdeMacBook-Pro:sample-microservices-springboot fanhongling$ gradle build
:compileJava NO-SOURCE
:processResources NO-SOURCE
:classes UP-TO-DATE
:findMainClass
:jar SKIPPED
:bootRepackage SKIPPED
:assemble UP-TO-DATE
:compileTestJava NO-SOURCE
:processTestResources NO-SOURCE
:testClasses UP-TO-DATE
:test NO-SOURCE
:check UP-TO-DATE
:build UP-TO-DATE
:repositories-mem:compileJava UP-TO-DATE
:repositories-mem:processResources UP-TO-DATE
:repositories-mem:classes UP-TO-DATE
:repositories-mem:jar
:repositories-mem:findMainClass
:repositories-mem:startScripts UP-TO-DATE
:repositories-mem:distTar
:repositories-mem:distZip
:repositories-mem:srcJar UP-TO-DATE
:repositories-mem:bootRepackage
:repositories-mem:assemble
:repositories-mem:compileTestJava NO-SOURCE
:repositories-mem:processTestResources NO-SOURCE
:repositories-mem:testClasses UP-TO-DATE
:repositories-mem:test NO-SOURCE
:repositories-mem:check UP-TO-DATE
:repositories-mem:build
:web:compileJava UP-TO-DATE
:web:processResources UP-TO-DATE
:web:classes UP-TO-DATE
:web:jar
:web:findMainClass
:web:startScripts UP-TO-DATE
:web:distTar
:web:distZip
:web:srcJar UP-TO-DATE
:web:bootRepackage
:web:assemble
:web:compileTestJava NO-SOURCE
:web:processTestResources NO-SOURCE
:web:testClasses UP-TO-DATE
:web:test NO-SOURCE
:web:check UP-TO-DATE
:web:build

BUILD SUCCESSFUL

Total time: 5.674 secs
```

With `mvn package`, notice the output may different with it because this building is not the first time
```
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] web
[INFO] repositories-mem
[INFO] microservices-demo
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building web 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ web ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 10 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ web ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ web ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ web ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.17:test (default-test) @ web ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ web ---
[INFO] Building jar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/target/web.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.2.5.RELEASE:repackage (default) @ web ---
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building repositories-mem 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ repositories-mem ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ repositories-mem ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ repositories-mem ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ repositories-mem ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.17:test (default-test) @ repositories-mem ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ repositories-mem ---
[INFO] Building jar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/target/repositories-mem.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.2.5.RELEASE:repackage (default) @ repositories-mem ---
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building microservices-demo 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO] 
[INFO] web ................................................ SUCCESS [  2.566 s]
[INFO] repositories-mem ................................... SUCCESS [  0.478 s]
[INFO] microservices-demo ................................. SUCCESS [  0.001 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.440 s
[INFO] Finished at: 2017-07-02T00:06:19-07:00
[INFO] Final Memory: 21M/331M
[INFO] ------------------------------------------------------------------------
```

### Install and Upload

With `gradle install`
```
fanhonglingdeMacBook-Pro:sample-microservices-springboot fanhongling$ gradle install
:createPom
:compileJava NO-SOURCE
:processResources NO-SOURCE
:classes UP-TO-DATE
:jar SKIPPED
:install
:repositories-mem:compileJava UP-TO-DATE
:repositories-mem:processResources UP-TO-DATE
:repositories-mem:classes UP-TO-DATE
:repositories-mem:jar
:repositories-mem:findMainClass
:repositories-mem:startScripts UP-TO-DATE
:repositories-mem:distTar
:repositories-mem:distZip
:repositories-mem:srcJar UP-TO-DATE
:repositories-mem:install
:web:compileJava UP-TO-DATE
:web:processResources UP-TO-DATE
:web:classes UP-TO-DATE
:web:jar
:web:findMainClass
:web:startScripts UP-TO-DATE
:web:distTar
:web:distZip
:web:srcJar UP-TO-DATE
:web:install

BUILD SUCCESSFUL

Total time: 6.599 secs

fanhonglingdeMacBook-Pro:sample-microservices-springboot fanhongling$ ls -ltr ~/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/
total 24
-rw-r--r--  1 fanhongling  staff  191  6 27 10:19 resolver-status.properties
-rw-r--r--  1 fanhongling  staff  314  6 27 10:19 maven-metadata-my-snapshots.xml
drwxr-xr-x  7 fanhongling  staff  238  6 27 10:19 0.0.1-SNAPSHOT
drwxr-xr-x  9 fanhongling  staff  306  6 30 20:16 web
-rw-r--r--  1 fanhongling  staff  374  7  1 22:23 maven-metadata-local.xml
drwxr-xr-x  4 fanhongling  staff  136  7  1 22:23 0.0.1
drwxr-xr-x  8 fanhongling  staff  272  7  1 22:23 repositories-mem
fanhonglingdeMacBook-Pro:sample-microservices-springboot fanhongling$ ls -ltr ~/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/web
total 40
drwxr-xr-x  9 fanhongling  staff  306  6 27 10:19 0.0.1-SNAPSHOT
-rw-r--r--  1 fanhongling  staff   40  6 27 10:19 maven-metadata-my-snapshots.xml.sha1
-rw-r--r--  1 fanhongling  staff  318  6 27 10:19 maven-metadata-my-snapshots.xml
drwxr-xr-x  7 fanhongling  staff  238  6 30 20:10 0.0.1
-rw-r--r--  1 fanhongling  staff  236  6 30 20:16 resolver-status.properties
-rw-r--r--  1 fanhongling  staff  338  6 30 20:16 maven-metadata-remote.xml
-rw-r--r--  1 fanhongling  staff  378  7  1 22:23 maven-metadata-local.xml
fanhonglingdeMacBook-Pro:sample-microservices-springboot fanhongling$ ls -ltr ~/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1
total 84776
-rw-r--r--  1 fanhongling  staff    110532  6 30 20:08 web-0.0.1-sources.jar
-rw-r--r--  1 fanhongling  staff  22835200  7  1 22:23 web-0.0.1.tar
-rw-r--r--  1 fanhongling  staff    115790  7  1 22:23 web-0.0.1.jar
-rw-r--r--  1 fanhongling  staff  20330013  7  1 22:23 web-0.0.1.zip
-rw-r--r--  1 fanhongling  staff      4914  7  1 22:23 web-0.0.1.pom
```

With `gradle uploadArchives`
```
fanhonglingdeMacBook-Pro:sample-microservices-springboot fanhongling$ gradle :repositories-mem:uploadArchives :web:uploadArchives
:repositories-mem:compileJava UP-TO-DATE
:repositories-mem:processResources UP-TO-DATE
:repositories-mem:classes UP-TO-DATE
:repositories-mem:jar UP-TO-DATE
:repositories-mem:findMainClass
:repositories-mem:startScripts UP-TO-DATE
:repositories-mem:distTar UP-TO-DATE
:repositories-mem:distZip UP-TO-DATE
:repositories-mem:srcJar UP-TO-DATE
:repositories-mem:uploadArchives
Could not find metadata com.openshift.evangelists.microservices-demo-springboot:repositories-mem/maven-metadata.xml in remote (http://172.17.4.50:8081/content/repositories/releases)
:web:compileJava
注: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/src/main/java/com/openshift/evangelists/microservices/web/client/RestMessageRepositoryClient.java使用了未经检查或不安全的操作。
注: 有关详细信息, 请使用 -Xlint:unchecked 重新编译。
:web:processResources UP-TO-DATE
:web:classes
:web:jar
:web:findMainClass
:web:startScripts
:web:distTar
:web:distZip
:web:srcJar UP-TO-DATE
:web:uploadArchives
Could not find metadata com.openshift.evangelists.microservices-demo-springboot:web/maven-metadata.xml in remote (http://172.17.4.50:8081/content/repositories/releases)

BUILD SUCCESSFUL

Total time: 7.49 secs

fanhonglingdeMacBook-Pro:sample-microservices-springboot fanhongling$ curl -L http://172.17.4.50:8081/content/repositories/releases/com/openshift/evangelists/microservices-demo-springboot
<html>
  <head>
    <title>Index of /repositories/releases/com/openshift/evangelists/microservices-demo-springboot</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

    <link rel="icon" type="image/png" href="http://172.17.4.50:8081/favicon.png">
    <!--[if IE]>
    <link rel="SHORTCUT ICON" href="http://172.17.4.50:8081/favicon.ico"/>
    <![endif]-->

    <link rel="stylesheet" href="http://172.17.4.50:8081/static/css/Sonatype-content.css?2.13.0-01" type="text/css" media="screen" title="no title" charset="utf-8">
  </head>
  <body>
    <h1>Index of /repositories/releases/com/openshift/evangelists/microservices-demo-springboot</h1>
    <table cellspacing="10">
      <tr>
        <th align="left">Name</th>
        <th>Last Modified</th>
        <th>Size</th>
        <th>Description</th>
      </tr>
      <tr>
        <td><a href="../">Parent Directory</a></td>
      </tr>
                  <tr>
            <td><a href="http://172.17.4.50:8081/content/repositories/releases/com/openshift/evangelists/microservices-demo-springboot/0.0.1/">0.0.1/</a></td>
            <td>Sun Jul 02 07:57:13 UTC 2017</td>
            <td align="right">
                              &nbsp;
                          </td>
            <td></td>
          </tr>
                  <tr>
            <td><a href="http://172.17.4.50:8081/content/repositories/releases/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/">repositories-mem/</a></td>
            <td>Sun Jul 02 08:22:27 UTC 2017</td>
            <td align="right">
                              &nbsp;
                          </td>
            <td></td>
          </tr>
                  <tr>
            <td><a href="http://172.17.4.50:8081/content/repositories/releases/com/openshift/evangelists/microservices-demo-springboot/web/">web/</a></td>
            <td>Sun Jul 02 08:22:31 UTC 2017</td>
            <td align="right">
                              &nbsp;
                          </td>
            <td></td>
          </tr>
                  <tr>
            <td><a href="http://172.17.4.50:8081/content/repositories/releases/com/openshift/evangelists/microservices-demo-springboot/maven-metadata.xml">maven-metadata.xml</a></td>
            <td>Sun Jul 02 05:45:11 UTC 2017</td>
            <td align="right">
                              334
                          </td>
            <td></td>
          </tr>
                  <tr>
            <td><a href="http://172.17.4.50:8081/content/repositories/releases/com/openshift/evangelists/microservices-demo-springboot/maven-metadata.xml.md5">maven-metadata.xml.md5</a></td>
            <td>Sun Jul 02 05:45:11 UTC 2017</td>
            <td align="right">
                              32
                          </td>
            <td></td>
          </tr>
                  <tr>
            <td><a href="http://172.17.4.50:8081/content/repositories/releases/com/openshift/evangelists/microservices-demo-springboot/maven-metadata.xml.sha1">maven-metadata.xml.sha1</a></td>
            <td>Sun Jul 02 05:45:11 UTC 2017</td>
            <td align="right">
                              40
                          </td>
            <td></td>
          </tr>
            </table>
  </body>
</html>
```

With `mvn install`
```
fanhonglingdeMacBook-Pro:sample-microservices-springboot fanhongling$ mvn install
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] web
[INFO] repositories-mem
[INFO] microservices-demo
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building web 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ web ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 10 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ web ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ web ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ web ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.17:test (default-test) @ web ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ web ---
[INFO] Building jar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/target/web.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.2.5.RELEASE:repackage (default) @ web ---
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ web ---
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/target/web.jar to /Users/fanhongling/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1-SNAPSHOT/web-0.0.1-SNAPSHOT.jar
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/pom.xml to /Users/fanhongling/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1-SNAPSHOT/web-0.0.1-SNAPSHOT.pom
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building repositories-mem 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ repositories-mem ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ repositories-mem ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ repositories-mem ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ repositories-mem ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.17:test (default-test) @ repositories-mem ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ repositories-mem ---
[INFO] Building jar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/target/repositories-mem.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.2.5.RELEASE:repackage (default) @ repositories-mem ---
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ repositories-mem ---
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/target/repositories-mem.jar to /Users/fanhongling/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/0.0.1-SNAPSHOT/repositories-mem-0.0.1-SNAPSHOT.jar
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/pom.xml to /Users/fanhongling/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/0.0.1-SNAPSHOT/repositories-mem-0.0.1-SNAPSHOT.pom
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building microservices-demo 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ microservices-demo-springboot ---
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/pom.xml to /Users/fanhongling/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/0.0.1-SNAPSHOT/microservices-demo-springboot-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO] 
[INFO] web ................................................ SUCCESS [  2.644 s]
[INFO] repositories-mem ................................... SUCCESS [  0.716 s]
[INFO] microservices-demo ................................. SUCCESS [  0.072 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.830 s
[INFO] Finished at: 2017-07-01T23:55:06-07:00
[INFO] Final Memory: 20M/331M
[INFO] ------------------------------------------------------------------------
```

With spring-boot repackage & fabric8-docker build
```
[vagrant@localhost sample-microservices-springboot]$ mvn install spring-boot:repackage io.fabric8:docker-maven-plugin:build
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for com.openshift.evangelists:microservices-demo-springboot:pom:0.0.1-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.springframework.boot:spring-boot-maven-plugin is missing. @ line 142, column 14
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] web
[INFO] repositories-mem
[INFO] microservices-demo
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building web 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ web ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 11 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ web ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ web ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ web ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ web ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:2.6:jar (default-jar) @ web ---
[INFO] Building jar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/target/web.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.5.4.RELEASE:repackage (default) @ web ---
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ web ---
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/target/web.jar to /home/vagrant/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1-SNAPSHOT/web-0.0.1-SNAPSHOT.jar
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/pom.xml to /home/vagrant/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1-SNAPSHOT/web-0.0.1-SNAPSHOT.pom
[INFO] 
[INFO] --- docker-maven-plugin:0.21.0:build (docker-build) @ web ---
[INFO] Copying files to /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/target/docker/172.17.4.50/5000/springboot-osev3-examples/web/build/maven
[INFO] Building tar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/target/docker/172.17.4.50/5000/springboot-osev3-examples/web/tmp/docker-build.tar
[INFO] DOCKER> [172.17.4.50:5000/springboot-osev3-examples:web]: Created docker-build.tar in 19 seconds 
[INFO] DOCKER> [172.17.4.50:5000/springboot-osev3-examples:web]: Built image sha256:a3af4
[INFO] DOCKER> [172.17.4.50:5000/springboot-osev3-examples:web]: Removed old image sha256:018e2
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.5.4.RELEASE:repackage (default-cli) @ web ---
[INFO] 
[INFO] --- docker-maven-plugin:0.21.0:build (default-cli) @ web ---
[INFO] Copying files to /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/target/docker/172.17.4.50/5000/springboot-osev3-examples/web/build/maven
[INFO] Building tar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/target/docker/172.17.4.50/5000/springboot-osev3-examples/web/tmp/docker-build.tar
[INFO] DOCKER> [172.17.4.50:5000/springboot-osev3-examples:web]: Created docker-build.tar in 8 seconds 
[INFO] DOCKER> [172.17.4.50:5000/springboot-osev3-examples:web]: Built image sha256:a3af4
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building repositories-mem 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ repositories-mem ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ repositories-mem ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ repositories-mem ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ repositories-mem ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ repositories-mem ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:2.6:jar (default-jar) @ repositories-mem ---
[INFO] Building jar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/target/repositories-mem.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.5.4.RELEASE:repackage (default) @ repositories-mem ---
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ repositories-mem ---
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/target/repositories-mem.jar to /home/vagrant/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/0.0.1-SNAPSHOT/repositories-mem-0.0.1-SNAPSHOT.jar
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/pom.xml to /home/vagrant/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/0.0.1-SNAPSHOT/repositories-mem-0.0.1-SNAPSHOT.pom
[INFO] 
[INFO] --- docker-maven-plugin:0.21.0:build (docker-build) @ repositories-mem ---
[INFO] Copying files to /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/target/docker/172.17.4.50/5000/springboot-osev3-examples/repositories-mem/build/maven
[INFO] Building tar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/target/docker/172.17.4.50/5000/springboot-osev3-examples/repositories-mem/tmp/docker-build.tar
[INFO] DOCKER> [172.17.4.50:5000/springboot-osev3-examples:repositories-mem]: Created docker-build.tar in 3 seconds 
[INFO] DOCKER> [172.17.4.50:5000/springboot-osev3-examples:repositories-mem]: Built image sha256:bd3d5
[INFO] DOCKER> [172.17.4.50:5000/springboot-osev3-examples:repositories-mem]: Removed old image sha256:e6468
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.5.4.RELEASE:repackage (default-cli) @ repositories-mem ---
[INFO] 
[INFO] --- docker-maven-plugin:0.21.0:build (default-cli) @ repositories-mem ---
[INFO] Copying files to /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/target/docker/172.17.4.50/5000/springboot-osev3-examples/repositories-mem/build/maven
[INFO] Building tar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/target/docker/172.17.4.50/5000/springboot-osev3-examples/repositories-mem/tmp/docker-build.tar
[INFO] DOCKER> [172.17.4.50:5000/springboot-osev3-examples:repositories-mem]: Created docker-build.tar in 2 seconds 
[INFO] DOCKER> [172.17.4.50:5000/springboot-osev3-examples:repositories-mem]: Built image sha256:bd3d5
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building microservices-demo 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ microservices-demo-springboot ---
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/pom.xml to /home/vagrant/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/0.0.1-SNAPSHOT/microservices-demo-springboot-0.0.1-SNAPSHOT.pom
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.0.0.M2:repackage (default-cli) @ microservices-demo-springboot ---
[INFO] 
[INFO] --- docker-maven-plugin:0.21.0:build (default-cli) @ microservices-demo-springboot ---
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO] 
[INFO] web ................................................ SUCCESS [01:10 min]
[INFO] repositories-mem ................................... SUCCESS [ 41.947 s]
[INFO] microservices-demo ................................. SUCCESS [  2.966 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 02:00 min
[INFO] Finished at: 2017-07-22T10:04:55+00:00
[INFO] Final Memory: 58M/494M
[INFO] ------------------------------------------------------------------------
```

With `mvn deploy` and local repository
```
[vagrant@localhost sample-microservices-springboot]$ mvn deploy
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] web
[INFO] repositories-mem
[INFO] microservices-demo
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building web 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ web ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 10 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ web ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ web ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ web ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.17:test (default-test) @ web ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ web ---
[INFO] Building jar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/target/web.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.2.5.RELEASE:repackage (default) @ web ---
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ web ---
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/target/web.jar to /home/vagrant/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1-SNAPSHOT/web-0.0.1-SNAPSHOT.jar
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/pom.xml to /home/vagrant/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1-SNAPSHOT/web-0.0.1-SNAPSHOT.pom
[INFO] 
[INFO] --- maven-deploy-plugin:2.8.2:deploy (default-deploy) @ web ---
Downloading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1-SNAPSHOT/maven-metadata.xml
Downloaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1-SNAPSHOT/maven-metadata.xml (808 B at 4.1 KB/sec)
Uploading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1-SNAPSHOT/web-0.0.1-20170702.065910-4.jar
Uploaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1-SNAPSHOT/web-0.0.1-20170702.065910-4.jar (15673 KB at 4044.4 KB/sec)
Uploading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1-SNAPSHOT/web-0.0.1-20170702.065910-4.pom
Uploaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1-SNAPSHOT/web-0.0.1-20170702.065910-4.pom (3 KB at 41.2 KB/sec)
Downloading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/web/maven-metadata.xml
Downloaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/web/maven-metadata.xml (318 B at 4.4 KB/sec)
Uploading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1-SNAPSHOT/maven-metadata.xml
Uploaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/web/0.0.1-SNAPSHOT/maven-metadata.xml (808 B at 13.8 KB/sec)
Uploading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/web/maven-metadata.xml
Uploaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/web/maven-metadata.xml (318 B at 4.2 KB/sec)
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building repositories-mem 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ repositories-mem ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ repositories-mem ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ repositories-mem ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ repositories-mem ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-surefire-plugin:2.17:test (default-test) @ repositories-mem ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:2.5:jar (default-jar) @ repositories-mem ---
[INFO] Building jar: /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/target/repositories-mem.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.2.5.RELEASE:repackage (default) @ repositories-mem ---
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ repositories-mem ---
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/target/repositories-mem.jar to /home/vagrant/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/0.0.1-SNAPSHOT/repositories-mem-0.0.1-SNAPSHOT.jar
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/pom.xml to /home/vagrant/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/0.0.1-SNAPSHOT/repositories-mem-0.0.1-SNAPSHOT.pom
[INFO] 
[INFO] --- maven-deploy-plugin:2.8.2:deploy (default-deploy) @ repositories-mem ---
Downloading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/0.0.1-SNAPSHOT/maven-metadata.xml
Downloaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/0.0.1-SNAPSHOT/maven-metadata.xml (821 B at 18.2 KB/sec)
Uploading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/0.0.1-SNAPSHOT/repositories-mem-0.0.1-20170702.065917-3.jar
Uploaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/0.0.1-SNAPSHOT/repositories-mem-0.0.1-20170702.065917-3.jar (17329 KB at 5195.9 KB/sec)
Uploading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/0.0.1-SNAPSHOT/repositories-mem-0.0.1-20170702.065917-3.pom
Uploaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/0.0.1-SNAPSHOT/repositories-mem-0.0.1-20170702.065917-3.pom (3 KB at 29.3 KB/sec)
Downloading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/maven-metadata.xml
Downloaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/maven-metadata.xml (331 B at 5.6 KB/sec)
Uploading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/0.0.1-SNAPSHOT/maven-metadata.xml
Uploaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/0.0.1-SNAPSHOT/maven-metadata.xml (821 B at 14.8 KB/sec)
Uploading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/maven-metadata.xml
Uploaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/repositories-mem/maven-metadata.xml (331 B at 5.4 KB/sec)
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building microservices-demo 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ microservices-demo-springboot ---
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/pom.xml to /home/vagrant/.m2/repository/com/openshift/evangelists/microservices-demo-springboot/0.0.1-SNAPSHOT/microservices-demo-springboot-0.0.1-SNAPSHOT.pom
[INFO] 
[INFO] --- maven-deploy-plugin:2.8.2:deploy (default-deploy) @ microservices-demo-springboot ---
[INFO] Skipping artifact deployment
[INFO] 
[INFO] --- nexus-staging-maven-plugin:1.6.8:deploy (default-deploy) @ microservices-demo-springboot ---
[INFO] Performing deferred deploys (gathering into "/Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/target/nexus-staging/deferred")...
[INFO] Installing /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/pom.xml to /Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/target/nexus-staging/deferred/com/openshift/evangelists/microservices-demo-springboot/0.0.1-SNAPSHOT/microservices-demo-springboot-0.0.1-SNAPSHOT.pom
[INFO] Deploying remotely...
[INFO] Bulk deploying locally gathered artifacts from directory: 
[INFO]  * Bulk deploying locally gathered snapshot artifacts
Downloading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/0.0.1-SNAPSHOT/maven-metadata.xml
Downloaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/0.0.1-SNAPSHOT/maven-metadata.xml (631 B at 9.3 KB/sec)
Uploading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/0.0.1-SNAPSHOT/microservices-demo-springboot-0.0.1-20170702.065924-2.pom
Uploaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/0.0.1-SNAPSHOT/microservices-demo-springboot-0.0.1-20170702.065924-2.pom (4 KB at 13.9 KB/sec)
Downloading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/maven-metadata.xml
Downloaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/maven-metadata.xml (314 B at 5.5 KB/sec)
Uploading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/0.0.1-SNAPSHOT/maven-metadata.xml
Uploaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/0.0.1-SNAPSHOT/maven-metadata.xml (631 B at 3.5 KB/sec)
Uploading: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/maven-metadata.xml
Uploaded: http://172.17.4.50:8081/content/repositories/snapshots/com/openshift/evangelists/microservices-demo-springboot/maven-metadata.xml (314 B at 5.8 KB/sec)
[INFO]  * Bulk deploy of locally gathered snapshot artifacts finished.
[INFO] Remote deploy finished with success.
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO] 
[INFO] web ................................................ SUCCESS [ 15.495 s]
[INFO] repositories-mem ................................... SUCCESS [  7.189 s]
[INFO] microservices-demo ................................. SUCCESS [  3.116 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 26.553 s
[INFO] Finished at: 2017-07-02T06:59:24+00:00
[INFO] Final Memory: 31M/226M
[INFO] ------------------------------------------------------------------------
```

Maven _settting.xml_

```
[vagrant@localhost sample-microservices-springboot]$ cat ~/.m2/settings.xml 
<?xml version="1.0" encoding="UTF-8"?>

<!--
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
-->

<!--
 | This is the configuration file for Maven. It can be specified at two levels:
 |
 |  1. User Level. This settings.xml file provides configuration for a single user,
 |                 and is normally provided in ${user.home}/.m2/settings.xml.
 |
 |                 NOTE: This location can be overridden with the CLI option:
 |
 |                 -s /path/to/user/settings.xml
 |
 |  2. Global Level. This settings.xml file provides configuration for all Maven
 |                 users on a machine (assuming they're all using the same Maven
 |                 installation). It's normally provided in
 |                 ${maven.home}/conf/settings.xml.
 |
 |                 NOTE: This location can be overridden with the CLI option:
 |
 |                 -gs /path/to/global/settings.xml
 |
 | The sections in this sample file are intended to give you a running start at
 | getting the most out of your Maven installation. Where appropriate, the default
 | values (values used when the setting is not specified) are provided.
 |
 |-->
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
  <!-- localRepository
   | The path to the local repository maven will use to store artifacts.
   |
   | Default: ${user.home}/.m2/repository
  <localRepository>/path/to/local/repo</localRepository>
  -->

  <!-- interactiveMode
   | This will determine whether maven prompts you when it needs input. If set to false,
   | maven will use a sensible default value, perhaps based on some other setting, for
   | the parameter in question.
   |
   | Default: true
  <interactiveMode>true</interactiveMode>
  -->

  <!-- offline
   | Determines whether maven should attempt to connect to the network when executing a build.
   | This will have an effect on artifact downloads, artifact deployment, and others.
   |
   | Default: false
  <offline>false</offline>
  -->

  <!-- pluginGroups
   | This is a list of additional group identifiers that will be searched when resolving plugins by their prefix, i.e.
   | when invoking a command line like "mvn prefix:goal". Maven will automatically add the group identifiers
   | "org.apache.maven.plugins" and "org.codehaus.mojo" if these are not already contained in the list.
   |-->
  <pluginGroups>
    <!-- pluginGroup
     | Specifies a further group identifier to use for plugin lookup.
    <pluginGroup>com.your.plugins</pluginGroup>
    -->
  </pluginGroups>

  <!-- proxies
   | This is a list of proxies which can be used on this machine to connect to the network.
   | Unless otherwise specified (by system property or command-line switch), the first proxy
   | specification in this list marked as active will be used.
   |-->
  <proxies>
    <!-- proxy
     | Specification for one proxy, to be used in connecting to the network.
     |
    <proxy>
      <id>optional</id>
      <active>true</active>
      <protocol>http</protocol>
      <username>proxyuser</username>
      <password>proxypass</password>
      <host>proxy.host.net</host>
      <port>80</port>
      <nonProxyHosts>local.net|some.host.com</nonProxyHosts>
    </proxy>
    -->
  </proxies>

  <!-- servers
   | This is a list of authentication profiles, keyed by the server-id used within the system.
   | Authentication profiles can be used whenever maven must make a connection to a remote server.
   |-->
  <servers>
        <server>
            <id>my-snapshots</id>
            <username>admin</username>
            <password>admin123</password>
        </server>
        <server>
            <id>my-releases</id>
            <username>admin</username>
            <password>admin123</password>
        </server>
    <!-- server
     | Specifies the authentication information to use when connecting to a particular server, identified by
     | a unique name within the system (referred to by the 'id' attribute below).
     |
     | NOTE: You should either specify username/password OR privateKey/passphrase, since these pairings are
     |       used together.
     |
    <server>
      <id>deploymentRepo</id>
      <username>repouser</username>
      <password>repopwd</password>
    </server>
    -->

    <!-- Another sample, using keys to authenticate.
    <server>
      <id>siteServer</id>
      <privateKey>/path/to/private/key</privateKey>
      <passphrase>optional; leave empty if not used.</passphrase>
    </server>
    -->
  </servers>

  <!-- mirrors
   | This is a list of mirrors to be used in downloading artifacts from remote repositories.
   |
   | It works like this: a POM may declare a repository to use in resolving certain artifacts.
   | However, this repository may have problems with heavy traffic at times, so people have mirrored
   | it to several places.
   |
   | That repository definition will have a unique id, so we can create a mirror reference for that
   | repository, to be used as an alternate download site. The mirror site will be the preferred
   | server for that repository.
   |-->
  <mirrors>
        <mirror>
            <id>nexus</id>
            <mirrorOf>*</mirrorOf>
            <url>http://172.17.4.50:8081/content/groups/public</url>
        </mirror>
    <!-- mirror
     | Specifies a repository mirror site to use instead of a given repository. The repository that
     | this mirror serves has an ID that matches the mirrorOf element of this mirror. IDs are used
     | for inheritance and direct lookup purposes, and must be unique across the set of mirrors.
     |
    <mirror>
      <id>mirrorId</id>
      <mirrorOf>repositoryId</mirrorOf>
      <name>Human Readable Name for this Mirror.</name>
      <url>http://my.repository.com/repo/path</url>
    </mirror>
     -->
  </mirrors>

  <!-- profiles
   | This is a list of profiles which can be activated in a variety of ways, and which can modify
   | the build process. Profiles provided in the settings.xml are intended to provide local machine-
   | specific paths and repository locations which allow the build to work in the local environment.
   |
   | For example, if you have an integration testing plugin - like cactus - that needs to know where
   | your Tomcat instance is installed, you can provide a variable here such that the variable is
   | dereferenced during the build process to configure the cactus plugin.
   |
   | As noted above, profiles can be activated in a variety of ways. One way - the activeProfiles
   | section of this document (settings.xml) - will be discussed later. Another way essentially
   | relies on the detection of a system property, either matching a particular value for the property,
   | or merely testing its existence. Profiles can also be activated by JDK version prefix, where a
   | value of '1.4' might activate a profile when the build is executed on a JDK version of '1.4.2_07'.
   | Finally, the list of active profiles can be specified directly from the command line.
   |
   | NOTE: For profiles defined in the settings.xml, you are restricted to specifying only artifact
   |       repositories, plugin repositories, and free-form properties to be used as configuration
   |       variables for plugins in the POM.
   |
   |-->
  <profiles>
        <profile>
            <id>staging</id>
            <repositories>
                <repository>
                    <id>nexusLocalSync</id>
                    <url>http://172.17.4.50:8081/content/repositories/allsynced/</url>
                    <releases>
                        <enabled>true</enabled>
                    </releases>
                    <snapshots>
                        <enabled>true</enabled>
                    </snapshots>
                </repository>
                <repository>
                    <id>nexusLocalRepo</id>
                    <url>http://172.17.4.50:8081/content/repositories/releases/</url>
                    <releases>
                        <enabled>true</enabled>
                    </releases>
                    <snapshots>
                        <enabled>true</enabled>
                    </snapshots>
                </repository>
            </repositories>

            <pluginRepositories>
                <pluginRepository>
                    <id>nexusLocalSync</id>
                    <url>http://172.17.4.50:8081/content/repositories/allsynced/</url>
                    <releases>
                        <enabled>true</enabled>
                    </releases>
                    <snapshots>
                        <enabled>true</enabled>
                    </snapshots>
                </pluginRepository>
                <pluginRepository>
                    <id>nexusLocalRepo</id>
                    <url>http://172.17.4.50:8081/content/repositories/snapshots/</url>
                    <releases>
                        <enabled>true</enabled>
                    </releases>
                    <snapshots>
                        <enabled>true</enabled>
                    </snapshots>
                </pluginRepository>
            </pluginRepositories>
        </profile>
    <!-- profile
     | Specifies a set of introductions to the build process, to be activated using one or more of the
     | mechanisms described above. For inheritance purposes, and to activate profiles via <activatedProfiles/>
     | or the command line, profiles have to have an ID that is unique.
     |
     | An encouraged best practice for profile identification is to use a consistent naming convention
     | for profiles, such as 'env-dev', 'env-test', 'env-production', 'user-jdcasey', 'user-brett', etc.
     | This will make it more intuitive to understand what the set of introduced profiles is attempting
     | to accomplish, particularly when you only have a list of profile id's for debug.
     |
     | This profile example uses the JDK version to trigger activation, and provides a JDK-specific repo.
    <profile>
      <id>jdk-1.4</id>

      <activation>
        <jdk>1.4</jdk>
      </activation>

      <repositories>
        <repository>
          <id>jdk14</id>
          <name>Repository for JDK 1.4 builds</name>
          <url>http://www.myhost.com/maven/jdk14</url>
          <layout>default</layout>
          <snapshotPolicy>always</snapshotPolicy>
        </repository>
      </repositories>
    </profile>
    -->

    <!--
     | Here is another profile, activated by the system property 'target-env' with a value of 'dev',
     | which provides a specific path to the Tomcat instance. To use this, your plugin configuration
     | might hypothetically look like:
     |
     | ...
     | <plugin>
     |   <groupId>org.myco.myplugins</groupId>
     |   <artifactId>myplugin</artifactId>
     |
     |   <configuration>
     |     <tomcatLocation>${tomcatPath}</tomcatLocation>
     |   </configuration>
     | </plugin>
     | ...
     |
     | NOTE: If you just wanted to inject this configuration whenever someone set 'target-env' to
     |       anything, you could just leave off the <value/> inside the activation-property.
     |
    <profile>
      <id>env-dev</id>

      <activation>
        <property>
          <name>target-env</name>
          <value>dev</value>
        </property>
      </activation>

      <properties>
        <tomcatPath>/path/to/tomcat/instance</tomcatPath>
      </properties>
    </profile>
    -->
  </profiles>

    <activeProfiles>
        <activeProfile>staging</activeProfile>
    </activeProfiles>
  <!-- activeProfiles
   | List of profiles that are active for all builds.
   |
  <activeProfiles>
    <activeProfile>alwaysActiveProfile</activeProfile>
    <activeProfile>anotherAlwaysActiveProfile</activeProfile>
  </activeProfiles>
  -->
</settings>
```

### Docker build and push

With `gradle dockerBuild`
```
[vagrant@localhost sample-microservices-springboot]$ ./gradlew :web:dockerBuild
:web:copyTask
:web:dockerBuild
Building image using context '/Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/build/libs'.
Using Dockerfile '/Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/build/libs/Dockerfile'
Using tag '172.17.4.50:5000/springboot-osev3-examples:web' for image.
Step 1 : FROM docker.io/centos:centos7
---> 34c4689f9727
Step 2 : LABEL maintainer "tangfeixiong" mailto "tangfx128@gmail.com" project "https://github.com/tangfeixiong/osev3-examples/tree/cicd/spring-boot/sample-microservices-springboot" name "web"
---> Using cache
---> 83de36713f81
Step 3 : ARG app_version=0.0.1
---> Using cache
---> c99de0c9229d
Step 4 : ENV JAVA_HOME "/opt/java" JAVA_OPTIONS "-Xms128m -Xmx512m -XX:PermSize=128m -XX:MaxPermSize=256m" SERVER_PORT 8091
---> Using cache
---> 13abaa6e73a2
Step 5 : COPY /web-${app_version}.jar /
---> Using cache
---> 130cb059d358
Step 6 : RUN set -x     && install_pkgs="         tar         unzip         bc         which         lsof         java-1.8.0-openjdk-headless     "     && if [[ -z $localrepo_url ]]; then         yum install -y $install_pkgs;     else         curl -jkSL $localrepo_url -o /etc/yum.repos.d/local.repo;         yum install -y --disablerepo=\* --enablerepo=localbase,localrepo-\* $install_pkgs;     fi     && yum clean all -y     && export JAVA_OPTIONS="-Xms128m -Xmx256m -XX:PermSize=128m -XX:MaxPermSize=128m"
---> Running in 8e578f69deee
[91m+ install_pkgs='         tar         unzip         bc         which         lsof         java-1.8.0-openjdk-headless     '

[91m+ [[ -z '' ]]
+ yum install -y tar unzip bc which lsof java-1.8.0-openjdk-headless

Loaded plugins: fastestmirror, ovl
Determining fastest mirrors
* base: ftp.tsukuba.wide.ad.jp
* extras: centosv4.centos.org
* updates: ftp.tsukuba.wide.ad.jp
Resolving Dependencies
--> Running transaction check
---> Package bc.x86_64 0:1.06.95-13.el7 will be installed
---> Package java-1.8.0-openjdk-headless.x86_64 1:1.8.0.131-3.b12.el7_3 will be installed
--> Processing Dependency: tzdata-java >= 2015d for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: nss(x86-64) >= 3.28.4 for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: copy-jdk-configs >= 1.1-3 for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: chkconfig >= 1.7 for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: chkconfig >= 1.7 for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: lksctp-tools(x86-64) for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: libjpeg.so.62(LIBJPEG_6.2)(64bit) for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: jpackage-utils for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: libjpeg.so.62()(64bit) for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: libfreetype.so.6()(64bit) for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
---> Package lsof.x86_64 0:4.87-4.el7 will be installed
---> Package tar.x86_64 2:1.26-29.el7 will be updated
---> Package tar.x86_64 2:1.26-31.el7 will be an update
---> Package unzip.x86_64 0:6.0-16.el7 will be installed
---> Package which.x86_64 0:2.20-7.el7 will be installed
--> Running transaction check
---> Package chkconfig.x86_64 0:1.3.61-5.el7_2.1 will be updated
---> Package chkconfig.x86_64 0:1.7.2-1.el7_3.1 will be an update
---> Package copy-jdk-configs.noarch 0:1.2-1.el7 will be installed
---> Package freetype.x86_64 0:2.4.11-12.el7 will be installed
---> Package javapackages-tools.noarch 0:3.4.1-11.el7 will be installed
--> Processing Dependency: python-javapackages = 3.4.1-11.el7 for package: javapackages-tools-3.4.1-11.el7.noarch
--> Processing Dependency: libxslt for package: javapackages-tools-3.4.1-11.el7.noarch
---> Package libjpeg-turbo.x86_64 0:1.2.90-5.el7 will be installed
---> Package lksctp-tools.x86_64 0:1.0.17-2.el7 will be installed
---> Package nss.x86_64 0:3.21.0-9.el7_2 will be updated
--> Processing Dependency: nss = 3.21.0-9.el7_2 for package: nss-sysinit-3.21.0-9.el7_2.x86_64
--> Processing Dependency: nss(x86-64) = 3.21.0-9.el7_2 for package: nss-tools-3.21.0-9.el7_2.x86_64
---> Package nss.x86_64 0:3.28.4-1.2.el7_3 will be an update
--> Processing Dependency: nss-util >= 3.28.2-1.1 for package: nss-3.28.4-1.2.el7_3.x86_64
--> Processing Dependency: nspr >= 4.13.1 for package: nss-3.28.4-1.2.el7_3.x86_64
--> Processing Dependency: libnssutil3.so(NSSUTIL_3.24)(64bit) for package: nss-3.28.4-1.2.el7_3.x86_64
---> Package tzdata-java.noarch 0:2017b-1.el7 will be installed
--> Running transaction check
---> Package libxslt.x86_64 0:1.1.28-5.el7 will be installed
---> Package nspr.x86_64 0:4.11.0-1.el7_2 will be updated
---> Package nspr.x86_64 0:4.13.1-1.0.el7_3 will be an update
---> Package nss-sysinit.x86_64 0:3.21.0-9.el7_2 will be updated
---> Package nss-sysinit.x86_64 0:3.28.4-1.2.el7_3 will be an update
---> Package nss-tools.x86_64 0:3.21.0-9.el7_2 will be updated
---> Package nss-tools.x86_64 0:3.28.4-1.2.el7_3 will be an update
---> Package nss-util.x86_64 0:3.21.0-2.2.el7_2 will be updated
---> Package nss-util.x86_64 0:3.28.4-1.0.el7_3 will be an update
---> Package python-javapackages.noarch 0:3.4.1-11.el7 will be installed
--> Processing Dependency: python-lxml for package: python-javapackages-3.4.1-11.el7.noarch
--> Running transaction check
---> Package python-lxml.x86_64 0:3.2.1-4.el7 will be installed
--> Finished Dependency Resolution
Dependencies Resolved
================================================================================
 Package                      Arch    Version                    Repository
                                                                           Size
================================================================================
Installing:
 bc                           x86_64  1.06.95-13.el7             base     115 k
 java-1.8.0-openjdk-headless  x86_64  1:1.8.0.131-3.b12.el7_3    updates   31 M
 lsof                         x86_64  4.87-4.el7                 base     331 k
 unzip                        x86_64  6.0-16.el7                 base     169 k
 which                        x86_64  2.20-7.el7                 base      41 k
Updating:
 tar                          x86_64  2:1.26-31.el7              base     843 k
Installing for dependencies:
 copy-jdk-configs             noarch  1.2-1.el7                  base      14 k
 freetype                     x86_64  2.4.11-12.el7              base     391 k
 javapackages-tools           noarch  3.4.1-11.el7               base      73 k
 libjpeg-turbo                x86_64  1.2.90-5.el7               base     134 k
 libxslt                      x86_64  1.1.28-5.el7               base     242 k
 lksctp-tools                 x86_64  1.0.17-2.el7               base      88 k
 python-javapackages          noarch  3.4.1-11.el7               base      31 k
 python-lxml                  x86_64  3.2.1-4.el7                base     758 k
 tzdata-java                  noarch  2017b-1.el7                updates  183 k
Updating for dependencies:
 chkconfig                    x86_64  1.7.2-1.el7_3.1            updates  175 k
 nspr                         x86_64  4.13.1-1.0.el7_3           updates  126 k
 nss                          x86_64  3.28.4-1.2.el7_3           updates  872 k
 nss-sysinit                  x86_64  3.28.4-1.2.el7_3           updates   58 k
 nss-tools                    x86_64  3.28.4-1.2.el7_3           updates  496 k
 nss-util                     x86_64  3.28.4-1.0.el7_3           updates   73 k

Transaction Summary
================================================================================
Install  5 Packages (+9 Dependent packages)
Upgrade  1 Package  (+6 Dependent packages)
Total download size: 36 M
Downloading packages:
Delta RPMs disabled because /usr/bin/applydeltarpm not installed.
[91mwarning: /var/cache/yum/x86_64/7/base/packages/copy-jdk-configs-1.2-1.el7.noarch.rpm: Header V3 RSA/SHA256 Signature, key ID f4a80eb5: NOKEY

Public key for copy-jdk-configs-1.2-1.el7.noarch.rpm is not installed
Public key for chkconfig-1.7.2-1.el7_3.1.x86_64.rpm is not installed
--------------------------------------------------------------------------------
Total                                              1.1 MB/s |  36 MB  00:32
Retrieving key from file:///etc/pki/rpm-gpg/RPM-GPG-KEY-CentOS-7
[91mImporting GPG key 0xF4A80EB5:
 Userid     : "CentOS-7 Key (CentOS 7 Official Signing Key) <security@centos.org>"
 Fingerprint: 6341 ab27 53d7 8a78 a7c2 7bb1 24c6 a8a7 f4a8 0eb5
 Package    : centos-release-7-2.1511.el7.centos.2.10.x86_64 (@CentOS)
 From       : /etc/pki/rpm-gpg/RPM-GPG-KEY-CentOS-7

Running transaction check
Running transaction test
Transaction test succeeded
Running transaction
Updating   : nspr-4.13.1-1.0.el7_3.x86_64                                1/28
Updating   : nss-util-3.28.4-1.0.el7_3.x86_64                            2/28
Installing : libxslt-1.1.28-5.el7.x86_64                                 3/28
Updating   : chkconfig-1.7.2-1.el7_3.1.x86_64                            4/28
Updating   : nss-sysinit-3.28.4-1.2.el7_3.x86_64                         5/28
Updating   : nss-3.28.4-1.2.el7_3.x86_64                                 6/28
Installing : python-lxml-3.2.1-4.el7.x86_64                              7/28
Installing : python-javapackages-3.4.1-11.el7.noarch                     8/28
Installing : javapackages-tools-3.4.1-11.el7.noarch                      9/28
Installing : freetype-2.4.11-12.el7.x86_64                              10/28
Installing : tzdata-java-2017b-1.el7.noarch                             11/28
Installing : copy-jdk-configs-1.2-1.el7.noarch                          12/28
Installing : lksctp-tools-1.0.17-2.el7.x86_64                           13/28
Installing : libjpeg-turbo-1.2.90-5.el7.x86_64                          14/28
Installing : 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_   15/28
Updating   : nss-tools-3.28.4-1.2.el7_3.x86_64                          16/28
Installing : lsof-4.87-4.el7.x86_64                                     17/28
Updating   : 2:tar-1.26-31.el7.x86_64                                   18/28
Installing : which-2.20-7.el7.x86_64                                    19/28
install-info: No such file or directory for /usr/share/info/which.info.gz
Installing : bc-1.06.95-13.el7.x86_64                                   20/28
Installing : unzip-6.0-16.el7.x86_64                                    21/28
Cleanup    : nss-tools-3.21.0-9.el7_2.x86_64                            22/28
Cleanup    : nss-sysinit-3.21.0-9.el7_2.x86_64                          23/28
Cleanup    : nss-3.21.0-9.el7_2.x86_64                                  24/28
Cleanup    : nss-util-3.21.0-2.2.el7_2.x86_64                           25/28
Cleanup    : nspr-4.11.0-1.el7_2.x86_64                                 26/28
Cleanup    : chkconfig-1.3.61-5.el7_2.1.x86_64                          27/28
Cleanup    : 2:tar-1.26-29.el7.x86_64                                   28/28
Verifying  : python-javapackages-3.4.1-11.el7.noarch                     1/28
Verifying  : nss-tools-3.28.4-1.2.el7_3.x86_64                           2/28
Verifying  : libjpeg-turbo-1.2.90-5.el7.x86_64                           3/28
Verifying  : nss-3.28.4-1.2.el7_3.x86_64                                 4/28
Verifying  : python-lxml-3.2.1-4.el7.x86_64                              5/28
Verifying  : unzip-6.0-16.el7.x86_64                                     6/28
Verifying  : nss-util-3.28.4-1.0.el7_3.x86_64                            7/28
Verifying  : bc-1.06.95-13.el7.x86_64                                    8/28
Verifying  : 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_    9/28
Verifying  : which-2.20-7.el7.x86_64                                    10/28
Verifying  : chkconfig-1.7.2-1.el7_3.1.x86_64                           11/28
Verifying  : 2:tar-1.26-31.el7.x86_64                                   12/28
Verifying  : lksctp-tools-1.0.17-2.el7.x86_64                           13/28
Verifying  : copy-jdk-configs-1.2-1.el7.noarch                          14/28
Verifying  : nss-sysinit-3.28.4-1.2.el7_3.x86_64                        15/28
Verifying  : libxslt-1.1.28-5.el7.x86_64                                16/28
Verifying  : tzdata-java-2017b-1.el7.noarch                             17/28
Verifying  : javapackages-tools-3.4.1-11.el7.noarch                     18/28
Verifying  : freetype-2.4.11-12.el7.x86_64                              19/28
Verifying  : lsof-4.87-4.el7.x86_64                                     20/28
Verifying  : nspr-4.13.1-1.0.el7_3.x86_64                               21/28
Verifying  : 2:tar-1.26-29.el7.x86_64                                   22/28
Verifying  : nspr-4.11.0-1.el7_2.x86_64                                 23/28
Verifying  : nss-3.21.0-9.el7_2.x86_64                                  24/28
Verifying  : nss-tools-3.21.0-9.el7_2.x86_64                            25/28
Verifying  : nss-sysinit-3.21.0-9.el7_2.x86_64                          26/28
Verifying  : chkconfig-1.3.61-5.el7_2.1.x86_64                          27/28
Verifying  : nss-util-3.21.0-2.2.el7_2.x86_64                           28/28
Installed:
  bc.x86_64 0:1.06.95-13.el7                                                    
  java-1.8.0-openjdk-headless.x86_64 1:1.8.0.131-3.b12.el7_3                    
  lsof.x86_64 0:4.87-4.el7                                                      
  unzip.x86_64 0:6.0-16.el7                                                     
  which.x86_64 0:2.20-7.el7                                                     

Dependency Installed:
  copy-jdk-configs.noarch 0:1.2-1.el7       freetype.x86_64 0:2.4.11-12.el7    
  javapackages-tools.noarch 0:3.4.1-11.el7  libjpeg-turbo.x86_64 0:1.2.90-5.el7
  libxslt.x86_64 0:1.1.28-5.el7             lksctp-tools.x86_64 0:1.0.17-2.el7 
  python-javapackages.noarch 0:3.4.1-11.el7 python-lxml.x86_64 0:3.2.1-4.el7   
  tzdata-java.noarch 0:2017b-1.el7         

Updated:
  tar.x86_64 2:1.26-31.el7                                                      

Dependency Updated:
  chkconfig.x86_64 0:1.7.2-1.el7_3.1    nspr.x86_64 0:4.13.1-1.0.el7_3         
  nss.x86_64 0:3.28.4-1.2.el7_3         nss-sysinit.x86_64 0:3.28.4-1.2.el7_3  
  nss-tools.x86_64 0:3.28.4-1.2.el7_3   nss-util.x86_64 0:3.28.4-1.0.el7_3
Complete!
[91m+ yum clean all -y

Loaded plugins: fastestmirror, ovl
Cleaning repos: base extras updates
Cleaning up everything
Cleaning up list of fastest mirrors
[91m+ export 'JAVA_OPTIONS=-Xms128m -Xmx256m -XX:PermSize=128m -XX:MaxPermSize=128m'

[91m+ JAVA_OPTIONS='-Xms128m -Xmx256m -XX:PermSize=128m -XX:MaxPermSize=128m'

---> 1d062bd96257
Removing intermediate container 8e578f69deee
Step 7 : EXPOSE 9091
---> Running in cfbb4a3936c3
---> 2211c455308a
Removing intermediate container cfbb4a3936c3
Step 8 : CMD java -Djava.security.egd=file:/dev/./urandom $JAVA_OPTIONS -jar /web.jar --server.port=$SERVER_PORT
---> Running in e6b59e604e6e
---> f4bca3b03e83
Removing intermediate container e6b59e604e6e
Successfully built f4bca3b03e83
Created image with ID 'f4bca3b03e83'.

BUILD SUCCESSFUL

Total time: 1 mins 34.615 secs
```

With `gradle dockerPush`
```
vagrant@localhost sample-microservices-springboot]$ ./gradlew :web:dockerPush
:web:copyTask UP-TO-DATE
:web:dockerBuild
Building image using context '/Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/build/libs'.
Using Dockerfile '/Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/web/build/libs/Dockerfile'
Using tag '172.17.4.50:5000/springboot-osev3-examples:web' for image.
Step 1 : FROM docker.io/centos:centos7
---> 34c4689f9727
Step 2 : LABEL maintainer "tangfeixiong" mailto "tangfx128@gmail.com" project "https://github.com/tangfeixiong/osev3-examples/tree/cicd/spring-boot/sample-microservices-springboot" name "web"
---> Using cache
---> 83de36713f81
Step 3 : ARG app_version=0.0.1
---> Using cache
---> c99de0c9229d
Step 4 : ENV JAVA_HOME "/opt/java" JAVA_OPTIONS "-Xms128m -Xmx512m -XX:PermSize=128m -XX:MaxPermSize=256m" SERVER_PORT 8091
---> Using cache
---> 13abaa6e73a2
Step 5 : COPY /web-${app_version}.jar /
---> Using cache
---> 130cb059d358
Step 6 : RUN set -x     && install_pkgs="         tar         unzip         bc         which         lsof         java-1.8.0-openjdk-headless     "     && if [[ -z $localrepo_url ]]; then         yum install -y $install_pkgs;     else         curl -jkSL $localrepo_url -o /etc/yum.repos.d/local.repo;         yum install -y --disablerepo=\* --enablerepo=localbase,localrepo-\* $install_pkgs;     fi     && yum clean all -y     && export JAVA_OPTIONS="-Xms128m -Xmx256m -XX:PermSize=128m -XX:MaxPermSize=128m"
---> Using cache
---> 1d062bd96257
Step 7 : EXPOSE 9091
---> Using cache
---> 2211c455308a
Step 8 : CMD java -Djava.security.egd=file:/dev/./urandom $JAVA_OPTIONS -jar /web.jar --server.port=$SERVER_PORT
---> Using cache
---> f4bca3b03e83
Successfully built f4bca3b03e83
Created image with ID 'f4bca3b03e83'.
:web:dockerPush
Pushing image with name '172.17.4.50:5000/springboot-osev3-examples'.

BUILD SUCCESSFUL

Total time: 27.046 secs
```

With `gradle dockerBuild`
```
[vagrant@localhost sample-microservices-springboot]$ ./gradlew :repositories-mem:dockerBuild
:repositories-mem:copyTask
:repositories-mem:dockerBuild
Building image using context '/Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/build/libs'.
Using Dockerfile '/Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/build/libs/Dockerfile'
Using tag '172.17.4.50:5000/springboot-osev3-examples:repositories-mem' for image.
Step 1 : FROM docker.io/centos:centos7
---> 34c4689f9727
Step 2 : LABEL maintainer "tangfeixiong" mailto "tangfx128@gmail.com" project "https://github.com/tangfeixiong/osev3-examples/tree/cicd/spring-boot/sample-microservices-springboot" name "web"
---> Using cache
---> 83de36713f81
Step 3 : ARG app_version=0.0.0
---> Running in 99cdb1f96743
---> a2646f3b8805
Removing intermediate container 99cdb1f96743
Step 4 : ENV JAVA_HOME "/opt/java" JAVA_OPTIONS "-Xms128m -Xmx512m -XX:PermSize=128m -XX:MaxPermSize=256m" SERVER_PORT 9091
---> Running in a965d7318f07
---> f11dcdaec999
Removing intermediate container a965d7318f07
Step 5 : COPY /repositories-mem-${app_version}.jar /repositories-mem.jar
---> 53cc6aff397a
Removing intermediate container 4552a71392b7
Step 6 : RUN set -x     && install_pkgs="         tar         unzip         bc         which         lsof         java-1.8.0-openjdk-headless     "     && if [[ -z $localrepo_url ]]; then         yum install -y $install_pkgs;     else         curl -jkSL $localrepo_url -o /etc/yum.repos.d/local.repo;         yum install -y --disablerepo=\* --enablerepo=localbase,localrepo-\* $install_pkgs;     fi     && yum clean all -y     && export JAVA_OPTIONS="-Xms128m -Xmx256m -XX:PermSize=128m -XX:MaxPermSize=128m"
---> Running in 5416c0e38fc7
[91m+ install_pkgs='         tar         unzip         bc         which         lsof         java-1.8.0-openjdk-headless     '
+ [[ -z '' ]]
+ yum install -y tar unzip bc which lsof java-1.8.0-openjdk-headless

Loaded plugins: fastestmirror, ovl
Determining fastest mirrors
* base: www.ftp.ne.jp
* extras: centosv4.centos.org
* updates: www.ftp.ne.jp
Resolving Dependencies
--> Running transaction check
---> Package bc.x86_64 0:1.06.95-13.el7 will be installed
---> Package java-1.8.0-openjdk-headless.x86_64 1:1.8.0.131-3.b12.el7_3 will be installed
--> Processing Dependency: tzdata-java >= 2015d for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: nss(x86-64) >= 3.28.4 for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: copy-jdk-configs >= 1.1-3 for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: chkconfig >= 1.7 for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: chkconfig >= 1.7 for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: lksctp-tools(x86-64) for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: libjpeg.so.62(LIBJPEG_6.2)(64bit) for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: jpackage-utils for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: libjpeg.so.62()(64bit) for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
--> Processing Dependency: libfreetype.so.6()(64bit) for package: 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_64
---> Package lsof.x86_64 0:4.87-4.el7 will be installed
---> Package tar.x86_64 2:1.26-29.el7 will be updated
---> Package tar.x86_64 2:1.26-31.el7 will be an update
---> Package unzip.x86_64 0:6.0-16.el7 will be installed
---> Package which.x86_64 0:2.20-7.el7 will be installed
--> Running transaction check
---> Package chkconfig.x86_64 0:1.3.61-5.el7_2.1 will be updated
---> Package chkconfig.x86_64 0:1.7.2-1.el7_3.1 will be an update
---> Package copy-jdk-configs.noarch 0:1.2-1.el7 will be installed
---> Package freetype.x86_64 0:2.4.11-12.el7 will be installed
---> Package javapackages-tools.noarch 0:3.4.1-11.el7 will be installed
--> Processing Dependency: python-javapackages = 3.4.1-11.el7 for package: javapackages-tools-3.4.1-11.el7.noarch
--> Processing Dependency: libxslt for package: javapackages-tools-3.4.1-11.el7.noarch
---> Package libjpeg-turbo.x86_64 0:1.2.90-5.el7 will be installed
---> Package lksctp-tools.x86_64 0:1.0.17-2.el7 will be installed
---> Package nss.x86_64 0:3.21.0-9.el7_2 will be updated
--> Processing Dependency: nss = 3.21.0-9.el7_2 for package: nss-sysinit-3.21.0-9.el7_2.x86_64
--> Processing Dependency: nss(x86-64) = 3.21.0-9.el7_2 for package: nss-tools-3.21.0-9.el7_2.x86_64
---> Package nss.x86_64 0:3.28.4-1.2.el7_3 will be an update
--> Processing Dependency: nss-util >= 3.28.2-1.1 for package: nss-3.28.4-1.2.el7_3.x86_64
--> Processing Dependency: nspr >= 4.13.1 for package: nss-3.28.4-1.2.el7_3.x86_64
--> Processing Dependency: libnssutil3.so(NSSUTIL_3.24)(64bit) for package: nss-3.28.4-1.2.el7_3.x86_64
---> Package tzdata-java.noarch 0:2017b-1.el7 will be installed
--> Running transaction check
---> Package libxslt.x86_64 0:1.1.28-5.el7 will be installed
---> Package nspr.x86_64 0:4.11.0-1.el7_2 will be updated
---> Package nspr.x86_64 0:4.13.1-1.0.el7_3 will be an update
---> Package nss-sysinit.x86_64 0:3.21.0-9.el7_2 will be updated
---> Package nss-sysinit.x86_64 0:3.28.4-1.2.el7_3 will be an update
---> Package nss-tools.x86_64 0:3.21.0-9.el7_2 will be updated
---> Package nss-tools.x86_64 0:3.28.4-1.2.el7_3 will be an update
---> Package nss-util.x86_64 0:3.21.0-2.2.el7_2 will be updated
---> Package nss-util.x86_64 0:3.28.4-1.0.el7_3 will be an update
---> Package python-javapackages.noarch 0:3.4.1-11.el7 will be installed
--> Processing Dependency: python-lxml for package: python-javapackages-3.4.1-11.el7.noarch
--> Running transaction check
---> Package python-lxml.x86_64 0:3.2.1-4.el7 will be installed
--> Finished Dependency Resolution
Dependencies Resolved
================================================================================
 Package                      Arch    Version                    Repository
                                                                           Size
================================================================================
Installing:
 bc                           x86_64  1.06.95-13.el7             base     115 k
 java-1.8.0-openjdk-headless  x86_64  1:1.8.0.131-3.b12.el7_3    updates   31 M
 lsof                         x86_64  4.87-4.el7                 base     331 k
 unzip                        x86_64  6.0-16.el7                 base     169 k
 which                        x86_64  2.20-7.el7                 base      41 k
Updating:
 tar                          x86_64  2:1.26-31.el7              base     843 k
Installing for dependencies:
 copy-jdk-configs             noarch  1.2-1.el7                  base      14 k
 freetype                     x86_64  2.4.11-12.el7              base     391 k
 javapackages-tools           noarch  3.4.1-11.el7               base      73 k
 libjpeg-turbo                x86_64  1.2.90-5.el7               base     134 k
 libxslt                      x86_64  1.1.28-5.el7               base     242 k
 lksctp-tools                 x86_64  1.0.17-2.el7               base      88 k
 python-javapackages          noarch  3.4.1-11.el7               base      31 k
 python-lxml                  x86_64  3.2.1-4.el7                base     758 k
 tzdata-java                  noarch  2017b-1.el7                updates  183 k
Updating for dependencies:
 chkconfig                    x86_64  1.7.2-1.el7_3.1            updates  175 k
 nspr                         x86_64  4.13.1-1.0.el7_3           updates  126 k
 nss                          x86_64  3.28.4-1.2.el7_3           updates  872 k
 nss-sysinit                  x86_64  3.28.4-1.2.el7_3           updates   58 k
 nss-tools                    x86_64  3.28.4-1.2.el7_3           updates  496 k
 nss-util                     x86_64  3.28.4-1.0.el7_3           updates   73 k

Transaction Summary
================================================================================
Install  5 Packages (+9 Dependent packages)
Upgrade  1 Package  (+6 Dependent packages)
Total download size: 36 M
Downloading packages:
Delta RPMs disabled because /usr/bin/applydeltarpm not installed.
[91mwarning: /var/cache/yum/x86_64/7/base/packages/copy-jdk-configs-1.2-1.el7.noarch.rpm: Header V3 RSA/SHA256 Signature, key ID f4a80eb5: NOKEY

Public key for copy-jdk-configs-1.2-1.el7.noarch.rpm is not installed
Public key for chkconfig-1.7.2-1.el7_3.1.x86_64.rpm is not installed
--------------------------------------------------------------------------------
Total                                              1.1 MB/s |  36 MB  00:31
Retrieving key from file:///etc/pki/rpm-gpg/RPM-GPG-KEY-CentOS-7
[91mImporting GPG key 0xF4A80EB5:
 Userid     : "CentOS-7 Key (CentOS 7 Official Signing Key) <security@centos.org>"
 Fingerprint: 6341 ab27 53d7 8a78 a7c2 7bb1 24c6 a8a7 f4a8 0eb5
 Package    : centos-release-7-2.1511.el7.centos.2.10.x86_64 (@CentOS)
 From       : /etc/pki/rpm-gpg/RPM-GPG-KEY-CentOS-7

Running transaction check
Running transaction test
Transaction test succeeded
Running transaction
Updating   : nspr-4.13.1-1.0.el7_3.x86_64                                1/28
Updating   : nss-util-3.28.4-1.0.el7_3.x86_64                            2/28
Installing : libxslt-1.1.28-5.el7.x86_64                                 3/28
Updating   : chkconfig-1.7.2-1.el7_3.1.x86_64                            4/28
Updating   : nss-sysinit-3.28.4-1.2.el7_3.x86_64                         5/28
Updating   : nss-3.28.4-1.2.el7_3.x86_64                                 6/28
Installing : python-lxml-3.2.1-4.el7.x86_64                              7/28
Installing : python-javapackages-3.4.1-11.el7.noarch                     8/28
Installing : javapackages-tools-3.4.1-11.el7.noarch                      9/28
Installing : freetype-2.4.11-12.el7.x86_64                              10/28
Installing : tzdata-java-2017b-1.el7.noarch                             11/28
Installing : copy-jdk-configs-1.2-1.el7.noarch                          12/28
Installing : lksctp-tools-1.0.17-2.el7.x86_64                           13/28
Installing : libjpeg-turbo-1.2.90-5.el7.x86_64                          14/28
Installing : 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_   15/28
Updating   : nss-tools-3.28.4-1.2.el7_3.x86_64                          16/28
Installing : lsof-4.87-4.el7.x86_64                                     17/28
Updating   : 2:tar-1.26-31.el7.x86_64                                   18/28
Installing : which-2.20-7.el7.x86_64                                    19/28
install-info: No such file or directory for /usr/share/info/which.info.gz
Installing : bc-1.06.95-13.el7.x86_64                                   20/28
Installing : unzip-6.0-16.el7.x86_64                                    21/28
Cleanup    : nss-tools-3.21.0-9.el7_2.x86_64                            22/28
Cleanup    : nss-sysinit-3.21.0-9.el7_2.x86_64                          23/28
Cleanup    : nss-3.21.0-9.el7_2.x86_64                                  24/28
Cleanup    : nss-util-3.21.0-2.2.el7_2.x86_64                           25/28
Cleanup    : nspr-4.11.0-1.el7_2.x86_64                                 26/28
Cleanup    : chkconfig-1.3.61-5.el7_2.1.x86_64                          27/28
Cleanup    : 2:tar-1.26-29.el7.x86_64                                   28/28
Verifying  : python-javapackages-3.4.1-11.el7.noarch                     1/28
Verifying  : nss-tools-3.28.4-1.2.el7_3.x86_64                           2/28
Verifying  : libjpeg-turbo-1.2.90-5.el7.x86_64                           3/28
Verifying  : nss-3.28.4-1.2.el7_3.x86_64                                 4/28
Verifying  : python-lxml-3.2.1-4.el7.x86_64                              5/28
Verifying  : unzip-6.0-16.el7.x86_64                                     6/28
Verifying  : nss-util-3.28.4-1.0.el7_3.x86_64                            7/28
Verifying  : bc-1.06.95-13.el7.x86_64                                    8/28
Verifying  : 1:java-1.8.0-openjdk-headless-1.8.0.131-3.b12.el7_3.x86_    9/28
Verifying  : which-2.20-7.el7.x86_64                                    10/28
Verifying  : chkconfig-1.7.2-1.el7_3.1.x86_64                           11/28
Verifying  : 2:tar-1.26-31.el7.x86_64                                   12/28
Verifying  : lksctp-tools-1.0.17-2.el7.x86_64                           13/28
Verifying  : copy-jdk-configs-1.2-1.el7.noarch                          14/28
Verifying  : nss-sysinit-3.28.4-1.2.el7_3.x86_64                        15/28
Verifying  : libxslt-1.1.28-5.el7.x86_64                                16/28
Verifying  : tzdata-java-2017b-1.el7.noarch                             17/28
Verifying  : javapackages-tools-3.4.1-11.el7.noarch                     18/28
Verifying  : freetype-2.4.11-12.el7.x86_64                              19/28
Verifying  : lsof-4.87-4.el7.x86_64                                     20/28
Verifying  : nspr-4.13.1-1.0.el7_3.x86_64                               21/28
Verifying  : 2:tar-1.26-29.el7.x86_64                                   22/28
Verifying  : nspr-4.11.0-1.el7_2.x86_64                                 23/28
Verifying  : nss-3.21.0-9.el7_2.x86_64                                  24/28 
  Verifying  : nss-tools-3.21.0-9.el7_2.x86_64                            25/28 
  Verifying  : nss-sysinit-3.21.0-9.el7_2.x86_64                          26/28
Verifying  : chkconfig-1.3.61-5.el7_2.1.x86_64                          27/28 
  Verifying  : nss-util-3.21.0-2.2.el7_2.x86_64                           28/28
Installed:
  bc.x86_64 0:1.06.95-13.el7                                                    
  java-1.8.0-openjdk-headless.x86_64 1:1.8.0.131-3.b12.el7_3                    
  lsof.x86_64 0:4.87-4.el7                                                      
  unzip.x86_64 0:6.0-16.el7                                                     
  which.x86_64 0:2.20-7.el7                                                     

Dependency Installed:
  copy-jdk-configs.noarch 0:1.2-1.el7       freetype.x86_64 0:2.4.11-12.el7    
  javapackages-tools.noarch 0:3.4.1-11.el7  libjpeg-turbo.x86_64 0:1.2.90-5.el7
  libxslt.x86_64 0:1.1.28-5.el7             lksctp-tools.x86_64 0:1.0.17-2.el7 
  python-javapackages.noarch 0:3.4.1-11.el7 python-lxml.x86_64 0:3.2.1-4.el7   
  tzdata-java.noarch 0:2017b-1.el7         

Updated:
  tar.x86_64 2:1.26-31.el7                                                      

Dependency Updated:
  chkconfig.x86_64 0:1.7.2-1.el7_3.1    nspr.x86_64 0:4.13.1-1.0.el7_3         
  nss.x86_64 0:3.28.4-1.2.el7_3         nss-sysinit.x86_64 0:3.28.4-1.2.el7_3  
  nss-tools.x86_64 0:3.28.4-1.2.el7_3   nss-util.x86_64 0:3.28.4-1.0.el7_3
Complete!
[91m+ yum clean all -y

Loaded plugins: fastestmirror, ovl
Cleaning repos: base extras updates
Cleaning up everything
Cleaning up list of fastest mirrors
[91m+ export 'JAVA_OPTIONS=-Xms128m -Xmx256m -XX:PermSize=128m -XX:MaxPermSize=128m'
+ JAVA_OPTIONS='-Xms128m -Xmx256m -XX:PermSize=128m -XX:MaxPermSize=128m'

---> 76d3cb0be6ce
Removing intermediate container 5416c0e38fc7
Step 7 : EXPOSE 9091
---> Running in 7da74b1f81c3
---> c1183c296afe
Removing intermediate container 7da74b1f81c3
Step 8 : CMD java -Djava.security.egd=file:/dev/./urandom $JAVA_OPTIONS -jar /repositories-mem.jar --server.port=$SERVER_PORT
---> Running in bbdcb7f2eec8
---> e6468a0a2ba6
Removing intermediate container bbdcb7f2eec8
Successfully built e6468a0a2ba6
Created image with ID 'e6468a0a2ba6'.

BUILD SUCCESSFUL
```

With `gradle dockerPush`
```
[vagrant@localhost sample-microservices-springboot]$ ./gradlew :repositories-mem:dockerPush
:repositories-mem:copyTask UP-TO-DATE
:repositories-mem:dockerBuild
Building image using context '/Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/build/libs'.
Using Dockerfile '/Users/fanhongling/Downloads/workspace/src/github.com/tangfeixiong/osev3-examples/spring-boot/sample-microservices-springboot/repositories-mem/build/libs/Dockerfile'
Using tag '172.17.4.50:5000/springboot-osev3-examples:repositories-mem' for image.
Step 1 : FROM docker.io/centos:centos7
---> 34c4689f9727
Step 2 : LABEL maintainer "tangfeixiong" mailto "tangfx128@gmail.com" project "https://github.com/tangfeixiong/osev3-examples/tree/cicd/spring-boot/sample-microservices-springboot" name "web"
---> Using cache
---> 83de36713f81
Step 3 : ARG app_version=0.0.0
---> Using cache
---> a2646f3b8805
Step 4 : ENV JAVA_HOME "/opt/java" JAVA_OPTIONS "-Xms128m -Xmx512m -XX:PermSize=128m -XX:MaxPermSize=256m" SERVER_PORT 9091
---> Using cache
---> f11dcdaec999
Step 5 : COPY /repositories-mem-${app_version}.jar /repositories-mem.jar
---> Using cache
---> 53cc6aff397a
Step 6 : RUN set -x     && install_pkgs="         tar         unzip         bc         which         lsof         java-1.8.0-openjdk-headless     "     && if [[ -z $localrepo_url ]]; then         yum install -y $install_pkgs;     else         curl -jkSL $localrepo_url -o /etc/yum.repos.d/local.repo;         yum install -y --disablerepo=\* --enablerepo=localbase,localrepo-\* $install_pkgs;     fi     && yum clean all -y     && export JAVA_OPTIONS="-Xms128m -Xmx256m -XX:PermSize=128m -XX:MaxPermSize=128m"
---> Using cache
---> 76d3cb0be6ce
Step 7 : EXPOSE 9091
---> Using cache
---> c1183c296afe
Step 8 : CMD java -Djava.security.egd=file:/dev/./urandom $JAVA_OPTIONS -jar /repositories-mem.jar --server.port=$SERVER_PORT
---> Using cache
---> e6468a0a2ba6
Successfully built e6468a0a2ba6
Created image with ID 'e6468a0a2ba6'.
:repositories-mem:dockerPush
Pushing image with name '172.17.4.50:5000/springboot-osev3-examples'.

BUILD SUCCESSFUL

Total time: 28.319 secs
```

Docker-Compose
```
[vagrant@localhost sample-microservices-springboot]$ docker-compose up
Creating network "samplemicroservicesspringboot_default" with the default driver
Creating samplemicroservicesspringboot_repositories-mem_1 ... 
Creating samplemicroservicesspringboot_web_1 ... 
Creating samplemicroservicesspringboot_web_1
Creating samplemicroservicesspringboot_web_1 ... done
Attaching to samplemicroservicesspringboot_repositories-mem_1, samplemicroservicesspringboot_web_1
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option PermSize=128m; support was removed in 8.0
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
web_1               | OpenJDK 64-Bit Server VM warning: ignoring option PermSize=128m; support was removed in 8.0
web_1               | OpenJDK 64-Bit Server VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
repositories-mem_1  | no main manifest attribute, in /repositories-mem.jar
samplemicroservicesspringboot_repositories-mem_1 exited with code 0
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option PermSize=128m; support was removed in 8.0
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
repositories-mem_1  | no main manifest attribute, in /repositories-mem.jar
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option PermSize=128m; support was removed in 8.0
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
repositories-mem_1  | no main manifest attribute, in /repositories-mem.jar
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option PermSize=128m; support was removed in 8.0
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
repositories-mem_1  | no main manifest attribute, in /repositories-mem.jar
web_1               | 
web_1               |   .   ____          _            __ _ _
web_1               |  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
web_1               | ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
web_1               |  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
web_1               |   '  |____| .__|_| |_|_| |_\__, | / / / /
web_1               |  =========|_|==============|___/=/_/_/_/
web_1               |  :: Spring Boot ::        (v1.5.4.RELEASE)
web_1               | 
samplemicroservicesspringboot_repositories-mem_1 exited with code 0
web_1               | 2017-07-20 05:45:30.316  INFO 1 --- [           main] c.o.e.m.web.SampleWebUIApplication       : Starting SampleWebUIApplication on 95383971156e with PID 1 (/web.jar started by root in /)
web_1               | 2017-07-20 05:45:30.342  INFO 1 --- [           main] c.o.e.m.web.SampleWebUIApplication       : No active profile set, falling back to default profiles: default
web_1               | 2017-07-20 05:45:31.054  INFO 1 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@4bf558aa: startup date [Thu Jul 20 05:45:31 UTC 2017]; root of context hierarchy
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option PermSize=128m; support was removed in 8.0
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
repositories-mem_1  | no main manifest attribute, in /repositories-mem.jar
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option PermSize=128m; support was removed in 8.0
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
repositories-mem_1  | no main manifest attribute, in /repositories-mem.jar
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option PermSize=128m; support was removed in 8.0
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
repositories-mem_1  | no main manifest attribute, in /repositories-mem.jar
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option PermSize=128m; support was removed in 8.0
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
repositories-mem_1  | no main manifest attribute, in /repositories-mem.jar
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option PermSize=128m; support was removed in 8.0
repositories-mem_1  | OpenJDK 64-Bit Server VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
repositories-mem_1  | no main manifest attribute, in /repositories-mem.jar
web_1               | 2017-07-20 05:45:34.912  INFO 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8091 (http)
web_1               | 2017-07-20 05:45:34.941  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
web_1               | 2017-07-20 05:45:34.945  INFO 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.15
web_1               | 2017-07-20 05:45:35.141  INFO 1 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
web_1               | 2017-07-20 05:45:35.142  INFO 1 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 4102 ms
web_1               | 2017-07-20 05:45:35.499 ERROR 1 --- [ost-startStop-1] o.s.b.c.embedded.tomcat.TomcatStarter    : Error starting Tomcat context. Exception: org.springframework.beans.factory.BeanCreationException. Message: Error creating bean with name 'characterEncodingFilter' defined in class path resource [org/springframework/boot/autoconfigure/web/HttpEncodingAutoConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.web.filter.CharacterEncodingFilter]: Factory method 'characterEncodingFilter' threw exception; nested exception is java.lang.NoSuchMethodError: org.springframework.web.filter.CharacterEncodingFilter.setForceRequestEncoding(Z)V
web_1               | 2017-07-20 05:45:35.564  WARN 1 --- [           main] ationConfigEmbeddedWebApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
web_1               | 2017-07-20 05:45:35.591  INFO 1 --- [           main] utoConfigurationReportLoggingInitializer : 
web_1               | 
web_1               | Error starting ApplicationContext. To display the auto-configuration report re-run your application with 'debug' enabled.
web_1               | 2017-07-20 05:45:35.604 ERROR 1 --- [           main] o.s.boot.SpringApplication               : Application startup failed
web_1               | 
web_1               | org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
web_1               | 	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:137)
web_1               | 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:537)
web_1               | 	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122)
web_1               | 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:693)
web_1               | 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:360)
web_1               | 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:303)
web_1               | 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118)
web_1               | 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107)
web_1               | 	at com.openshift.evangelists.microservices.web.SampleWebUIApplication.main(SampleWebUIApplication.java:36)
web_1               | 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
web_1               | 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
web_1               | 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
web_1               | 	at java.lang.reflect.Method.invoke(Method.java:498)
web_1               | 	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48)
web_1               | 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:87)
web_1               | 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:50)
web_1               | 	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51)
web_1               | Caused by: org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat
web_1               | 	at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.initialize(TomcatEmbeddedServletContainer.java:123)
web_1               | 	at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer.<init>(TomcatEmbeddedServletContainer.java:84)
web_1               | 	at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getTomcatEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:554)
web_1               | 	at org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory.getEmbeddedServletContainer(TomcatEmbeddedServletContainerFactory.java:179)
web_1               | 	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.createEmbeddedServletContainer(EmbeddedWebApplicationContext.java:164)
web_1               | 	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.onRefresh(EmbeddedWebApplicationContext.java:134)
web_1               | 	... 16 common frames omitted
web_1               | Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'characterEncodingFilter' defined in class path resource [org/springframework/boot/autoconfigure/web/HttpEncodingAutoConfiguration.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.web.filter.CharacterEncodingFilter]: Factory method 'characterEncodingFilter' threw exception; nested exception is java.lang.NoSuchMethodError: org.springframework.web.filter.CharacterEncodingFilter.setForceRequestEncoding(Z)V
web_1               | 	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:599)
web_1               | 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1173)
web_1               | 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1067)
web_1               | 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:513)
web_1               | 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:483)
web_1               | 	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:306)
web_1               | 	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230)
web_1               | 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:302)
web_1               | 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202)
web_1               | 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.getOrderedBeansOfType(ServletContextInitializerBeans.java:234)
web_1               | 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAsRegistrationBean(ServletContextInitializerBeans.java:182)
web_1               | 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAsRegistrationBean(ServletContextInitializerBeans.java:177)
web_1               | 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAdaptableBeans(ServletContextInitializerBeans.java:159)
web_1               | 	at org.springframework.boot.web.servlet.ServletContextInitializerBeans.<init>(ServletContextInitializerBeans.java:80)
web_1               | 	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.getServletContextInitializerBeans(EmbeddedWebApplicationContext.java:241)
web_1               | 	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.selfInitialize(EmbeddedWebApplicationContext.java:228)
web_1               | 	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.access$000(EmbeddedWebApplicationContext.java:89)
web_1               | 	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext$1.onStartup(EmbeddedWebApplicationContext.java:213)
web_1               | 	at org.springframework.boot.context.embedded.tomcat.TomcatStarter.onStartup(TomcatStarter.java:55)
web_1               | 	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5196)
web_1               | 	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150)
web_1               | 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1419)
web_1               | 	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1409)
web_1               | 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
web_1               | 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
web_1               | 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
web_1               | 	at java.lang.Thread.run(Thread.java:748)
web_1               | Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.web.filter.CharacterEncodingFilter]: Factory method 'characterEncodingFilter' threw exception; nested exception is java.lang.NoSuchMethodError: org.springframework.web.filter.CharacterEncodingFilter.setForceRequestEncoding(Z)V
web_1               | 	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:189)
web_1               | 	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:588)
web_1               | 	... 26 common frames omitted
web_1               | Caused by: java.lang.NoSuchMethodError: org.springframework.web.filter.CharacterEncodingFilter.setForceRequestEncoding(Z)V
web_1               | 	at org.springframework.boot.autoconfigure.web.HttpEncodingAutoConfiguration.characterEncodingFilter(HttpEncodingAutoConfiguration.java:60)
web_1               | 	at org.springframework.boot.autoconfigure.web.HttpEncodingAutoConfiguration$$EnhancerBySpringCGLIB$$a6337142.CGLIB$characterEncodingFilter$0(<generated>)
web_1               | 	at org.springframework.boot.autoconfigure.web.HttpEncodingAutoConfiguration$$EnhancerBySpringCGLIB$$a6337142$$FastClassBySpringCGLIB$$f67d59e0.invoke(<generated>)
web_1               | 	at org.springframework.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)
web_1               | 	at org.springframework.context.annotation.ConfigurationClassEnhancer$BeanMethodInterceptor.intercept(ConfigurationClassEnhancer.java:358)
web_1               | 	at org.springframework.boot.autoconfigure.web.HttpEncodingAutoConfiguration$$EnhancerBySpringCGLIB$$a6337142.characterEncodingFilter(<generated>)
web_1               | 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
web_1               | 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
web_1               | 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
web_1               | 	at java.lang.reflect.Method.invoke(Method.java:498)
web_1               | 	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:162)
web_1               | 	... 27 common frames omitted
web_1               | 
samplemicroservicesspringboot_repositories-mem_1 exited with code 0
samplemicroservicesspringboot_web_1 exited with code 0
```

Gradle
```
[vagrant@localhost eureka]$ gradle build
Download https://jcenter.bintray.com/org/springframework/boot/spring-boot-gradle-plugin/1.4.3.RELEASE/spring-boot-gradle-plugin-1.4.3.RELEASE.pom
Download https://jcenter.bintray.com/org/springframework/boot/spring-boot-gradle-plugin/1.4.3.RELEASE/spring-boot-gradle-plugin-1.4.3.RELEASE.jar
Download https://jcenter.bintray.com/io/spring/gradle/dependency-management-plugin/0.6.1.RELEASE/dependency-management-plugin-0.6.1.RELEASE.jar
The plugin id 'spring-boot' is deprecated. Please use 'org.springframework.boot' instead.
Spring Boot plugin's support for Gradle 2.5 is deprecated. Please upgrade to Gradle 2.9 or later.
:compileJava
...snip...

```

Payload
```
[vagrant@localhost sample-microservices-springboot]$ docker-compose ps
                      Name                                    Command                 State       Ports   
---------------------------------------------------------------------------------------------------------
samplemicroservicesspringboot_repositories-mem_1   /bin/sh -c java -Djava.sec ...   Restarting   9091/tcp 
samplemicroservicesspringboot_web_1                /bin/sh -c java -Djava.sec ...   Restarting   9091/tcp 
```

Networking
```
[vagrant@localhost sample-microservices-springboot]$ docker network ls
NETWORK ID          NAME                                    DRIVER
d38da8bfe6e5        none                                    null                
9f0c9b730340        host                                    host                
c5f656cde491        samplemicroservicesspringboot_default   bridge              
3ba1465afaf1        cbr0                                    bridge              
203b62e09f95        bridge                                  bridge              
cee016075c51        gitlab_default                          bridge              
```

Down
```
[vagrant@localhost sample-microservices-springboot]$ docker-compose down
Stopping samplemicroservicesspringboot_repositories-mem_1 ... done
Stopping samplemicroservicesspringboot_web_1 ... done
Removing samplemicroservicesspringboot_repositories-mem_1 ... done
Removing samplemicroservicesspringboot_web_1 ... done
Removing network samplemicroservicesspringboot_default
```

### docker compose info

Containers
```
[vagrant@localhost ~]$ docker ps
CONTAINER ID        IMAGE                                                         COMMAND                  CREATED              STATUS                          PORTS                                                                                        NAMES
f37c61565d96        rabbitmq:3-management                                         "docker-entrypoint.sh"   About a minute ago   Up About a minute               4369/tcp, 5671/tcp, 0.0.0.0:5672->5672/tcp, 15671/tcp, 25672/tcp, 0.0.0.0:15672->15672/tcp   osev3examplesspringcloudnetflix_rabbitmq_1
2275836de7fd        springcloud/configserver                                      "java -Djava.security"   About a minute ago   Up 19 seconds                   0.0.0.0:8888->8888/tcp                                                                       osev3examplesspringcloudnetflix_configserver_1
ca8630eb970f        springcloud/zuul-server                                       "java -Djava.security"   About a minute ago   Up Less than a second                                                                                                        osev3examplesspringcloudnetflix_zuul-server_1
33622a41ed7e        springcloud/eureka                                            "java -Djava.security"   About a minute ago   Up About a minute               0.0.0.0:8761->8761/tcp                                                                       osev3examplesspringcloudnetflix_eureka_1
4c035bc80b28        172.17.4.50:5000/springboot-osev3-examples:repositories-mem   "java -Djava.security"   About a minute ago   Restarting (1) 41 seconds ago   9091/tcp                                                                                     osev3examplesspringcloudnetflix_repositories-mem_1
c6c4edb2374f        172.17.4.50:5000/springboot-osev3-examples:web                "java -Djava.security"   About a minute ago   Restarting (1) 43 seconds ago   0.0.0.0:8091->8091/tcp                                                                       osev3examplesspringcloudnetflix_web_1
[vagrant@localhost ~]$ docker network ls
NETWORK ID          NAME                                      DRIVER
3ba1465afaf1        cbr0                                      bridge              
cee016075c51        gitlab_default                            bridge              
362bb5fba2ae        none                                      null                
ca4fcbcd31f6        host                                      host                
cc4d8974a9be        osev3examplesspringcloudnetflix_default   bridge              
c2eb7c874109        bridge                                    bridge              
```

Logs
```

```