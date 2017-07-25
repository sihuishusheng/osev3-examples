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

Extra hosts
```
[vagrant@localhost sample-microservices-springboot]$ sudo vi /etc/hosts
127.0.0.1   localhost localhost.localdomain localhost4 localhost4.localdomain4 configserver eureka rabbitmq repsotories-mem web
```

Containers
```
[vagrant@localhost sample-microservices-springboot]$ docker-compose -p osev3examplesspringcloudnetflix ps
              Name                               Command                              State                               Ports               
---------------------------------------------------------------------------------------------------------------------------------------------
osev3examplesspringcloudnetflix_c   java -Djava.security.egd=f ...      Up                                  0.0.0.0:8888->8888/tcp            
onfigserver_1                                                                                                                                 
osev3examplesspringcloudnetflix_e   java -Djava.security.egd=f ...      Up                                  0.0.0.0:8761->8761/tcp            
ureka_1                                                                                                                                       
osev3examplesspringcloudnetflix_r   docker-entrypoint.sh rabbi ...      Up                                  15671/tcp,                        
abbitmq_1                                                                                                   0.0.0.0:15672->15672/tcp,         
                                                                                                            25672/tcp, 4369/tcp, 5671/tcp,    
                                                                                                            0.0.0.0:5672->5672/tcp            
osev3examplesspringcloudnetflix_r   java -Djava.security.egd=f ...      Up                                  9091/tcp                          
epositories-mem_1                                                                                                                             
osev3examplesspringcloudnetflix_w   java -Djava.security.egd=f ...      Up                                  0.0.0.0:8091->8091/tcp            
eb_1                                                                                                                                          
osev3examplesspringcloudnetflix_z   java -Djava.security.egd=f ...      Up                                                                    
uul-server_1                                                                                                                                  
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
[vagrant@localhost sample-microservices-springboot]$ docker-compose --project-name osev3-examples-spring-cloud-netflix up --no-build --force-recreate
Creating network "osev3examplesspringcloudnetflix_default" with the default driver
Creating osev3examplesspringcloudnetflix_zuul-server_1 ... 
Creating osev3examplesspringcloudnetflix_repositories-mem_1 ... 
Creating osev3examplesspringcloudnetflix_zuul-server_1
Creating osev3examplesspringcloudnetflix_configserver_1 ... 
Creating osev3examplesspringcloudnetflix_web_1 ... 
Creating osev3examplesspringcloudnetflix_eureka_1 ... 
Creating osev3examplesspringcloudnetflix_rabbitmq_1 ... 
Creating osev3examplesspringcloudnetflix_web_1
Creating osev3examplesspringcloudnetflix_configserver_1
Creating osev3examplesspringcloudnetflix_repositories-mem_1
Creating osev3examplesspringcloudnetflix_rabbitmq_1
Creating osev3examplesspringcloudnetflix_eureka_1 ... done
Attaching to osev3examplesspringcloudnetflix_zuul-server_1, osev3examplesspringcloudnetflix_web_1, osev3examplesspringcloudnetflix_configserver_1, osev3examplesspringcloudnetflix_repositories-mem_1, osev3examplesspringcloudnetflix_rabbitmq_1, osev3examplesspringcloudnetflix_eureka_1
web_1               | Java HotSpot(TM) 64-Bit Server VM warning: ignoring option PermSize=128m; support was removed in 8.0
web_1               | Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=128m; support was removed in 8.0
repositories-mem_1  | Java HotSpot(TM) 64-Bit Server VM warning: ignoring option PermSize=128m; support was removed in 8.0
repositories-mem_1  | Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=128m; support was removed in 8.0
zuul-server_1       | 2017-07-23 04:16:25.885  INFO 1 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@16f65612: startup date [Sun Jul 23 04:16:25 UTC 2017]; root of context hierarchy
zuul-server_1       | 2017-07-23 04:16:31.329  INFO 1 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
zuul-server_1       | 2017-07-23 04:16:31.925  INFO 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'configurationPropertiesRebinderAutoConfiguration' of type [class org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$b226e45b] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
configserver_1      | 2017-07-23 04:16:32.954  INFO 1 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@470e2030: startup date [Sun Jul 23 04:16:32 UTC 2017]; root of context hierarchy
repositories-mem_1  | 2017-07-23 04:16:34.659  INFO [repositories-mem,,,] 1 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@2a33fae0: startup date [Sun Jul 23 04:16:34 UTC 2017]; root of context hierarchy
web_1               | 2017-07-23 04:16:35.750  INFO [web,,,] 1 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@6a38e57f: startup date [Sun Jul 23 04:16:35 UTC 2017]; root of context hierarchy
rabbitmq_1          | 
rabbitmq_1          |               RabbitMQ 3.6.10. Copyright (C) 2007-2017 Pivotal Software, Inc.
rabbitmq_1          |   ##  ##      Licensed under the MPL.  See http://www.rabbitmq.com/
rabbitmq_1          |   ##  ##
rabbitmq_1          |   ##########  Logs: tty
rabbitmq_1          |   ######  ##        tty
rabbitmq_1          |   ##########
rabbitmq_1          |               Starting broker...
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:37 ===
rabbitmq_1          | Starting RabbitMQ 3.6.10 on Erlang 19.2.1
rabbitmq_1          | Copyright (C) 2007-2017 Pivotal Software, Inc.
rabbitmq_1          | Licensed under the MPL.  See http://www.rabbitmq.com/
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:37 ===
rabbitmq_1          | node           : rabbit@8629a1f1f48e
rabbitmq_1          | home dir       : /var/lib/rabbitmq
rabbitmq_1          | config file(s) : /etc/rabbitmq/rabbitmq.config
rabbitmq_1          | cookie hash    : YwrmMFwEftPvIUdeM8JXYQ==
rabbitmq_1          | log            : tty
rabbitmq_1          | sasl log       : tty
rabbitmq_1          | database dir   : /var/lib/rabbitmq/mnesia/rabbit@8629a1f1f48e
zuul-server_1       | 
zuul-server_1       |   .   ____          _            __ _ _
zuul-server_1       |  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
zuul-server_1       | ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
zuul-server_1       |  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
zuul-server_1       |   '  |____| .__|_| |_|_| |_\__, | / / / /
zuul-server_1       |  =========|_|==============|___/=/_/_/_/
zuul-server_1       |  :: Spring Boot ::        (v1.4.1.RELEASE)
zuul-server_1       | 
zuul-server_1       | 2017-07-23 04:16:37.997 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Adding [servletConfigInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:16:38.006 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Adding [servletContextInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:16:38.009 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Adding [systemProperties] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:16:38.012 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Adding [systemEnvironment] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:16:38.015 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Initialized StandardServletEnvironment with PropertySources [servletConfigInitParams,servletContextInitParams,systemProperties,systemEnvironment]
zuul-server_1       | 2017-07-23 04:16:38.077 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Removing [defaultProperties] PropertySource
zuul-server_1       | 2017-07-23 04:16:38.102 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Adding [defaultProperties] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:16:38.105 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Adding [applicationConfig: [classpath:/bootstrap.yml]] PropertySource with search precedence immediately higher than [defaultProperties]
zuul-server_1       | 2017-07-23 04:16:38.404  INFO 1 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Fetching config from server at: http://spring-cloud-config-server.default.svc.cluster.local:8888
zuul-server_1       | 2017-07-23 04:16:38.765 DEBUG 1 --- [           main] o.s.web.client.RestTemplate              : Created GET request for "http://spring-cloud-config-server.default.svc.cluster.local:8888/zuulserver/qa"
configserver_1      | 2017-07-23 04:16:39.302  INFO 1 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
zuul-server_1       | 2017-07-23 04:16:39.528 DEBUG 1 --- [           main] o.s.web.client.RestTemplate              : Setting request Accept header to [application/json, application/*+json]
eureka_1            | 2017-07-23 04:16:39.557  INFO 1 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@3abfe836: startup date [Sun Jul 23 04:16:39 UTC 2017]; root of context hierarchy
configserver_1      | 2017-07-23 04:16:39.950  INFO 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'configurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$36b149b0] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
zuul-server_1       | 2017-07-23 04:16:39.957  WARN 1 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Could not locate PropertySource: I/O error on GET request for "http://spring-cloud-config-server.default.svc.cluster.local:8888/zuulserver/qa": spring-cloud-config-server.default.svc.cluster.local; nested exception is java.net.UnknownHostException: spring-cloud-config-server.default.svc.cluster.local
zuul-server_1       | 2017-07-23 04:16:39.987  INFO 1 --- [           main] zuulserver.ZuulServerApplication         : The following profiles are active: qa
zuul-server_1       | 2017-07-23 04:16:40.164  INFO 1 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@457e2f02: startup date [Sun Jul 23 04:16:40 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@16f65612
repositories-mem_1  | 2017-07-23 04:16:41.668  INFO [repositories-mem,,,] 1 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
web_1               | 2017-07-23 04:16:42.001  INFO [web,,,] 1 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
repositories-mem_1  | 2017-07-23 04:16:42.694  INFO [repositories-mem,,,] 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'configurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$b6f67692] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
web_1               | 2017-07-23 04:16:42.950  INFO [web,,,] 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'configurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$198077d3] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
eureka_1            | 2017-07-23 04:16:47.247  INFO 1 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
eureka_1            | 2017-07-23 04:16:48.212  INFO 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'configurationPropertiesRebinderAutoConfiguration' of type [class org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$ce812613] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
web_1               | 
web_1               |   .   ____          _            __ _ _
web_1               |  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
web_1               | ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
web_1               |  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
web_1               |   '  |____| .__|_| |_|_| |_\__, | / / / /
web_1               |  =========|_|==============|___/=/_/_/_/
web_1               |  :: Spring Boot ::        (v1.5.4.RELEASE)
web_1               | 
configserver_1      | 
configserver_1      |   .   ____          _            __ _ _
configserver_1      |  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
configserver_1      | ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
configserver_1      |  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
configserver_1      |   '  |____| .__|_| |_|_| |_\__, | / / / /
configserver_1      |  =========|_|==============|___/=/_/_/_/
configserver_1      |  :: Spring Boot ::        (v1.5.4.RELEASE)
configserver_1      | 
configserver_1      | 2017-07-23 04:16:49.089  INFO 1 --- [           main] demo.ConfigServerApplication             : The following profiles are active: demo,development
configserver_1      | 2017-07-23 04:16:49.233  INFO 1 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@290dbf45: startup date [Sun Jul 23 04:16:49 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@470e2030
web_1               | 2017-07-23 04:16:49.308  INFO [web,,,] 1 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Fetching config from server at: http://spring-cloud-config-server.default.svc.cluster.local:8888
repositories-mem_1  | 
repositories-mem_1  |   .   ____          _            __ _ _
repositories-mem_1  |  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
repositories-mem_1  | ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
repositories-mem_1  |  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
repositories-mem_1  |   '  |____| .__|_| |_|_| |_\__, | / / / /
repositories-mem_1  |  =========|_|==============|___/=/_/_/_/
repositories-mem_1  |  :: Spring Boot ::        (v1.5.4.RELEASE)
repositories-mem_1  | 
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:49 ===
rabbitmq_1          | Memory limit set to 1984MB of 4960MB total.
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:49 ===
rabbitmq_1          | Enabling free disk space monitoring
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:49 ===
rabbitmq_1          | Disk free limit set to 50MB
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:49 ===
rabbitmq_1          | Limiting to approx 1048476 file handles (943626 sockets)
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:49 ===
rabbitmq_1          | FHC read buffering:  OFF
rabbitmq_1          | FHC write buffering: ON
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:49 ===
rabbitmq_1          | Database directory at /var/lib/rabbitmq/mnesia/rabbit@8629a1f1f48e is empty. Initialising from scratch...
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:49 ===
rabbitmq_1          |     application: mnesia
rabbitmq_1          |     exited: stopped
rabbitmq_1          |     type: temporary
repositories-mem_1  | 2017-07-23 04:16:49.907  INFO [repositories-mem,,,] 1 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Fetching config from server at: http://spring-cloud-config-server.default.svc.cluster.local:8888
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | Waiting for Mnesia tables for 30000 ms, 9 retries left
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | Waiting for Mnesia tables for 30000 ms, 9 retries left
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | Waiting for Mnesia tables for 30000 ms, 9 retries left
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | Priority queues enabled, real BQ is rabbit_variable_queue
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | Starting rabbit_node_monitor
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | Management plugin: using rates mode 'basic'
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | msg_store_transient: using rabbit_msg_store_ets_index to provide index
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | msg_store_persistent: using rabbit_msg_store_ets_index to provide index
rabbitmq_1          | 
rabbitmq_1          | =WARNING REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | msg_store_persistent: rebuilding indices from scratch
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | Adding vhost '/'
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | Creating user 'guest'
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | Setting user tags for user 'guest' to [administrator]
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | Setting permissions for 'guest' in '/' to '.*', '.*', '.*'
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | started TCP Listener on [::]:5672
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | Management plugin started. Port: 15672
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | Statistics database started.
rabbitmq_1          |  completed with 6 plugins.
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:16:50 ===
rabbitmq_1          | Server startup complete; 6 plugins started.
rabbitmq_1          |  * rabbitmq_management
rabbitmq_1          |  * rabbitmq_management_agent
rabbitmq_1          |  * rabbitmq_web_dispatch
rabbitmq_1          |  * cowboy
rabbitmq_1          |  * cowlib
rabbitmq_1          |  * amqp_client
web_1               | 2017-07-23 04:16:51.268  WARN [web,,,] 1 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Could not locate PropertySource: I/O error on GET request for "http://spring-cloud-config-server.default.svc.cluster.local:8888/web/demo": spring-cloud-config-server.default.svc.cluster.local; nested exception is java.net.UnknownHostException: spring-cloud-config-server.default.svc.cluster.local
web_1               | 2017-07-23 04:16:51.287  INFO [web,,,] 1 --- [           main] c.o.e.m.web.SampleWebUIApplication       : The following profiles are active: demo
web_1               | 2017-07-23 04:16:51.500  INFO [web,,,] 1 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@6325a3ee: startup date [Sun Jul 23 04:16:51 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@6a38e57f
zuul-server_1       | 2017-07-23 04:16:51.541  INFO 1 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Overriding bean definition for bean 'hystrixFeature' with a different definition: replacing [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.cloud.netflix.hystrix.HystrixCircuitBreakerConfiguration$HystrixWebConfiguration; factoryMethodName=hystrixFeature; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/cloud/netflix/hystrix/HystrixCircuitBreakerConfiguration$HystrixWebConfiguration.class]] with [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.cloud.netflix.hystrix.HystrixCircuitBreakerConfiguration; factoryMethodName=hystrixFeature; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/cloud/netflix/hystrix/HystrixCircuitBreakerConfiguration.class]]
repositories-mem_1  | 2017-07-23 04:16:51.748  WARN [repositories-mem,,,] 1 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Could not locate PropertySource: I/O error on GET request for "http://spring-cloud-config-server.default.svc.cluster.local:8888/repositories-mem/demo": spring-cloud-config-server.default.svc.cluster.local; nested exception is java.net.UnknownHostException: spring-cloud-config-server.default.svc.cluster.local
repositories-mem_1  | 2017-07-23 04:16:51.779  INFO [repositories-mem,,,] 1 --- [           main] c.o.e.m.r.InMemoryRepositoryApplication  : The following profiles are active: demo
repositories-mem_1  | 2017-07-23 04:16:52.042  INFO [repositories-mem,,,] 1 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@97e1986: startup date [Sun Jul 23 04:16:52 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@2a33fae0
eureka_1            | 
eureka_1            |   .   ____          _            __ _ _
eureka_1            |  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
eureka_1            | ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
eureka_1            |  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
eureka_1            |   '  |____| .__|_| |_|_| |_\__, | / / / /
eureka_1            |  =========|_|==============|___/=/_/_/_/
eureka_1            |  :: Spring Boot ::        (v1.4.3.RELEASE)
eureka_1            | 
eureka_1            | 2017-07-23 04:16:53.099  INFO 1 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Fetching config from server at: http://spring-cloud-config-server.default.svc.cluster.local:8888
eureka_1            | 2017-07-23 04:16:54.798  WARN 1 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Could not locate PropertySource: I/O error on GET request for "http://spring-cloud-config-server.default.svc.cluster.local:8888/eureka/qa": spring-cloud-config-server.default.svc.cluster.local; nested exception is java.net.UnknownHostException: spring-cloud-config-server.default.svc.cluster.local
eureka_1            | 2017-07-23 04:16:54.828  INFO 1 --- [           main] eurekademo.EurekaApplication             : The following profiles are active: qa
eureka_1            | 2017-07-23 04:16:55.050  INFO 1 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@548a9f61: startup date [Sun Jul 23 04:16:55 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@3abfe836
zuul-server_1       | 2017-07-23 04:16:56.578  INFO 1 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=aa8a9720-59cd-31a9-b743-4088d08d78c5
zuul-server_1       | 2017-07-23 04:16:56.588 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Adding [applicationConfig: [classpath:/application.yml]] PropertySource with search precedence immediately lower than [applicationConfigurationProperties]
zuul-server_1       | 2017-07-23 04:16:56.600 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Removing [applicationConfigurationProperties] PropertySource
zuul-server_1       | 2017-07-23 04:16:56.603 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Removing [defaultProperties] PropertySource
zuul-server_1       | 2017-07-23 04:16:56.611 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Adding [defaultProperties] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:16:56.789  INFO 1 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
configserver_1      | 2017-07-23 04:16:57.645  INFO 1 --- [           main] o.s.i.config.IntegrationRegistrar        : No bean named 'integrationHeaderChannelRegistry' has been explicitly defined. Therefore, a default DefaultHeaderChannelRegistry will be created.
zuul-server_1       | 2017-07-23 04:16:59.219  INFO 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [class org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$b226e45b] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
configserver_1      | 2017-07-23 04:17:02.725 DEBUG 1 --- [           main] o.s.cloud.context.scope.GenericScope     : Generating bean factory id from names: [$autoCreateChannelCandidates, DefaultConfiguringBeanFactoryPostProcessor, IntegrationConfigurationBeanFactoryPostProcessor, amqpAdmin, applicationContextIdFilter, archaiusEndpoint, asyncLoadBalancerInterceptor, asyncRestTemplateCustomizer, auditEventMvcEndpoint, auditEventRepository, auditEventsEndpoint, auditListener, autoConfigurationReportEndpoint, basicErrorController, beanNameHandlerMapping, beanNameViewResolver, beansEndpoint, binderAwareChannelResolver, binderAwareRouterBeanPostProcessor, binderFactory, binderTypeRegistry, bindingService, bitbucketPropertyPathNotificationExtractor, busEndpoint, busJsonConverter, busPathMatcher, channelBindingServiceProperties, channelFactory, channelInitializer, channelsEndpoint, characterEncodingFilter, codec, commonsFeatures, compositeMessageChannelConfigurer, compositeMessageConverterFactory, configClientHealthProperties, configClientProperties, configServerApplication, configServerHealthIndicator, configurableEnvironmentConfiguration, configurationPropertiesBeans, configurationPropertiesRebinder, configurationPropertiesReportEndpoint, contextRefresher, contextStartAfterRefreshListener, conventionErrorViewResolver, converterRegistrar, datatypeChannelMessageConverter, default.org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration.RibbonClientSpecification, default.org.springframework.cloud.netflix.ribbon.eureka.RibbonEurekaAutoConfiguration.RibbonClientSpecification, defaultEnvironmentRepository, defaultMetricsTagProvider, defaultServletHandlerMapping, defaultValidator, defaultViewResolver, discoveryClient, discoveryClientHealthIndicator, discoveryClientOptionalArgs, discoveryCompositeHealthIndicator, diskSpaceHealthIndicator, diskSpaceHealthIndicatorProperties, dispatcherServlet, dispatcherServletRegistration, dumpEndpoint, duplicateServerPropertiesDetector, dynamicDestinationsBindable, embeddedServletContainerCustomizerBeanPostProcessor, enableConfigServerMarker, encrypt-org.springframework.cloud.bootstrap.encrypt.KeyProperties, encryptionController, endpointHandlerMapping, endpointMBeanExporter, endpoints-org.springframework.boot.actuate.endpoint.EndpointProperties, endpoints.cors-org.springframework.boot.actuate.autoconfigure.EndpointCorsProperties, endpoints.health-org.springframework.boot.actuate.autoconfigure.HealthMvcEndpointProperties, endpoints.jmx-org.springframework.boot.actuate.autoconfigure.EndpointMBeanExportProperties, endpoints.metrics.filter-org.springframework.boot.actuate.autoconfigure.MetricFilterProperties, envInfoContributor, environmentBusEndpoint, environmentChangeListener, environmentController, environmentEncryptor, environmentEndpoint, environmentManager, environmentManagerEndpoint, environmentMvcEndpoint, environmentWatch, error, errorAttributes, errorPageCustomizer, errorPageRegistrarBeanPostProcessor, eurekaApplicationInfoManager, eurekaAutoServiceRegistration, eurekaClient, eurekaClientConfigBean, eurekaDiscoverClientMarker, eurekaFeature, eurekaHealthIndicator, eurekaInstanceConfigBean, eurekaRegistration, eurekaServiceRegistry, faviconHandlerMapping, faviconRequestHandler, featuresEndpoint, fileRegistrar, gitInfoContributor, gitProperties, githubPropertyPathNotificationExtractor, gitlabPropertyPathNotificationExtractor, globalChannelInterceptorProcessor, gson, handlerExceptionResolver, healthAggregator, healthEndpoint, healthMvcEndpoint, heapdumpMvcEndpoint, hiddenHttpMethodFilter, httpPutFormContentFilter, httpRequestHandlerAdapter, hystrixHealthIndicator, inetUtils, inetUtilsProperties, infoEndpoint, inputBindingLifecycle, integrationConversionService, integrationEvaluationContext, integrationGlobalProperties, integrationHeaderChannelRegistry, integrationLifecycleRoleController, integrationManagementConfigurer, integrationMbeanExporter, jacksonObjectMapper, jacksonObjectMapperBuilder, jsonComponentModule, loadBalancedAsyncRestTemplateInitializer, loadBalancedRestTemplateInitializer, loadBalancedRetryPolicyFactory, loadBalancerClient, loadBalancerRequestFactory, localeCharsetMappingsCustomizer, loggersEndpoint, loggersMvcEndpoint, loggingRebinder, management.health.status-org.springframework.boot.actuate.autoconfigure.HealthIndicatorProperties, management.info-org.springframework.boot.actuate.autoconfigure.InfoContributorProperties, management.trace-org.springframework.boot.actuate.trace.TraceProperties, managementContextResolver, managementServerProperties, managementServletContext, mappingJackson2HttpMessageConverter, mbeanExporter, mbeanServer, messageBuilderFactory, messageConverterConfigurer, messageConverters, messageHandlerMethodFactory, methodValidationPostProcessor, metricReaderPublicMetrics, metricWritersMetricExporter, metricsEndpoint, metricsFilter, metricsMvcEndpoint, monitorCache, monitorRegistry, multipartConfigElement, multipartResolver, mvcContentNegotiationManager, mvcConversionService, mvcEndpoints, mvcPathMatcher, mvcResourceUrlProvider, mvcUriComponentsContributor, mvcUrlPathHelper, mvcValidator, mvcViewResolver, objectNamingStrategy, observableMVCConfiguration, org.springframework.amqp.rabbit.annotation.RabbitBootstrapConfiguration, org.springframework.amqp.rabbit.config.internalRabbitListenerAnnotationProcessor, org.springframework.amqp.rabbit.config.internalRabbitListenerEndpointRegistry, org.springframework.boot.actuate.autoconfigure.AuditAutoConfiguration, org.springframework.boot.actuate.autoconfigure.AuditAutoConfiguration$AuditEventRepositoryConfiguration, org.springframework.boot.actuate.autoconfigure.EndpointAutoConfiguration, org.springframework.boot.actuate.autoconfigure.EndpointAutoConfiguration$RequestMappingEndpointConfiguration, org.springframework.boot.actuate.autoconfigure.EndpointMBeanExportAutoConfiguration, org.springframework.boot.actuate.autoconfigure.EndpointWebMvcAutoConfiguration, org.springframework.boot.actuate.autoconfigure.EndpointWebMvcAutoConfiguration$ApplicationContextFilterConfiguration, org.springframework.boot.actuate.autoconfigure.EndpointWebMvcAutoConfiguration$EndpointWebMvcConfiguration, org.springframework.boot.actuate.autoconfigure.EndpointWebMvcManagementContextConfiguration, org.springframework.boot.actuate.autoconfigure.HealthIndicatorAutoConfiguration, org.springframework.boot.actuate.autoconfigure.HealthIndicatorAutoConfiguration$DiskSpaceHealthIndicatorConfiguration, org.springframework.boot.actuate.autoconfigure.HealthIndicatorAutoConfiguration$RabbitHealthIndicatorConfiguration, org.springframework.boot.actuate.autoconfigure.InfoContributorAutoConfiguration, org.springframework.boot.actuate.autoconfigure.ManagementServerPropertiesAutoConfiguration, org.springframework.boot.actuate.autoconfigure.MetricExportAutoConfiguration, org.springframework.boot.actuate.autoconfigure.MetricExportAutoConfiguration$MetricExportPropertiesConfiguration, org.springframework.boot.actuate.autoconfigure.MetricExportAutoConfiguration$StatsdConfiguration, org.springframework.boot.actuate.autoconfigure.MetricFilterAutoConfiguration, org.springframework.boot.actuate.autoconfigure.MetricRepositoryAutoConfiguration, org.springframework.boot.actuate.autoconfigure.PublicMetricsAutoConfiguration, org.springframework.boot.actuate.autoconfigure.PublicMetricsAutoConfiguration$IntegrationMetricsConfiguration, org.springframework.boot.actuate.autoconfigure.PublicMetricsAutoConfiguration$TomcatMetricsConfiguration, org.springframework.boot.actuate.autoconfigure.TraceRepositoryAutoConfiguration, org.springframework.boot.actuate.autoconfigure.TraceWebFilterAutoConfiguration, org.springframework.boot.autoconfigure.AutoConfigurationPackages, org.springframework.boot.autoconfigure.amqp.RabbitAnnotationDrivenConfiguration, org.springframework.boot.autoconfigure.amqp.RabbitAnnotationDrivenConfiguration$EnableRabbitConfiguration, org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration, org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration$MessagingTemplateConfiguration, org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration$RabbitConnectionFactoryCreator, org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration$RabbitTemplateConfiguration, org.springframework.boot.autoconfigure.condition.BeanTypeRegistry, org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration, org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration, org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration, org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration, org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration, org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration, org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration$IntegrationComponentScanAutoConfiguration, org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration$IntegrationConfiguration, org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration$IntegrationJmxConfiguration, org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration$IntegrationManagementConfiguration, org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration$IntegrationManagementConfiguration$EnableIntegrationManagementConfiguration, org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory, org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration, org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$Jackson2ObjectMapperBuilderCustomizerConfiguration, org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperBuilderConfiguration, org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperConfiguration, org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration, org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration, org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration, org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration, org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration$DispatcherServletConfiguration, org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration, org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration, org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration$EmbeddedTomcat, org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration, org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration, org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration, org.springframework.boot.autoconfigure.web.GsonHttpMessageConvertersConfiguration, org.springframework.boot.autoconfigure.web.HttpEncodingAutoConfiguration, org.springframework.boot.autoconfigure.web.HttpMessageConvertersAutoConfiguration, org.springframework.boot.autoconfigure.web.HttpMessageConvertersAutoConfiguration$StringHttpMessageConverterConfiguration, org.springframework.boot.autoconfigure.web.JacksonHttpMessageConvertersConfiguration, org.springframework.boot.autoconfigure.web.JacksonHttpMessageConvertersConfiguration$MappingJackson2HttpMessageConverterConfiguration, org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration, org.springframework.boot.autoconfigure.web.ServerPropertiesAutoConfiguration, org.springframework.boot.autoconfigure.web.WebClientAutoConfiguration, org.springframework.boot.autoconfigure.web.WebClientAutoConfiguration$RestTemplateConfiguration, org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration, org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration$EnableWebMvcConfiguration, org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter, org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter$FaviconConfiguration, org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration, org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration$TomcatWebSocketConfiguration, org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor, org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor.store, org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration, org.springframework.cloud.autoconfigure.LifecycleMvcEndpointAutoConfiguration, org.springframework.cloud.autoconfigure.RefreshAutoConfiguration, org.springframework.cloud.autoconfigure.RefreshAutoConfiguration$RefreshScopeConfiguration, org.springframework.cloud.autoconfigure.RefreshEndpointAutoConfiguration, org.springframework.cloud.autoconfigure.RefreshEndpointAutoConfiguration$RefreshEndpointConfiguration, org.springframework.cloud.autoconfigure.RefreshEndpointAutoConfiguration$RestartEndpointWithIntegration, org.springframework.cloud.bus.BusAutoConfiguration, org.springframework.cloud.bus.BusAutoConfiguration$BusEndpointConfiguration, org.springframework.cloud.bus.BusAutoConfiguration$BusEnvironmentConfiguration, org.springframework.cloud.bus.BusAutoConfiguration$BusEnvironmentConfiguration$EnvironmentBusEndpointConfiguration, org.springframework.cloud.bus.BusAutoConfiguration$BusRefreshConfiguration, org.springframework.cloud.bus.BusAutoConfiguration$BusRefreshConfiguration$BusRefreshEndpointConfiguration, org.springframework.cloud.bus.BusAutoConfiguration$MatcherConfiguration, org.springframework.cloud.bus.SpringCloudBusClient, org.springframework.cloud.bus.jackson.BusJacksonAutoConfiguration, org.springframework.cloud.client.CommonsClientAutoConfiguration, org.springframework.cloud.client.CommonsClientAutoConfiguration$ActuatorConfiguration, org.springframework.cloud.client.CommonsClientAutoConfiguration$DiscoveryLoadBalancerConfiguration, org.springframework.cloud.client.loadbalancer.AsyncLoadBalancerAutoConfiguration, org.springframework.cloud.client.loadbalancer.AsyncLoadBalancerAutoConfiguration$AsyncRestTemplateCustomizerConfig, org.springframework.cloud.client.loadbalancer.AsyncLoadBalancerAutoConfiguration$LoadBalancerInterceptorConfig, org.springframework.cloud.client.loadbalancer.LoadBalancerAutoConfiguration, org.springframework.cloud.client.loadbalancer.LoadBalancerAutoConfiguration$RetryAutoConfiguration, org.springframework.cloud.client.serviceregistry.AutoServiceRegistrationConfiguration, org.springframework.cloud.client.serviceregistry.ServiceRegistryAutoConfiguration, org.springframework.cloud.client.serviceregistry.ServiceRegistryAutoConfiguration$ServiceRegistryEndpointConfiguration, org.springframework.cloud.commons.util.UtilAutoConfiguration, org.springframework.cloud.config.client.ConfigClientAutoConfiguration, org.springframework.cloud.config.monitor.EnvironmentMonitorAutoConfiguration, org.springframework.cloud.config.monitor.EnvironmentMonitorAutoConfiguration$PropertyPathNotificationExtractorConfiguration, org.springframework.cloud.config.monitor.FileMonitorConfiguration, org.springframework.cloud.config.server.config.CompositeConfiguration, org.springframework.cloud.config.server.config.ConfigServerAutoConfiguration, org.springframework.cloud.config.server.config.ConfigServerConfiguration, org.springframework.cloud.config.server.config.ConfigServerEncryptionConfiguration, org.springframework.cloud.config.server.config.ConfigServerMvcConfiguration, org.springframework.cloud.config.server.config.EncryptionAutoConfiguration, org.springframework.cloud.config.server.config.EncryptionAutoConfiguration$KeyStoreConfiguration, org.springframework.cloud.config.server.config.EnvironmentRepositoryConfiguration, org.springframework.cloud.config.server.config.EnvironmentRepositoryConfiguration$DefaultEnvironmentWatch, org.springframework.cloud.config.server.config.EnvironmentRepositoryConfiguration$DefaultRepositoryConfiguration, org.springframework.cloud.config.server.config.ResourceRepositoryConfiguration, org.springframework.cloud.config.server.config.SingleEncryptorAutoConfiguration, org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration, org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration$ArchaiusEndpointConfiguration, org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration$PropagateEventsConfiguration, org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration, org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration, org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration, org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration$EurekaClientConfigurationRefresher, org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration$EurekaHealthIndicatorConfiguration, org.springframework.cloud.netflix.eureka.config.EurekaClientConfigServerAutoConfiguration, org.springframework.cloud.netflix.hystrix.HystrixAutoConfiguration, org.springframework.cloud.netflix.metrics.MetricsInterceptorConfiguration, org.springframework.cloud.netflix.metrics.MetricsInterceptorConfiguration$MetricsRestTemplateConfiguration, org.springframework.cloud.netflix.metrics.MetricsInterceptorConfiguration$MetricsWebResourceConfiguration, org.springframework.cloud.netflix.metrics.servo.ServoMetricsAutoConfiguration, org.springframework.cloud.netflix.metrics.servo.ServoMetricsAutoConfiguration$MetricsTagConfiguration, org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration, org.springframework.cloud.netflix.ribbon.eureka.RibbonEurekaAutoConfiguration, org.springframework.cloud.netflix.rx.RxJavaAutoConfiguration, org.springframework.cloud.netflix.rx.RxJavaAutoConfiguration$RxJavaReturnValueHandlerConfig, org.springframework.cloud.stream.config.BinderFactoryConfiguration, org.springframework.cloud.stream.config.BindingServiceConfiguration, org.springframework.cloud.stream.config.BindingServiceConfiguration$PostProcessorConfiguration, org.springframework.cloud.stream.config.ChannelBindingAutoConfiguration, org.springframework.cloud.stream.config.ChannelsEndpointAutoConfiguration, org.springframework.cloud.stream.config.SpelExpressionConverterConfiguration, org.springframework.cloud.stream.config.codec.kryo.KryoCodecAutoConfiguration, org.springframework.context.annotation.internalAutowiredAnnotationProcessor, org.springframework.context.annotation.internalCommonAnnotationProcessor, org.springframework.context.annotation.internalConfigurationAnnotationProcessor, org.springframework.context.annotation.internalRequiredAnnotationProcessor, org.springframework.context.annotation.internalScheduledAnnotationProcessor, org.springframework.context.event.internalEventListenerFactory, org.springframework.context.event.internalEventListenerProcessor, org.springframework.integration.config.IntegrationManagementConfiguration, org.springframework.integration.context.defaultPollerMetadata, org.springframework.integration.expression.IntegrationEvaluationContextAwareBeanPostProcessor#0, org.springframework.integration.internalMessagingAnnotationPostProcessor, org.springframework.integration.internalPublisherAnnotationBeanPostProcessor, org.springframework.integration.jmx.config.MBeanExporterHelper, org.springframework.scheduling.annotation.SchedulingConfiguration, outputBindingLifecycle, pauseEndpoint, pauseMvcEndpoint, persistenceExceptionTranslationPostProcessor, platformTransactionManagerCustomizers, preserveErrorControllerTargetClassPostProcessor, propertiesFactory, propertyAccessorBeanPostProcessor, propertyPathEndpoint, propertySourcesPlaceholderConfigurer, rabbitConnectionFactory, rabbitHealthIndicator, rabbitListenerContainerFactory, rabbitListenerContainerFactoryConfigurer, rabbitMessagingTemplate, rabbitTemplate, refreshBusEndpoint, refreshEndpoint, refreshEventListener, refreshListener, refreshMvcEndpoint, refreshScope, refreshScopeHealthIndicator, requestContextFilter, requestMappingEndpoint, requestMappingHandlerAdapter, requestMappingHandlerMapping, resourceController, resourceHandlerMapping, resourceRepository, restTemplateBuilder, restTemplateCustomizer, restartEndpoint, restartMvcEndpoint, resumeEndpoint, resumeMvcEndpoint, retryTemplate, ribbon.eager-load-org.springframework.cloud.netflix.ribbon.RibbonEagerLoadProperties, ribbonFeature, ribbonInterceptor, rxFeature, scopedTarget.eurekaApplicationInfoManager, scopedTarget.eurekaClient, searchPathCompositeEnvironmentRepository, serverProperties, serviceMatcher, serviceRegistryEndpoint, servoMetricNaming, servoMetricReader, servoMetricServices, servoMetricsConfig, servoMonitoringWebResourceInterceptor, servoPublicMetrics, shutdownEndpoint, simpleControllerHandlerAdapter, singleReturnValueHandler, spectatorLoggingClientHttpRequestInterceptor, spectatorRestTemplateInterceptorPostProcessor, spelConverter, spring.cloud.bus-org.springframework.cloud.bus.BusProperties, spring.cloud.codec.kryo-org.springframework.cloud.stream.config.codec.kryo.KryoCodecProperties, spring.cloud.config.server-org.springframework.cloud.config.server.config.ConfigServerProperties, spring.cloud.loadbalancer.retry-org.springframework.cloud.client.loadbalancer.LoadBalancerRetryProperties, spring.cloud.service-registry.auto-registration-org.springframework.cloud.client.serviceregistry.AutoServiceRegistrationProperties, spring.cloud.stream-org.springframework.cloud.stream.config.BindingServiceProperties, spring.http.encoding-org.springframework.boot.autoconfigure.web.HttpEncodingProperties, spring.http.multipart-org.springframework.boot.autoconfigure.web.MultipartProperties, spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties, spring.integration.poller-org.springframework.cloud.stream.config.DefaultPollerProperties, spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties, spring.metrics.export-org.springframework.boot.actuate.metrics.export.MetricExportProperties, spring.mvc-org.springframework.boot.autoconfigure.web.WebMvcProperties, spring.rabbitmq-org.springframework.boot.autoconfigure.amqp.RabbitProperties, spring.resources-org.springframework.boot.autoconfigure.web.ResourceProperties, spring.transaction-org.springframework.boot.autoconfigure.transaction.TransactionProperties, springClientFactory, springCloudBusInput, springCloudBusOutput, springIntegrationPublicMetrics, standardJacksonObjectMapperBuilderCustomizer, streamListenerAnnotationBeanPostProcessor, stringHttpMessageConverter, systemPublicMetrics, textEncryptorLocator, toStringFriendlyJsonNodeToStringConverter, tomcatEmbeddedServletContainerFactory, tomcatPublicMetrics, traceEndpoint, traceRepository, viewControllerHandlerMapping, viewResolver, webRequestLoggingFilter, websocketContainerCustomizer, welcomePageHandlerMapping]
configserver_1      | 2017-07-23 04:17:02.743  INFO 1 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=d1ef2cdc-f2c8-36c9-8a08-e5f12567df97
configserver_1      | 2017-07-23 04:17:02.882  INFO 1 --- [           main] faultConfiguringBeanFactoryPostProcessor : No bean named 'errorChannel' has been explicitly defined. Therefore, a default PublishSubscribeChannel will be created.
configserver_1      | 2017-07-23 04:17:02.921  INFO 1 --- [           main] faultConfiguringBeanFactoryPostProcessor : No bean named 'taskScheduler' has been explicitly defined. Therefore, a default ThreadPoolTaskScheduler will be created.
configserver_1      | 2017-07-23 04:17:02.990  INFO 1 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
zuul-server_1       | 2017-07-23 04:17:03.502  INFO 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8765 (http)
configserver_1      | 2017-07-23 04:17:03.541  INFO 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.amqp.rabbit.annotation.RabbitBootstrapConfiguration' of type [org.springframework.amqp.rabbit.annotation.RabbitBootstrapConfiguration$$EnhancerBySpringCGLIB$$e10304e1] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
zuul-server_1       | 2017-07-23 04:17:03.715  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service Tomcat
zuul-server_1       | 2017-07-23 04:17:03.737  INFO 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.5
configserver_1      | 2017-07-23 04:17:04.245  INFO 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.netflix.metrics.MetricsInterceptorConfiguration$MetricsRestTemplateConfiguration' of type [org.springframework.cloud.netflix.metrics.MetricsInterceptorConfiguration$MetricsRestTemplateConfiguration$$EnhancerBySpringCGLIB$$4cc3ecf4] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
zuul-server_1       | 2017-07-23 04:17:04.659  INFO 1 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
zuul-server_1       | 2017-07-23 04:17:04.667 DEBUG 1 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Published root WebApplicationContext as ServletContext attribute with name [org.springframework.web.context.WebApplicationContext.ROOT]
zuul-server_1       | 2017-07-23 04:17:04.672  INFO 1 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 24509 ms
configserver_1      | 2017-07-23 04:17:04.844  INFO 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'integrationGlobalProperties' of type [org.springframework.beans.factory.config.PropertiesFactoryBean] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
configserver_1      | 2017-07-23 04:17:04.864  INFO 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'integrationGlobalProperties' of type [java.util.Properties] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
repositories-mem_1  | 2017-07-23 04:17:05.033  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Overriding bean definition for bean 'httpRequestHandlerAdapter' with a different definition: replacing [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration$EnableWebMvcConfiguration; factoryMethodName=httpRequestHandlerAdapter; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/autoconfigure/web/WebMvcAutoConfiguration$EnableWebMvcConfiguration.class]] with [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration; factoryMethodName=httpRequestHandlerAdapter; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/data/rest/webmvc/config/RepositoryRestMvcConfiguration.class]]
configserver_1      | 2017-07-23 04:17:05.193  INFO 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$36b149b0] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
configserver_1      | 2017-07-23 04:17:05.260  INFO 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.stream.config.BindingServiceConfiguration$PostProcessorConfiguration' of type [org.springframework.cloud.stream.config.BindingServiceConfiguration$PostProcessorConfiguration$$EnhancerBySpringCGLIB$$dc5ee4b8] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
web_1               | 2017-07-23 04:17:05.289  WARN [web,,,] 1 --- [           main] o.s.c.a.ConfigurationClassPostProcessor  : Cannot enhance @Configuration bean definition 'refreshScope' since its singleton instance has been created too early. The typical cause is a non-static @Bean method with a BeanDefinitionRegistryPostProcessor return type: Consider declaring such methods as 'static'.
repositories-mem_1  | 2017-07-23 04:17:05.730  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.f.s.DefaultListableBeanFactory     : Overriding bean definition for bean 'managementServletContext' with a different definition: replacing [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.actuate.autoconfigure.EndpointWebMvcHypermediaManagementContextConfiguration; factoryMethodName=managementServletContext; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/actuate/autoconfigure/EndpointWebMvcHypermediaManagementContextConfiguration.class]] with [Root bean: class [null]; scope=; abstract=false; lazyInit=false; autowireMode=3; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=org.springframework.boot.actuate.autoconfigure.EndpointWebMvcAutoConfiguration; factoryMethodName=managementServletContext; initMethodName=null; destroyMethodName=(inferred); defined in class path resource [org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfiguration.class]]
repositories-mem_1  | 2017-07-23 04:17:07.190  WARN [repositories-mem,,,] 1 --- [           main] o.s.c.a.ConfigurationClassPostProcessor  : Cannot enhance @Configuration bean definition 'refreshScope' since its singleton instance has been created too early. The typical cause is a non-static @Bean method with a BeanDefinitionRegistryPostProcessor return type: Consider declaring such methods as 'static'.
web_1               | 2017-07-23 04:17:07.383  INFO [web,,,] 1 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=5e4cfc67-89e9-345d-944a-551f927c0a2c
web_1               | 2017-07-23 04:17:07.557  INFO [web,,,] 1 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
eureka_1            | 2017-07-23 04:17:07.844  INFO 1 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=82a8e921-5602-3564-9868-f9db6653b04b
eureka_1            | 2017-07-23 04:17:08.697  INFO 1 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
configserver_1      | 2017-07-23 04:17:08.926  INFO 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8888 (http)
configserver_1      | 2017-07-23 04:17:09.095  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
configserver_1      | 2017-07-23 04:17:09.117  INFO 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.15
zuul-server_1       | 2017-07-23 04:17:09.163 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [servletConfigInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:09.173 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [servletContextInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:09.205 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [systemProperties] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:09.215 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [systemEnvironment] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:09.225 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Initialized StandardServletEnvironment with PropertySources [servletConfigInitParams,servletContextInitParams,systemProperties,systemEnvironment]
eureka_1            | 2017-07-23 04:17:09.345  INFO 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [class org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$ce812613] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
web_1               | 2017-07-23 04:17:09.362  INFO [web,,,] 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.sleuth.instrument.async.AsyncDefaultAutoConfiguration$DefaultAsyncConfigurerSupport' of type [org.springframework.cloud.sleuth.instrument.async.AsyncDefaultAutoConfiguration$DefaultAsyncConfigurerSupport$$EnhancerBySpringCGLIB$$3aa81299] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
zuul-server_1       | 2017-07-23 04:17:09.530 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [servletConfigInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:09.540 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [servletContextInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:09.542 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [systemProperties] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:09.544 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [systemEnvironment] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:09.546 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Initialized StandardServletEnvironment with PropertySources [servletConfigInitParams,servletContextInitParams,systemProperties,systemEnvironment]
zuul-server_1       | 2017-07-23 04:17:09.652 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [servletConfigInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:09.670 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [servletContextInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:09.676 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [systemProperties] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:09.679 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [systemEnvironment] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:09.683 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Initialized StandardServletEnvironment with PropertySources [servletConfigInitParams,servletContextInitParams,systemProperties,systemEnvironment]
repositories-mem_1  | 2017-07-23 04:17:09.775  INFO [repositories-mem,,,] 1 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=ffe8da8c-cb2c-39f5-9755-44da046dcec6
zuul-server_1       | 2017-07-23 04:17:10.012 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [servletConfigInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:10.016 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [servletContextInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:10.021 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [systemProperties] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:10.036 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [systemEnvironment] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:10.041 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Initialized StandardServletEnvironment with PropertySources [servletConfigInitParams,servletContextInitParams,systemProperties,systemEnvironment]
repositories-mem_1  | 2017-07-23 04:17:10.069  INFO [repositories-mem,,,] 1 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
configserver_1      | 2017-07-23 04:17:10.105  INFO 1 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
configserver_1      | 2017-07-23 04:17:10.106  INFO 1 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 20873 ms
zuul-server_1       | 2017-07-23 04:17:10.565 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [servletConfigInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:10.567 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [servletContextInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:10.568 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [systemProperties] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:10.583 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [systemEnvironment] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:10.594 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Initialized StandardServletEnvironment with PropertySources [servletConfigInitParams,servletContextInitParams,systemProperties,systemEnvironment]
zuul-server_1       | 2017-07-23 04:17:10.916 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [servletConfigInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:10.918 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [servletContextInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:10.919 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [systemProperties] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:10.923 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [systemEnvironment] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:10.928 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Initialized StandardServletEnvironment with PropertySources [servletConfigInitParams,servletContextInitParams,systemProperties,systemEnvironment]
zuul-server_1       | 2017-07-23 04:17:11.024 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [servletConfigInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:11.025 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [servletContextInitParams] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:11.036 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [systemProperties] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:11.046 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Adding [systemEnvironment] PropertySource with lowest search precedence
zuul-server_1       | 2017-07-23 04:17:11.048 DEBUG 1 --- [ost-startStop-1] o.s.w.c.s.StandardServletEnvironment     : Initialized StandardServletEnvironment with PropertySources [servletConfigInitParams,servletContextInitParams,systemProperties,systemEnvironment]
repositories-mem_1  | 2017-07-23 04:17:11.628  INFO [repositories-mem,,,] 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.sleuth.instrument.async.AsyncDefaultAutoConfiguration$DefaultAsyncConfigurerSupport' of type [org.springframework.cloud.sleuth.instrument.async.AsyncDefaultAutoConfiguration$DefaultAsyncConfigurerSupport$$EnhancerBySpringCGLIB$$d81e1158] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
zuul-server_1       | 2017-07-23 04:17:11.816  WARN 1 --- [ost-startStop-1] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
zuul-server_1       | 2017-07-23 04:17:11.833  INFO 1 --- [ost-startStop-1] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
zuul-server_1       | 2017-07-23 04:17:11.937  INFO 1 --- [ost-startStop-1] c.netflix.config.DynamicPropertyFactory  : DynamicPropertyFactory is initialized with configuration sources: com.netflix.config.ConcurrentCompositeConfiguration@6bffb8a3
eureka_1            | 2017-07-23 04:17:12.355  INFO 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8761 (http)
eureka_1            | 2017-07-23 04:17:12.482  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service Tomcat
eureka_1            | 2017-07-23 04:17:12.495  INFO 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.6
configserver_1      | 2017-07-23 04:17:12.740  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
configserver_1      | 2017-07-23 04:17:12.770  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'metricsFilter' to: [/*]
configserver_1      | 2017-07-23 04:17:12.780  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
configserver_1      | 2017-07-23 04:17:12.788  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
configserver_1      | 2017-07-23 04:17:12.790  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
configserver_1      | 2017-07-23 04:17:12.793  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
configserver_1      | 2017-07-23 04:17:12.799  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'webRequestLoggingFilter' to: [/*]
configserver_1      | 2017-07-23 04:17:12.801  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'applicationContextIdFilter' to: [/*]
web_1               | 2017-07-23 04:17:13.050  INFO [web,,,] 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$198077d3] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
eureka_1            | 2017-07-23 04:17:13.295  INFO 1 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
eureka_1            | 2017-07-23 04:17:13.302  INFO 1 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 18251 ms
repositories-mem_1  | 2017-07-23 04:17:15.618  INFO [repositories-mem,,,] 1 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$b6f67692] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
zuul-server_1       | 2017-07-23 04:17:16.215  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'zuulServlet' to [/zuul/*]
zuul-server_1       | 2017-07-23 04:17:16.243  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
zuul-server_1       | 2017-07-23 04:17:16.296  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'metricsFilter' to: [/*]
zuul-server_1       | 2017-07-23 04:17:16.308  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
zuul-server_1       | 2017-07-23 04:17:16.308  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
zuul-server_1       | 2017-07-23 04:17:16.308  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
zuul-server_1       | 2017-07-23 04:17:16.308  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
zuul-server_1       | 2017-07-23 04:17:16.308  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'webRequestLoggingFilter' to: [/*]
zuul-server_1       | 2017-07-23 04:17:16.308  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'applicationContextIdFilter' to: [/*]
zuul-server_1       | 2017-07-23 04:17:16.571  INFO 1 --- [ost-startStop-1] o.s.c.n.zuul.ZuulFilterInitializer       : Starting filter initializer context listener
zuul-server_1       | 2017-07-23 04:17:16.672 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Replacing [servletContextInitParams] PropertySource with [servletContextInitParams]
eureka_1            | 2017-07-23 04:17:19.080  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'metricsFilter' to: [/*]
eureka_1            | 2017-07-23 04:17:19.091  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
eureka_1            | 2017-07-23 04:17:19.096  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
eureka_1            | 2017-07-23 04:17:19.097  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
eureka_1            | 2017-07-23 04:17:19.114  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
eureka_1            | 2017-07-23 04:17:19.123  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'webRequestTraceFilter' to: [/*]
eureka_1            | 2017-07-23 04:17:19.129  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'servletContainer' to urls: [/eureka/*]
eureka_1            | 2017-07-23 04:17:19.141  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'applicationContextIdFilter' to: [/*]
eureka_1            | 2017-07-23 04:17:19.149  INFO 1 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
eureka_1            | 2017-07-23 04:17:20.722  INFO 1 --- [ost-startStop-1] c.s.j.s.i.a.WebApplicationImpl           : Initiating Jersey application, version 'Jersey: 1.19.1 03/11/2016 02:08 PM'
web_1               | 2017-07-23 04:17:20.942  INFO [web,,,] 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8091 (http)
web_1               | 2017-07-23 04:17:21.195  INFO [web,,,] 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
web_1               | 2017-07-23 04:17:21.239  INFO [web,,,] 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.15
eureka_1            | 2017-07-23 04:17:21.913  INFO 1 --- [ost-startStop-1] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON encoding codec LegacyJacksonJson
eureka_1            | 2017-07-23 04:17:21.931  INFO 1 --- [ost-startStop-1] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON decoding codec LegacyJacksonJson
configserver_1      | 2017-07-23 04:17:22.152  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@290dbf45: startup date [Sun Jul 23 04:16:49 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@470e2030
web_1               | 2017-07-23 04:17:22.545  INFO [web,,,] 1 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
web_1               | 2017-07-23 04:17:22.547  INFO [web,,,] 1 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 31047 ms
repositories-mem_1  | 2017-07-23 04:17:22.978  INFO [repositories-mem,,,] 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 9091 (http)
repositories-mem_1  | 2017-07-23 04:17:23.128  INFO [repositories-mem,,,] 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
repositories-mem_1  | 2017-07-23 04:17:23.144  INFO [repositories-mem,,,] 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.15
configserver_1      | 2017-07-23 04:17:23.286  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
configserver_1      | 2017-07-23 04:17:23.302  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
configserver_1      | 2017-07-23 04:17:23.349  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/monitor],methods=[POST]}" onto public java.util.Set<java.lang.String> org.springframework.cloud.config.monitor.PropertyPathEndpoint.notifyByPath(org.springframework.http.HttpHeaders,java.util.Map<java.lang.String, java.lang.Object>)
configserver_1      | 2017-07-23 04:17:23.357  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/monitor],methods=[POST],consumes=[application/x-www-form-urlencoded]}" onto public java.util.Set<java.lang.String> org.springframework.cloud.config.monitor.PropertyPathEndpoint.notifyByForm(org.springframework.http.HttpHeaders,java.util.List<java.lang.String>)
configserver_1      | 2017-07-23 04:17:23.445  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/encrypt],methods=[POST]}" onto public java.lang.String org.springframework.cloud.config.server.encryption.EncryptionController.encrypt(java.lang.String,org.springframework.http.MediaType)
configserver_1      | 2017-07-23 04:17:23.465  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/encrypt/{name}/{profiles}],methods=[POST]}" onto public java.lang.String org.springframework.cloud.config.server.encryption.EncryptionController.encrypt(java.lang.String,java.lang.String,java.lang.String,org.springframework.http.MediaType)
configserver_1      | 2017-07-23 04:17:23.468  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/decrypt/{name}/{profiles}],methods=[POST]}" onto public java.lang.String org.springframework.cloud.config.server.encryption.EncryptionController.decrypt(java.lang.String,java.lang.String,java.lang.String,org.springframework.http.MediaType)
configserver_1      | 2017-07-23 04:17:23.471  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/decrypt],methods=[POST]}" onto public java.lang.String org.springframework.cloud.config.server.encryption.EncryptionController.decrypt(java.lang.String,org.springframework.http.MediaType)
configserver_1      | 2017-07-23 04:17:23.481  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/encrypt/status],methods=[GET]}" onto public java.util.Map<java.lang.String, java.lang.Object> org.springframework.cloud.config.server.encryption.EncryptionController.status()
configserver_1      | 2017-07-23 04:17:23.482  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/key],methods=[GET]}" onto public java.lang.String org.springframework.cloud.config.server.encryption.EncryptionController.getPublicKey()
configserver_1      | 2017-07-23 04:17:23.485  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/key/{name}/{profiles}],methods=[GET]}" onto public java.lang.String org.springframework.cloud.config.server.encryption.EncryptionController.getPublicKey(java.lang.String,java.lang.String)
configserver_1      | 2017-07-23 04:17:23.569  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}/{profiles}/{label:.*}],methods=[GET]}" onto public org.springframework.cloud.config.environment.Environment org.springframework.cloud.config.server.environment.EnvironmentController.labelled(java.lang.String,java.lang.String,java.lang.String)
configserver_1      | 2017-07-23 04:17:23.580  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{label}/{name}-{profiles}.properties],methods=[GET]}" onto public org.springframework.http.ResponseEntity<java.lang.String> org.springframework.cloud.config.server.environment.EnvironmentController.labelledProperties(java.lang.String,java.lang.String,java.lang.String,boolean) throws java.io.IOException
configserver_1      | 2017-07-23 04:17:23.588  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}-{profiles}.json],methods=[GET]}" onto public org.springframework.http.ResponseEntity<java.lang.String> org.springframework.cloud.config.server.environment.EnvironmentController.jsonProperties(java.lang.String,java.lang.String,boolean) throws java.lang.Exception
configserver_1      | 2017-07-23 04:17:23.594  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{label}/{name}-{profiles}.json],methods=[GET]}" onto public org.springframework.http.ResponseEntity<java.lang.String> org.springframework.cloud.config.server.environment.EnvironmentController.labelledJsonProperties(java.lang.String,java.lang.String,java.lang.String,boolean) throws java.lang.Exception
configserver_1      | 2017-07-23 04:17:23.599  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{label}/{name}-{profiles}.yml || /{label}/{name}-{profiles}.yaml],methods=[GET]}" onto public org.springframework.http.ResponseEntity<java.lang.String> org.springframework.cloud.config.server.environment.EnvironmentController.labelledYaml(java.lang.String,java.lang.String,java.lang.String,boolean) throws java.lang.Exception
configserver_1      | 2017-07-23 04:17:23.607  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}-{profiles}.properties],methods=[GET]}" onto public org.springframework.http.ResponseEntity<java.lang.String> org.springframework.cloud.config.server.environment.EnvironmentController.properties(java.lang.String,java.lang.String,boolean) throws java.io.IOException
configserver_1      | 2017-07-23 04:17:23.612  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}-{profiles}.yml || /{name}-{profiles}.yaml],methods=[GET]}" onto public org.springframework.http.ResponseEntity<java.lang.String> org.springframework.cloud.config.server.environment.EnvironmentController.yaml(java.lang.String,java.lang.String,boolean) throws java.lang.Exception
configserver_1      | 2017-07-23 04:17:23.613  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}/{profiles:.*[^-].*}],methods=[GET]}" onto public org.springframework.cloud.config.environment.Environment org.springframework.cloud.config.server.environment.EnvironmentController.defaultLabel(java.lang.String,java.lang.String)
configserver_1      | 2017-07-23 04:17:23.640  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}/{profile}/{label}/**],methods=[GET],produces=[application/octet-stream]}" onto public synchronized byte[] org.springframework.cloud.config.server.resource.ResourceController.binary(java.lang.String,java.lang.String,java.lang.String,javax.servlet.http.HttpServletRequest) throws java.io.IOException
configserver_1      | 2017-07-23 04:17:23.654  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}/{profile}/{label}/**],methods=[GET]}" onto public java.lang.String org.springframework.cloud.config.server.resource.ResourceController.retrieve(java.lang.String,java.lang.String,java.lang.String,javax.servlet.http.HttpServletRequest,boolean) throws java.io.IOException
eureka_1            | 2017-07-23 04:17:24.016  INFO 1 --- [ost-startStop-1] c.n.d.provider.DiscoveryJerseyProvider   : Using XML encoding codec XStreamXml
eureka_1            | 2017-07-23 04:17:24.029  INFO 1 --- [ost-startStop-1] c.n.d.provider.DiscoveryJerseyProvider   : Using XML decoding codec XStreamXml
configserver_1      | 2017-07-23 04:17:24.169  INFO 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
configserver_1      | 2017-07-23 04:17:24.184  INFO 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
repositories-mem_1  | 2017-07-23 04:17:24.638  INFO [repositories-mem,,,] 1 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
repositories-mem_1  | 2017-07-23 04:17:24.638  INFO [repositories-mem,,,] 1 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 32604 ms
configserver_1      | 2017-07-23 04:17:24.707  INFO 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
zuul-server_1       | 2017-07-23 04:17:26.860  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@457e2f02: startup date [Sun Jul 23 04:16:40 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@16f65612
zuul-server_1       | 2017-07-23 04:17:28.695 DEBUG 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Looking for request mappings in application context: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@457e2f02: startup date [Sun Jul 23 04:16:40 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@16f65612
eureka_1            | 2017-07-23 04:17:28.794  INFO 1 --- [           main] o.s.c.n.eureka.InstanceInfoFactory       : Setting initial instance status as: STARTING
zuul-server_1       | 2017-07-23 04:17:28.821 DEBUG 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 1 request handler methods found on class zuulserver.ZuulServerApplication: {public java.lang.String zuulserver.ZuulServerApplication.timeout() throws java.lang.InterruptedException={[/timeout]}}
zuul-server_1       | 2017-07-23 04:17:28.829  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/timeout]}" onto public java.lang.String zuulserver.ZuulServerApplication.timeout() throws java.lang.InterruptedException
zuul-server_1       | 2017-07-23 04:17:28.871 DEBUG 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 2 request handler methods found on class org.springframework.boot.autoconfigure.web.BasicErrorController: {public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)={[/error],produces=[text/html]}, public org.springframework.http.ResponseEntity org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)={[/error]}}
zuul-server_1       | 2017-07-23 04:17:28.872  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
zuul-server_1       | 2017-07-23 04:17:28.872  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
eureka_1            | 2017-07-23 04:17:29.488  INFO 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Client configured to neither register nor query for data.
zuul-server_1       | 2017-07-23 04:17:29.530 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Looking for URL mappings in application context: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@457e2f02: startup date [Sun Jul 23 04:16:40 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@16f65612
zuul-server_1       | 2017-07-23 04:17:29.531 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.531 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.537 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.annotation.internalRequiredAnnotationProcessor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.537 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.annotation.internalCommonAnnotationProcessor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.event.internalEventListenerProcessor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.event.internalEventListenerFactory': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'zuulServerApplication': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.annotation.ConfigurationClassPostProcessor.importAwareProcessor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.annotation.ConfigurationClassPostProcessor.enhancedConfigurationProcessor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.zuul.ZuulProxyConfiguration$RoutesEndpointConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'proxyRequestHelper': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'zuulEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.zuul.RibbonCommandFactoryConfiguration$HttpClientRibbonConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.condition.BeanTypeRegistry': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'ribbonCommandFactory': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.zuul.ZuulConfiguration$ZuulFilterConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'zuulFilterInitializer': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.ServerPropertiesAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.538 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'serverProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.539 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'duplicateServerPropertiesDetector': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.547 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.547 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor.store': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.548 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.zuul.ZuulProxyConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.560 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'routeLocator': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.564 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'preDecorationFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.564 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'ribbonRoutingFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.567 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'zuulDiscoveryRefreshRoutesListener': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.567 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'serviceRouteMapper': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.567 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'simpleHostRoutingFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.573 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'zuulHandlerMapping': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.573 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'zuulRefreshRoutesListener': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.574 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'zuulServlet': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.576 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'servletDetectionFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.576 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'formBodyWrapperFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.576 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'debugFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.576 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'servlet30WrapperFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.576 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'sendResponseFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.589 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'sendErrorFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.592 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'sendForwardFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.599 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'zuulController': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.600 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'zuulFeature': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.611 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'zuul-org.springframework.cloud.netflix.zuul.filters.ZuulProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.616 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'zuulFallbackProvider': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.619 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.AutoConfigurationPackages': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.623 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.hystrix.HystrixCircuitBreakerConfiguration$HystrixMetricsPollerConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.625 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'hystrix.metrics-org.springframework.cloud.netflix.hystrix.HystrixMetricsProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.626 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.hystrix.HystrixCircuitBreakerConfiguration$HystrixWebConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.631 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'hystrixStreamEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.632 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'hystrixFeature': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.641 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.hystrix.HystrixCircuitBreakerConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.641 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'hystrixCommandAspect': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.641 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'hystrixShutdownHook': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.641 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration$EurekaHealthIndicatorConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.642 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'eurekaHealthIndicator': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.642 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration$EurekaClientConfigurationRefresher': no URL paths identified
eureka_1            | 2017-07-23 04:17:29.647  INFO 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Discovery Client initialized at timestamp 1500783449644 with initial instances count: 0
zuul-server_1       | 2017-07-23 04:17:29.657 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.657 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.PropertyPlaceholderAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.661 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'propertySourcesPlaceholderConfigurer': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.662 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$Jackson2ObjectMapperBuilderCustomizerConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.662 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'standardJacksonObjectMapperBuilderCustomizer': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.662 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.662 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperBuilderConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.662 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'jacksonObjectMapperBuilder': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.662 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.667 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'jacksonObjectMapper': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.673 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.673 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'jsonComponentModule': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.678 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration$TomcatWebSocketConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.684 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'websocketContainerCustomizer': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.684 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.693 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration$EmbeddedTomcat': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.693 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'tomcatEmbeddedServletContainerFactory': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.694 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.701 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'embeddedServletContainerCustomizerBeanPostProcessor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.701 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'errorPageRegistrarBeanPostProcessor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.707 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration$DispatcherServletConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.707 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'dispatcherServlet': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.710 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.mvc-org.springframework.boot.autoconfigure.web.WebMvcProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.710 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.716 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'dispatcherServletRegistration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.716 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.716 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.720 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'error': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.723 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'beanNameViewResolver': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.727 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.736 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'errorAttributes': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.739 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'basicErrorController': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.739 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'errorPageCustomizer': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.742 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'conventionErrorViewResolver': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.744 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'preserveErrorControllerTargetClassPostProcessor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.750 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.resources-org.springframework.boot.autoconfigure.web.ResourceProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.754 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration$EnableWebMvcConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.756 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'requestMappingHandlerAdapter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.756 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'requestMappingHandlerMapping': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.756 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcPathMatcher': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.756 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcUrlPathHelper': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.756 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcContentNegotiationManager': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.756 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'viewControllerHandlerMapping': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.766 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'beanNameHandlerMapping': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.769 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'resourceHandlerMapping': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.771 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcResourceUrlProvider': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.773 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'defaultServletHandlerMapping': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.777 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcConversionService': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.777 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcValidator': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.783 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcUriComponentsContributor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.787 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'httpRequestHandlerAdapter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.797 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'simpleControllerHandlerAdapter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.797 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'handlerExceptionResolver': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.800 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcViewResolver': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.804 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter$FaviconConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.804 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'faviconHandlerMapping': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.804 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'faviconRequestHandler': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.804 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.805 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'defaultViewResolver': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.805 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'viewResolver': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.805 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'welcomePageHandlerMapping': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.805 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'requestContextFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.805 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.806 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'hiddenHttpMethodFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.806 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'httpPutFormContentFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.806 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.autoconfigure.RefreshAutoConfiguration$RefreshScopeConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.806 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.autoconfigure.RefreshAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.806 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'loggingRebinder': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.806 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'environmentManager': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.810 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'contextRefresher': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.812 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.816 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'scopedTarget.eurekaClient': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.816 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'eurekaClient': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.816 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'scopedTarget.eurekaApplicationInfoManager': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.816 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'eurekaApplicationInfoManager': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.816 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.816 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'eurekaFeature': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.816 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'eurekaClientConfigBean': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.822 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'eurekaInstanceConfigBean': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.822 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'discoveryClient': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.822 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'discoveryClientOptionalArgs': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.822 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.client.CommonsClientAutoConfiguration$ActuatorConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.822 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'featuresEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.822 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.client.CommonsClientAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.825 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'discoveryClientHealthIndicator': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.825 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'discoveryCompositeHealthIndicator': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.826 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'commonsFeatures': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.830 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.commons.util.UtilAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.830 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'inetUtilsProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.831 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'inetUtils': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.849 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.AuditAutoConfiguration$AuditEventRepositoryConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.849 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'auditEventRepository': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.849 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.AuditAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.849 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'auditListener': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.849 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.849 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.849 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.InfoContributorAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.849 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'envInfoContributor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.850 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'management.info-org.springframework.boot.actuate.autoconfigure.InfoContributorProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.850 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.850 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'gson': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.850 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.HealthIndicatorAutoConfiguration$DiskSpaceHealthIndicatorConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.850 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'diskSpaceHealthIndicator': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.851 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'diskSpaceHealthIndicatorProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.851 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.HealthIndicatorAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.851 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'healthAggregator': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.853 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'management.health.status-org.springframework.boot.actuate.autoconfigure.HealthIndicatorProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.853 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.metrics.servo.ServoMetricsAutoConfiguration$MetricsTagConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.853 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'defaultMetricsTagProvider': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.853 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.metrics.MetricsInterceptorConfiguration$MetricsWebResourceConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.853 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'servoMonitoringWebResourceInterceptor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.856 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.metrics.MetricsInterceptorConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.857 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.metrics.servo.ServoMetricsAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.861 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'servoMetricsConfig': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.861 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'servoMetricNaming': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.861 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'monitorRegistry': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.861 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'monitorCache': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.861 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'servoMetricReader': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.861 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'servoPublicMetrics': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.861 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'servoMetricServices': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.861 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.MetricRepositoryAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.861 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.862 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mbeanExporter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.873 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'objectNamingStrategy': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.873 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mbeanServer': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.882 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.PublicMetricsAutoConfiguration$TomcatMetricsConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.882 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'tomcatPublicMetrics': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.887 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.PublicMetricsAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.896 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'systemPublicMetrics': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.896 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'metricReaderPublicMetrics': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.896 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.EndpointAutoConfiguration$RequestMappingEndpointConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.899 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'requestMappingEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.904 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.EndpointAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.904 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'environmentEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.910 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'healthEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.910 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'beansEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.910 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'infoEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.910 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'metricsEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.912 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'traceEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.913 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'dumpEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.923 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'autoConfigurationReportEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.925 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'shutdownEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.926 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'configurationPropertiesReportEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.926 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'endpoints-org.springframework.boot.actuate.endpoint.EndpointProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.926 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.EndpointMBeanExportAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.926 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'endpointMBeanExporter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.929 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'endpoints.jmx-org.springframework.boot.actuate.autoconfigure.EndpointMBeanExportProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.933 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.ManagementServerPropertiesAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.933 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'managementServerProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.933 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.HttpMessageConvertersAutoConfiguration$StringHttpMessageConverterConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.933 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'stringHttpMessageConverter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.933 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.http.encoding-org.springframework.boot.autoconfigure.web.HttpEncodingProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.933 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.JacksonHttpMessageConvertersConfiguration$MappingJackson2HttpMessageConverterConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.933 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mappingJackson2HttpMessageConverter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.936 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.JacksonHttpMessageConvertersConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.936 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.GsonHttpMessageConvertersConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.936 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.HttpMessageConvertersAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.942 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'messageConverters': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.942 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.EndpointWebMvcManagementContextConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.947 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'endpointHandlerMapping': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.949 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'mvcEndpoints': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.949 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'environmentMvcEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.956 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'heapdumpMvcEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.956 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'healthMvcEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.960 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'metricsMvcEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.961 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'shutdownMvcEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.961 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'endpoints.health-org.springframework.boot.actuate.autoconfigure.HealthMvcEndpointProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.967 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'endpoints.cors-org.springframework.boot.actuate.autoconfigure.EndpointCorsProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.969 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.EndpointWebMvcAutoConfiguration$EndpointWebMvcConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.971 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.EndpointWebMvcAutoConfiguration$ApplicationContextFilterConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.976 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'applicationContextIdFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.979 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.EndpointWebMvcAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.982 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'managementContextResolver': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.983 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'managementServletContext': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.991 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.MetricExportAutoConfiguration$MetricExportPropertiesConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.991 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.metrics.export-org.springframework.boot.actuate.metrics.export.MetricExportProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.991 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.MetricExportAutoConfiguration$StatsdConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.991 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.scheduling.annotation.SchedulingConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.994 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.annotation.internalScheduledAnnotationProcessor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.995 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.MetricExportAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.995 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'metricWritersMetricExporter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:29.997 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.MetricFilterAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.003 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'metricsFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.003 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'endpoints.metrics.filter-org.springframework.boot.actuate.autoconfigure.MetricFilterProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.005 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.TraceRepositoryAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.006 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'traceRepository': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.009 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.actuate.autoconfigure.TraceWebFilterAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.013 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'webRequestLoggingFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.016 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'management.trace-org.springframework.boot.actuate.trace.TraceProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.017 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$CglibAutoProxyConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.018 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.aop.config.internalAutoProxyCreator': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.027 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.aop.AopAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.037 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.040 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.HttpEncodingAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.040 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'characterEncodingFilter': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.040 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'localeCharsetMappingsCustomizer': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.040 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.040 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'multipartConfigElement': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.040 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'multipartResolver': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.041 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.http.multipart-org.springframework.boot.autoconfigure.web.MultipartProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.041 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.WebClientAutoConfiguration$RestTemplateConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.041 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'restTemplateBuilder': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.041 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.boot.autoconfigure.web.WebClientAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.041 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.045 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'configurationPropertiesBeans': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.045 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'configurationPropertiesRebinder': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.045 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.autoconfigure.RefreshEndpointAutoConfiguration$RefreshEndpointConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.054 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'refreshEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.054 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'refreshEventListener': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.054 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.autoconfigure.RefreshEndpointAutoConfiguration$RestartEndpointWithoutIntegration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.055 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'restartEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.057 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.autoconfigure.RefreshEndpointAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.062 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'refreshScopeHealthIndicator': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.065 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'pauseEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.066 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'resumeEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.078 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.autoconfigure.LifecycleMvcEndpointAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.078 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'environmentManagerEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.078 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'refreshMvcEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.086 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'restartMvcEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.087 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'pauseMvcEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.089 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'resumeMvcEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.092 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.096 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'ribbonFeature': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.101 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'springClientFactory': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.102 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'loadBalancerClient': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.102 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'neverRetryPolicyFactory': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.109 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'propertiesFactory': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.109 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'default.org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration.RibbonClientSpecification': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.109 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.client.loadbalancer.LoadBalancerAutoConfiguration$LoadBalancerInterceptorConfig': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.109 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'ribbonInterceptor': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.109 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'restTemplateCustomizer': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.109 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.client.loadbalancer.LoadBalancerAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.109 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'loadBalancedRestTemplateInitializer': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.110 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'loadBalancerRequestFactory': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.110 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'spring.cloud.loadbalancer.retry-org.springframework.cloud.client.loadbalancer.LoadBalancerRetryProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.110 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.config.client.ConfigClientAutoConfiguration$ConfigServerHealthIndicatorConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.110 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'configServerHealthIndicator': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.110 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.config.client.ConfigClientAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.110 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'configClientProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.110 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'configClientHealthProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.110 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration$PropagateEventsConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.110 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration$ArchaiusEndpointConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.110 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'archaiusEndpoint': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.110 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.110 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'configurableEnvironmentConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.118 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.hystrix.HystrixAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.119 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'hystrixHealthIndicator': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.124 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.ribbon.eureka.RibbonEurekaAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.126 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'default.org.springframework.cloud.netflix.ribbon.eureka.RibbonEurekaAutoConfiguration.RibbonClientSpecification': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.130 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.rx.RxJavaAutoConfiguration$RxJavaReturnValueHandlerConfig': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.135 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'singleReturnValueHandler': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.137 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'observableMVCConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.145 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'rxFeature': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.145 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.cloud.netflix.rx.RxJavaAutoConfiguration': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.145 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'refreshScope': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.152 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'autoConfigurationReport': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.152 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'springApplicationArguments': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.152 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'springBootBanner': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.152 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'environment': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.155 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'systemProperties': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.158 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'systemEnvironment': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.164 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'org.springframework.context.annotation.ConfigurationClassPostProcessor.importRegistry': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.164 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'messageSource': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.164 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'applicationEventMulticaster': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.164 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'servletContext': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.170 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'contextParameters': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.182 DEBUG 1 --- [           main] o.s.w.s.h.BeanNameUrlHandlerMapping      : Rejected bean name 'contextAttributes': no URL paths identified
zuul-server_1       | 2017-07-23 04:17:30.382  INFO 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
zuul-server_1       | 2017-07-23 04:17:30.384  INFO 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
web_1               | 2017-07-23 04:17:30.511  INFO [web,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
eureka_1            | 2017-07-23 04:17:30.540  INFO 1 --- [           main] c.n.eureka.DefaultEurekaServerContext    : Initializing ...
web_1               | 2017-07-23 04:17:30.569  INFO [web,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'metricsFilter' to: [/*]
web_1               | 2017-07-23 04:17:30.576  INFO [web,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
eureka_1            | 2017-07-23 04:17:30.578  INFO 1 --- [           main] c.n.eureka.cluster.PeerEurekaNodes       : Adding new peer nodes [http://localhost:8761/eureka/]
web_1               | 2017-07-23 04:17:30.581  INFO [web,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'traceFilter' to: [/*]
web_1               | 2017-07-23 04:17:30.582  INFO [web,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
web_1               | 2017-07-23 04:17:30.597  INFO [web,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
zuul-server_1       | 2017-07-23 04:17:30.604 DEBUG 1 --- [           main] .m.m.a.ExceptionHandlerExceptionResolver : Looking for exception mappings: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@457e2f02: startup date [Sun Jul 23 04:16:40 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@16f65612
web_1               | 2017-07-23 04:17:30.600  INFO [web,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
web_1               | 2017-07-23 04:17:30.613  INFO [web,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'webRequestLoggingFilter' to: [/*]
web_1               | 2017-07-23 04:17:30.614  INFO [web,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'applicationContextIdFilter' to: [/*]
zuul-server_1       | 2017-07-23 04:17:30.967  INFO 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
configserver_1      | 2017-07-23 04:17:32.446  INFO 1 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService  'taskScheduler'
eureka_1            | 2017-07-23 04:17:32.575  INFO 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON encoding codec LegacyJacksonJson
eureka_1            | 2017-07-23 04:17:32.593  INFO 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON decoding codec LegacyJacksonJson
eureka_1            | 2017-07-23 04:17:32.595  INFO 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML encoding codec XStreamXml
eureka_1            | 2017-07-23 04:17:32.604  INFO 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML decoding codec XStreamXml
repositories-mem_1  | 2017-07-23 04:17:33.321  INFO [repositories-mem,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
repositories-mem_1  | 2017-07-23 04:17:33.365  INFO [repositories-mem,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'metricsFilter' to: [/*]
repositories-mem_1  | 2017-07-23 04:17:33.366  INFO [repositories-mem,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
repositories-mem_1  | 2017-07-23 04:17:33.371  INFO [repositories-mem,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'traceFilter' to: [/*]
repositories-mem_1  | 2017-07-23 04:17:33.371  INFO [repositories-mem,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
repositories-mem_1  | 2017-07-23 04:17:33.372  INFO [repositories-mem,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
repositories-mem_1  | 2017-07-23 04:17:33.377  INFO [repositories-mem,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
repositories-mem_1  | 2017-07-23 04:17:33.377  INFO [repositories-mem,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'webRequestLoggingFilter' to: [/*]
repositories-mem_1  | 2017-07-23 04:17:33.377  INFO [repositories-mem,,,] 1 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'applicationContextIdFilter' to: [/*]
eureka_1            | 2017-07-23 04:17:34.091  INFO 1 --- [           main] c.n.eureka.cluster.PeerEurekaNodes       : Replica node URL:  http://localhost:8761/eureka/
eureka_1            | 2017-07-23 04:17:34.232  INFO 1 --- [           main] c.n.e.registry.AbstractInstanceRegistry  : Finished initializing remote region registries. All known remote regions: []
eureka_1            | 2017-07-23 04:17:34.242  INFO 1 --- [           main] c.n.eureka.DefaultEurekaServerContext    : Initialized
configserver_1      | 2017-07-23 04:17:34.366 DEBUG 1 --- [           main] .s.c.c.s.s.GitCredentialsProviderFactory : No credentials provider required for URI https://github.com/tangfeixiong/osev3-examples
configserver_1      | 2017-07-23 04:17:34.420 DEBUG 1 --- [           main] .s.c.c.s.s.GitCredentialsProviderFactory : Constructing UsernamePasswordCredentialsProvider for URI http://172.17.4.50:10080/root/osev3-examples
configserver_1      | 2017-07-23 04:17:34.442 DEBUG 1 --- [           main] .s.c.c.s.s.GitCredentialsProviderFactory : No credentials provider required for URI https://github.com/tangfeixiong/osev3-examples
configserver_1      | 2017-07-23 04:17:34.453 DEBUG 1 --- [           main] .s.c.c.s.s.GitCredentialsProviderFactory : No credentials provider required for URI https://github.com/spring-cloud-samples/config-repo
configserver_1      | 2017-07-23 04:17:34.464 DEBUG 1 --- [           main] .s.c.c.s.s.GitCredentialsProviderFactory : No credentials provider required for URI file:///root/Downloads/99-mirror/spring-cloud-config/config-repo
repositories-mem_1  | InMemoryMessageRepository.save[pre]: Message{id=null, text='Hello', summary='World', created=java.util.GregorianCalendar[time=1500783454689,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="UTC",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=6,WEEK_OF_YEAR=30,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=204,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=17,SECOND=34,MILLISECOND=689,ZONE_OFFSET=0,DST_OFFSET=0]}
repositories-mem_1  | InMemoryMessageRepository.save[post]: Message{id=1, text='Hello', summary='World', created=java.util.GregorianCalendar[time=1500783454689,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="UTC",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=6,WEEK_OF_YEAR=30,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=204,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=17,SECOND=34,MILLISECOND=689,ZONE_OFFSET=0,DST_OFFSET=0]}
repositories-mem_1  | InMemoryMessageRepository.save[pre]: Message{id=null, text='Hi', summary='Universe', created=java.util.GregorianCalendar[time=1500783454695,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="UTC",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=6,WEEK_OF_YEAR=30,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=204,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=17,SECOND=34,MILLISECOND=695,ZONE_OFFSET=0,DST_OFFSET=0]}
repositories-mem_1  | InMemoryMessageRepository.save[post]: Message{id=2, text='Hi', summary='Universe', created=java.util.GregorianCalendar[time=1500783454695,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="UTC",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=6,WEEK_OF_YEAR=30,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=204,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=17,SECOND=34,MILLISECOND=695,ZONE_OFFSET=0,DST_OFFSET=0]}
repositories-mem_1  | InMemoryMessageRepository.save[pre]: Message{id=null, text='Hola', summary='OpenShift', created=java.util.GregorianCalendar[time=1500783454703,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="UTC",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=6,WEEK_OF_YEAR=30,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=204,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=17,SECOND=34,MILLISECOND=703,ZONE_OFFSET=0,DST_OFFSET=0]}
repositories-mem_1  | InMemoryMessageRepository.save[post]: Message{id=3, text='Hola', summary='OpenShift', created=java.util.GregorianCalendar[time=1500783454703,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="UTC",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2017,MONTH=6,WEEK_OF_YEAR=30,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=204,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=17,SECOND=34,MILLISECOND=703,ZONE_OFFSET=0,DST_OFFSET=0]}
configserver_1      | 2017-07-23 04:17:38.394 DEBUG 1 --- [           main] s.c.s.c.CompositeMessageConverterFactory : Ommitted org.springframework.integration.support.converter.DefaultDatatypeChannelMessageConverter@6e57e95e of type class org.springframework.integration.support.converter.DefaultDatatypeChannelMessageConverter for 'application/json' as it is not an AbstractMessageConverter
configserver_1      | 2017-07-23 04:17:38.601  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/resume || /admin/resume.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
configserver_1      | 2017-07-23 04:17:38.611  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/bus/env],methods=[POST]}" onto public void org.springframework.cloud.bus.endpoint.EnvironmentBusEndpoint.env(java.util.Map<java.lang.String, java.lang.String>,java.lang.String)
configserver_1      | 2017-07-23 04:17:38.635  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/archaius || /admin/archaius.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
configserver_1      | 2017-07-23 04:17:38.636  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/trace || /admin/trace.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
configserver_1      | 2017-07-23 04:17:38.645  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/info || /admin/info.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
configserver_1      | 2017-07-23 04:17:38.671  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/metrics/{name:.*}],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.MetricsMvcEndpoint.value(java.lang.String)
configserver_1      | 2017-07-23 04:17:38.673  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/metrics || /admin/metrics.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
configserver_1      | 2017-07-23 04:17:38.682  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/bus/refresh],methods=[POST]}" onto public void org.springframework.cloud.bus.endpoint.RefreshBusEndpoint.refresh(java.lang.String)
configserver_1      | 2017-07-23 04:17:38.693  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/mappings || /admin/mappings.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
configserver_1      | 2017-07-23 04:17:38.702  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/configprops || /admin/configprops.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
configserver_1      | 2017-07-23 04:17:38.706  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/env/{name:.*}],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EnvironmentMvcEndpoint.value(java.lang.String)
configserver_1      | 2017-07-23 04:17:38.714  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/env || /admin/env.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
configserver_1      | 2017-07-23 04:17:38.722  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/heapdump || /admin/heapdump.json],methods=[GET],produces=[application/octet-stream]}" onto public void org.springframework.boot.actuate.endpoint.mvc.HeapdumpMvcEndpoint.invoke(boolean,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse) throws java.io.IOException,javax.servlet.ServletException
configserver_1      | 2017-07-23 04:17:38.723  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/health || /admin/health.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.HealthMvcEndpoint.invoke(javax.servlet.http.HttpServletRequest,java.security.Principal)
configserver_1      | 2017-07-23 04:17:38.736  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/restart || /admin/restart.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.context.restart.RestartMvcEndpoint.invoke()
configserver_1      | 2017-07-23 04:17:38.747  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/dump || /admin/dump.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
configserver_1      | 2017-07-23 04:17:38.762  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/env],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.context.environment.EnvironmentManagerMvcEndpoint.value(java.util.Map<java.lang.String, java.lang.String>)
configserver_1      | 2017-07-23 04:17:38.774  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/env/reset],methods=[POST]}" onto public java.util.Map<java.lang.String, java.lang.Object> org.springframework.cloud.context.environment.EnvironmentManagerMvcEndpoint.reset()
configserver_1      | 2017-07-23 04:17:38.778  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/features || /admin/features.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
configserver_1      | 2017-07-23 04:17:38.790  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/loggers/{name:.*}],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.LoggersMvcEndpoint.get(java.lang.String)
configserver_1      | 2017-07-23 04:17:38.790  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/loggers/{name:.*}],methods=[POST],consumes=[application/vnd.spring-boot.actuator.v1+json || application/json],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.LoggersMvcEndpoint.set(java.lang.String,java.util.Map<java.lang.String, java.lang.String>)
configserver_1      | 2017-07-23 04:17:38.791  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/loggers || /admin/loggers.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
configserver_1      | 2017-07-23 04:17:38.800  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/beans || /admin/beans.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
configserver_1      | 2017-07-23 04:17:38.802  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/autoconfig || /admin/autoconfig.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
configserver_1      | 2017-07-23 04:17:38.806  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/pause || /admin/pause.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
configserver_1      | 2017-07-23 04:17:38.811  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/auditevents || /admin/auditevents.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.boot.actuate.endpoint.mvc.AuditEventsMvcEndpoint.findByPrincipalAndAfterAndType(java.lang.String,java.util.Date,java.lang.String)
configserver_1      | 2017-07-23 04:17:38.815  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/service-registry/instance-status],methods=[GET]}" onto public org.springframework.http.ResponseEntity org.springframework.cloud.client.serviceregistry.endpoint.ServiceRegistryEndpoint.getStatus()
configserver_1      | 2017-07-23 04:17:38.818  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/service-registry/instance-status],methods=[POST]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.cloud.client.serviceregistry.endpoint.ServiceRegistryEndpoint.setStatus(java.lang.String)
configserver_1      | 2017-07-23 04:17:38.822  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/refresh || /admin/refresh.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
configserver_1      | 2017-07-23 04:17:38.828  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/admin/channels || /admin/channels.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
zuul-server_1       | 2017-07-23 04:17:39.042  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/shutdown || /shutdown.json],methods=[POST]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.ShutdownMvcEndpoint.invoke()
zuul-server_1       | 2017-07-23 04:17:39.056  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/archaius || /archaius.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
zuul-server_1       | 2017-07-23 04:17:39.124  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/beans || /beans.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
zuul-server_1       | 2017-07-23 04:17:39.130  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/hystrix.stream/**]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.cloud.netflix.endpoint.ServletWrappingEndpoint.handle(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse) throws java.lang.Exception
zuul-server_1       | 2017-07-23 04:17:39.135  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics/{name:.*}],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.MetricsMvcEndpoint.value(java.lang.String)
zuul-server_1       | 2017-07-23 04:17:39.155  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics || /metrics.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
zuul-server_1       | 2017-07-23 04:17:39.164  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/pause || /pause.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
zuul-server_1       | 2017-07-23 04:17:39.180  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/routes || /routes.json],methods=[GET]}" onto public java.util.Map<java.lang.String, java.lang.String> org.springframework.cloud.netflix.zuul.RoutesEndpoint.getRoutes()
zuul-server_1       | 2017-07-23 04:17:39.185  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/routes || /routes.json],methods=[POST]}" onto public java.util.Map<java.lang.String, java.lang.String> org.springframework.cloud.netflix.zuul.RoutesEndpoint.reset()
zuul-server_1       | 2017-07-23 04:17:39.218  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/restart || /restart.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.context.restart.RestartMvcEndpoint.invoke()
zuul-server_1       | 2017-07-23 04:17:39.225  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/features || /features.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
zuul-server_1       | 2017-07-23 04:17:39.251  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/dump || /dump.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
zuul-server_1       | 2017-07-23 04:17:39.269  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/mappings || /mappings.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
zuul-server_1       | 2017-07-23 04:17:39.273  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.context.environment.EnvironmentManagerMvcEndpoint.value(java.util.Map<java.lang.String, java.lang.String>)
zuul-server_1       | 2017-07-23 04:17:39.290  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/reset],methods=[POST]}" onto public java.util.Map<java.lang.String, java.lang.Object> org.springframework.cloud.context.environment.EnvironmentManagerMvcEndpoint.reset()
zuul-server_1       | 2017-07-23 04:17:39.299  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/trace || /trace.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
zuul-server_1       | 2017-07-23 04:17:39.348  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/{name:.*}],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EnvironmentMvcEndpoint.value(java.lang.String)
zuul-server_1       | 2017-07-23 04:17:39.359  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env || /env.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
zuul-server_1       | 2017-07-23 04:17:39.381  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/info || /info.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
zuul-server_1       | 2017-07-23 04:17:39.387  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/autoconfig || /autoconfig.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
zuul-server_1       | 2017-07-23 04:17:39.396  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/configprops || /configprops.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
zuul-server_1       | 2017-07-23 04:17:39.402  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/heapdump || /heapdump.json],methods=[GET],produces=[application/octet-stream]}" onto public void org.springframework.boot.actuate.endpoint.mvc.HeapdumpMvcEndpoint.invoke(boolean,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse) throws java.io.IOException,javax.servlet.ServletException
zuul-server_1       | 2017-07-23 04:17:39.432  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/health || /health.json],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.HealthMvcEndpoint.invoke(java.security.Principal)
zuul-server_1       | 2017-07-23 04:17:39.441  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/refresh || /refresh.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
zuul-server_1       | 2017-07-23 04:17:39.443  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/resume || /resume.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
eureka_1            | 2017-07-23 04:17:39.489  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@548a9f61: startup date [Sun Jul 23 04:16:55 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@3abfe836
eureka_1            | 2017-07-23 04:17:40.885  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/lastn],methods=[GET]}" onto public java.lang.String org.springframework.cloud.netflix.eureka.server.EurekaController.lastn(javax.servlet.http.HttpServletRequest,java.util.Map<java.lang.String, java.lang.Object>)
eureka_1            | 2017-07-23 04:17:40.907  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/],methods=[GET]}" onto public java.lang.String org.springframework.cloud.netflix.eureka.server.EurekaController.status(javax.servlet.http.HttpServletRequest,java.util.Map<java.lang.String, java.lang.Object>)
eureka_1            | 2017-07-23 04:17:40.942  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
eureka_1            | 2017-07-23 04:17:40.948  INFO 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
zuul-server_1       | 2017-07-23 04:17:41.175  WARN 1 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
zuul-server_1       | 2017-07-23 04:17:41.187  INFO 1 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
eureka_1            | 2017-07-23 04:17:41.292  INFO 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
eureka_1            | 2017-07-23 04:17:41.294  INFO 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
eureka_1            | 2017-07-23 04:17:41.702  INFO 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
zuul-server_1       | 2017-07-23 04:17:41.887  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
zuul-server_1       | 2017-07-23 04:17:41.965  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'zuulEndpoint' has been autodetected for JMX exposure
zuul-server_1       | 2017-07-23 04:17:41.977  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'environmentManager' has been autodetected for JMX exposure
zuul-server_1       | 2017-07-23 04:17:42.005  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'configurationPropertiesRebinder' has been autodetected for JMX exposure
zuul-server_1       | 2017-07-23 04:17:42.009  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshEndpoint' has been autodetected for JMX exposure
zuul-server_1       | 2017-07-23 04:17:42.030  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'restartEndpoint' has been autodetected for JMX exposure
zuul-server_1       | 2017-07-23 04:17:42.055  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshScope' has been autodetected for JMX exposure
zuul-server_1       | 2017-07-23 04:17:42.087  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'environmentManager': registering with JMX server as MBean [org.springframework.cloud.context.environment:name=environmentManager,type=EnvironmentManager]
zuul-server_1       | 2017-07-23 04:17:42.276  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'restartEndpoint': registering with JMX server as MBean [org.springframework.cloud.context.restart:name=restartEndpoint,type=RestartEndpoint]
zuul-server_1       | 2017-07-23 04:17:42.519  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshScope': registering with JMX server as MBean [org.springframework.cloud.context.scope.refresh:name=refreshScope,type=RefreshScope]
zuul-server_1       | 2017-07-23 04:17:42.656  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'zuulEndpoint': registering with JMX server as MBean [org.springframework.cloud.netflix.zuul:name=zuulEndpoint,type=RoutesEndpoint]
zuul-server_1       | 2017-07-23 04:17:42.713  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'configurationPropertiesRebinder': registering with JMX server as MBean [org.springframework.cloud.context.properties:name=configurationPropertiesRebinder,context=457e2f02,type=ConfigurationPropertiesRebinder]
zuul-server_1       | 2017-07-23 04:17:42.758  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshEndpoint': registering with JMX server as MBean [org.springframework.cloud.endpoint:name=refreshEndpoint,type=RefreshEndpoint]
zuul-server_1       | 2017-07-23 04:17:42.813 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Adding [Management Server] PropertySource with lowest search precedence
web_1               | 2017-07-23 04:17:42.849  INFO [web,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/],methods=[POST]}" onto public org.springframework.web.servlet.ModelAndView com.openshift.evangelists.microservices.web.mvc.WebMessageController.create(com.openshift.evangelists.microservices.web.api.Message,org.springframework.validation.BindingResult,org.springframework.web.servlet.mvc.support.RedirectAttributes)
web_1               | 2017-07-23 04:17:42.863  INFO [web,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/]}" onto public org.springframework.web.servlet.ModelAndView com.openshift.evangelists.microservices.web.mvc.WebMessageController.list()
web_1               | 2017-07-23 04:17:42.868  INFO [web,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/foo]}" onto public java.lang.String com.openshift.evangelists.microservices.web.mvc.WebMessageController.foo()
web_1               | 2017-07-23 04:17:42.870  INFO [web,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/],methods=[GET],params=[form]}" onto public java.lang.String com.openshift.evangelists.microservices.web.mvc.WebMessageController.createForm(com.openshift.evangelists.microservices.web.api.Message)
web_1               | 2017-07-23 04:17:42.880  INFO [web,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{id}],methods=[GET]}" onto public org.springframework.web.servlet.ModelAndView com.openshift.evangelists.microservices.web.mvc.WebMessageController.view(com.openshift.evangelists.microservices.web.api.Message)
web_1               | 2017-07-23 04:17:42.887  INFO [web,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/v2/api-docs],methods=[GET],produces=[application/json || application/hal+json]}" onto public org.springframework.http.ResponseEntity<springfox.documentation.spring.web.json.Json> springfox.documentation.swagger2.web.Swagger2Controller.getDocumentation(java.lang.String,javax.servlet.http.HttpServletRequest)
web_1               | 2017-07-23 04:17:42.899  INFO [web,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/configuration/ui]}" onto org.springframework.http.ResponseEntity<springfox.documentation.swagger.web.UiConfiguration> springfox.documentation.swagger.web.ApiResourceController.uiConfiguration()
web_1               | 2017-07-23 04:17:42.908  INFO [web,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/configuration/security]}" onto org.springframework.http.ResponseEntity<springfox.documentation.swagger.web.SecurityConfiguration> springfox.documentation.swagger.web.ApiResourceController.securityConfiguration()
web_1               | 2017-07-23 04:17:42.922  INFO [web,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/swagger-resources]}" onto org.springframework.http.ResponseEntity<java.util.List<springfox.documentation.swagger.web.SwaggerResource>> springfox.documentation.swagger.web.ApiResourceController.swaggerResources()
configserver_1      | 2017-07-23 04:17:42.943  WARN 1 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
configserver_1      | 2017-07-23 04:17:42.943  INFO 1 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
web_1               | 2017-07-23 04:17:42.953  INFO [web,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
web_1               | 2017-07-23 04:17:42.954  INFO [web,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
configserver_1      | 2017-07-23 04:17:43.002  WARN 1 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
configserver_1      | 2017-07-23 04:17:43.014  INFO 1 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
configserver_1      | 2017-07-23 04:17:43.960  INFO 1 --- [           main] o.s.i.codec.kryo.CompositeKryoRegistrar  : configured Kryo registration [40, java.io.File] with serializer org.springframework.integration.codec.kryo.FileSerializer
zuul-server_1       | 2017-07-23 04:17:44.107  INFO 1 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
zuul-server_1       | 2017-07-23 04:17:44.181  INFO 1 --- [           main] o.s.c.n.eureka.InstanceInfoFactory       : Setting initial instance status as: STARTING
configserver_1      | 2017-07-23 04:17:44.930  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
configserver_1      | 2017-07-23 04:17:45.095  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'environmentManager' has been autodetected for JMX exposure
configserver_1      | 2017-07-23 04:17:45.109  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'rabbitConnectionFactory' has been autodetected for JMX exposure
configserver_1      | 2017-07-23 04:17:45.137  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'integrationMbeanExporter' has been autodetected for JMX exposure
configserver_1      | 2017-07-23 04:17:45.173  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'configurationPropertiesRebinder' has been autodetected for JMX exposure
configserver_1      | 2017-07-23 04:17:45.187  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshEndpoint' has been autodetected for JMX exposure
configserver_1      | 2017-07-23 04:17:45.279  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'restartEndpoint' has been autodetected for JMX exposure
configserver_1      | 2017-07-23 04:17:45.333  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'environmentBusEndpoint' has been autodetected for JMX exposure
configserver_1      | 2017-07-23 04:17:45.374  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshBusEndpoint' has been autodetected for JMX exposure
configserver_1      | 2017-07-23 04:17:45.394  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'serviceRegistryEndpoint' has been autodetected for JMX exposure
configserver_1      | 2017-07-23 04:17:45.405  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshScope' has been autodetected for JMX exposure
configserver_1      | 2017-07-23 04:17:45.460  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'environmentManager': registering with JMX server as MBean [org.springframework.cloud.context.environment:name=environmentManager,type=EnvironmentManager]
configserver_1      | 2017-07-23 04:17:45.670  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'environmentBusEndpoint': registering with JMX server as MBean [org.springframework.cloud.bus.endpoint:name=environmentBusEndpoint,type=EnvironmentBusEndpoint]
configserver_1      | 2017-07-23 04:17:45.814  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'restartEndpoint': registering with JMX server as MBean [org.springframework.cloud.context.restart:name=restartEndpoint,type=RestartEndpoint]
configserver_1      | 2017-07-23 04:17:46.008  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'serviceRegistryEndpoint': registering with JMX server as MBean [org.springframework.cloud.client.serviceregistry.endpoint:name=serviceRegistryEndpoint,type=ServiceRegistryEndpoint]
configserver_1      | 2017-07-23 04:17:46.053  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshBusEndpoint': registering with JMX server as MBean [org.springframework.cloud.bus.endpoint:name=refreshBusEndpoint,type=RefreshBusEndpoint]
configserver_1      | 2017-07-23 04:17:46.071  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshScope': registering with JMX server as MBean [org.springframework.cloud.context.scope.refresh:name=refreshScope,type=RefreshScope]
configserver_1      | 2017-07-23 04:17:46.273  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'integrationMbeanExporter': registering with JMX server as MBean [org.springframework.integration.monitor:name=integrationMbeanExporter,type=IntegrationMBeanExporter]
configserver_1      | 2017-07-23 04:17:46.433  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'configurationPropertiesRebinder': registering with JMX server as MBean [org.springframework.cloud.context.properties:name=configurationPropertiesRebinder,context=290dbf45,type=ConfigurationPropertiesRebinder]
configserver_1      | 2017-07-23 04:17:46.452  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'rabbitConnectionFactory': registering with JMX server as MBean [org.springframework.amqp.rabbit.connection:name=rabbitConnectionFactory,type=CachingConnectionFactory]
configserver_1      | 2017-07-23 04:17:46.492  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshEndpoint': registering with JMX server as MBean [org.springframework.cloud.endpoint:name=refreshEndpoint,type=RefreshEndpoint]
configserver_1      | 2017-07-23 04:17:46.538  INFO 1 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering beans for JMX exposure on startup
configserver_1      | 2017-07-23 04:17:46.548  INFO 1 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel springCloudBusInput
configserver_1      | 2017-07-23 04:17:46.590  INFO 1 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageChannel,name=springCloudBusInput': registering with JMX server as MBean [org.springframework.integration:type=MessageChannel,name=springCloudBusInput]
configserver_1      | 2017-07-23 04:17:46.823  INFO 1 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel errorChannel
configserver_1      | 2017-07-23 04:17:46.844  INFO 1 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageChannel,name=errorChannel': registering with JMX server as MBean [org.springframework.integration:type=MessageChannel,name=errorChannel]
configserver_1      | 2017-07-23 04:17:46.949  INFO 1 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel springCloudBusOutput
configserver_1      | 2017-07-23 04:17:46.963  INFO 1 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageChannel,name=springCloudBusOutput': registering with JMX server as MBean [org.springframework.integration:type=MessageChannel,name=springCloudBusOutput]
zuul-server_1       | 2017-07-23 04:17:46.992  INFO 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON encoding codec LegacyJacksonJson
zuul-server_1       | 2017-07-23 04:17:47.026  INFO 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON decoding codec LegacyJacksonJson
configserver_1      | 2017-07-23 04:17:47.029  INFO 1 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel nullChannel
configserver_1      | 2017-07-23 04:17:47.054  INFO 1 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageChannel,name=nullChannel': registering with JMX server as MBean [org.springframework.integration:type=MessageChannel,name=nullChannel]
configserver_1      | 2017-07-23 04:17:47.173  INFO 1 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageHandler errorLogger
configserver_1      | 2017-07-23 04:17:47.188  INFO 1 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageHandler,name=errorLogger,bean=internal': registering with JMX server as MBean [org.springframework.integration:type=MessageHandler,name=errorLogger,bean=internal]
eureka_1            | 2017-07-23 04:17:48.403  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/pause || /pause.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
eureka_1            | 2017-07-23 04:17:48.423  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/heapdump || /heapdump.json],methods=[GET],produces=[application/octet-stream]}" onto public void org.springframework.boot.actuate.endpoint.mvc.HeapdumpMvcEndpoint.invoke(boolean,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse) throws java.io.IOException,javax.servlet.ServletException
eureka_1            | 2017-07-23 04:17:48.445  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/health || /health.json],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.HealthMvcEndpoint.invoke(java.security.Principal)
eureka_1            | 2017-07-23 04:17:48.484  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/trace || /trace.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
eureka_1            | 2017-07-23 04:17:48.496  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/restart || /restart.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.context.restart.RestartMvcEndpoint.invoke()
eureka_1            | 2017-07-23 04:17:48.508  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/resume || /resume.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
eureka_1            | 2017-07-23 04:17:48.539  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/features || /features.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
configserver_1      | 2017-07-23 04:17:48.570 DEBUG 1 --- [           main] .s.c.c.s.s.GitCredentialsProviderFactory : No credentials provider required for URI https://github.com/tangfeixiong/osev3-examples
eureka_1            | 2017-07-23 04:17:48.586  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.context.environment.EnvironmentManagerMvcEndpoint.value(java.util.Map<java.lang.String, java.lang.String>)
configserver_1      | 2017-07-23 04:17:48.607 DEBUG 1 --- [           main] .s.c.c.s.s.GitCredentialsProviderFactory : Constructing UsernamePasswordCredentialsProvider for URI http://172.17.4.50:10080/root/osev3-examples
configserver_1      | 2017-07-23 04:17:48.625 DEBUG 1 --- [           main] .s.c.c.s.s.GitCredentialsProviderFactory : No credentials provider required for URI https://github.com/tangfeixiong/osev3-examples
eureka_1            | 2017-07-23 04:17:48.628  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/reset],methods=[POST]}" onto public java.util.Map<java.lang.String, java.lang.Object> org.springframework.cloud.context.environment.EnvironmentManagerMvcEndpoint.reset()
configserver_1      | 2017-07-23 04:17:48.630 DEBUG 1 --- [           main] .s.c.c.s.s.GitCredentialsProviderFactory : No credentials provider required for URI https://github.com/spring-cloud-samples/config-repo
configserver_1      | 2017-07-23 04:17:48.645 DEBUG 1 --- [           main] .s.c.c.s.s.GitCredentialsProviderFactory : No credentials provider required for URI file:///root/Downloads/99-mirror/spring-cloud-config/config-repo
eureka_1            | 2017-07-23 04:17:48.688  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics/{name:.*}],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.MetricsMvcEndpoint.value(java.lang.String)
eureka_1            | 2017-07-23 04:17:48.696  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics || /metrics.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
eureka_1            | 2017-07-23 04:17:48.709  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/autoconfig || /autoconfig.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
eureka_1            | 2017-07-23 04:17:48.727  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/info || /info.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
eureka_1            | 2017-07-23 04:17:48.775  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/configprops || /configprops.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
eureka_1            | 2017-07-23 04:17:48.784  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/beans || /beans.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
eureka_1            | 2017-07-23 04:17:48.824  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/mappings || /mappings.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
eureka_1            | 2017-07-23 04:17:48.827  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/dump || /dump.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
eureka_1            | 2017-07-23 04:17:48.860  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/archaius || /archaius.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
eureka_1            | 2017-07-23 04:17:48.864  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/refresh || /refresh.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
eureka_1            | 2017-07-23 04:17:48.904  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/{name:.*}],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EnvironmentMvcEndpoint.value(java.lang.String)
eureka_1            | 2017-07-23 04:17:48.907  INFO 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env || /env.json],methods=[GET],produces=[application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
zuul-server_1       | 2017-07-23 04:17:49.338  INFO 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML encoding codec XStreamXml
zuul-server_1       | 2017-07-23 04:17:49.338  INFO 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML decoding codec XStreamXml
configserver_1      | 2017-07-23 04:17:50.295  INFO 1 --- [           main] o.s.integration.channel.DirectChannel    : Channel 'configserver:demo,development:8888.springCloudBusInput' has 1 subscriber(s).
configserver_1      | 2017-07-23 04:17:50.311  INFO 1 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase -2147482648
configserver_1      | 2017-07-23 04:17:50.327 DEBUG 1 --- [           main] o.s.c.s.binding.BindableProxyFactory     : Binding outputs for :interface org.springframework.cloud.bus.SpringCloudBusClient
configserver_1      | 2017-07-23 04:17:50.342 DEBUG 1 --- [           main] o.s.c.s.binding.BindableProxyFactory     : Binding :interface org.springframework.cloud.bus.SpringCloudBusClient:springCloudBusOutput
eureka_1            | 2017-07-23 04:17:50.374  INFO 1 --- [           main] o.s.ui.freemarker.SpringTemplateLoader   : SpringTemplateLoader for FreeMarker: using resource loader [org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@548a9f61: startup date [Sun Jul 23 04:16:55 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@3abfe836] and template loader path [classpath:/templates/]
eureka_1            | 2017-07-23 04:17:50.404  INFO 1 --- [           main] o.s.w.s.v.f.FreeMarkerConfigurer         : ClassTemplateLoader for Spring macros added to FreeMarker configuration
configserver_1      | 2017-07-23 04:17:51.502  INFO 1 --- [           main] demo.ConfigServerApplication             : The following profiles are active: demo,development
configserver_1      | 2017-07-23 04:17:51.581  INFO 1 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@34d4860f: startup date [Sun Jul 23 04:17:51 UTC 2017]; parent: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@290dbf45
eureka_1            | 2017-07-23 04:17:51.670  WARN 1 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
eureka_1            | 2017-07-23 04:17:51.673  INFO 1 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
eureka_1            | 2017-07-23 04:17:51.759  WARN 1 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
eureka_1            | 2017-07-23 04:17:51.760  INFO 1 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
zuul-server_1       | 2017-07-23 04:17:52.032  INFO 1 --- [           main] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration
configserver_1      | 2017-07-23 04:17:52.028  INFO 1 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
eureka_1            | 2017-07-23 04:17:52.291  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
zuul-server_1       | 2017-07-23 04:17:52.325  INFO 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Disable delta property : false
zuul-server_1       | 2017-07-23 04:17:52.325  INFO 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Single vip registry refresh property : null
zuul-server_1       | 2017-07-23 04:17:52.325  INFO 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Force full registry fetch : false
zuul-server_1       | 2017-07-23 04:17:52.325  INFO 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Application is null : false
zuul-server_1       | 2017-07-23 04:17:52.325  INFO 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Registered Applications size is zero : true
zuul-server_1       | 2017-07-23 04:17:52.325  INFO 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Application version is -1: true
zuul-server_1       | 2017-07-23 04:17:52.325  INFO 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Getting all instance registry info from the eureka server
eureka_1            | 2017-07-23 04:17:52.406  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'environmentManager' has been autodetected for JMX exposure
eureka_1            | 2017-07-23 04:17:52.417  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'configurationPropertiesRebinder' has been autodetected for JMX exposure
eureka_1            | 2017-07-23 04:17:52.433  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshEndpoint' has been autodetected for JMX exposure
eureka_1            | 2017-07-23 04:17:52.450  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'restartEndpoint' has been autodetected for JMX exposure
eureka_1            | 2017-07-23 04:17:52.468  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshScope' has been autodetected for JMX exposure
eureka_1            | 2017-07-23 04:17:52.498  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'environmentManager': registering with JMX server as MBean [org.springframework.cloud.context.environment:name=environmentManager,type=EnvironmentManager]
configserver_1      | 2017-07-23 04:17:52.605  INFO 1 --- [           main] o.s.c.support.GenericApplicationContext  : Refreshing org.springframework.context.support.GenericApplicationContext@6d1dcdff: startup date [Sun Jul 23 04:17:52 UTC 2017]; root of context hierarchy
eureka_1            | 2017-07-23 04:17:52.720  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'restartEndpoint': registering with JMX server as MBean [org.springframework.cloud.context.restart:name=restartEndpoint,type=RestartEndpoint]
eureka_1            | 2017-07-23 04:17:52.857  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshScope': registering with JMX server as MBean [org.springframework.cloud.context.scope.refresh:name=refreshScope,type=RefreshScope]
eureka_1            | 2017-07-23 04:17:52.973  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'configurationPropertiesRebinder': registering with JMX server as MBean [org.springframework.cloud.context.properties:name=configurationPropertiesRebinder,context=548a9f61,type=ConfigurationPropertiesRebinder]
configserver_1      | 2017-07-23 04:17:53.045  INFO 1 --- [           main] demo.ConfigServerApplication             : Started ConfigServerApplication in 2.569 seconds (JVM running for 96.73)
eureka_1            | 2017-07-23 04:17:53.073  INFO 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshEndpoint': registering with JMX server as MBean [org.springframework.cloud.endpoint:name=refreshEndpoint,type=RefreshEndpoint]
zuul-server_1       | 2017-07-23 04:17:53.165  INFO 1 --- [           main] o.a.http.impl.client.DefaultHttpClient   : I/O exception (org.apache.http.NoHttpResponseException) caught when processing request to {}->http://localhost:8761: The target server failed to respond
zuul-server_1       | 2017-07-23 04:17:53.165  INFO 1 --- [           main] o.a.http.impl.client.DefaultHttpClient   : Retrying request to {}->http://localhost:8761
zuul-server_1       | 2017-07-23 04:17:53.167  INFO 1 --- [           main] o.a.http.impl.client.DefaultHttpClient   : I/O exception (org.apache.http.NoHttpResponseException) caught when processing request to {}->http://localhost:8761: The target server failed to respond
zuul-server_1       | 2017-07-23 04:17:53.172  INFO 1 --- [           main] o.a.http.impl.client.DefaultHttpClient   : Retrying request to {}->http://localhost:8761
zuul-server_1       | 2017-07-23 04:17:53.185  INFO 1 --- [           main] o.a.http.impl.client.DefaultHttpClient   : I/O exception (java.net.SocketException) caught when processing request to {}->http://localhost:8761: Connection reset
zuul-server_1       | 2017-07-23 04:17:53.185  INFO 1 --- [           main] o.a.http.impl.client.DefaultHttpClient   : Retrying request to {}->http://localhost:8761
zuul-server_1       | 2017-07-23 04:17:53.213 ERROR 1 --- [           main] c.n.d.s.t.d.RedirectingEurekaHttpClient  : Request execution error
zuul-server_1       | 
zuul-server_1       | com.sun.jersey.api.client.ClientHandlerException: org.apache.http.NoHttpResponseException: localhost:8761 failed to respond
zuul-server_1       | 	at com.sun.jersey.client.apache4.ApacheHttpClient4Handler.handle(ApacheHttpClient4Handler.java:187) ~[jersey-apache-client4-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	at com.sun.jersey.api.client.filter.GZIPContentEncodingFilter.handle(GZIPContentEncodingFilter.java:123) ~[jersey-client-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	at com.netflix.discovery.EurekaIdentityHeaderFilter.handle(EurekaIdentityHeaderFilter.java:27) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.sun.jersey.api.client.Client.handle(Client.java:652) ~[jersey-client-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	at com.sun.jersey.api.client.WebResource.handle(WebResource.java:682) ~[jersey-client-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	at com.sun.jersey.api.client.WebResource.access$200(WebResource.java:74) ~[jersey-client-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	at com.sun.jersey.api.client.WebResource$Builder.get(WebResource.java:509) ~[jersey-client-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.jersey.AbstractJerseyEurekaHttpClient.getApplicationsInternal(AbstractJerseyEurekaHttpClient.java:194) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.jersey.AbstractJerseyEurekaHttpClient.getApplications(AbstractJerseyEurekaHttpClient.java:165) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$6.execute(EurekaHttpClientDecorator.java:137) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.MetricsCollectingEurekaHttpClient.execute(MetricsCollectingEurekaHttpClient.java:73) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.getApplications(EurekaHttpClientDecorator.java:134) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$6.execute(EurekaHttpClientDecorator.java:137) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.RedirectingEurekaHttpClient.executeOnNewServer(RedirectingEurekaHttpClient.java:118) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.RedirectingEurekaHttpClient.execute(RedirectingEurekaHttpClient.java:79) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.getApplications(EurekaHttpClientDecorator.java:134) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$6.execute(EurekaHttpClientDecorator.java:137) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.RetryableEurekaHttpClient.execute(RetryableEurekaHttpClient.java:119) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.getApplications(EurekaHttpClientDecorator.java:134) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$6.execute(EurekaHttpClientDecorator.java:137) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.SessionedEurekaHttpClient.execute(SessionedEurekaHttpClient.java:77) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.getApplications(EurekaHttpClientDecorator.java:134) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.DiscoveryClient.getAndStoreFullRegistry(DiscoveryClient.java:1030) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.DiscoveryClient.fetchRegistry(DiscoveryClient.java:944) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.DiscoveryClient.<init>(DiscoveryClient.java:444) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.DiscoveryClient.<init>(DiscoveryClient.java:304) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at org.springframework.cloud.netflix.eureka.CloudEurekaClient.<init>(CloudEurekaClient.java:51) [spring-cloud-netflix-eureka-client-1.2.8.BUILD-SNAPSHOT.jar!/:1.2.8.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration.eurekaClient(EurekaClientAutoConfiguration.java:192) [spring-cloud-netflix-eureka-client-1.2.8.BUILD-SNAPSHOT.jar!/:1.2.8.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration$$EnhancerBySpringCGLIB$$b98fdd7a.CGLIB$eurekaClient$1(<generated>) [spring-cloud-netflix-eureka-client-1.2.8.BUILD-SNAPSHOT.jar!/:1.2.8.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration$$EnhancerBySpringCGLIB$$b98fdd7a$$FastClassBySpringCGLIB$$7b6f6cd1.invoke(<generated>) [spring-cloud-netflix-eureka-client-1.2.8.BUILD-SNAPSHOT.jar!/:1.2.8.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228) [spring-core-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.context.annotation.ConfigurationClassEnhancer$BeanMethodInterceptor.intercept(ConfigurationClassEnhancer.java:356) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration$$EnhancerBySpringCGLIB$$b98fdd7a.eurekaClient(<generated>) [spring-cloud-netflix-eureka-client-1.2.8.BUILD-SNAPSHOT.jar!/:1.2.8.BUILD-SNAPSHOT]
zuul-server_1       | 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_131]
zuul-server_1       | 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_131]
zuul-server_1       | 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_131]
zuul-server_1       | 	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_131]
zuul-server_1       | 	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:162) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:588) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1128) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1023) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:510) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:482) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.beans.factory.support.AbstractBeanFactory$2.getObject(AbstractBeanFactory.java:345) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.cloud.context.scope.GenericScope$BeanLifecycleWrapper.getBean(GenericScope.java:359) [spring-cloud-context-1.1.10.BUILD-SNAPSHOT.jar!/:1.1.10.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.cloud.context.scope.GenericScope.get(GenericScope.java:176) [spring-cloud-context-1.1.10.BUILD-SNAPSHOT.jar!/:1.1.10.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:340) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.aop.target.SimpleBeanTargetSource.getTarget(SimpleBeanTargetSource.java:35) [spring-aop-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:192) [spring-aop-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at com.sun.proxy.$Proxy96.getApplications(Unknown Source) [na:na]
zuul-server_1       | 	at org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration.maybeInitializeClient(EurekaDiscoveryClientConfiguration.java:120) [spring-cloud-netflix-eureka-client-1.2.8.BUILD-SNAPSHOT.jar!/:1.2.8.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration.start(EurekaDiscoveryClientConfiguration.java:97) [spring-cloud-netflix-eureka-client-1.2.8.BUILD-SNAPSHOT.jar!/:1.2.8.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.context.support.DefaultLifecycleProcessor.doStart(DefaultLifecycleProcessor.java:173) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.context.support.DefaultLifecycleProcessor.access$200(DefaultLifecycleProcessor.java:51) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.context.support.DefaultLifecycleProcessor$LifecycleGroup.start(DefaultLifecycleProcessor.java:346) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.context.support.DefaultLifecycleProcessor.startBeans(DefaultLifecycleProcessor.java:149) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.context.support.DefaultLifecycleProcessor.onRefresh(DefaultLifecycleProcessor.java:112) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.context.support.AbstractApplicationContext.finishRefresh(AbstractApplicationContext.java:874) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.finishRefresh(EmbeddedWebApplicationContext.java:144) [spring-boot-1.4.1.RELEASE.jar!/:1.4.1.RELEASE]
zuul-server_1       | 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:544) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) [spring-boot-1.4.1.RELEASE.jar!/:1.4.1.RELEASE]
zuul-server_1       | 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:761) [spring-boot-1.4.1.RELEASE.jar!/:1.4.1.RELEASE]
zuul-server_1       | 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:371) [spring-boot-1.4.1.RELEASE.jar!/:1.4.1.RELEASE]
zuul-server_1       | 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:315) [spring-boot-1.4.1.RELEASE.jar!/:1.4.1.RELEASE]
zuul-server_1       | 	at org.springframework.boot.builder.SpringApplicationBuilder.run(SpringApplicationBuilder.java:134) [spring-boot-1.4.1.RELEASE.jar!/:1.4.1.RELEASE]
zuul-server_1       | 	at zuulserver.ZuulServerApplication.main(ZuulServerApplication.java:28) [classes!/:1.0.0.BUILD-SNAPSHOT]
zuul-server_1       | 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_131]
zuul-server_1       | 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_131]
zuul-server_1       | 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_131]
zuul-server_1       | 	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_131]
zuul-server_1       | 	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [app.jar:1.0.0.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [app.jar:1.0.0.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [app.jar:1.0.0.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:58) [app.jar:1.0.0.BUILD-SNAPSHOT]
zuul-server_1       | Caused by: org.apache.http.NoHttpResponseException: localhost:8761 failed to respond
zuul-server_1       | 	at org.apache.http.impl.conn.DefaultHttpResponseParser.parseHead(DefaultHttpResponseParser.java:143) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at org.apache.http.impl.conn.DefaultHttpResponseParser.parseHead(DefaultHttpResponseParser.java:57) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at org.apache.http.impl.io.AbstractMessageParser.parse(AbstractMessageParser.java:259) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 	at org.apache.http.impl.AbstractHttpClientConnection.receiveResponseHeader(AbstractHttpClientConnection.java:281) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 	at org.apache.http.impl.conn.DefaultClientConnection.receiveResponseHeader(DefaultClientConnection.java:259) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at org.apache.http.impl.conn.AbstractClientConnAdapter.receiveResponseHeader(AbstractClientConnAdapter.java:232) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at org.apache.http.protocol.HttpRequestExecutor.doReceiveResponse(HttpRequestExecutor.java:273) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 	at org.apache.http.protocol.HttpRequestExecutor.execute(HttpRequestExecutor.java:125) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 	at org.apache.http.impl.client.DefaultRequestDirector.tryExecute(DefaultRequestDirector.java:686) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:488) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:884) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:117) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:55) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at com.sun.jersey.client.apache4.ApacheHttpClient4Handler.handle(ApacheHttpClient4Handler.java:173) ~[jersey-apache-client4-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	... 74 common frames omitted
zuul-server_1       | 
zuul-server_1       | 2017-07-23 04:17:53.213  WARN 1 --- [           main] c.n.d.s.t.d.RetryableEurekaHttpClient    : Request execution failure
zuul-server_1       | 2017-07-23 04:17:53.250 ERROR 1 --- [           main] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_ZUULSERVER/10.0.2.15:zuulserver:8765 - was unable to refresh its cache! status = Cannot execute request on any known server
zuul-server_1       | 
zuul-server_1       | com.netflix.discovery.shared.transport.TransportException: Cannot execute request on any known server
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.RetryableEurekaHttpClient.execute(RetryableEurekaHttpClient.java:111) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.getApplications(EurekaHttpClientDecorator.java:134) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$6.execute(EurekaHttpClientDecorator.java:137) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.SessionedEurekaHttpClient.execute(SessionedEurekaHttpClient.java:77) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.getApplications(EurekaHttpClientDecorator.java:134) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.DiscoveryClient.getAndStoreFullRegistry(DiscoveryClient.java:1030) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.DiscoveryClient.fetchRegistry(DiscoveryClient.java:944) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.DiscoveryClient.<init>(DiscoveryClient.java:444) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.DiscoveryClient.<init>(DiscoveryClient.java:304) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at org.springframework.cloud.netflix.eureka.CloudEurekaClient.<init>(CloudEurekaClient.java:51) [spring-cloud-netflix-eureka-client-1.2.8.BUILD-SNAPSHOT.jar!/:1.2.8.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration.eurekaClient(EurekaClientAutoConfiguration.java:192) [spring-cloud-netflix-eureka-client-1.2.8.BUILD-SNAPSHOT.jar!/:1.2.8.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration$$EnhancerBySpringCGLIB$$b98fdd7a.CGLIB$eurekaClient$1(<generated>) [spring-cloud-netflix-eureka-client-1.2.8.BUILD-SNAPSHOT.jar!/:1.2.8.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration$$EnhancerBySpringCGLIB$$b98fdd7a$$FastClassBySpringCGLIB$$7b6f6cd1.invoke(<generated>) [spring-cloud-netflix-eureka-client-1.2.8.BUILD-SNAPSHOT.jar!/:1.2.8.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228) [spring-core-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.context.annotation.ConfigurationClassEnhancer$BeanMethodInterceptor.intercept(ConfigurationClassEnhancer.java:356) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration$RefreshableEurekaClientConfiguration$$EnhancerBySpringCGLIB$$b98fdd7a.eurekaClient(<generated>) [spring-cloud-netflix-eureka-client-1.2.8.BUILD-SNAPSHOT.jar!/:1.2.8.BUILD-SNAPSHOT]
zuul-server_1       | 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_131]
zuul-server_1       | 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_131]
zuul-server_1       | 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_131]
zuul-server_1       | 	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_131]
zuul-server_1       | 	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:162) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:588) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1128) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1023) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:510) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:482) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.beans.factory.support.AbstractBeanFactory$2.getObject(AbstractBeanFactory.java:345) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.cloud.context.scope.GenericScope$BeanLifecycleWrapper.getBean(GenericScope.java:359) [spring-cloud-context-1.1.10.BUILD-SNAPSHOT.jar!/:1.1.10.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.cloud.context.scope.GenericScope.get(GenericScope.java:176) [spring-cloud-context-1.1.10.BUILD-SNAPSHOT.jar!/:1.1.10.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:340) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197) [spring-beans-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.aop.target.SimpleBeanTargetSource.getTarget(SimpleBeanTargetSource.java:35) [spring-aop-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:192) [spring-aop-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at com.sun.proxy.$Proxy96.getApplications(Unknown Source) [na:na]
zuul-server_1       | 	at org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration.maybeInitializeClient(EurekaDiscoveryClientConfiguration.java:120) [spring-cloud-netflix-eureka-client-1.2.8.BUILD-SNAPSHOT.jar!/:1.2.8.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration.start(EurekaDiscoveryClientConfiguration.java:97) [spring-cloud-netflix-eureka-client-1.2.8.BUILD-SNAPSHOT.jar!/:1.2.8.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.context.support.DefaultLifecycleProcessor.doStart(DefaultLifecycleProcessor.java:173) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.context.support.DefaultLifecycleProcessor.access$200(DefaultLifecycleProcessor.java:51) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.context.support.DefaultLifecycleProcessor$LifecycleGroup.start(DefaultLifecycleProcessor.java:346) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.context.support.DefaultLifecycleProcessor.startBeans(DefaultLifecycleProcessor.java:149) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.context.support.DefaultLifecycleProcessor.onRefresh(DefaultLifecycleProcessor.java:112) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.context.support.AbstractApplicationContext.finishRefresh(AbstractApplicationContext.java:874) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.finishRefresh(EmbeddedWebApplicationContext.java:144) [spring-boot-1.4.1.RELEASE.jar!/:1.4.1.RELEASE]
zuul-server_1       | 	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:544) [spring-context-4.3.3.RELEASE.jar!/:4.3.3.RELEASE]
zuul-server_1       | 	at org.springframework.boot.context.embedded.EmbeddedWebApplicationContext.refresh(EmbeddedWebApplicationContext.java:122) [spring-boot-1.4.1.RELEASE.jar!/:1.4.1.RELEASE]
zuul-server_1       | 	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:761) [spring-boot-1.4.1.RELEASE.jar!/:1.4.1.RELEASE]
zuul-server_1       | 	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:371) [spring-boot-1.4.1.RELEASE.jar!/:1.4.1.RELEASE]
zuul-server_1       | 	at org.springframework.boot.SpringApplication.run(SpringApplication.java:315) [spring-boot-1.4.1.RELEASE.jar!/:1.4.1.RELEASE]
zuul-server_1       | 	at org.springframework.boot.builder.SpringApplicationBuilder.run(SpringApplicationBuilder.java:134) [spring-boot-1.4.1.RELEASE.jar!/:1.4.1.RELEASE]
zuul-server_1       | 	at zuulserver.ZuulServerApplication.main(ZuulServerApplication.java:28) [classes!/:1.0.0.BUILD-SNAPSHOT]
zuul-server_1       | 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_131]
zuul-server_1       | 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_131]
zuul-server_1       | 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_131]
zuul-server_1       | 	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_131]
zuul-server_1       | 	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [app.jar:1.0.0.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [app.jar:1.0.0.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [app.jar:1.0.0.BUILD-SNAPSHOT]
zuul-server_1       | 	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:58) [app.jar:1.0.0.BUILD-SNAPSHOT]
zuul-server_1       | 
zuul-server_1       | 2017-07-23 04:17:53.294  WARN 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Using default backup registry implementation which does not do anything.
zuul-server_1       | 2017-07-23 04:17:53.332  INFO 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Starting heartbeat executor: renew interval is: 30
zuul-server_1       | 2017-07-23 04:17:53.374  INFO 1 --- [           main] c.n.discovery.InstanceInfoReplicator     : InstanceInfoReplicator onDemand update allowed rate per min is 4
zuul-server_1       | 2017-07-23 04:17:53.413  INFO 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Discovery Client initialized at timestamp 1500783473413 with initial instances count: 0
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:17:53 ===
rabbitmq_1          | accepting AMQP connection <0.544.0> (172.19.0.3:43052 -> 172.19.0.5:5672)
zuul-server_1       | 2017-07-23 04:17:54.250  INFO 1 --- [           main] c.n.e.EurekaDiscoveryClientConfiguration : Registering application zuulserver with eureka with status UP
zuul-server_1       | 2017-07-23 04:17:54.258  INFO 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Saw local status change event StatusChangeEvent [timestamp=1500783474258, current=UP, previous=STARTING]
zuul-server_1       | 2017-07-23 04:17:54.309  INFO 1 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_ZUULSERVER/10.0.2.15:zuulserver:8765: registering service...
eureka_1            | 2017-07-23 04:17:54.585  INFO 1 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
eureka_1            | 2017-07-23 04:17:54.618  INFO 1 --- [           main] c.n.e.EurekaDiscoveryClientConfiguration : Registering application eureka with eureka with status UP
eureka_1            | 2017-07-23 04:17:54.642  INFO 1 --- [      Thread-10] o.s.c.n.e.server.EurekaServerBootstrap   : Setting the eureka configuration..
eureka_1            | 2017-07-23 04:17:54.646  INFO 1 --- [      Thread-10] o.s.c.n.e.server.EurekaServerBootstrap   : Eureka data center value eureka.datacenter is not set, defaulting to default
eureka_1            | 2017-07-23 04:17:54.651  INFO 1 --- [      Thread-10] o.s.c.n.e.server.EurekaServerBootstrap   : Eureka environment value eureka.environment is not set, defaulting to test
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:17:54 ===
rabbitmq_1          | Connection <0.544.0> (172.19.0.3:43052 -> 172.19.0.5:5672) has a client-provided name: rabbitConnectionFactory#1a96d94c:0
rabbitmq_1          | 
rabbitmq_1          | =INFO REPORT==== 23-Jul-2017::04:17:54 ===
rabbitmq_1          | connection <0.544.0> (172.19.0.3:43052 -> 172.19.0.5:5672 - rabbitConnectionFactory#1a96d94c:0): user 'guest' authenticated and granted access to vhost '/'
configserver_1      | 2017-07-23 04:17:54.792  INFO 1 --- [           main] o.s.a.r.c.CachingConnectionFactory       : Created new connection: rabbitConnectionFactory#1a96d94c:0/SimpleConnection@46aa712c [delegate=amqp://guest@172.19.0.5:5672/, localPort= 43052]
eureka_1            | 2017-07-23 04:17:54.911  INFO 1 --- [      Thread-10] o.s.c.n.e.server.EurekaServerBootstrap   : isAws returned false
eureka_1            | 2017-07-23 04:17:54.914  INFO 1 --- [      Thread-10] o.s.c.n.e.server.EurekaServerBootstrap   : Initialized server context
eureka_1            | 2017-07-23 04:17:54.919  INFO 1 --- [      Thread-10] c.n.e.r.PeerAwareInstanceRegistryImpl    : Got 1 instances from neighboring DS node
eureka_1            | 2017-07-23 04:17:54.924  INFO 1 --- [      Thread-10] c.n.e.r.PeerAwareInstanceRegistryImpl    : Renew threshold is: 1
eureka_1            | 2017-07-23 04:17:54.928  INFO 1 --- [      Thread-10] c.n.e.r.PeerAwareInstanceRegistryImpl    : Changing status to UP
eureka_1            | 2017-07-23 04:17:54.997  INFO 1 --- [      Thread-10] e.s.EurekaServerInitializerConfiguration : Started Eureka Server
zuul-server_1       | 2017-07-23 04:17:55.184  INFO 1 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 2147483647
zuul-server_1       | 2017-07-23 04:17:55.229  INFO 1 --- [nfoReplicator-0] o.a.http.impl.client.DefaultHttpClient   : I/O exception (java.net.SocketException) caught when processing request to {}->http://localhost:8761: Broken pipe (Write failed)
zuul-server_1       | 2017-07-23 04:17:55.233  INFO 1 --- [nfoReplicator-0] o.a.http.impl.client.DefaultHttpClient   : Retrying request to {}->http://localhost:8761
configserver_1      | 2017-07-23 04:17:55.296  INFO 1 --- [           main] o.s.integration.channel.DirectChannel    : Channel 'configserver:demo,development:8888.springCloudBusOutput' has 1 subscriber(s).
configserver_1      | 2017-07-23 04:17:55.312  INFO 1 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
zuul-server_1       | 2017-07-23 04:17:55.331 ERROR 1 --- [nfoReplicator-0] c.n.d.s.t.d.RedirectingEurekaHttpClient  : Request execution error
zuul-server_1       | 
zuul-server_1       | com.sun.jersey.api.client.ClientHandlerException: org.apache.http.client.ClientProtocolException
zuul-server_1       | 	at com.sun.jersey.client.apache4.ApacheHttpClient4Handler.handle(ApacheHttpClient4Handler.java:187) ~[jersey-apache-client4-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	at com.sun.jersey.api.client.filter.GZIPContentEncodingFilter.handle(GZIPContentEncodingFilter.java:123) ~[jersey-client-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	at com.netflix.discovery.EurekaIdentityHeaderFilter.handle(EurekaIdentityHeaderFilter.java:27) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.sun.jersey.api.client.Client.handle(Client.java:652) ~[jersey-client-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	at com.sun.jersey.api.client.WebResource.handle(WebResource.java:682) ~[jersey-client-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	at com.sun.jersey.api.client.WebResource.access$200(WebResource.java:74) ~[jersey-client-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	at com.sun.jersey.api.client.WebResource$Builder.post(WebResource.java:570) ~[jersey-client-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.jersey.AbstractJerseyEurekaHttpClient.register(AbstractJerseyEurekaHttpClient.java:56) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$1.execute(EurekaHttpClientDecorator.java:59) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.MetricsCollectingEurekaHttpClient.execute(MetricsCollectingEurekaHttpClient.java:73) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.register(EurekaHttpClientDecorator.java:56) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$1.execute(EurekaHttpClientDecorator.java:59) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.RedirectingEurekaHttpClient.executeOnNewServer(RedirectingEurekaHttpClient.java:118) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.RedirectingEurekaHttpClient.execute(RedirectingEurekaHttpClient.java:79) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.register(EurekaHttpClientDecorator.java:56) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$1.execute(EurekaHttpClientDecorator.java:59) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.RetryableEurekaHttpClient.execute(RetryableEurekaHttpClient.java:119) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.register(EurekaHttpClientDecorator.java:56) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$1.execute(EurekaHttpClientDecorator.java:59) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.SessionedEurekaHttpClient.execute(SessionedEurekaHttpClient.java:77) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.register(EurekaHttpClientDecorator.java:56) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.DiscoveryClient.register(DiscoveryClient.java:815) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.InstanceInfoReplicator.run(InstanceInfoReplicator.java:104) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.InstanceInfoReplicator$1.run(InstanceInfoReplicator.java:88) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$201(ScheduledThreadPoolExecutor.java:180) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:293) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_131]
zuul-server_1       | 	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_131]
zuul-server_1       | Caused by: org.apache.http.client.ClientProtocolException: null
zuul-server_1       | 	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:888) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:117) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:55) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at com.sun.jersey.client.apache4.ApacheHttpClient4Handler.handle(ApacheHttpClient4Handler.java:173) ~[jersey-apache-client4-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	... 30 common frames omitted
zuul-server_1       | Caused by: org.apache.http.client.NonRepeatableRequestException: Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed.
zuul-server_1       | 	at org.apache.http.impl.client.DefaultRequestDirector.tryExecute(DefaultRequestDirector.java:660) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:488) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:884) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	... 33 common frames omitted
zuul-server_1       | Caused by: java.net.SocketException: Broken pipe (Write failed)
zuul-server_1       | 	at java.net.SocketOutputStream.socketWrite0(Native Method) ~[na:1.8.0_131]
zuul-server_1       | 	at java.net.SocketOutputStream.socketWrite(SocketOutputStream.java:111) ~[na:1.8.0_131]
zuul-server_1       | 	at java.net.SocketOutputStream.write(SocketOutputStream.java:155) ~[na:1.8.0_131]
zuul-server_1       | 	at org.apache.http.impl.io.AbstractSessionOutputBuffer.flushBuffer(AbstractSessionOutputBuffer.java:157) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 	at org.apache.http.impl.io.AbstractSessionOutputBuffer.flush(AbstractSessionOutputBuffer.java:164) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 	at org.apache.http.impl.io.ChunkedOutputStream.flush(ChunkedOutputStream.java:192) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 	at com.fasterxml.jackson.core.json.UTF8JsonGenerator.flush(UTF8JsonGenerator.java:1048) ~[jackson-core-2.8.3.jar!/:2.8.3]
zuul-server_1       | 	at com.fasterxml.jackson.databind.ObjectMapper.writeValue(ObjectMapper.java:2486) ~[jackson-databind-2.8.3.jar!/:2.8.3]
zuul-server_1       | 	at com.fasterxml.jackson.core.base.GeneratorBase.writeObject(GeneratorBase.java:378) ~[jackson-core-2.8.3.jar!/:2.8.3]
zuul-server_1       | 	at com.fasterxml.jackson.core.JsonGenerator.writeObjectField(JsonGenerator.java:1662) ~[jackson-core-2.8.3.jar!/:2.8.3]
zuul-server_1       | 	at com.netflix.discovery.converters.EurekaJacksonCodec$InstanceInfoSerializer.serialize(EurekaJacksonCodec.java:358) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.converters.EurekaJacksonCodec$InstanceInfoSerializer.serialize(EurekaJacksonCodec.java:316) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializeValue(DefaultSerializerProvider.java:416) ~[jackson-databind-2.8.3.jar!/:2.8.3]
zuul-server_1       | 	at com.fasterxml.jackson.databind.ObjectWriter$Prefetch.serialize(ObjectWriter.java:1416) ~[jackson-databind-2.8.3.jar!/:2.8.3]
zuul-server_1       | 	at com.fasterxml.jackson.databind.ObjectWriter._configAndWriteValue(ObjectWriter.java:1147) ~[jackson-databind-2.8.3.jar!/:2.8.3]
zuul-server_1       | 	at com.fasterxml.jackson.databind.ObjectWriter.writeValue(ObjectWriter.java:977) ~[jackson-databind-2.8.3.jar!/:2.8.3]
zuul-server_1       | 	at com.netflix.discovery.converters.EurekaJacksonCodec.writeTo(EurekaJacksonCodec.java:194) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.converters.wrappers.CodecWrappers$LegacyJacksonJson.encode(CodecWrappers.java:304) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.provider.DiscoveryJerseyProvider.writeTo(DiscoveryJerseyProvider.java:135) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.sun.jersey.api.client.RequestWriter$RequestEntityWriterImpl.writeRequestEntity(RequestWriter.java:231) ~[jersey-client-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	at com.sun.jersey.client.apache4.ApacheHttpClient4Handler$2.writeTo(ApacheHttpClient4Handler.java:289) ~[jersey-apache-client4-1.19.1.jar!/:1.19.1]
zuul-server_1       | 	at org.apache.http.entity.HttpEntityWrapper.writeTo(HttpEntityWrapper.java:94) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 	at org.apache.http.impl.client.EntityEnclosingRequestWrapper$EntityWrapper.writeTo(EntityEnclosingRequestWrapper.java:112) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at org.apache.http.impl.entity.EntitySerializer.serialize(EntitySerializer.java:118) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 	at org.apache.http.impl.AbstractHttpClientConnection.sendRequestEntity(AbstractHttpClientConnection.java:263) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 	at org.apache.http.impl.conn.AbstractClientConnAdapter.sendRequestEntity(AbstractClientConnAdapter.java:241) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	at org.apache.http.protocol.HttpRequestExecutor.doSendRequest(HttpRequestExecutor.java:238) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 	at org.apache.http.protocol.HttpRequestExecutor.execute(HttpRequestExecutor.java:123) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 	at org.apache.http.impl.client.DefaultRequestDirector.tryExecute(DefaultRequestDirector.java:686) ~[httpclient-4.5.2.jar!/:4.5.2]
zuul-server_1       | 	... 35 common frames omitted
zuul-server_1       | 	Suppressed: java.net.SocketException: Broken pipe (Write failed)
zuul-server_1       | 		at java.net.SocketOutputStream.socketWrite0(Native Method) ~[na:1.8.0_131]
zuul-server_1       | 		at java.net.SocketOutputStream.socketWrite(SocketOutputStream.java:111) ~[na:1.8.0_131]
zuul-server_1       | 		at java.net.SocketOutputStream.write(SocketOutputStream.java:155) ~[na:1.8.0_131]
zuul-server_1       | 		at org.apache.http.impl.io.AbstractSessionOutputBuffer.flushBuffer(AbstractSessionOutputBuffer.java:157) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 		at org.apache.http.impl.io.AbstractSessionOutputBuffer.flush(AbstractSessionOutputBuffer.java:164) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 		at org.apache.http.impl.io.ChunkedOutputStream.close(ChunkedOutputStream.java:203) ~[httpcore-4.4.5.jar!/:4.4.5]
zuul-server_1       | 		at com.fasterxml.jackson.core.json.UTF8JsonGenerator.close(UTF8JsonGenerator.java:1086) ~[jackson-core-2.8.3.jar!/:2.8.3]
zuul-server_1       | 		at com.fasterxml.jackson.databind.util.ClassUtil.closeOnFailAndThrowAsIAE(ClassUtil.java:499) ~[jackson-databind-2.8.3.jar!/:2.8.3]
zuul-server_1       | 		at com.fasterxml.jackson.databind.ObjectWriter._configAndWriteValue(ObjectWriter.java:1149) ~[jackson-databind-2.8.3.jar!/:2.8.3]
zuul-server_1       | 		... 49 common frames omitted
zuul-server_1       | 
zuul-server_1       | 2017-07-23 04:17:55.372  WARN 1 --- [nfoReplicator-0] c.n.d.s.t.d.RetryableEurekaHttpClient    : Request execution failure
web_1               | 2017-07-23 04:17:55.411  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.context.environment.EnvironmentManagerMvcEndpoint.value(java.util.Map<java.lang.String, java.lang.String>)
zuul-server_1       | 2017-07-23 04:17:55.407  WARN 1 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_ZUULSERVER/10.0.2.15:zuulserver:8765 - registration failed Cannot execute request on any known server
zuul-server_1       | 
zuul-server_1       | com.netflix.discovery.shared.transport.TransportException: Cannot execute request on any known server
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.RetryableEurekaHttpClient.execute(RetryableEurekaHttpClient.java:111) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.register(EurekaHttpClientDecorator.java:56) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$1.execute(EurekaHttpClientDecorator.java:59) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.SessionedEurekaHttpClient.execute(SessionedEurekaHttpClient.java:77) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.register(EurekaHttpClientDecorator.java:56) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.DiscoveryClient.register(DiscoveryClient.java:815) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.InstanceInfoReplicator.run(InstanceInfoReplicator.java:104) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.InstanceInfoReplicator$1.run(InstanceInfoReplicator.java:88) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$201(ScheduledThreadPoolExecutor.java:180) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:293) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_131]
zuul-server_1       | 	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_131]
zuul-server_1       | 
zuul-server_1       | 2017-07-23 04:17:55.421  WARN 1 --- [nfoReplicator-0] c.n.discovery.InstanceInfoReplicator     : There was a problem with the instance info replicator
zuul-server_1       | 
zuul-server_1       | com.netflix.discovery.shared.transport.TransportException: Cannot execute request on any known server
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.RetryableEurekaHttpClient.execute(RetryableEurekaHttpClient.java:111) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.register(EurekaHttpClientDecorator.java:56) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator$1.execute(EurekaHttpClientDecorator.java:59) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.SessionedEurekaHttpClient.execute(SessionedEurekaHttpClient.java:77) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator.register(EurekaHttpClientDecorator.java:56) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.DiscoveryClient.register(DiscoveryClient.java:815) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.InstanceInfoReplicator.run(InstanceInfoReplicator.java:104) ~[eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at com.netflix.discovery.InstanceInfoReplicator$1.run(InstanceInfoReplicator.java:88) [eureka-client-1.4.12.jar!/:1.4.12]
zuul-server_1       | 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$201(ScheduledThreadPoolExecutor.java:180) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:293) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) [na:1.8.0_131]
zuul-server_1       | 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) [na:1.8.0_131]
zuul-server_1       | 	at java.lang.Thread.run(Thread.java:748) [na:1.8.0_131]
zuul-server_1       | 
web_1               | 2017-07-23 04:17:55.427  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/reset],methods=[POST]}" onto public java.util.Map<java.lang.String, java.lang.Object> org.springframework.cloud.context.environment.EnvironmentManagerMvcEndpoint.reset()
web_1               | 2017-07-23 04:17:55.448  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/heapdump || /heapdump.json],methods=[GET],produces=[application/octet-stream]}" onto public void org.springframework.boot.actuate.endpoint.mvc.HeapdumpMvcEndpoint.invoke(boolean,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse) throws java.io.IOException,javax.servlet.ServletException
zuul-server_1       | 2017-07-23 04:17:55.430  INFO 1 --- [           main] ration$HystrixMetricsPollerConfiguration : Starting poller
configserver_1      | 2017-07-23 04:17:55.475  INFO 1 --- [           main] o.s.c.n.eureka.InstanceInfoFactory       : Setting initial instance status as: STARTING
web_1               | 2017-07-23 04:17:55.475  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/mappings || /mappings.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
web_1               | 2017-07-23 04:17:55.551  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/resume || /resume.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
web_1               | 2017-07-23 04:17:55.565  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/archaius || /archaius.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
web_1               | 2017-07-23 04:17:55.578  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/auditevents || /auditevents.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.boot.actuate.endpoint.mvc.AuditEventsMvcEndpoint.findByPrincipalAndAfterAndType(java.lang.String,java.util.Date,java.lang.String)
web_1               | 2017-07-23 04:17:55.599  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/beans || /beans.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
web_1               | 2017-07-23 04:17:55.627  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/dump || /dump.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
zuul-server_1       | 2017-07-23 04:17:55.650 DEBUG 1 --- [           main] o.s.w.s.resource.ResourceUrlProvider     : Looking for resource handler mappings
web_1               | 2017-07-23 04:17:55.642  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/{name:.*}],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EnvironmentMvcEndpoint.value(java.lang.String)
web_1               | 2017-07-23 04:17:55.655  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env || /env.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
web_1               | 2017-07-23 04:17:55.672  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/info || /info.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
web_1               | 2017-07-23 04:17:55.690  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/loggers/{name:.*}],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.LoggersMvcEndpoint.get(java.lang.String)
zuul-server_1       | 2017-07-23 04:17:55.672 DEBUG 1 --- [           main] o.s.w.s.resource.ResourceUrlProvider     : Found resource handler mapping: URL pattern="/**/favicon.ico", locations=[ServletContext resource [/], class path resource [META-INF/resources/], class path resource [resources/], class path resource [static/], class path resource [public/], class path resource []], resolvers=[org.springframework.web.servlet.resource.PathResourceResolver@791cbf87]
zuul-server_1       | 2017-07-23 04:17:55.691 DEBUG 1 --- [           main] o.s.w.s.resource.ResourceUrlProvider     : Found resource handler mapping: URL pattern="/webjars/**", locations=[class path resource [META-INF/resources/webjars/]], resolvers=[org.springframework.web.servlet.resource.PathResourceResolver@a7e2d9d]
zuul-server_1       | 2017-07-23 04:17:55.691 DEBUG 1 --- [           main] o.s.w.s.resource.ResourceUrlProvider     : Found resource handler mapping: URL pattern="/**", locations=[ServletContext resource [/], class path resource [META-INF/resources/], class path resource [resources/], class path resource [static/], class path resource [public/]], resolvers=[org.springframework.web.servlet.resource.PathResourceResolver@754777cd]
web_1               | 2017-07-23 04:17:55.714  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/loggers/{name:.*}],methods=[POST],consumes=[application/vnd.spring-boot.actuator.v1+json || application/json],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.LoggersMvcEndpoint.set(java.lang.String,java.util.Map<java.lang.String, java.lang.String>)
web_1               | 2017-07-23 04:17:55.717  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/loggers || /loggers.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
web_1               | 2017-07-23 04:17:55.728  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/pause || /pause.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
web_1               | 2017-07-23 04:17:55.743  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics/{name:.*}],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.MetricsMvcEndpoint.value(java.lang.String)
web_1               | 2017-07-23 04:17:55.750  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics || /metrics.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
web_1               | 2017-07-23 04:17:55.753  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/restart || /restart.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.context.restart.RestartMvcEndpoint.invoke()
web_1               | 2017-07-23 04:17:55.767  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/features || /features.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
web_1               | 2017-07-23 04:17:55.782  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/autoconfig || /autoconfig.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
web_1               | 2017-07-23 04:17:55.804  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/configprops || /configprops.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
web_1               | 2017-07-23 04:17:55.807  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/health || /health.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.HealthMvcEndpoint.invoke(javax.servlet.http.HttpServletRequest,java.security.Principal)
web_1               | 2017-07-23 04:17:55.830  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/refresh || /refresh.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
web_1               | 2017-07-23 04:17:55.839  INFO [web,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/trace || /trace.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
eureka_1            | 2017-07-23 04:17:56.271  INFO 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8761 (http)
eureka_1            | 2017-07-23 04:17:56.286  INFO 1 --- [           main] c.n.e.EurekaDiscoveryClientConfiguration : Updating port to 8761
zuul-server_1       | 2017-07-23 04:17:56.290  INFO 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8765 (http)
zuul-server_1       | 2017-07-23 04:17:56.299  INFO 1 --- [           main] c.n.e.EurekaDiscoveryClientConfiguration : Updating port to 8765
zuul-server_1       | 2017-07-23 04:17:56.300 DEBUG 1 --- [           main] o.s.w.c.s.StandardServletEnvironment     : Adding [server.ports] PropertySource with highest search precedence
eureka_1            | 2017-07-23 04:17:56.330  INFO 1 --- [           main] eurekademo.EurekaApplication             : Started EurekaApplication in 88.358 seconds (JVM running for 95.881)
zuul-server_1       | 2017-07-23 04:17:56.333  INFO 1 --- [           main] zuulserver.ZuulServerApplication         : Started ZuulServerApplication in 101.131 seconds (JVM running for 106.219)
repositories-mem_1  | 2017-07-23 04:17:56.501  INFO [repositories-mem,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/],methods=[GET]}" onto public java.lang.Iterable<com.openshift.evangelists.microservices.api.Message> com.openshift.evangelists.microservices.repository.rest.InMemoryRepositoryRestMessageController.getAll()
repositories-mem_1  | 2017-07-23 04:17:56.526  INFO [repositories-mem,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{id}],methods=[GET]}" onto public com.openshift.evangelists.microservices.api.Message com.openshift.evangelists.microservices.repository.rest.InMemoryRepositoryRestMessageController.getById(java.lang.Long)
repositories-mem_1  | 2017-07-23 04:17:56.527  INFO [repositories-mem,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{id}],methods=[PUT]}" onto public com.openshift.evangelists.microservices.api.Message com.openshift.evangelists.microservices.repository.rest.InMemoryRepositoryRestMessageController.update(java.lang.String,com.openshift.evangelists.microservices.api.Message)
repositories-mem_1  | 2017-07-23 04:17:56.539  INFO [repositories-mem,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{id}],methods=[DELETE]}" onto public void com.openshift.evangelists.microservices.repository.rest.InMemoryRepositoryRestMessageController.delete(java.lang.Long)
repositories-mem_1  | 2017-07-23 04:17:56.540  INFO [repositories-mem,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/],methods=[POST]}" onto public com.openshift.evangelists.microservices.api.Message com.openshift.evangelists.microservices.repository.rest.InMemoryRepositoryRestMessageController.create(com.openshift.evangelists.microservices.api.Message)
repositories-mem_1  | 2017-07-23 04:17:56.543  INFO [repositories-mem,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/v2/api-docs],methods=[GET],produces=[application/json || application/hal+json]}" onto public org.springframework.http.ResponseEntity<springfox.documentation.spring.web.json.Json> springfox.documentation.swagger2.web.Swagger2Controller.getDocumentation(java.lang.String,javax.servlet.http.HttpServletRequest)
repositories-mem_1  | 2017-07-23 04:17:56.554  INFO [repositories-mem,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/configuration/ui]}" onto org.springframework.http.ResponseEntity<springfox.documentation.swagger.web.UiConfiguration> springfox.documentation.swagger.web.ApiResourceController.uiConfiguration()
repositories-mem_1  | 2017-07-23 04:17:56.564  INFO [repositories-mem,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/configuration/security]}" onto org.springframework.http.ResponseEntity<springfox.documentation.swagger.web.SecurityConfiguration> springfox.documentation.swagger.web.ApiResourceController.securityConfiguration()
repositories-mem_1  | 2017-07-23 04:17:56.573  INFO [repositories-mem,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/swagger-resources]}" onto org.springframework.http.ResponseEntity<java.util.List<springfox.documentation.swagger.web.SwaggerResource>> springfox.documentation.swagger.web.ApiResourceController.swaggerResources()
repositories-mem_1  | 2017-07-23 04:17:56.608  INFO [repositories-mem,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
repositories-mem_1  | 2017-07-23 04:17:56.608  INFO [repositories-mem,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
eureka_1            | 2017-07-23 04:17:59.940  INFO 1 --- [nio-8761-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'
eureka_1            | 2017-07-23 04:17:59.941  INFO 1 --- [nio-8761-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
eureka_1            | 2017-07-23 04:18:00.100  INFO 1 --- [nio-8761-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 157 ms
repositories-mem_1  | 2017-07-23 04:18:03.471  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/trace || /trace.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.494  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/info || /info.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.507  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/heapdump || /heapdump.json],methods=[GET],produces=[application/octet-stream]}" onto public void org.springframework.boot.actuate.endpoint.mvc.HeapdumpMvcEndpoint.invoke(boolean,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse) throws java.io.IOException,javax.servlet.ServletException
repositories-mem_1  | 2017-07-23 04:18:03.521  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/archaius || /archaius.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.547  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/{name:.*}],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EnvironmentMvcEndpoint.value(java.lang.String)
repositories-mem_1  | 2017-07-23 04:18:03.554  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env || /env.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.571  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/dump || /dump.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.574  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/health || /health.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.HealthMvcEndpoint.invoke(javax.servlet.http.HttpServletRequest,java.security.Principal)
repositories-mem_1  | 2017-07-23 04:18:03.577  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/actuator || /actuator.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public org.springframework.hateoas.ResourceSupport org.springframework.boot.actuate.endpoint.mvc.HalJsonMvcEndpoint.links()
repositories-mem_1  | 2017-07-23 04:18:03.580  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/resume || /resume.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.595  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/auditevents || /auditevents.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.boot.actuate.endpoint.mvc.AuditEventsMvcEndpoint.findByPrincipalAndAfterAndType(java.lang.String,java.util.Date,java.lang.String)
repositories-mem_1  | 2017-07-23 04:18:03.602  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/beans || /beans.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.622  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/pause || /pause.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.643  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/autoconfig || /autoconfig.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.652  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/features || /features.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.679  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/refresh || /refresh.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.endpoint.GenericPostableMvcEndpoint.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.691  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics/{name:.*}],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.MetricsMvcEndpoint.value(java.lang.String)
repositories-mem_1  | 2017-07-23 04:18:03.695  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/metrics || /metrics.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.712  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/configprops || /configprops.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.730  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.context.environment.EnvironmentManagerMvcEndpoint.value(java.util.Map<java.lang.String, java.lang.String>)
repositories-mem_1  | 2017-07-23 04:18:03.741  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/env/reset],methods=[POST]}" onto public java.util.Map<java.lang.String, java.lang.Object> org.springframework.cloud.context.environment.EnvironmentManagerMvcEndpoint.reset()
repositories-mem_1  | 2017-07-23 04:18:03.755  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/mappings || /mappings.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.772  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/restart || /restart.json],methods=[POST]}" onto public java.lang.Object org.springframework.cloud.context.restart.RestartMvcEndpoint.invoke()
repositories-mem_1  | 2017-07-23 04:18:03.789  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/loggers/{name:.*}],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.LoggersMvcEndpoint.get(java.lang.String)
repositories-mem_1  | 2017-07-23 04:18:03.795  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/loggers/{name:.*}],methods=[POST],consumes=[application/vnd.spring-boot.actuator.v1+json || application/json],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.LoggersMvcEndpoint.set(java.lang.String,java.util.Map<java.lang.String, java.lang.String>)
repositories-mem_1  | 2017-07-23 04:18:03.804  INFO [repositories-mem,,,] 1 --- [           main] o.s.b.a.e.mvc.EndpointHandlerMapping     : Mapped "{[/loggers || /loggers.json],methods=[GET],produces=[application/vnd.spring-boot.actuator.v1+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke()
configserver_1      | 2017-07-23 04:18:03.904  INFO 1 --- [           main] o.s.c.n.e.s.EurekaServiceRegistry        : Registering application configserver with eureka with status UP
configserver_1      | 2017-07-23 04:18:03.952 DEBUG 1 --- [           main] s.c.c.d.h.DiscoveryClientHealthIndicator : Discovery Client has been initialized
web_1               | 2017-07-23 04:18:04.048  INFO [web,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@6325a3ee: startup date [Sun Jul 23 04:16:51 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@6a38e57f
configserver_1      | 2017-07-23 04:18:04.470  INFO 1 --- [           main] o.s.c.c.m.FileMonitorConfiguration       : Not monitoring for local config changes
configserver_1      | 2017-07-23 04:18:04.478  INFO 1 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : Adding {logging-channel-adapter:_org.springframework.integration.errorLogger} as a subscriber to the 'errorChannel' channel
configserver_1      | 2017-07-23 04:18:04.481  INFO 1 --- [           main] o.s.i.channel.PublishSubscribeChannel    : Channel 'configserver:demo,development:8888.errorChannel' has 1 subscriber(s).
configserver_1      | 2017-07-23 04:18:04.487  INFO 1 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : started _org.springframework.integration.errorLogger
configserver_1      | 2017-07-23 04:18:04.489  INFO 1 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 2147482647
configserver_1      | 2017-07-23 04:18:04.498 DEBUG 1 --- [           main] o.s.c.s.binding.BindableProxyFactory     : Binding inputs for :interface org.springframework.cloud.bus.SpringCloudBusClient
configserver_1      | 2017-07-23 04:18:04.510 DEBUG 1 --- [           main] o.s.c.s.binding.BindableProxyFactory     : Binding :interface org.springframework.cloud.bus.SpringCloudBusClient:springCloudBusInput
configserver_1      | 2017-07-23 04:18:04.655  INFO 1 --- [           main] c.s.b.r.p.RabbitExchangeQueueProvisioner : declaring queue for inbound: springCloudBus.anonymous.EB_JAxhrTqi9sX9u5ryEtw, bound to: springCloudBus
eureka_1            | 2017-07-23 04:18:05.060  INFO 1 --- [nio-8761-exec-3] c.n.e.registry.AbstractInstanceRegistry  : Registered instance CONFIGSERVER/3ab7a2719c37:configserver:8888 with status UP (replication=false)
configserver_1      | 2017-07-23 04:18:05.113  INFO 1 --- [           main] o.s.i.a.i.AmqpInboundChannelAdapter      : started inbound.springCloudBus.anonymous.EB_JAxhrTqi9sX9u5ryEtw
configserver_1      | 2017-07-23 04:18:05.116  INFO 1 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : Adding {message-handler:inbound.springCloudBus.default} as a subscriber to the 'bridge.springCloudBus' channel
configserver_1      | 2017-07-23 04:18:05.119  INFO 1 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : started inbound.springCloudBus.default
configserver_1      | 2017-07-23 04:18:05.127  INFO 1 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 2147483647
web_1               | 2017-07-23 04:18:05.345  INFO [web,,,] 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
web_1               | 2017-07-23 04:18:05.363  INFO [web,,,] 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
configserver_1      | 2017-07-23 04:18:05.631  INFO 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8888 (http)
configserver_1      | 2017-07-23 04:18:05.651  INFO 1 --- [           main] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8888
configserver_1      | 2017-07-23 04:18:05.680  INFO 1 --- [           main] demo.ConfigServerApplication             : Started ConfigServerApplication in 100.119 seconds (JVM running for 109.366)
web_1               | 2017-07-23 04:18:06.015  INFO [web,,,] 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
eureka_1            | 2017-07-23 04:18:06.896  INFO 1 --- [nio-8761-exec-4] c.n.e.registry.AbstractInstanceRegistry  : Registered instance CONFIGSERVER/3ab7a2719c37:configserver:8888 with status UP (replication=true)
repositories-mem_1  | 2017-07-23 04:18:09.329  INFO [repositories-mem,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@97e1986: startup date [Sun Jul 23 04:16:52 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@2a33fae0
repositories-mem_1  | 2017-07-23 04:18:09.369  INFO [repositories-mem,,,] 1 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Detected ResponseBodyAdvice bean in org.springframework.boot.actuate.autoconfigure.EndpointWebMvcHypermediaManagementContextConfiguration$ActuatorEndpointLinksAdvice
repositories-mem_1  | 2017-07-23 04:18:10.078  INFO [repositories-mem,,,] 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
repositories-mem_1  | 2017-07-23 04:18:10.082  INFO [repositories-mem,,,] 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
repositories-mem_1  | 2017-07-23 04:18:10.188  INFO [repositories-mem,,,] 1 --- [           main] .m.m.a.ExceptionHandlerExceptionResolver : Detected @ExceptionHandler methods in repositoryRestExceptionHandler
repositories-mem_1  | 2017-07-23 04:18:10.193  INFO [repositories-mem,,,] 1 --- [           main] .m.m.a.ExceptionHandlerExceptionResolver : Detected ResponseBodyAdvice implementation in org.springframework.boot.actuate.autoconfigure.EndpointWebMvcHypermediaManagementContextConfiguration$ActuatorEndpointLinksAdvice
repositories-mem_1  | 2017-07-23 04:18:10.630  INFO [repositories-mem,,,] 1 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
web_1               | 2017-07-23 04:18:11.168  WARN [web,,,] 1 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
web_1               | 2017-07-23 04:18:11.169  INFO [web,,,] 1 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
web_1               | 2017-07-23 04:18:11.204  WARN [web,,,] 1 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
web_1               | 2017-07-23 04:18:11.205  INFO [web,,,] 1 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
repositories-mem_1  | 2017-07-23 04:18:11.917  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerAdapter   : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@97e1986: startup date [Sun Jul 23 04:16:52 UTC 2017]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@2a33fae0
repositories-mem_1  | 2017-07-23 04:18:11.929  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerAdapter   : Detected ResponseBodyAdvice bean in org.springframework.boot.actuate.autoconfigure.EndpointWebMvcHypermediaManagementContextConfiguration$ActuatorEndpointLinksAdvice
web_1               | 2017-07-23 04:18:11.965  INFO [web,,,] 1 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService 
repositories-mem_1  | 2017-07-23 04:18:11.992  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/ || ],methods=[OPTIONS],produces=[application/hal+json || application/json]}" onto public org.springframework.http.HttpEntity<?> org.springframework.data.rest.webmvc.RepositoryController.optionsForRepositories()
repositories-mem_1  | 2017-07-23 04:18:11.993  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/ || ],methods=[HEAD],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryController.headForRepositories()
repositories-mem_1  | 2017-07-23 04:18:11.996  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/ || ],methods=[GET],produces=[application/hal+json || application/json]}" onto public org.springframework.http.HttpEntity<org.springframework.data.rest.webmvc.RepositoryLinksResource> org.springframework.data.rest.webmvc.RepositoryController.listRepositories()
repositories-mem_1  | 2017-07-23 04:18:12.004  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}/{property}],methods=[DELETE],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<? extends org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.deletePropertyReference(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String) throws java.lang.Exception
repositories-mem_1  | 2017-07-23 04:18:12.008  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}/{property}],methods=[GET],produces=[application/x-spring-data-compact+json || text/uri-list]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.followPropertyReferenceCompact(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws java.lang.Exception
repositories-mem_1  | 2017-07-23 04:18:12.042  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}/{property}],methods=[PATCH || PUT || POST],consumes=[application/json || application/x-spring-data-compact+json || text/uri-list],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<? extends org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.createPropertyReference(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.http.HttpMethod,org.springframework.hateoas.Resources<java.lang.Object>,java.io.Serializable,java.lang.String) throws java.lang.Exception
repositories-mem_1  | 2017-07-23 04:18:12.048  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}/{property}/{propertyId}],methods=[DELETE],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.deletePropertyReferenceId(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String,java.lang.String) throws java.lang.Exception
repositories-mem_1  | 2017-07-23 04:18:12.057  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}/{property}/{propertyId}],methods=[GET],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.followPropertyReference(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String,java.lang.String,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws java.lang.Exception
repositories-mem_1  | 2017-07-23 04:18:12.062  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}/{property}],methods=[GET],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryPropertyReferenceController.followPropertyReference(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,java.lang.String,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws java.lang.Exception
repositories-mem_1  | 2017-07-23 04:18:12.063  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/search/{search}],methods=[GET],produces=[application/x-spring-data-compact+json]}" onto public org.springframework.hateoas.ResourceSupport org.springframework.data.rest.webmvc.RepositorySearchController.executeSearchCompact(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.http.HttpHeaders,org.springframework.util.MultiValueMap<java.lang.String, java.lang.Object>,java.lang.String,java.lang.String,org.springframework.data.rest.webmvc.support.DefaultedPageable,org.springframework.data.domain.Sort,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler)
repositories-mem_1  | 2017-07-23 04:18:12.064  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/search/{search}],methods=[OPTIONS],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<java.lang.Object> org.springframework.data.rest.webmvc.RepositorySearchController.optionsForSearch(org.springframework.data.rest.webmvc.RootResourceInformation,java.lang.String)
repositories-mem_1  | 2017-07-23 04:18:12.064  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/search/{search}],methods=[HEAD],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<java.lang.Object> org.springframework.data.rest.webmvc.RepositorySearchController.headForSearch(org.springframework.data.rest.webmvc.RootResourceInformation,java.lang.String)
repositories-mem_1  | 2017-07-23 04:18:12.065  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/search],methods=[OPTIONS],produces=[application/hal+json || application/json]}" onto public org.springframework.http.HttpEntity<?> org.springframework.data.rest.webmvc.RepositorySearchController.optionsForSearches(org.springframework.data.rest.webmvc.RootResourceInformation)
repositories-mem_1  | 2017-07-23 04:18:12.072  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/search],methods=[HEAD],produces=[application/hal+json || application/json]}" onto public org.springframework.http.HttpEntity<?> org.springframework.data.rest.webmvc.RepositorySearchController.headForSearches(org.springframework.data.rest.webmvc.RootResourceInformation)
repositories-mem_1  | 2017-07-23 04:18:12.072  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/search],methods=[GET],produces=[application/hal+json || application/json]}" onto public org.springframework.data.rest.webmvc.RepositorySearchesResource org.springframework.data.rest.webmvc.RepositorySearchController.listSearches(org.springframework.data.rest.webmvc.RootResourceInformation)
repositories-mem_1  | 2017-07-23 04:18:12.073  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/search/{search}],methods=[GET],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositorySearchController.executeSearch(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.util.MultiValueMap<java.lang.String, java.lang.Object>,java.lang.String,org.springframework.data.rest.webmvc.support.DefaultedPageable,org.springframework.data.domain.Sort,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler,org.springframework.http.HttpHeaders)
repositories-mem_1  | 2017-07-23 04:18:12.091  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}],methods=[DELETE],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.deleteItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,org.springframework.data.rest.webmvc.support.ETag) throws org.springframework.data.rest.webmvc.ResourceNotFoundException,org.springframework.web.HttpRequestMethodNotSupportedException
repositories-mem_1  | 2017-07-23 04:18:12.092  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}],methods=[GET],produces=[application/x-spring-data-compact+json || text/uri-list]}" onto public org.springframework.hateoas.Resources<?> org.springframework.data.rest.webmvc.RepositoryEntityController.getCollectionResourceCompact(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.support.DefaultedPageable,org.springframework.data.domain.Sort,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws org.springframework.data.rest.webmvc.ResourceNotFoundException,org.springframework.web.HttpRequestMethodNotSupportedException
repositories-mem_1  | 2017-07-23 04:18:12.099  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}],methods=[POST],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryEntityController.postCollectionResource(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.PersistentEntityResource,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler,java.lang.String) throws org.springframework.web.HttpRequestMethodNotSupportedException
repositories-mem_1  | 2017-07-23 04:18:12.099  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}],methods=[OPTIONS],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.optionsForItemResource(org.springframework.data.rest.webmvc.RootResourceInformation)
repositories-mem_1  | 2017-07-23 04:18:12.100  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}],methods=[HEAD],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.headForItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws org.springframework.web.HttpRequestMethodNotSupportedException
repositories-mem_1  | 2017-07-23 04:18:12.101  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}],methods=[GET],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.Resource<?>> org.springframework.data.rest.webmvc.RepositoryEntityController.getItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,java.io.Serializable,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler,org.springframework.http.HttpHeaders) throws org.springframework.web.HttpRequestMethodNotSupportedException
repositories-mem_1  | 2017-07-23 04:18:12.102  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}],methods=[PUT],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<? extends org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryEntityController.putItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.PersistentEntityResource,java.io.Serializable,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler,org.springframework.data.rest.webmvc.support.ETag,java.lang.String) throws org.springframework.web.HttpRequestMethodNotSupportedException
repositories-mem_1  | 2017-07-23 04:18:12.102  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}/{id}],methods=[PATCH],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.RepositoryEntityController.patchItemResource(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.PersistentEntityResource,java.io.Serializable,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler,org.springframework.data.rest.webmvc.support.ETag,java.lang.String) throws org.springframework.web.HttpRequestMethodNotSupportedException,org.springframework.data.rest.webmvc.ResourceNotFoundException
repositories-mem_1  | 2017-07-23 04:18:12.103  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}],methods=[OPTIONS],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.optionsForCollectionResource(org.springframework.data.rest.webmvc.RootResourceInformation)
repositories-mem_1  | 2017-07-23 04:18:12.112  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}],methods=[HEAD],produces=[application/hal+json || application/json]}" onto public org.springframework.http.ResponseEntity<?> org.springframework.data.rest.webmvc.RepositoryEntityController.headCollectionResource(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.support.DefaultedPageable) throws org.springframework.web.HttpRequestMethodNotSupportedException
repositories-mem_1  | 2017-07-23 04:18:12.115  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.RepositoryRestHandlerMapping   : Mapped "{[/{repository}],methods=[GET],produces=[application/hal+json || application/json]}" onto public org.springframework.hateoas.Resources<?> org.springframework.data.rest.webmvc.RepositoryEntityController.getCollectionResource(org.springframework.data.rest.webmvc.RootResourceInformation,org.springframework.data.rest.webmvc.support.DefaultedPageable,org.springframework.data.domain.Sort,org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler) throws org.springframework.data.rest.webmvc.ResourceNotFoundException,org.springframework.web.HttpRequestMethodNotSupportedException
repositories-mem_1  | 2017-07-23 04:18:12.127  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.BasePathAwareHandlerMapping    : Mapped "{[/profile],methods=[GET]}" onto org.springframework.http.HttpEntity<org.springframework.hateoas.ResourceSupport> org.springframework.data.rest.webmvc.ProfileController.listAllFormsOfMetadata()
repositories-mem_1  | 2017-07-23 04:18:12.128  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.BasePathAwareHandlerMapping    : Mapped "{[/profile],methods=[OPTIONS]}" onto public org.springframework.http.HttpEntity<?> org.springframework.data.rest.webmvc.ProfileController.profileOptions()
repositories-mem_1  | 2017-07-23 04:18:12.136  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.BasePathAwareHandlerMapping    : Mapped "{[/profile/{repository}],methods=[GET],produces=[application/alps+json || */*]}" onto org.springframework.http.HttpEntity<org.springframework.data.rest.webmvc.RootResourceInformation> org.springframework.data.rest.webmvc.alps.AlpsController.descriptor(org.springframework.data.rest.webmvc.RootResourceInformation)
repositories-mem_1  | 2017-07-23 04:18:12.136  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.BasePathAwareHandlerMapping    : Mapped "{[/profile/{repository}],methods=[OPTIONS],produces=[application/alps+json]}" onto org.springframework.http.HttpEntity<?> org.springframework.data.rest.webmvc.alps.AlpsController.alpsOptions()
repositories-mem_1  | 2017-07-23 04:18:12.137  INFO [repositories-mem,,,] 1 --- [           main] o.s.d.r.w.BasePathAwareHandlerMapping    : Mapped "{[/profile/{repository}],methods=[GET],produces=[application/schema+json]}" onto public org.springframework.http.HttpEntity<org.springframework.data.rest.webmvc.json.JsonSchema> org.springframework.data.rest.webmvc.RepositorySchemaController.schema(org.springframework.data.rest.webmvc.RootResourceInformation)
web_1               | 2017-07-23 04:18:12.643  INFO [web,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
web_1               | 2017-07-23 04:18:12.680  INFO [web,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshScope' has been autodetected for JMX exposure
web_1               | 2017-07-23 04:18:12.683  INFO [web,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'environmentManager' has been autodetected for JMX exposure
web_1               | 2017-07-23 04:18:12.688  INFO [web,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'configurationPropertiesRebinder' has been autodetected for JMX exposure
web_1               | 2017-07-23 04:18:12.695  INFO [web,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshEndpoint' has been autodetected for JMX exposure
web_1               | 2017-07-23 04:18:12.697  INFO [web,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'restartEndpoint' has been autodetected for JMX exposure
web_1               | 2017-07-23 04:18:12.717  INFO [web,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'environmentManager': registering with JMX server as MBean [org.springframework.cloud.context.environment:name=environmentManager,type=EnvironmentManager]
web_1               | 2017-07-23 04:18:12.797  INFO [web,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'restartEndpoint': registering with JMX server as MBean [org.springframework.cloud.context.restart:name=restartEndpoint,type=RestartEndpoint]
web_1               | 2017-07-23 04:18:12.861  INFO [web,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshScope': registering with JMX server as MBean [org.springframework.cloud.context.scope.refresh:name=refreshScope,type=RefreshScope]
web_1               | 2017-07-23 04:18:12.906  INFO [web,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'configurationPropertiesRebinder': registering with JMX server as MBean [org.springframework.cloud.context.properties:name=configurationPropertiesRebinder,context=6325a3ee,type=ConfigurationPropertiesRebinder]
web_1               | 2017-07-23 04:18:12.952  INFO [web,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshEndpoint': registering with JMX server as MBean [org.springframework.cloud.endpoint:name=refreshEndpoint,type=RefreshEndpoint]
web_1               | 2017-07-23 04:18:13.261  INFO [web,,,] 1 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
web_1               | 2017-07-23 04:18:13.306  INFO [web,,,] 1 --- [           main] o.s.c.n.eureka.InstanceInfoFactory       : Setting initial instance status as: STARTING
repositories-mem_1  | 2017-07-23 04:18:13.447  WARN [repositories-mem,,,] 1 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
repositories-mem_1  | 2017-07-23 04:18:13.447  INFO [repositories-mem,,,] 1 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
repositories-mem_1  | 2017-07-23 04:18:13.482  WARN [repositories-mem,,,] 1 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
repositories-mem_1  | 2017-07-23 04:18:13.482  INFO [repositories-mem,,,] 1 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
repositories-mem_1  | 2017-07-23 04:18:14.790  INFO [repositories-mem,,,] 1 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService 
web_1               | 2017-07-23 04:18:14.957  INFO [web,,,] 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON encoding codec LegacyJacksonJson
web_1               | 2017-07-23 04:18:14.966  INFO [web,,,] 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON decoding codec LegacyJacksonJson
repositories-mem_1  | 2017-07-23 04:18:15.493  INFO [repositories-mem,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
web_1               | 2017-07-23 04:18:15.534  INFO [web,,,] 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML encoding codec XStreamXml
web_1               | 2017-07-23 04:18:15.537  INFO [web,,,] 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML decoding codec XStreamXml
repositories-mem_1  | 2017-07-23 04:18:15.562  INFO [repositories-mem,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshScope' has been autodetected for JMX exposure
repositories-mem_1  | 2017-07-23 04:18:15.563  INFO [repositories-mem,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'environmentManager' has been autodetected for JMX exposure
repositories-mem_1  | 2017-07-23 04:18:15.583  INFO [repositories-mem,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'configurationPropertiesRebinder' has been autodetected for JMX exposure
repositories-mem_1  | 2017-07-23 04:18:15.602  INFO [repositories-mem,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshEndpoint' has been autodetected for JMX exposure
repositories-mem_1  | 2017-07-23 04:18:15.617  INFO [repositories-mem,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'restartEndpoint' has been autodetected for JMX exposure
repositories-mem_1  | 2017-07-23 04:18:15.640  INFO [repositories-mem,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'environmentManager': registering with JMX server as MBean [org.springframework.cloud.context.environment:name=environmentManager,type=EnvironmentManager]
repositories-mem_1  | 2017-07-23 04:18:15.697  INFO [repositories-mem,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'restartEndpoint': registering with JMX server as MBean [org.springframework.cloud.context.restart:name=restartEndpoint,type=RestartEndpoint]
repositories-mem_1  | 2017-07-23 04:18:15.724  INFO [repositories-mem,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshScope': registering with JMX server as MBean [org.springframework.cloud.context.scope.refresh:name=refreshScope,type=RefreshScope]
repositories-mem_1  | 2017-07-23 04:18:15.760  INFO [repositories-mem,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'configurationPropertiesRebinder': registering with JMX server as MBean [org.springframework.cloud.context.properties:name=configurationPropertiesRebinder,context=97e1986,type=ConfigurationPropertiesRebinder]
repositories-mem_1  | 2017-07-23 04:18:15.784  INFO [repositories-mem,,,] 1 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshEndpoint': registering with JMX server as MBean [org.springframework.cloud.endpoint:name=refreshEndpoint,type=RefreshEndpoint]
repositories-mem_1  | 2017-07-23 04:18:16.325  INFO [repositories-mem,,,] 1 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
repositories-mem_1  | 2017-07-23 04:18:16.378  INFO [repositories-mem,,,] 1 --- [           main] o.s.c.n.eureka.InstanceInfoFactory       : Setting initial instance status as: STARTING
web_1               | 2017-07-23 04:18:17.302  INFO [web,,,] 1 --- [           main] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration
web_1               | 2017-07-23 04:18:17.452  INFO [web,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Disable delta property : false
web_1               | 2017-07-23 04:18:17.454  INFO [web,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Single vip registry refresh property : null
web_1               | 2017-07-23 04:18:17.458  INFO [web,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Force full registry fetch : false
web_1               | 2017-07-23 04:18:17.463  INFO [web,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Application is null : false
web_1               | 2017-07-23 04:18:17.468  INFO [web,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Registered Applications size is zero : true
web_1               | 2017-07-23 04:18:17.470  INFO [web,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Application version is -1: true
web_1               | 2017-07-23 04:18:17.471  INFO [web,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Getting all instance registry info from the eureka server
repositories-mem_1  | 2017-07-23 04:18:18.387  INFO [repositories-mem,,,] 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON encoding codec LegacyJacksonJson
repositories-mem_1  | 2017-07-23 04:18:18.399  INFO [repositories-mem,,,] 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON decoding codec LegacyJacksonJson
web_1               | 2017-07-23 04:18:18.423  INFO [web,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : The response status is 200
web_1               | 2017-07-23 04:18:18.428  INFO [web,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Starting heartbeat executor: renew interval is: 30
web_1               | 2017-07-23 04:18:18.436  INFO [web,,,] 1 --- [           main] c.n.discovery.InstanceInfoReplicator     : InstanceInfoReplicator onDemand update allowed rate per min is 4
web_1               | 2017-07-23 04:18:18.921  INFO [web,,,] 1 --- [           main] c.n.e.EurekaDiscoveryClientConfiguration : Registering application web with eureka with status UP
web_1               | 2017-07-23 04:18:18.934  INFO [web,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Saw local status change event StatusChangeEvent [timestamp=1500783498934, current=UP, previous=STARTING]
web_1               | 2017-07-23 04:18:18.942  INFO [web,,,] 1 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_WEB/94dadd7737b8:web:8091: registering service...
repositories-mem_1  | 2017-07-23 04:18:19.183  INFO [repositories-mem,,,] 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML encoding codec XStreamXml
repositories-mem_1  | 2017-07-23 04:18:19.183  INFO [repositories-mem,,,] 1 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML decoding codec XStreamXml
eureka_1            | 2017-07-23 04:18:19.403  INFO 1 --- [nio-8761-exec-3] c.n.e.registry.AbstractInstanceRegistry  : Registered instance WEB/94dadd7737b8:web:8091 with status UP (replication=false)
web_1               | 2017-07-23 04:18:19.407  INFO [web,,,] 1 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_WEB/94dadd7737b8:web:8091 - registration status: 204
web_1               | 2017-07-23 04:18:19.491  INFO [web,,,] 1 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Context refreshed
web_1               | 2017-07-23 04:18:19.598  INFO [web,,,] 1 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Found 1 custom documentation plugin(s)
web_1               | 2017-07-23 04:18:19.658  INFO [web,,,] 1 --- [           main] s.d.s.w.s.ApiListingReferenceScanner     : Scanning for api listing references
eureka_1            | 2017-07-23 04:18:19.928  INFO 1 --- [nio-8761-exec-4] c.n.e.registry.AbstractInstanceRegistry  : Registered instance WEB/94dadd7737b8:web:8091 with status UP (replication=true)
repositories-mem_1  | 2017-07-23 04:18:20.453  INFO [repositories-mem,,,] 1 --- [           main] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration
repositories-mem_1  | 2017-07-23 04:18:20.620  INFO [repositories-mem,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Disable delta property : false
repositories-mem_1  | 2017-07-23 04:18:20.620  INFO [repositories-mem,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Single vip registry refresh property : null
repositories-mem_1  | 2017-07-23 04:18:20.620  INFO [repositories-mem,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Force full registry fetch : false
repositories-mem_1  | 2017-07-23 04:18:20.620  INFO [repositories-mem,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Application is null : false
repositories-mem_1  | 2017-07-23 04:18:20.620  INFO [repositories-mem,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Registered Applications size is zero : true
repositories-mem_1  | 2017-07-23 04:18:20.621  INFO [repositories-mem,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Application version is -1: true
repositories-mem_1  | 2017-07-23 04:18:20.621  INFO [repositories-mem,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Getting all instance registry info from the eureka server
web_1               | 2017-07-23 04:18:20.843  INFO [web,,,] 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8091 (http)
web_1               | 2017-07-23 04:18:20.854  INFO [web,,,] 1 --- [           main] c.n.e.EurekaDiscoveryClientConfiguration : Updating port to 8091
web_1               | 2017-07-23 04:18:20.883  INFO [web,,,] 1 --- [           main] c.o.e.m.web.SampleWebUIApplication       : Started SampleWebUIApplication in 118.956 seconds (JVM running for 128.235)
repositories-mem_1  | 2017-07-23 04:18:21.490  INFO [repositories-mem,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : The response status is 200
repositories-mem_1  | 2017-07-23 04:18:21.497  INFO [repositories-mem,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Starting heartbeat executor: renew interval is: 30
repositories-mem_1  | 2017-07-23 04:18:21.514  INFO [repositories-mem,,,] 1 --- [           main] c.n.discovery.InstanceInfoReplicator     : InstanceInfoReplicator onDemand update allowed rate per min is 4
repositories-mem_1  | 2017-07-23 04:18:21.809  INFO [repositories-mem,,,] 1 --- [           main] c.n.e.EurekaDiscoveryClientConfiguration : Registering application repositories-mem with eureka with status UP
repositories-mem_1  | 2017-07-23 04:18:21.824  INFO [repositories-mem,,,] 1 --- [           main] com.netflix.discovery.DiscoveryClient    : Saw local status change event StatusChangeEvent [timestamp=1500783501822, current=UP, previous=STARTING]
repositories-mem_1  | 2017-07-23 04:18:21.834  INFO [repositories-mem,,,] 1 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_REPOSITORIES-MEM/f6b033060e41:repositories-mem:9091: registering service...
repositories-mem_1  | 2017-07-23 04:18:22.087  INFO [repositories-mem,,,] 1 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Context refreshed
eureka_1            | 2017-07-23 04:18:22.156  INFO 1 --- [nio-8761-exec-6] c.n.e.registry.AbstractInstanceRegistry  : Registered instance REPOSITORIES-MEM/f6b033060e41:repositories-mem:9091 with status UP (replication=false)
repositories-mem_1  | 2017-07-23 04:18:22.165  INFO [repositories-mem,,,] 1 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_REPOSITORIES-MEM/f6b033060e41:repositories-mem:9091 - registration status: 204
repositories-mem_1  | 2017-07-23 04:18:22.172  INFO [repositories-mem,,,] 1 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Found 1 custom documentation plugin(s)
repositories-mem_1  | 2017-07-23 04:18:22.196  INFO [repositories-mem,,,] 1 --- [           main] s.d.s.w.s.ApiListingReferenceScanner     : Scanning for api listing references
repositories-mem_1  | 2017-07-23 04:18:22.373  INFO [repositories-mem,,,] 1 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 9091 (http)
repositories-mem_1  | 2017-07-23 04:18:22.377  INFO [repositories-mem,,,] 1 --- [           main] c.n.e.EurekaDiscoveryClientConfiguration : Updating port to 9091
repositories-mem_1  | 2017-07-23 04:18:22.386  INFO [repositories-mem,,,] 1 --- [           main] c.o.e.m.r.InMemoryRepositoryApplication  : Started InMemoryRepositoryApplication in 115.982 seconds (JVM running for 125.146)
eureka_1            | 2017-07-23 04:18:22.670  INFO 1 --- [nio-8761-exec-7] c.n.e.registry.AbstractInstanceRegistry  : Registered instance REPOSITORIES-MEM/f6b033060e41:repositories-mem:9091 with status UP (replication=true)
zuul-server_1       | 2017-07-23 04:18:23.325  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Disable delta property : false
zuul-server_1       | 2017-07-23 04:18:23.325  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Single vip registry refresh property : null
zuul-server_1       | 2017-07-23 04:18:23.325  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Force full registry fetch : false
zuul-server_1       | 2017-07-23 04:18:23.327  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Application is null : false
zuul-server_1       | 2017-07-23 04:18:23.327  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Registered Applications size is zero : true
zuul-server_1       | 2017-07-23 04:18:23.327  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Application version is -1: true
zuul-server_1       | 2017-07-23 04:18:23.327  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Getting all instance registry info from the eureka server
eureka_1            | 2017-07-23 04:18:23.369  WARN 1 --- [nio-8761-exec-9] c.n.e.registry.AbstractInstanceRegistry  : DS: Registry: lease doesn't exist, registering resource: ZUULSERVER - 10.0.2.15:zuulserver:8765
eureka_1            | 2017-07-23 04:18:23.369  WARN 1 --- [nio-8761-exec-9] c.n.eureka.resources.InstanceResource    : Not Found (Renew): ZUULSERVER - 10.0.2.15:zuulserver:8765
zuul-server_1       | 2017-07-23 04:18:23.411  INFO 1 --- [tbeatExecutor-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_ZUULSERVER/10.0.2.15:zuulserver:8765 - Re-registering apps/ZUULSERVER
zuul-server_1       | 2017-07-23 04:18:23.411  INFO 1 --- [tbeatExecutor-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_ZUULSERVER/10.0.2.15:zuulserver:8765: registering service...
eureka_1            | 2017-07-23 04:18:23.442  INFO 1 --- [nio-8761-exec-1] c.n.e.registry.AbstractInstanceRegistry  : Registered instance ZUULSERVER/10.0.2.15:zuulserver:8765 with status UP (replication=false)
zuul-server_1       | 2017-07-23 04:18:23.450  INFO 1 --- [tbeatExecutor-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_ZUULSERVER/10.0.2.15:zuulserver:8765 - registration status: 204
zuul-server_1       | 2017-07-23 04:18:23.473  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : The response status is 200
eureka_1            | 2017-07-23 04:18:23.962  INFO 1 --- [nio-8761-exec-2] c.n.e.registry.AbstractInstanceRegistry  : Registered instance ZUULSERVER/10.0.2.15:zuulserver:8765 with status UP (replication=true)
zuul-server_1       | 2017-07-23 04:18:25.479  INFO 1 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_ZUULSERVER/10.0.2.15:zuulserver:8765: registering service...
eureka_1            | 2017-07-23 04:18:25.497  INFO 1 --- [nio-8761-exec-5] c.n.e.registry.AbstractInstanceRegistry  : Registered instance ZUULSERVER/10.0.2.15:zuulserver:8765 with status UP (replication=false)
zuul-server_1       | 2017-07-23 04:18:25.499  INFO 1 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_ZUULSERVER/10.0.2.15:zuulserver:8765 - registration status: 204
eureka_1            | 2017-07-23 04:18:26.009  INFO 1 --- [nio-8761-exec-6] c.n.e.registry.AbstractInstanceRegistry  : Registered instance ZUULSERVER/10.0.2.15:zuulserver:8765 with status UP (replication=true)
web_1               | 2017-07-23 04:18:48.429  INFO [web,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Disable delta property : false
web_1               | 2017-07-23 04:18:48.430  INFO [web,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Single vip registry refresh property : null
web_1               | 2017-07-23 04:18:48.430  INFO [web,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Force full registry fetch : false
web_1               | 2017-07-23 04:18:48.433  INFO [web,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Application is null : false
web_1               | 2017-07-23 04:18:48.436  INFO [web,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Registered Applications size is zero : true
web_1               | 2017-07-23 04:18:48.437  INFO [web,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Application version is -1: false
web_1               | 2017-07-23 04:18:48.439  INFO [web,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Getting all instance registry info from the eureka server
web_1               | 2017-07-23 04:18:48.691  INFO [web,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : The response status is 200
repositories-mem_1  | 2017-07-23 04:18:51.505  INFO [repositories-mem,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Disable delta property : false
repositories-mem_1  | 2017-07-23 04:18:51.505  INFO [repositories-mem,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Single vip registry refresh property : null
repositories-mem_1  | 2017-07-23 04:18:51.506  INFO [repositories-mem,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Force full registry fetch : false
repositories-mem_1  | 2017-07-23 04:18:51.506  INFO [repositories-mem,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Application is null : false
repositories-mem_1  | 2017-07-23 04:18:51.506  INFO [repositories-mem,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Registered Applications size is zero : true
repositories-mem_1  | 2017-07-23 04:18:51.506  INFO [repositories-mem,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Application version is -1: false
repositories-mem_1  | 2017-07-23 04:18:51.507  INFO [repositories-mem,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Getting all instance registry info from the eureka server
repositories-mem_1  | 2017-07-23 04:18:51.704  INFO [repositories-mem,,,] 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : The response status is 200
zuul-server_1       | 2017-07-23 04:18:53.481  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Disable delta property : false
zuul-server_1       | 2017-07-23 04:18:53.481  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Single vip registry refresh property : null
zuul-server_1       | 2017-07-23 04:18:53.481  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Force full registry fetch : false
zuul-server_1       | 2017-07-23 04:18:53.481  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Application is null : false
zuul-server_1       | 2017-07-23 04:18:53.481  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Registered Applications size is zero : true
zuul-server_1       | 2017-07-23 04:18:53.481  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Application version is -1: false
zuul-server_1       | 2017-07-23 04:18:53.481  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Getting all instance registry info from the eureka server
zuul-server_1       | 2017-07-23 04:18:53.531  INFO 1 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : The response status is 200
eureka_1            | 2017-07-23 04:18:54.938  INFO 1 --- [a-EvictionTimer] c.n.e.registry.AbstractInstanceRegistry  : Running the evict task with compensationTime 0ms
eureka_1            | 2017-07-23 04:19:54.939  INFO 1 --- [a-EvictionTimer] c.n.e.registry.AbstractInstanceRegistry  : Running the evict task with compensationTime 0ms
eureka_1            | 2017-07-23 04:20:54.939  INFO 1 --- [a-EvictionTimer] c.n.e.registry.AbstractInstanceRegistry  : Running the evict task with compensationTime 0ms
eureka_1            | 2017-07-23 04:21:54.939  INFO 1 --- [a-EvictionTimer] c.n.e.registry.AbstractInstanceRegistry  : Running the evict task with compensationTime 0ms
zuul-server_1       | 2017-07-23 04:22:52.342  INFO 1 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration
eureka_1            | 2017-07-23 04:22:54.940  INFO 1 --- [a-EvictionTimer] c.n.e.registry.AbstractInstanceRegistry  : Running the evict task with compensationTime 0ms
web_1               | 2017-07-23 04:23:17.487  INFO [web,,,] 1 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration
repositories-mem_1  | 2017-07-23 04:23:20.632  INFO [repositories-mem,,,] 1 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration
eureka_1            | 2017-07-23 04:23:54.941  INFO 1 --- [a-EvictionTimer] c.n.e.registry.AbstractInstanceRegistry  : Running the evict task with compensationTime 1ms
eureka_1            | 2017-07-23 04:24:54.942  INFO 1 --- [a-EvictionTimer] c.n.e.registry.AbstractInstanceRegistry  : Running the evict task with compensationTime 0ms

```