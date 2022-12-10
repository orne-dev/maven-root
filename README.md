# Root POMs for `orne.dev` Maven projects

[![Latest version](https://img.shields.io/maven-central/v/dev.orne/root-pom.svg?label=Maven%20Central)](https://search.maven.org/artifact/dev.orne/root-pom)
[![License](https://img.shields.io/github/license/orne-dev/maven-root)](http://www.gnu.org/licenses/gpl-3.0.txt)
[![Maven site](https://img.shields.io/website?url=https%3A%2F%2Forne-dev.github.io%2Fmaven-root%2F)](https://orne-dev.github.io/maven-root/)
[![Latest version Sonar status](https://sonarcloud.io/api/project_badges/measure?organization=orne-dev&project=orne-dev_maven-root&metric=alert_status&branch=master)](https://sonarcloud.io/dashboard?id=orne-dev_maven-root&branch=master)

[![Development CI status](https://github.com/orne-dev/maven-root/actions/workflows/build.yml/badge.svg?branch=develop)](https://github.com/orne-dev/maven-root/actions/workflows/build.yml)
[![Development Sonar status](https://sonarcloud.io/api/project_badges/measure?organization=orne-dev&project=orne-dev_maven-root&metric=alert_status&branch=develop)](https://sonarcloud.io/dashboard?id=orne-dev_maven-root&branch=develop)

This projects provides root POM artifacts to be used as parents by projects
developed by [orne.dev][orne.dev].

For project details see [Maven site][project.maven.site].

## Global root POM

The `dev.orne:root-pom` artifact provides general configuration for
Maven based projects.

Usage:

```xml
<project ...>
...
  <parent>
    <groupId>dev.orne</groupId>
    <artifactId>root-pom</artifactId>
    <version>RELEASE</version>
    <relativePath />
  </parent>
...
  <packaging>pom</packaging>
...
</project>
```

Provides the next features:

- Version management
- License management
- Pre-release verifications on `pre-release` profile
    - Dependency version upper bound verification
    - Dependency release version verification
- Release verifications and configurations on `release` profile
    - Parent release version verification
    - Dependency version upper bound verification
    - Dependency release version verification
    - GPG signing of released artifacts
- Automatic Maven site publishing in `gh-pages` branch

## Root POM for Java projects

The `dev.orne:java-root-pom` artifact provides general configuration for
Maven based Java projects.

Usage:

```xml
<project ...>
...
  <parent>
    <groupId>dev.orne</groupId>
    <artifactId>java-root-pom</artifactId>
    <version>RELEASE</version>
    <relativePath />
  </parent>
...
  <packaging>jar</packaging>
...
</project>
```

Provides the next features:

- Version management
- License management
    - Automatic update of source files headers
- Unit tests execution configuration on `ut` profile
    - Automatic unit test execution
    - Automatic unit test coverage reports
- Integration tests execution configuration on `it` profile
    - Automatic integration test execution
    - Automatic integration test coverage reports
- API compatibility automatic checks based on `revapi` and `apiguardian`
- Pre-release verifications on `pre-release` profile
    - Dependency version upper bound verifications
- Release verifications and configurations on `release` profile
    - Parent release version verification
    - Dependency version upper bound verification
    - Dependency release version verification
    - GPG signing of released artifacts
- Automatic Maven site publishing in `gh-pages` branch

## Root POM for Maven archetype projects

The `dev.orne:archetype-root-pom` artifact provides general configuration
for Maven archetype projects.

Usage:

```xml
<project ...>
...
  <modelVersion>4.0.0</modelVersion>

  <parent>
    <groupId>dev.orne</groupId>
    <artifactId>archetype-root-pom</artifactId>
    <version>RELEASE</version>
    <relativePath />
  </parent>
...
  <packaging>maven-archetype</packaging>
...
</project>
```

Provides the next features:

- Version management
- License management
- Pre-release verifications on `pre-release` profile
    - Dependency version upper bound verification
    - Dependency release version verification
- Release verifications and configurations on `release` profile
    - Parent release version verification
    - Dependency version upper bound verification
    - Dependency release version verification
    - GPG signing of released artifacts
- Maven archetypes packaging and testing
- Automatic Maven site publishing in `gh-pages` branch

## Archetype for POM projects and modules

The `dev.orne:pom-project-archetype` artifact provides a basic archetype
for generation of projects or modules base en POM `dev.orne:root-pom`.

Usage:


```shell
mvn archetype:generate                              \
      -DarchetypeGroupId=dev.orne                   \
      -DarchetypeArtifactId=pom-project-archetype   \
      -DarchetypeVersion=RELEASE                    \
      -DgroupId=<my.groupid>                        \
      -DartifactId=<my-artifactId>
```

## Archetype for Java projects and modules

The `dev.orne:java-project-archetype` artifact provides a basic archetype
for generation of projects or modules base en POM `dev.orne:java-root-pom`.

Usage:


```shell
mvn archetype:generate                              \
      -DarchetypeGroupId=dev.orne                   \
      -DarchetypeArtifactId=java-project-archetype  \
      -DarchetypeVersion=RELEASE                    \
      -DgroupId=<my.groupid>                        \
      -DartifactId=<my-artifactId>
```

[orne.dev]: https://orne.dev
[project.maven.site]: https://orne-dev.github.io/maven-root/
