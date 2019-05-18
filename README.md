# Poll Discussion Project

## Tools Used
- Java (greater than 8)
- Spring Boot
- Postgres

## Getting Started

### Install Spring Boot

#### With Homebrew
If you are on a Mac and use Homebrew, you can install the Spring Boot CLI by using the following commands:
```
$ brew tap pivotal/tap
$ brew install springboot
```

#### Java and Maven
Before we begin, open a terminal and run the following commands to ensure that you have valid versions of Java and Maven installed:
```
$ java -version
java version "1.8.0_102"
Java(TM) SE Runtime Environment (build 1.8.0_102-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.102-b14, mixed mode)
$ mvn -v
Apache Maven 3.5.4 (1edded0938998edf8bf061f1ceb3cfdeccf443fe; 2018-06-17T14:33:14-04:00)
Maven home: /usr/local/Cellar/maven/3.3.9/libexec
Java version: 1.8.0_102, vendor: Oracle Corporation
```

## Run the project

To run the project, do:
```
mvn spring-boot:run
```