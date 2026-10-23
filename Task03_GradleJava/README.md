# Gradle Java Application
### CodeAlpha DevOps Internship · Build Automation

![Java 17](https://img.shields.io/badge/Java-17-ED8B00?style=flat-square)
![Gradle](https://img.shields.io/badge/Gradle-9.8.0-02303A?style=flat-square&logo=gradle&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit_Jupiter-6.0.1-25A162?style=flat-square&logo=junit5&logoColor=white)
![Groovy](https://img.shields.io/badge/Groovy-4298B8?style=flat-square&logo=apachegroovy&logoColor=white)

A small Java command-line application with an automated Gradle build. The project compiles Java source, runs a JUnit test, creates build outputs, and executes the application through the Gradle Wrapper.

[Demo](#demo) · [Tech stack](#tech-stack) · [Quick start](#quick-start) · [Skills demonstrated](#skills-demonstrated)

## Demo

```text
CodeAlpha Gradle Java App
10 + 5 = 15
```

![Java application executed through Gradle](screenshots/gradle-run.png)

## What this project does

- Adds two integers through `App.add(int, int)`.
- Displays a greeting and a sample calculation.
- Uses a Java 17 toolchain.
- Tests addition with positive numbers and a negative/positive pair.
- Uses the committed Gradle Wrapper to select the project's Gradle version.
- Keeps generated build and IDE output out of source control.

## Tech stack

| Technology | Role |
|---|---|
| Java 17 | Application source code |
| Gradle 9.8.0 | Compilation, testing, packaging, and application tasks |
| Groovy DSL | `build.gradle` and `settings.gradle` configuration |
| JUnit Jupiter 6.0.1 | Unit test framework |
| TOML version catalog | Dependency versions in `gradle/libs.versions.toml` |
| Maven Central | Dependency repository |
| PowerShell | Windows development commands |
| Git & GitHub | Version control and project evidence |

The generated build also declares Guava 33.5.0-jre. The current addition demo uses Java's built-in arithmetic and does not call Guava APIs.

## Quick start

### Requirements

- JDK 17 available to the build.
- Git.
- Internet access on the first run to download Gradle and dependencies.

A separate global Gradle installation is unnecessary when using the included Wrapper.

### 1. Clone the repository

```powershell
git clone https://github.com/dayanganganath/CodeAlpha_GradleJava.git
cd CodeAlpha_GradleJava
```

### 2. Build and test

**Windows PowerShell**

```powershell
.\gradlew.bat clean build
```

**Linux / macOS**

```bash
chmod +x gradlew
./gradlew clean build
```

### 3. Run the application

**Windows PowerShell**

```powershell
.\gradlew.bat run
```

**Linux / macOS**

```bash
./gradlew run
```

## Useful Gradle tasks

| Task | Purpose |
|---|---|
| `clean` | Remove generated build output |
| `build` | Compile, run verification, and create build outputs |
| `test` | Execute the JUnit test suite |
| `run` | Execute the Java application |
| `tasks` | List available tasks |

Use a task with `.\gradlew.bat <task>` on Windows or `./gradlew <task>` on Linux/macOS.

## Testing and verification

`AppTest.addsTwoNumbers()` contains **one test with two assertions**:

| Input | Expected result |
|---|---|
| `10, 5` | `15` |
| `-3, 3` | `0` |

The recorded local `clean build` completed with **BUILD SUCCESSFUL**. The application run produced the expected greeting and `10 + 5 = 15`.

![Successful Gradle build](screenshots/gradle-build.png)

After running tests, open `app/build/reports/tests/test/index.html` to inspect the HTML test report. Generated JAR files are under `app/build/libs/`.

## Repository guide

| Path | Purpose |
|---|---|
| `app/src/main/java/com/codealpha/app/App.java` | Application entry point and addition method |
| `app/src/test/java/com/codealpha/app/AppTest.java` | JUnit test |
| `app/build.gradle` | Application plugin, dependencies, toolchain, and test configuration |
| `settings.gradle` | Project configuration |
| `gradle/libs.versions.toml` | Dependency version catalog |
| `gradle/wrapper/` | Wrapper JAR and distribution settings |
| `gradlew` / `gradlew.bat` | Wrapper scripts |
| `screenshots/` | Build and run evidence |

## Skills demonstrated

- Java classes, methods, and command-line output.
- Gradle project initialization and conventional source directories.
- Groovy build configuration and Java toolchains.
- Dependency management with Maven Central and a version catalog.
- Unit testing with JUnit assertions.
- Reproducible build commands through the Gradle Wrapper.
- Build reports and generated artifacts.
- Git tracking and exclusion of generated files.

## Project scope

This is a focused build-automation exercise using a small Java application. The screenshots document a local build; this repository does not currently include a GitHub Actions workflow.

---

Built by [Dayan Ganganath](https://github.com/dayanganganath) as part of the CodeAlpha DevOps Internship.

**More CodeAlpha projects:** [Docker Web Server](https://github.com/dayanganganath/CodeAlpha_DockerWebServer) · [Jenkins Remoting](https://github.com/dayanganganath/CodeAlpha_JenkinsRemoting)
