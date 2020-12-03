## Welcome Developers

### Get started with git
- ***fork*** this repo to your github account
- ***clone*** your ***own fork*** to your local computer
- in local git repo, ```git remote add upstream git@github.com:FreeOpenUniversity/website-backend.git```
- create your ***local branch*** ***based on*** "base-on-this" branch
- commit and push to your ***own fork***
- create pull request against ***this "base-on-this" branch*** when your branch is ready
- ***stay in sync***: before word and push
  in your local "base-on-it" branch ```git pull upstream base-on-this```.
  in your local "feature" branch ```git rebase base-on-this```

### Get started with project
- If you use IntelliJ, open the folder and the project will be loaded automatically
### Set up database
- Install mysql server (GUI workbench is optional)  
  remember the root username and password during installing process  
  add the "bin" folder to path  
- Open cmd(windows) or terminal(mac) with ***admin*** access, run the command below  
  ```mysqld --console``` to start server  
- In another ***admin*** cmd or terminal, run the command below  
  ```mysql -u <your root username> -p```  
  ```<enter password at prompt>```  
  ```create user 'freeopenuniversity'@'localhost';``` I skipped password    
  ```grant all privileges on * . * to 'freeopenuniversity'@localhost;```  
  ```exit```  
  log in with the user just created  
  ```mysql -u freeopenuniversity```  
  now you can create database, tables and data entries  
- run the init_script in database folder to create tables and data
  ```source <your path to the script>```
  
