# Poll Discussion Project

## Tools Used
- Java 11
- Spring Boot (this does not need to be installed)
- [PostgreSQL](docs/heroku_and_postgres.md)
- [Heroku](docs/heroku_and_postgres.md)

## Getting Started

### Install Spring Boot (optional)

#### With Homebrew
If you are on a Mac and use Homebrew, you can install the Spring Boot CLI by using the following commands:
```
$ brew tap pivotal/tap
$ brew install springboot
```

#### Java and Maven
The project requires Java 11 and Maven 3.3+
```
$ java -version
openjdk version "11.0.2" 2019-01-15
OpenJDK Runtime Environment 18.9 (build 11.0.2+9)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.2+9, mixed mode)

$ mvn -v
Apache Maven 3.5.4 (1edded0938998edf8bf061f1ceb3cfdeccf443fe; 2018-06-17T14:33:14-04:00)
Maven home: /usr/local/Cellar/maven/3.3.9/libexec
Java version: 1.8.0_102, vendor: Oracle Corporation
```


## Run the project

To run the project from a command line there are two options:

### Run from Maven:
If Java 11 is not on your path, execute the following (Linux/MAC):
```
export JAVA_HOME=/cygdrive/c/java/jdk-11.0.2/
```
Windows:
set JAVA_HOME=c:\java\jdk-11.0.2

Then execute the command (Linux/MAC):
```
mvn -Dspring.profiles.active=<profile> spring-boot:run
```
Windows:
```
mvn.cmd -Dspring.profiles.active=<profile> spring-boot:run
```

### Alternatively, the application can be compiled and run
Assuming the Java and Maven versions above are set, this is a two step process:
```
mvn package
java -Dspring.profiles.active=<profile> -jar target/capstone-0.0.1-SNAPSHOT.jar
```

### Run from IDE

#### Intellij
Simply import the project into IntelliJ Ultimate. It will be recognized as a Spring Boot project. If prompted, enable automatic Maven imports.

Be sure to point to a Java 11 runtime version.

Also the Spring Boot run configuration for the CapstoneApplication, set the 'Active Profiles' to your first name.

#### Eclipse:
1. from the IDE: 
1. Import Projects
1. Projects from Git
1. Clone URI

or:
from the 'Welcome' :
1. Checkout Projects from Git
1. Clone URI

Either way get you to the Git clone dialog. Enter the URI:
https://github.com/Lumunix/SWENG-Capstone.git
and your credentials.
credentials

Choose Next, Next, choose directory, etc.

When prompted with 'Select a wizard to use for importing projects, 'chose

Using New Project wizard
Hit Next
You'll get a prompt to select Wizard. Just cancel out of everything. At this point the file is in your workspace.

Now you can do:
1. File - Import
1. Maven\Existing Maven Projects
1. Select the directory you chose above. 

Now you should see the project.

Make sure you ahve the Java 11 IDE set:
1. Widow - Prefernces - Java - Installed  JRE's. Click 'Add' to point to a Java 11 JRE
1. Set the Java Exection Envirornent and show in step 2 here: https://stackoverflow.com/a/21279068/1669115

The application should now build property (no errors shown).

To run it choose Run - Run Configurations
1.  Select Maven Build then Click the 'Paper' for 'New Launch Configuration'
1. For 'Base Directory' click 'Workspace' and chose the project directory.
1. Goals should be: clean spring-boot:run
1. The 'Maven Runtime' (bottom) should point to the installed Maven you downloaded above.

On the JRE tab, make sure:
1.  'Runtime JRE' point sto the 'Execution Envriorment' that is Java 11 (set above)
1. for VM arguments, enter: -Dspring.profiles.active=<profile>

