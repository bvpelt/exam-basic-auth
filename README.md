# exam-basic-auth
based on [spring io example](https://spring.io/guides/gs/securing-web/) and [spring security](http://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/)  
and [spring security project](http://projects.spring.io/spring-security/)

Voorbeeld van basic authentication met spring-boot.

Doel testen van basic authentication gedrag vanuit webapplicatie en vanuit webservice

Acties
+ download clone
+ build/run app ``` mvn spring:boot run ```
+ start web applicatie via ``` http://localhost:8080/userform ```

# Voorbeelden
```shell
curl -v  -u "user:password"  http://localhost:8080/greeting
```
werkt nog niet!
```
curl -v  -X POST -u "user:password" -F "username=Karel;name=myfile.txt;file=@/home/bvpelt/tmp/coverages.xml" http://localhost:8080/upload
```