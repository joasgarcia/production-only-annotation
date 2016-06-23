Grails application that demonstrates AOP concepts

#Requirements
- Grails 2.4.5

#Features
- ```ProductionOnlyInterceptor``` - Intercept all methods annotated with ```@ProductionOnly```. It will only proceed execution if is production environment.

#How to run the project
- ```grails <prod or dev> run-app```
- Browse to ```/message/productionOnly?message=<any message>``` for each environment and check different responses
