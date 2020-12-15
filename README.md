## Welcome Developers

### Get started with git
- ***fork*** this repo to your github account
- ***clone*** your ***own fork*** to your local computer
- in local git repo, ```git remote add upstream git@github.com:FreeOpenUniversity/website-backend.git```
- create your local "feature" branch ***based on*** "develop" branch
- commit and push to your ***own fork***
- create pull request against ***this "develop" branch*** when your branch is ready
- ***stay in sync***: before word and push
  in your local "develop" branch ```git pull upstream develop```.
  in your local "feature" branch ```git rebase develop```

### Get started with project
- If you use IntelliJ, open the folder and the project will be loaded automatically
- If you use command line, in project root, run ```./mvnw spring-boot:run``` In Windows, run ```mvnw spring-boot:run``` OR ```mvn spring-boot:run```
- Please make sure you have installed ***Java*** and ***Apache Maven*** before running the program locally
- Once the program starts running, open ```http://localhost:8080/``` manually to view the data
 ### Set up database
- Install MySQL server (GUI workbench is optional)  
  remember the root username and password during installing process  
  if you forget, open ***MySQL Installer*** and reconfigure MySQL server to reset them   

- Open cmd(Windows) or terminal(Mac) with ***admin access/run as administrator***
- Add the "bin" folder to path (e.g. *C:\Program Files\MySQL\MySQL Server 8.0\bin*)  
- Run the commands below: (***DO NOT forget the punctuation marks like " ; "***)  
  ```mysql -u <your root username> -p```  
  ```<enter password at prompt>```  
  ```create user 'OpenFreeUniversity'@'localhost';``` (*I skipped password, so DO NOT create the user with password here*)      
  ```grant all privileges on * . * to 'freeopenuniversity'@localhost;```  
  ```exit```  
  Now you can log in with the user just created  
  ```mysql -u freeopenuniversity```  
  and you can create database, tables and data entries by running the ***init_script.sql*** in the database folder through this command:  
  ```source <your path to the init_script>```
  

  For beginners: notice that a valid SQL command would have warnings in the next line of command prompt, such as "*Query OK, 1 row affected (0.00 sec)*"
