Dsolutions
==========

Technologies used.

1. Spring MVC
2. Hibernate
3. Mysql
4. Maven

Build instructions.
1. Add below contends to .settings file in m2 repo

<settings>
    <servers>
        <server>
            <id>my-tomcat</id>
            <username>manager</username>
            <password>manager</password>
        </server>
    </servers>
</settings>

2. Add below role and user and the role to the file 
   apache-tomcat-7.0.55/conf/tomcat-users.xml
   
   <role rolename="manager-script"/>
   <user password="manager" roles="manager-script" username="manager"/>
 
3. Add below fields in database.properties file accordingly.

database.driver=com.mysql.jdbc.Driver
database.url=jdbc:mysql://localhost:3306/dsolutions
database.user=root
database.password=password1234
dialect=org.hibernate.dialect.MySQLDialect  

4. Start tomecat server

5. run below targets
     mvn clean
     mvn package
     mvn tomcat7:deploy
   
  Try to access localhost:8080/Dsolutions
  If you see the welcome page, you are done !!!

