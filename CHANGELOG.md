# Root POMs for `orne.dev` Maven projects - Changelog

## 0.8.3 - 2025-07-15

### dev.orne:java-root-pom

#### Fixed

- Revert `org.junit-pioneer:junit-pioneer` version back to 1.9.1 to maintain JDK 8 support.
    - Exclude `org.junit.platform:junit-platform-launcher` transitive dependency to prevent
      engine and launcher version misalignment.

## 0.8.2 - 2025-06-14

### dev.orne:root-pom

#### Changed

- Update `license-maven-plugin` to version 2.5.0.
- Update `org.apache.maven.skins:maven-fluido-skin` to version 2.1.0.
- Configure `maven-project-info-reports-plugin` to generate link in license report
  to prevent [ban from gnu.org](https://github.com/mojohaus/license-maven-plugin/issues/626).

### dev.orne:java-root-pom

#### Changed

- Update `org.revapi:revapi-java` to version 0.28.4.

### dev.orne:archetype-root-pom

#### Changed

- Configure `license-maven-plugin` to exclude archetype resources and IT projects references.

### dev.orne:pom-project-archetype

#### Fixed

- Fix Maven site descriptor.

#### Added

- Add Eclipse update license headers launchers.

### dev.orne:java-project-archetype

#### Fixed

- Fix Maven site descriptor.

#### Added

- Add Eclipse update license headers launchers.

### dev.orne:java-module-project-archetype

#### Fixed

- Fix Maven site descriptor.

#### Added

- Add Eclipse update license headers launchers.

## 0.8.1 - 2025-06-07

### dev.orne:pom-project-archetype

#### Fixed

- Update GitHub actions workflows.

### dev.orne:java-project-archetype

#### Fixed

- Update GitHub actions workflows.

### dev.orne:java-module-project-archetype

#### Fixed

- Update GitHub actions workflows.

## 0.8.0 - 2025-06-07

### dev.orne:root-pom

#### Changed

- Update required Maven version to 3.6.3.
- Migrate `dev.orne` namespace publishing to `central.sonatype.com`
- Update `maven-site-plugin` to version 3.21.0.
- Update `org.apache.maven.skins:maven-fluido-skin` to version 2.0.0.

#### Added

- Add `maven.required.version` property to enforce minimum Maven version.
- Add `org.sonatype.central:central-publishing-maven-plugin:0.7.0` plugin configuration.

### dev.orne:java-root-pom

#### Changed

- Update required Maven version to 3.8.1.
- Update `jacoco-maven-plugin` to version 0.8.13. Fixes Java 24 instrumentation.
- Update `ch.qos.logback:logback-classic` to 1.3.15. Fixes CVE-2023-6378.
- Update `org.junit.jupiter:junit-jupiter` to 5.13.1.
- Update `org.junit-pioneer:junit-pioneer` to 2.3.0.

#### Added

- Add `org.eclipse.transformer:transformer-maven-plugin:1.0.0` plugin configuration.
    - Transforms `javax` references to `jakarta` references.

_  _Requires per project plugin activation._

### dev.orne:java-project-archetype

#### Added

- Add Eclipse Java 21 tests launchers.

#### Changed

- Update `maven-archetype-plugin` to version 3.3.1.

### dev.orne:java-module-project-archetype

#### Added

- Add Eclipse Java 21 tests launchers.

## 0.7.0 - 2023-12-03

### dev.orne:java-root-pom

#### Changed

- Update `ch.qos.logback:logback-classic` to 1.3.14. Fixes CVE-2023-6378.
- Update `org.junit.jupiter:junit-jupiter` to 5.10.1.
- Update `org.junit-pioneer:junit-pioneer` to 2.2.0.
- Update Maven plugins to latest versions
- Update `jacoco-maven-plugin` to version 0.8.8. Fixes Java 21 instrumentation.

#### Added

- Add `org.mockito:mockito-junit-jupiter` dependency management.

## 0.6.0 - 2023-09-23

### dev.orne:root-pom

#### Changed

- Simplify URL, SCM and site distribution configuration.

#### Added

- Add `github.namespace.id` property.
- Add `github.project.id` property.
- Add derived `github.project.url` property.
- Add derived `github.page.url` property.
- Add derived `github.scm.url` property.
- Add derived `github.scm.connection` property.
- Add derived `github.scm.connection.dev` property.

### dev.orne:java-root-pom

#### Fixed

- Revert `ch.qos.logback:logback-classic` version back to 1.3.11.

### dev.orne:pom-project-archetype

#### Changed

- Adapt to `root-pom` changes.

#### Added

- Add `toolchains` configuration to GitHub actions.

### dev.orne:pom-project-archetype

#### Changed

- Adapt to `root-pom` changes.

#### Added

- Add `toolchains` configuration to GitHub actions.

### dev.orne:pom-project-archetype

#### Changed

- Adapt to `root-pom` changes.

#### Added

- Add `toolchains` configuration to GitHub actions.

## 0.5.4 - 2023-09-16

### dev.orne:pom-project-archetype

#### Removed

- Remove SCM and URL configuration on module generation.

#### Fixed

- Fix generated SCM configuration.

### dev.orne:pom-project-archetype

#### Removed

- Remove SCM and URL configuration on module generation.

#### Fixed

- Fix generated SCM configuration.

### dev.orne:pom-project-archetype

#### Removed

- Remove SCM and URL configuration on module generation.

#### Fixed

- Fix generated SCM configuration.

## 0.5.3 - 2023-09-16

### dev.orne:root-pom

#### Fixed

- Fix Maven site distribution management.

### dev.orne:java-root-pom

#### Changed

- Update `org.slf4j:slf4j-api` to 2.0.9.
- Update `ch.qos.logback:logback-classic` to 1.4.11.
- Update `org.junit.jupiter:junit-jupiter` to 5.10.0.
- Update `org.junit-pioneer:junit-pioneer` to 2.1.0.
- Update `org.mockito:mockito-core` to 4.11.0.

### dev.orne:pom-project-archetype

#### Added

- Add GitHub workflows.
- Add automatic nested module clean up post-script.

#### Fixed

- Fix Maven site distribution management.
- Fix Sonar project key.
- Fix `.gitignore` and `.gitattributes` generation.

### dev.orne:java-project-archetype

#### Added

- Add GitHub workflows.
- Add Eclipse Java 17 tests launchers.
- Add automatic nested module clean up post-script.

#### Fixed

- Fix Maven site distribution management.
- Fix Sonar project key.
- Fix `.gitignore` and `.gitattributes` generation.

### dev.orne:java-module-project-archetype

#### Added

- Add GitHub workflows.
- Add Eclipse Java 17 tests launchers.
- Add automatic nested module clean up post-script.

#### Fixed

- Fix Maven site distribution management.
- Fix Sonar project key.
- Fix `.gitignore` and `.gitattributes` generation.

## 0.5.2 - 2023-09-09

### dev.orne:java-root-pom

#### Added

- Add `source` configuration option to `javadoc` plugin.

### dev.orne:pom-project-archetype

#### Added

- Add predefined `install.skip` and `deploy.skip` properties.

#### Fixed

- Fix Maven site distribution management.

### dev.orne:java-project-archetype

#### Fixed

- Fix Maven site distribution management.

### dev.orne:java-module-project-archetype

#### Fixed

- Fix Maven site distribution management.

## 0.5.1 - 2022-12-11

### dev.orne:java-root-pom

#### Fixed

- Reverte default dependencies to latest with Java 8 support
    - Update `ch.qos.logback:logback-classic` to version 1.3.5.

## 0.5.0 - 2022-12-10

### dev.orne:root-pom

#### Changed

- Update `maven-clean-plugin` to version 3.2.0.
- Update `maven-help-plugin` to version 3.3.0.
- Update `maven-antrun-plugin` to version 3.1.0.
- Update `maven-resources-plugin` to version 3.3.0.
- Update `org.codehaus.mojo:versions-maven-plugin` to version 2.13.0.
- Update `maven-dependency-plugin` to version 3.4.0.
- Update `maven-enforcer-plugin` to version 3.1.0.
- Update `maven-gpg-plugin` to version 3.0.1.
- Update `maven-assembly-plugin` to version 3.4.2.
- Update `maven-invoker-plugin` to version 3.3.0.
- Update `maven-install-plugin` to version 3.1.0.
- Update `com.amashchenko.maven.plugin:gitflow-maven-plugin` to version 1.19.0.
- Update `maven-deploy-plugin` to version 3.0.0.
- Update `maven-site-plugin` to version 3.12.1.
- Update `org.apache.maven.skins:maven-fluido-skin` to version 1.11.1.
- Update `maven-project-info-reports-plugin` to version 3.4.1.
- Update `org.sonarsource.scanner.maven:sonar-maven-plugin` to version 3.9.1.2184.

### dev.orne:java-root-pom

#### Changed

- Update `maven-toolchains-plugin` to version 3.1.0.
- Update `maven-compiler-plugin` to version 3.10.1.
- Update `maven-surefire-plugin` to version 3.0.0-M7.
- Update `maven-failsafe-plugin` to version 3.0.0-M7.
- Update `jacoco-maven-plugin` to version 0.8.8.
- Update `maven-jar-plugin` to version 3.3.0.
- Update `maven-javadoc-plugin` to version 3.4.1.
- Update `revapi-maven-plugin` to version 0.15.0.
    - Update `org.revapi:revapi-java` to version 0.28.0.
- Update `maven-jxr-plugin` to version 3.3.0.
- Update `maven-surefire-report-plugin` to version 3.0.0-M7.
- Update `org.slf4j:slf4j-api` to version 2.0.5.
- Update `ch.qos.logback:logback-classic` to version 1.4.5.
- Update `org.apiguardian_apiguardian-api` to version 1.1.2.
- Update `org.junit.jupiter:junit-jupiter` to version 5.9.1.
- Update `org.junit-pioneer:junit-pioneer` to version 1.9.1.
- Update `org.mockito:mockito-core` to version 4.9.0.

#### Fixed

- Fix Sonar Jacoco configuration.

### dev.orne:archetype-root-pom

#### Changed

- Update `maven-archetype-plugin` to version 3.2.1.

## 0.4.0 - 2022-10-12

### dev.orne:root-pom

#### Added

- Add `org.apache.maven.plugins:maven-invoker-plugin:3.2.2` plugin configuration.

  _Requires per project plugin activation._

- Add `clean verify` as default Maven goal.

### dev.orne:java-root-pom

#### Changed

- Update `org.revapi:revapi-maven-plugin` to version 0.14.3.
    - Update `org.revapi:revapi-java` to version 0.24.3.
- Update `org.junit.jupiter:junit-jupiter` to version 5.8.1.

#### Added

- Add `org.apache.maven.plugins:maven-toolchains-plugin:3.0.0` plugin configuration.
    - Add `java.jdk.version` property to specify JDK version. Defaults to `${java.version}`.
    - Add `tools` profile to activate `maven-toolchains-plugin`
- Add `jdk-release` profile.
    - Activated automatically on JDK 9 and above.
    - Configures `maven-compiler-plugin` plugin `release` option to `${java.target.version}`.
- Add `jpms-auto-module` profile.
    - Activated when file `src/main/java/module-info.java` is missing.
    - Add property `java.module.name`. Defaults to `${project.groupId}.${project.artifactId}`.
    - Adds entry `Automatic-Module-Name` with value `${java.module.name}` to manifest

### dev.orne:java-module-root-pom

_First release._

### dev.orne:java-project-archetype

#### Changed

- Update `revapi` generated configuration.

#### Added

- Add `logback-test.xml` to generated test resources.

#### Fixed

- Fix Eclipse UT launcher configuration
- Fix Eclipse classpath order.

### dev.orne:java-module-project-archetype

_First release._

## 0.3.0 - 2021-05-30

### dev.orne:pom-project-archetype

_First release._

### dev.orne:java-project-archetype

_First release._

## 0.2.0 - 2021-03-19

### dev.orne:root-pom

#### Changed

- Update `org.apache.maven.plugins:maven-resources-plugin` to version 3.2.0.
- Update `org.codehaus.mojo:versions-maven-plugin` to version 2.8.1.
- Update `org.apache.maven.plugins:maven-assembly-plugin` to version 3.3.0.
- Update `com.amashchenko.maven.plugin:gitflow-maven-plugin` to version 1.15.1.
- Update `org.apache.maven.plugins:maven-project-info-reports-plugin` to version 3.1.1.
- Update `org.apache.maven.plugins:maven-site-plugin` to version 3.9.1.

#### Added

- Add `org.apache.maven.skins:maven-fluido-skin:1.9` version management.
- Add `org.apache.maven.plugins:maven-scm-publish-plugin:3.1.0` plugin configuration.
- Add `org.sonarsource.scanner.maven:sonar-maven-plugin:3.8.0.2131` plugin configuration.
- Add `org.apiguardian:apiguardian-api:1.1.1` dependency management.

#### Removed

- Disable site deployment in favor of `maven-scm-publish-plugin`.

### dev.orne:archetype-root-pom

_First release._

#### Added

- Add `org.apache.maven.plugins:maven-archetype-plugin:3.2.0` plugin configuration.
- Allow empty directories in `maven-resources-plugin` configuration.

### dev.orne:java-root-pom

#### Changed

- Update `org.junit.jupiter:junit-jupiter` to version 5.8.0-M1.
- Update `org.mockito:mockito-core` to version 3.10.0.
- Update `org.apache.maven.plugins:maven-surefire-plugin` to version 3.0.0-M5.
- Update `org.apache.maven.plugins:maven-failsafe-plugin` to version 3.0.0-M5.
- Update `org.apache.maven.plugins:maven-surefire-report-plugin` to version 3.0.0-M5.
- Update `org.jacoco:jacoco-maven-plugin` to version 0.8.6.

#### Added

- Add `org.junit-pioneer:junit-pioneer:1.4.2` dependency management.
- Add `org.revapi:revapi-maven-plugin:0.14.2` plugin configuration.
    - Add `org.revapi:revapi-java:0.24.1` configuration.
    - Publishes `revapi` report.

#### Removed

- Remove `org.codehaus.mojo:clirr-maven-plugin` plugin configuration.

## 0.1.1 - 2020-05-10

### dev.orne:java-root-pom

#### Added

- Add `java.version` property
    - Property `java.source.version` now inherits from `java.version` by default
    - Property `java.target.version` now inherits from `java.version` by default

#### Fixed

- Fix `jacoco-maven-plugin` plugin configuration

## 0.1.0 - 2020-04-28

### dev.orne:root-pom

_First release._

#### Added

- Add `org.apache.maven.plugins:maven-clean-plugin:3.1.0` plugin configuration.
- Add `org.apache.maven.plugins:maven-help-plugin:3.2.0` plugin configuration.
- Add `org.apache.maven.plugins:maven-antrun-plugin:3.0.0` plugin configuration.
- Add `org.apache.maven.plugins:maven-resources-plugin:3.1.0` plugin configuration.
- Add `org.codehaus.mojo:license-maven-plugin:2.0.0` plugin configuration.
- Add `org.codehaus.mojo:versions-maven-plugin:2.7` plugin configuration.
    - Publishes default reports.
- Add `org.apache.maven.plugins:maven-dependency-plugin:3.1.2` plugin configuration.
- Add `org.apache.maven.plugins:maven-enforcer-plugin:3.0.0-M3` plugin configuration.
    - Requires Maven version `3.5.4`.
- Add `org.apache.maven.plugins:maven-gpg-plugin:1.6` plugin configuration.
- Add `org.apache.maven.plugins:maven-assembly-plugin:3.2.0` plugin configuration.
- Add `org.apache.maven.plugins:maven-install-plugin:3.0.0-M1` plugin configuration.
- Add `com.amashchenko.maven.plugin:gitflow-maven-plugin:1.14.0` plugin configuration.
- Add `org.apache.maven.plugins:maven-deploy-plugin:3.0.0-M1` plugin configuration.
- Add `org.apache.maven.plugins:maven-site-plugin:3.9.0` plugin configuration.
- Add `org.apache.maven.plugins:maven-project-info-reports-plugin:3.0.0` plugin configuration.
    - Publishes default reports.
- Add `pre-release` profile.
    - Performs `enforcer:verify`.
        - Allows `SNAPSHOT` parent version.
        - Allows `SNAPSHOT` versions for dependencies with same groupId.
        - Requires non `SNAPSHOT` versions for other dependencies.
        - Requires upper bound dependency versions.
- Add `release` profile.
    - Performs `enforcer:verify`.
        - Requires non `SNAPSHOT` version.
        - Requires non `SNAPSHOT` parent version.
        - Requires non `SNAPSHOT` dependency versions.
        - Requires upper bound dependency versions.
    - Performs `gpg:sign`

### dev.orne:java-root-pom

_First release._

#### Added

- Add `org.slf4j:slf4j-api:1.7.30` dependency management.
- Add `org.slf4j:jcl-over-slf4j:1.7.30` dependency management.
- Add `org.slf4j:jul-to-slf4j:1.7.30` dependency management.
- Add `org.slf4j:log4j-over-slf4j:1.7.30` dependency management.
- Add `ch.qos.logback:logback-classic:1.2.3` dependency management.
- Add `org.junit.jupiterjunit-jupiter:5.6.2` test dependency management.
- Add `org.mockito:mockito-core:3.3.3` test dependency management.
- Add `org.codehaus.mojo:license-maven-plugin:2.0.0` plugin configuration and executions.
    - Performs `license:update-project-license`.
    - Performs `license:add-third-party`.
    - Performs `license:update-file-header`.
- Add `org.apache.maven.plugins:maven-compiler-plugin:3.8.1` plugin configuration.
- Add `org.apache.maven.plugins:maven-surefire-plugin:3.0.0-M4` plugin configuration.
- Add `org.apache.maven.plugins:maven-failsafe-plugin:3.0.0-M4` plugin configuration.
- Add `org.jacoco:jacoco-maven-plugin:0.8.5` plugin configuration.
- Add `org.apache.maven.plugins:maven-jar-plugin:3.2.0` plugin configuration.
    - Publishes `jar` artifact.
- Add `org.apache.maven.plugins:maven-source-plugin:3.2.1` plugin configuration.
    - Publishes `sources` artifact.
- Add `org.apache.maven.plugins:maven-javadoc-plugin:3.2.0` plugin configuration.
    - Publishes `javadoc` artifact.
    - Publishes `javadoc` report.
- Add `org.codehaus.mojo:clirr-maven-plugin:2.8` plugin configuration.
    - Publishes `clirr` report.
- Add `org.apache.maven.plugins:maven-jxr-plugin:3.0.0` plugin configuration.
    - Publishes `jxr:jxr` report.
    - Publishes `jxr:test-jxr` report.
- Add `org.apache.maven.plugins:maven-surefire-report-plugin:3.0.0-M4` plugin configuration.
- Add `ut` profile.
    - Performs `jacoco:prepare-agent`.
    - Performs `surefire:test`.
    - Performs `jacoco:report`.
    - Publishes `surefire-report:report-only` report.
    - Publishes `jacoco:report` report.
- Add `it` profile.
    - Performs `jacoco:prepare-agent-integration`.
    - Performs `failsafe:integration-test`.
    - Performs `failsafe:verify`.
    - Performs `jacoco:report-integration`.
    - Publishes `surefire-report:failsafe-report-only` report.
    - Publishes `jacoco:report-integration` report.
- Add `pre-release` profile.
    - Performs `clirr:check` without failing in errors.
- Add `release` profile.
    - Performs `clirr:check` failing in errors.
- Add `mayor-release` profile.
    - Performs `clirr:check` without failing in errors.
