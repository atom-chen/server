@echo off

cd ..\
call ./gradlew build
Xcopy  config  build\distributions\config /s /e /y /i
Xcopy  script\docker  build\distributions /s /e /y /i

docker build -t lyzt_server build\distributions 

echo build compelte !!!!
pause