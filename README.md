# Root POMs for `orne.dev` Maven projects

This projects provides root POM artifacts to be used as parents by projects
developed by [orne.dev][orne.dev].

## Global root POM

The `dev.orne:root-pom` artifact provides general configuration for
Maven based projects.

Usage:

```xml
<project ...>
...
  <modelVersion>4.0.0</modelVersion>

  <parent>
    <groupId>dev.orne</groupId>
    <artifactId>root-pom</artifactId>
    <version>1.0.0</version>
    <relativePath />
  </parent>
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

## Root POM for Java projects

The `dev.orne:java-root-pom` artifact provides general configuration for
Maven based Java projects.

Usage:

```xml
<project ...>
...
  <modelVersion>4.0.0</modelVersion>

  <parent>
    <groupId>dev.orne</groupId>
    <artifactId>java-root-pom</artifactId>
    <version>1.0.0</version>
    <relativePath />
  </parent>
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
- Pre-release verifications on `pre-release` profile
    - Dependency version upper bound verifications
    - Disallows public API breakage
- Release verifications and configurations on `release` profile
    - Parent release version verification
    - Dependency version upper bound verification
    - Dependency release version verification
    - Disallows public API breakage
    - GPG signing of released artifacts
- Release verifications modifications for mayor version releases on `mayor-release` profile
    - Allows public API breakage

[orne.dev]: https://orne.dev
