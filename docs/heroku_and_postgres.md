## Heroku & PostgreSQL

The application will be hosted on Heroku which also contains an PostgreSQL database for data.

### Heroku

#### General Notes
- to publish the application to Heroku, we push the source code to Heroku
    - Heroku needs to be setup as a remote on the Git repository (more below)
    - the application must compile
    - note that Heroku only deploys the "master" branch, pushing another branch works, but Heroku will not start it
- Heroku manages the PostgreSQL database

#### Setup
- install the Heroku command line 
    [client](https://devcenter.heroku.com/articles/getting-started-with-java?singlepage=true#set-up)
- add the command line, type ```heroku login``` . This should open your browser and allow you to authenticate to 
    the command line client. This will only be done once.
- add the Heroku as a remote on your Git repo. Via the command line, ```cd``` to the repo, then type 
```git remote add heroku https://git.heroku.com/sweng894capstone.git```
 
#### Logging
Note that Heroku does not allow file system logging. As a result, the logback file system logging that was originally
created in the project was removed. All logging in the project is now console logging (which Heroku redirects to
whatever it wants). There are a few ways to view logs
- from the command line, cd to the root of the project, then type ```heroku logs -tail```
- there is a web UI for logging. Getting to it is a little odd. First, 
    go [here](https://addons-sso.heroku.com/apps/sweng894capstone/addons/papertrail) . After login you will be 
    redirected to this URL https://papertrailapp.com/systems/sweng894capstone/events which you can bookmark
    and use without logging in (assuming same computer, etc)
    

### PostgreSQL
PostgreSQL appears to be managable only through (Java) code or through a command line. To access PostgreSQL from
the command line, follow these steps:
- install PostgreSQL from [here](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)
    - when installing, I (chris) chose to install the entire product, assuming I may run the db locally
    - at the end of the install, I was prompted to install more features, I did not
- add the ```bin``` directory under the PostgreSQL install directory to your path. For example on Windows it was
    ```C:\Program Files\PostgreSQL\11\bin```
- to login:
    - go to a command prompt and navigate to the root of our project
    - type in ```set DATABASE_PATH=postgres://ctjhrubwhvmfiq:959bcab877a90679d58ebfcbe1f96d428e4adf3e8cd4f0c3968777981ad7f469@ec2-54-235-114-242.compute-1.amazonaws.com:5432/d19p1hpubqedo5```
    - if using Mac/Linux use ```export``` instead of ```set```
    - type in ```heroku pg:psql -a sweng894capstone```