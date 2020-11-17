## Welcome Developers

### Get started with git
- ***fork*** this repo to your github account
- ***clone*** your ***own fork*** to your local computer 
- create your ***local branch*** based on ***this develop branch*** (not the main branch)
- commit and push to your ***own fork***
- create pull request against ***this develop branch*** when your fork is ready
- remember to fetch+merge or just pull this branch to ***stay updated***.  

### Get started with project
- If you use IntelliJ, open the folder and the project will be loaded automatically
#### Set up database
- Install mysql server (GUI workbench is optional)
  remember the root username and password during installing process
  add the "bin" folder to path 
- Open cmd(windows) or terminal(mac) with ***admin*** access, run the command below
  ```mysqld --console``` to start server
- In another ***admin*** cmd or terminal, run the command below
  ```mysql -u <your root username> -p```
  ```<enter password at prompt>```
  ```create user 'freeopenuniversity'@'localhost';``` I skipped password here
  ```grant all privileges on * . * to 'freeopenuniversity'@localhost;```
  ```exit```
  log in with the user just created
  ```mysql -u freeopenuniversity```
  now you can create database, tables and data entries
  
