# exam-basic-auth

Voorbeeld van basic authentication met spring-boot.

Doel testen van basic authentication gedrag vanuit webapplicatie en vanuit webservice

Acties
1 download clone
2 build/run app mvn spring:boot run
3 start web applicatie via http://localhost:8080/userform

# Voorbeelden
curl -v  -u "user:password"  http://localhost:8080/greeting

werkt nog niet!
curl -v  -X POST -u "user:password" -F "username=Karel;name=myfile.txt;file=@/home/bvpelt/tmp/coverages.xml" http://localhost:8080/upload
