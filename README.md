
Help

    [vagrant@localhost osev3-examples]$ docker build -t docker.io/tangfeixiong/springboot-osev3-examples:web -f Dockerfile.spring-boot%2Fsample-microservices-springboot.hacking-of-唐飞雄 .
    Sending build context to Docker daemon 16.96 MB
    Step 1 : FROM docker.io/centos:centos7
     ---> 0959a1e48323
    Step 2 : MAINTAINER tangfeixiong <tangfx128@gmail.com>
     ---> Using cache
     ---> 5a7ae5466100
    Step 3 : ARG java_pkg="http://172.17.4.1:48080/99-mirror/http%3A%2F%2Fdownload.oracle.com/otn-pub%2Fjava%2Fjdk%2F8u112-b15/server-jre-8u112-linux-x64.tar.gz"
     ---> Running in 06ea89436c78
     ---> 2d3c8d0790c7
    Removing intermediate container 06ea89436c78
    Step 4 : COPY /spring-boot/sample-microservices-springboot/web.jar /opt/app/web.jar
     ---> 88b31a708f61
    Removing intermediate container 47aee96b52e3
    Step 5 : ENV JAVA_HOME "/opt/java" PATH $PATH:/opt/java/bin JAVA_OPTIONS "-Xms128m -Xmx512m -XX:PermSize=64m -XX:MaxPermSize=256m"
     ---> Running in d3860072a0bb
     ---> 5046e20c5068
    Removing intermediate container d3860072a0bb
    Step 6 : RUN set -x     temp_dir=/tmp/build     && mkdir -p $JAVA_HOME     && javaPkgSrc="${java_pkg:-'http://download.oracle.com/otn-pub/java/jdk/8u112-b15/server-jre-8u112-linux-x64.tar.gz'}"     && if [[ -f $temp_dir/$javaPkgSrc ]]; then         tar -C $JAVA_HOME --strip-components=1 -zxf $temp_dir/$javaPkgSrc;         rm -f $temp_dir/$javaPkgSrc;     elif [[ ! "$javaPkgSrc" =~ https?://download\.oracle\.com/?.* ]]; then         curl -jkSL ${javaPkgSrc//%/%25}             | gunzip -c -             | tar -x -C $JAVA_HOME --strip-components=1;     else         curl -jkSLH "Cookie: oraclelicense=accept-securebackup-cookie; " "$javaPkgSrc"             | gunzip             | tar -x -C "$JAVA_HOME" --strip-components=1;     fi     && rm -rf $temp_dir     && echo
     ---> Running in 6fdb0b04ee43
    + mkdir -p /opt/java
    + javaPkgSrc=http://172.17.4.1:48080/99-mirror/http%3A%2F%2Fdownload.oracle.com/otn-pub%2Fjava%2Fjdk%2F8u112-b15/server-jre-8u112-linux-x64.tar.gz
    + [[ -f /http://172.17.4.1:48080/99-mirror/http%3A%2F%2Fdownload.oracle.com/otn-pub%2Fjava%2Fjdk%2F8u112-b15/server-jre-8u112-linux-x64.tar.gz ]]
    + [[ ! http://172.17.4.1:48080/99-mirror/http%3A%2F%2Fdownload.oracle.com/otn-pub%2Fjava%2Fjdk%2F8u112-b15/server-jre-8u112-linux-x64.tar.gz =~ https?://download\.oracle\.com/?.* ]]
    + curl -jkSL http://172.17.4.1:48080/99-mirror/http%253A%252F%252Fdownload.oracle.com/otn-pub%252Fjava%252Fjdk%252F8u112-b15/server-jre-8u112-linux-x64.tar.gz
    + tar -x -C /opt/java --strip-components=1
    + gunzip -c -
      % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                     Dload  Upload   Total   Spent    Left  Speed
    100 57.1M  100 57.1M    0     0  27.2M      0  0:00:02  0:00:02 --:--:-- 27.3M
    + rm -rf
    
    + echo
     ---> ba44316879c7
    Removing intermediate container 6fdb0b04ee43
    Step 7 : EXPOSE 8080
     ---> Running in 49a98c1c42a1
     ---> 4ad5af73508b
    Removing intermediate container 49a98c1c42a1
    Step 8 : CMD java -Djava.security.egd=file:/dev/./urandom -jar /opt/app/web.jar $JAVA_OPTIONS
     ---> Running in 20f24d3567a4
     ---> 0fd2fffab2d8
    Removing intermediate container 20f24d3567a4
    Successfully built 0fd2fffab2d8

    [vagrant@localhost osev3-examples]$ docker run -d --name springbootapp -p 8080:8080 0fd2fffab2d8
    717fd3cacdc6a313666739fedf851d0847d71f5f23453901f4fb1453bbaac569

    [vagrant@localhost osev3-examples]$ curl -L localhost:8080
    <!DOCTYPE html>
    
    <html>
      <head>
        <title>Messages : View all</title>
        
        <link rel="stylesheet" href="/css/bootstrap.min.css" />
      
        
      </head>
      <body>
        <div class="container">
          <div class="navbar">
            <div class="navbar-inner">
              <a class="brand" href="https://github.com/ultraq/thymeleaf-layout-dialect">
                  Thymeleaf - Layout
              </a>
              <ul class="nav">
                <li>
                  <a href="/">
                    Messages
                  </a>
                </li>
              </ul>
            </div>
          </div>
          <h1>Messages : View all</h1>
          <div class="container">
          <div class="pull-right">
            <a href="/?form">Create Message</a>
           </div>
          <table class="table table-bordered table-striped">
            <thead>
              <tr>
                <td>ID</td>
                <td>Created</td>
                <td>Summary</td>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td colspan="3">
                  No messages
                </td>
              </tr>
              
            </tbody>
          </table>
        </div>
        </div>
      </body>
    </html>

    [vagrant@localhost osev3-examples]$ docker stop 717fd3cacdc6a313666739fedf851d0847d71f5f23453901f4fb1453bbaac569 
    717fd3cacdc6a313666739fedf851d0847d71f5f23453901f4fb1453bbaac569

    [vagrant@localhost osev3-examples]$ docker rm 717fd3cacdc6a313666739fedf851d0847d71f5f23453901f4fb1453bbaac569 
    717fd3cacdc6a313666739fedf851d0847d71f5f23453901f4fb1453bbaac569
