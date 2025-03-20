# JakartaEEStarter

This example project should provide a starting point for JakartaEE Web Application development on basis of 
- Primefaces
- JakartaEE 10+
- Tomee 10+

## Startup integrated TomEE Webserver (see [documentation](https://tomee.apache.org/latest/docs/developer/tools/maven/tomee.html) for further hints)
    ````
    mvn clean compile tomee:run
    ````

## Build

For executing a full build execute ``mvn clean site`` that generates e.g. an overview of the PMD test failures beneath other information at ``target/site/pmd.html``
