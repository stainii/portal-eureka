# portal-eureka
[![Build Status](https://server.stijnhooft.be/jenkins/buildStatus/icon?job=portal-eureka/master)](https://server.stijnhooft.be/jenkins/job/portal-eureka/job/master/)

Spring cloud Eureka server, used for service discovery.

## Environment variables
| Name | Example value | Description | Required? |
| ---- | ------------- | ----------- | -------- |
| JAVA_OPTS_EUREKA | -Xmx400m -Xms400m | Java opts you want to pass to the JVM | optional

### Release
#### Maven release
To release a module, this project makes use of the JGitflow plugin.
More information can be found [here](https://gist.github.com/lemiorhan/97b4f827c08aed58a9d8).

At the moment, releases are made on a local machine. No Jenkins job has been made (yet).

#### Docker release
A Docker release is made, by running `mvn clean deploy` on the Maven release branch.
