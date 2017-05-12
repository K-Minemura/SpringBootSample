echo off
%DEPLOYMENT_SOURCE%\gradlew assemble
cp %DEPLOYMENT_SOURCE%\build\libs\SpringBootSample-0.0.1-SNAPSHOT.jar %HOME%\site\wwwroot\webapps\SpringBootSample.jar
