# Read me
The original idea is from  
https://medium.com/@knowledge.cafe/optimize-your-spring-boot-application-with-dynamic-logging-2f20928d1247

To see the effective logging level go to
http://localhost:8080/actuator/loggers/com.colak.springactuatortutorial.controller.LoggersController

To change the effective logging level send POST to
http://localhost:8080/actuator/loggers/com.colak.springactuatortutorial.controller.LoggersController
configuredLevel:TRACE
