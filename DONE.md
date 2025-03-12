# DONE

- Startup integrated TomEE Webserver (see [documentation](https://tomee.apache.org/latest/docs/developer/tools/maven/tomee.html) for further hints)
    ````
    mvn clean compile tomee:run
    ````
- ArchUnit integration to check for the following rules
    - No Usage of java.util.Date
    - No Usage of persistence technology
