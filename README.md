## Welcome Developers

### Get started with git

- **_fork_** this repo to your github account
- **_clone_** your **_own fork_** to your local computer
- in local git repo, `git remote add upstream git@github.com:FreeOpenUniversity/website-backend.git`
- create your local "feature" branch **_based on_** "develop" branch
- commit and push to your **_own fork_**
- create pull request against **_this "develop" branch_** when your branch is ready
- **_stay in sync_**: before word and push
  in your local "develop" branch `git pull upstream develop`.
  in your local "feature" branch `git rebase develop`

### Get started with project

- If you use **_IntelliJ_**, open the folder and the project will be loaded automatically
  - to run it, click maven>backend>plugins>spring-boot>spring-boot:run
    ![starting at the far right under ant, click maven](RunMVN.jpg?raw=true "Maven")
- If you use command line, in project root, run `./mvnw spring-boot:run` In Windows, run `mvnw spring-boot:run` OR `mvn spring-boot:run`
- Please make sure you have installed [Java](https://java.com/en/download/) and [Apache Maven](https://maven.apache.org/download.cgi) before running this program locally
- Once the program starts running, open `http://localhost:8080/` manually to view the data

### Set up database

- Install MySQL server (GUI workbench is optional)
  - On a Mac with homebrew:
    - `brew install mysql`
    - `mysql_secure_installation`
      remember the root username and password during installing process  
      if you forget, open **_MySQL Installer_** and reconfigure MySQL server to reset them
- Open cmd(Windows) or terminal(Mac) with **_admin access/run as administrator_**
- Add the "bin" folder to path (e.g. _C:\Program Files\MySQL\MySQL Server 8.0\bin_)
- Run the commands below: (**_DO NOT forget the punctuation marks like " ; "_**)  
  `mysql -u <your root username> -p`  
  `<enter password at prompt>`  
  `create user 'freeopenuniversity'@'localhost';` (_I skipped password, so DO NOT create the user with password here_)  
  `grant all privileges on * . * to 'freeopenuniversity'@localhost;`  
  `exit`  
  Now you can log in with the user just created  
  `mysql -u freeopenuniversity`  
  and you can create database, tables and data entries by running the **_init_script.sql_** in the database folder through this command:  
  `source <your path to the init_script>`

  - to shut mysql down [try](https://stackoverflow.com/a/11091462/11338233):
    - `mysqladmin -u root -p shutdown`
    - `sudo mysqld stop`
    - `/usr/local/mysql/bin/mysqladmin -u root -p shutdown`

  For beginners: notice that a valid SQL command would have warnings in the next line of command prompt, such as "_Query OK, 1 row affected (0.00 sec)_"
