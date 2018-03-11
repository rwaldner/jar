
# Simple JAR File with minimal Java output

## Build
```
cd ~/Workspaces/jar
./gradlew jar
```

## Run
### Directly on the command line
```
cd ~/Workspaces/jar
java -cp build/libs/jar.jar Main
```

### Using gradle
```
cd ~/Workspaces/jar
./gradlew run
```

## Run in Docker Container
```
cd ~/Workspaces/class
docker run -v `pwd`:/tmp -it --rm openjdk:8u151-jre-alpine3.7 "/tmp/docker-run.sh"
```
