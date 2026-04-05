# Compiling and running the GUI
- `mkdir -p bin`
- `javac -d bin $(find src/app -name "*.java")`
- `java -cp "bin" app.Main`

# Using the JUnit jar files for running Test cases
- `curl -O https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar`
- `curl -O https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar`
- `curl -O https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.1/junit-platform-console-standalone-1.10.1.jar`
  
# Compiling and running the Test Cases
- `mkdir -p bin`
- `javac -d bin -cp "bin:junit-platform-console-standalone-1.10.1.jar" $(find src/test -name "*.java")`
- `java -Xmx4G -jar junit-platform-console-standalone-1.10.1.jar -cp "bin" --scan-classpath --include-classname=".*" --details=summary`

# Running a simulation using dummy data 
## Option 1:
- Go to `LabDatabase.java`
- Add student, researcher, manager and faculty types
- Add equipment to src.test
- Use headcoordinator credentials inside `HeadLabCoordinator.java`

## Oprion 2:
- Run commands to compile and run GUI
- Use `email`: headcoord@yorku.ca, `password`: MasterAdmin123! on the **Backend Portal**
- Use `email`: student1@yorku.ca, `password`: pass123 for student on the **main portal**
- Use `email`: prof@yorku.ca, `password`: secure456 for faculty on the **main portal**
- Use `email`: manager1@yorku.ca, `password`: managepass for faculty on the **Backend portal**
- **Note** You will need to sign in on both main and Backend portal to approve requests and run a full simulation

# Running State Pattern classes
- `javac StatePatternDemo.java`
- `java StatePatternDemo`

# Running Strategy patterns classes
- `javac StrategyMain.java`
- `java StrategyMain`

# Running Observer Pattern classes
- `javac ObserverPatterntest.java`
- `java ObserverPatterntest`
