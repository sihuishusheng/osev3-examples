# Intruduction

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