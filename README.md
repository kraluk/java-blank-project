# java-blank-project

Blank Java maven-based project

## Minimal Requirements

* Java `11` - [download](https://adoptopenjdk.net/)
* maven `3.6.3` - [download](https://maven.apache.org/download.cgi)
* IDE that is compatible with the chosen Java version

## Execution

As [maven-wrapper](https://github.com/takari/maven-wrapper) is used in the project, we can use it to compile the code and execute tests:
```shell
./mvnw test
```
otherwise, a local `maven` installation (that at the end will execute a wrapper) can be used as well:
```shell
mvn test
```