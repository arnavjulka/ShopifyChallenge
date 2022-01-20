# ShopifyChallenge

### Set up requirements -
installl these (exact version are not important) -
* java - java 11.0.12 2021-07-20 LTS (any java above java8 will do)
* maven - https://maven.apache.org/download.cgi latest maven (i have Apache Maven 3.8.4)
* Database used was H2 fot your ease, i originally did in mysql but it would be difficult for the tester to set it up for each person
* intellij
* Springboot 
* hibernate
* Tomcat server


### setup steps
#### if youre going to look at the code via any IDE
just run the maven configuration, build the project, run the project via ide only and follow further steps as it is 
##### OR
#### deploy the war file in your tomcat
* go to the main directory(outside src, the folder where pom.xml is present)
* open git bash/cmd/anybash/terminal
* run this command ``` mvn clean ```
* run this command ``` mvn install ```
* or follow this link https://www.appsdeveloperblog.com/create-a-deployable-war-file-with-spring-boot/ 
* there will create a folder called "target". it will contain a file called - "ShopifyChallenge-0.0.1-SNAPSHOT.war" . copy this file
* past the file in file into the webapps directory of Tomcat
* run the tomcat server( by running the startup file in tomcat/bin folder)
* follow this guide in case- https://www.baeldung.com/tomcat-deploy-war

### After setup is complete - Consume APIs and configure DB
Once the setup is complete then access the database by following these steps - 
* go to ``` http://localhost:8080/h2-console ```
* enter the following values for the following fields 
* Driver Class : ``` org.h2.Driver ```
* JDBC URL ``` jdbc:h2:mem:testdb ```
* Username : ``` sa ```
* Password : ``` ```
* click on connect. The prompt before connecting should look like this 
![image](https://user-images.githubusercontent.com/25602564/150241434-010c19aa-0250-419e-a3fe-ba4c616716c5.png)
* after logging in the console should look like this 
![image](https://user-images.githubusercontent.com/25602564/150241571-d488b2c7-8cd5-44d0-95c0-9684a915399a.png)

#### accessing the APIs
* once the server is up go to ``` http://localhost:8080/swagger-ui ```
* you will see all the apis and their responses 
![image](https://user-images.githubusercontent.com/25602564/150243500-cfe94923-1ea0-4f3e-8a83-28e23a40bb77.png)
* click on -  inventory-controller
* click on post call to save items 
![image](https://user-images.githubusercontent.com/25602564/150241927-d504d6bb-7498-4000-a0e7-215bdcad67de.png)
* click on try it out -> edit dummy JSON data -> click on execute -> 
* it will execute and hit the particular API with the JSON value as inserted as in input and return the result below
* You can check the result in the DB also 
* You can play along the APIs in the swagger UI dashboard itself 
* Each API has its definition with it, its input value and its return value






