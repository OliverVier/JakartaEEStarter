# Fork
This fork serves to create a out-of-box experience for setting up a Jakarta project in multiple 
IDEs (mainly Eclipse and IDEA) and to gather feedback for the main repository.

# JakartaEEStarter

This example project should provide a starting point for JakartaEE Web Application development on basis of 
- Primefaces
- JakartaEE 10+
- Tomee 10+

## Startup embedded TomEE Webserver (see [documentation](https://tomee.apache.org/latest/docs/developer/tools/maven/tomee.html) for further hints)

- Startup a local server for development (hot reloads current project sources)
    ````
    mvn tomee-embedded:run
    ````

## Build

For executing a full build execute ``mvn clean site`` that generates e.g. an overview of the PMD test failures beneath other information at ``target/site/pmd.html``
