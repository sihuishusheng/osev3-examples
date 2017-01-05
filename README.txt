[vagrant@localhost osev3-examples]$ docker run -d --name springbootapp -p 8080:8080 897fa06dc852
c5a66f625333013978fa984467e3a9594243f71d3fc846245670a1234c4c1352
[vagrant@localhost osev3-examples]$ docker exec -ti c5a66f625333013978fa984467e3a9594243f71d3fc846245670a1234c4c1352 /bin/bash
[root@c5a66f625333 /]# ps -ef        
UID        PID  PPID  C STIME TTY          TIME CMD
root         1     0 23 03:24 ?        00:00:14 java -Djava.security.egd=file:/dev/./urandom -Xms128m -Xmx512m -XX:PermSize=64m -XX:MaxP
root        29     0  0 03:25 ?        00:00:00 /bin/bash
root        47    29  0 03:25 ?        00:00:00 ps -ef
[root@c5a66f625333 /]# curl 127.0.0.1:8080
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
