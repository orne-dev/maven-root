# Root POMs for `orne.dev` Maven projects

[![Latest version][maven.central.badge]][maven.central.search]
[![License][project.license.badge]][project.license]
[![Maven site][project.maven.site.badge]][project.maven.site]
[![Latest version Sonar status][sonar.badge.master]][sonar.dashboard.master]

[![Development CI status][github.ci.develop.badge]][github.ci.develop.build]
[![Development Sonar status][sonar.badge.develop]][sonar.dashboard.develop]

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
    <version>1.0.0</version>
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
    <version>1.0.0</version>
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
    <version>1.0.0</version>
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

[orne.dev]: https://orne.dev
[project.license]: http://www.gnu.org/licenses/gpl-3.0.txt
[project.license.badge]: https://img.shields.io/github/license/orne-dev/maven-root
http://www.gnu.org/licenses/gpl-3.0.txt
[project.maven.site]: https://orne-dev.github.io/maven-root/
[project.maven.site.badge]: https://img.shields.io/website?url=https%3A%2F%2Forne-dev.github.io%2Fmaven-root%2F
[github.ci.master.badge]: https://github.com/orne-dev/maven-root/actions/workflows/release.yml/badge.svg?branch=master
[github.ci.master.build]: https://github.com/orne-dev/maven-root/actions/workflows/release.yml
[maven.central.search]: https://search.maven.org/artifact/dev.orne/root-pom
[maven.central.badge]: https://img.shields.io/maven-central/v/dev.orne/root-pom.svg?label=Maven%20Central
[github.ci.develop.badge]: https://github.com/orne-dev/maven-root/actions/workflows/build.yml/badge.svg?branch=develop
[github.ci.develop.build]: https://github.com/orne-dev/maven-root/actions/workflows/build.yml
[sonar.badge.master]: https://sonarcloud.io/api/project_badges/measure?organization=orne-dev&project=dev.orne:root-pom&metric=alert_status&branch=master
[sonar.dashboard.master]: https://sonarcloud.io/dashboard?id=dev.orne:root-pom&branch=master
[sonar.badge.develop]: https://sonarcloud.io/api/project_badges/measure?organization=orne-dev&project=dev.orne:root-pom&metric=alert_status&branch=develop
[sonar.dashboard.develop]: https://sonarcloud.io/dashboard?id=dev.orne:root-pom&branch=develop
