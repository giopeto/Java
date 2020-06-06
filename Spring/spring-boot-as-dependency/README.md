# spring-boot-as-dependency

## Setup

- Build app-dependency      
- Install app-dependency jar to local maven repo
    ```
        mvn install:install-file -Dfile=app-dependency\target\app-dependency-0.0.1-SNAPSHOT.jar -DgroupId=com.app-dependency -DartifactId=app-dependency -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar -DgeneratePom=true
    ```
- run app and check info log for message "Hello from AppDepService[AppDependencyApplication]"


- App dependency has additional configuration tag

```
<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<classifier>exec</classifier>
				</configuration>
			</plugin>
		</plugins>
	</build>
```