# 0.5.0

## :package: dev.orne:java-root-pom

01. :bug: Fixed Sonar Jacoco configuration.

# 0.4.0

## :package: dev.orne:root-pom

01. :gift: Added `org.apache.maven.plugins:maven-invoker-plugin:3.2.2` managed configuration.

    Requires per project plugin activation.

01. :gift: Added `clean verify` as default Maven goal.

## :package: dev.orne:java-root-pom

01. :gift: Added `org.apache.maven.plugins:maven-toolchains-plugin:3.0.0` configuration.
    01. Added `java.jdk.version` property to specify JDK version. Defaults to `${java.version}`.
    01. Added `tools` profile to activate `maven-toolchains-plugin`
01. :gift: Added `jdk-release` profile.
    01. Activated automatically on JDK 9 and above.
    01. Configures `maven-compiler-plugin` plugin `release` option to `${java.target.version}`.
01. :gift: Added `jpms-auto-module` profile.
    01. Activated when file `src/main/java/module-info.java` is missing.
    01. Added property `java.module.name`. Defaults to `${project.groupId}.${project.artifactId}`.
    01. Adds entry `Automatic-Module-Name` with value `${java.module.name}` to manifest

01. :wrench: Updated `org.revapi:revapi-maven-plugin` to version 0.14.3.
    01. :gift: Added `org.revapi:revapi-java` to version 0.24.3.
01. :wrench: Updated `org.junit.jupiter:junit-jupiter` to version 5.8.1.

## :package: dev.orne:java-module-root-pom

01. :gift: Created module.

## :package: dev.orne:java-project-archetype

01. :gift: Added `logback-test.xml` to generated test resources.
01. :bug: Fixed Eclipse UT launcher configuration
01. :gift: Updated `revapi` generated configuration.

## :package: dev.orne:java-project-archetype

01. :bug: Fixed Eclipse classpath order.

## :package: dev.orne:java-module-project-archetype

01. :gift: Created module.

# 0.3.0

## :package: dev.orne:pom-project-archetype

01. :gift: Created module.

## :package: dev.orne:java-project-archetype

01. :gift: Created module.

# 0.2.0

## :package: dev.orne:root-pom

01. :wrench: Updated `org.apache.maven.plugins:maven-resources-plugin` to version 3.2.0.
01. :wrench: Updated `org.codehaus.mojo:versions-maven-plugin` to version 2.8.1.
01. :wrench: Updated `org.apache.maven.plugins:maven-assembly-plugin` to version 3.3.0.
01. :wrench: Updated `com.amashchenko.maven.plugin:gitflow-maven-plugin` to version 1.15.1.
01. :wrench: Updated `org.apache.maven.plugins:maven-project-info-reports-plugin` to version 3.1.1.
01. :wrench: Updated `org.apache.maven.plugins:maven-site-plugin` to version 3.9.1.
    01. Added `org.apache.maven.skins:maven-fluido-skin:1.9` version management.
    01. Disabled site deployment in favor of `maven-scm-publish-plugin`.
01. :gift: Added `org.apache.maven.plugins:maven-scm-publish-plugin:3.1.0` configuration.
01. :gift: Added `org.sonarsource.scanner.maven:sonar-maven-plugin:3.8.0.2131` configuration.
01. :gift: Added `org.apiguardian:apiguardian-api:1.1.1` dependency management.

## :package: dev.orne:archetype-root-pom

01. :gift: Created module.
01. :gift: Added `org.apache.maven.plugins:maven-archetype-plugin:3.2.0` configuration.
01. :gift: Allowed empty directories in `maven-resources-plugin` configuration.

## :package: dev.orne:java-root-pom

01. :wrench: Updated `org.junit.jupiter:junit-jupiter` to version 5.8.0-M1.
01. :wrench: Updated `org.mockito:mockito-core` to version 3.10.0.
01. :wrench: Updated `org.apache.maven.plugins:maven-surefire-plugin` to version 3.0.0-M5.
01. :wrench: Updated `org.apache.maven.plugins:maven-failsafe-plugin` to version 3.0.0-M5.
01. :wrench: Updated `org.apache.maven.plugins:maven-surefire-report-plugin` to version 3.0.0-M5.
01. :wrench: Updated `org.jacoco:jacoco-maven-plugin` to version 0.8.6.
01. :gift: Added `org.junit-pioneer:junit-pioneer:1.4.2` dependency management.
01. :gift: Added `org.revapi:revapi-maven-plugin:0.14.2` configuration.
    01. Added `org.revapi:revapi-java:0.24.1` configuration.
    01. Publishes `revapi` report.
    01. :boom: Removed `org.codehaus.mojo:clirr-maven-plugin` configuration.

# 0.1.1 (2020-05-10)

## :package: dev.orne:java-root-pom

01. :gift: Added `java.version` property
    01. Property `java.source.version` now inherits from `java.version` by default
    01. Property `java.target.version` now inherits from `java.version` by default
01. :bug: Fixed `jacoco-maven-plugin` configuration

# 0.1.0 (2020-04-28)

## :package: dev.orne:root-pom

01. :gift: Added `org.apache.maven.plugins:maven-clean-plugin:3.1.0` configuration.
01. :gift: Added `org.apache.maven.plugins:maven-help-plugin:3.2.0` configuration.
01. :gift: Added `org.apache.maven.plugins:maven-antrun-plugin:3.0.0` configuration.
01. :gift: Added `org.apache.maven.plugins:maven-resources-plugin:3.1.0` configuration.
01. :gift: Added `org.codehaus.mojo:license-maven-plugin:2.0.0` configuration.
01. :gift: Added `org.codehaus.mojo:versions-maven-plugin:2.7` configuration.
    01. Publishes default reports.
01. :gift: Added `org.apache.maven.plugins:maven-dependency-plugin:3.1.2` configuration.
01. :gift: Added `org.apache.maven.plugins:maven-enforcer-plugin:3.0.0-M3` configuration.
    01. :wrench: Requires Maven version `3.5.4`.
01. :gift: Added `org.apache.maven.plugins:maven-gpg-plugin:1.6` configuration.
01. :gift: Added `org.apache.maven.plugins:maven-assembly-plugin:3.2.0` configuration.
01. :gift: Added `org.apache.maven.plugins:maven-install-plugin:3.0.0-M1` configuration.
01. :gift: Added `com.amashchenko.maven.plugin:gitflow-maven-plugin:1.14.0` configuration.
01. :gift: Added `org.apache.maven.plugins:maven-deploy-plugin:3.0.0-M1` configuration.
01. :gift: Added `org.apache.maven.plugins:maven-site-plugin:3.9.0` configuration.
01. :gift: Added `org.apache.maven.plugins:maven-project-info-reports-plugin:3.0.0` configuration.
    01. Publishes default reports.
01. :gift: Added `pre-release` profile.
    01. Performs `enforcer:verify`.
        01. Allows `SNAPSHOT` parent version.
        01. Allows `SNAPSHOT` versions for dependencies with same groupId.
        01. Requires non `SNAPSHOT` versions for other dependencies.
        01. Requires upper bound dependency versions.
01. :gift: Added `release` profile.
    01. Performs `enforcer:verify`.
        01. Requires non `SNAPSHOT` version.
        01. Requires non `SNAPSHOT` parent version.
        01. Requires non `SNAPSHOT` dependency versions.
        01. Requires upper bound dependency versions.
    01. Performs `gpg:sign`

## :package: dev.orne:java-root-pom

01. :gift: Added `org.slf4j:slf4j-api:1.7.30` dependency management.
01. :gift: Added `org.slf4j:jcl-over-slf4j:1.7.30` dependency management.
01. :gift: Added `org.slf4j:jul-to-slf4j:1.7.30` dependency management.
01. :gift: Added `org.slf4j:log4j-over-slf4j:1.7.30` dependency management.
01. :gift: Added `ch.qos.logback:logback-classic:1.2.3` dependency management.
01. :gift: Added `org.junit.jupiterjunit-jupiter:5.6.2` test dependency management.
01. :gift: Added `org.mockito:mockito-core:3.3.3` test dependency management.
01. :gift: Added `org.codehaus.mojo:license-maven-plugin` executions.
    01. Performs `license:update-project-license`.
    01. Performs `license:add-third-party`.
    01. Performs `license:update-file-header`.
01. :gift: Added `org.apache.maven.plugins:maven-compiler-plugin:3.8.1` configuration.
01. :gift: Added `org.apache.maven.plugins:maven-surefire-plugin:3.0.0-M4` configuration.
01. :gift: Added `org.apache.maven.plugins:maven-failsafe-plugin:3.0.0-M4` configuration.
01. :gift: Added `org.jacoco:jacoco-maven-plugin:0.8.5` configuration.
01. :gift: Added `org.apache.maven.plugins:maven-jar-plugin:3.2.0` configuration.
    01. Publishes `jar` artifact.
01. :gift: Added `org.apache.maven.plugins:maven-source-plugin:3.2.1` configuration.
    01. Publishes `sources` artifact.
01. :gift: Added `org.apache.maven.plugins:maven-javadoc-plugin:3.2.0` configuration.
    01. Publishes `javadoc` artifact.
    01. Publishes `javadoc` report.
01. :gift: Added `org.codehaus.mojo:clirr-maven-plugin:2.8` configuration.
    01. Publishes `clirr` report.
01. :gift: Added `org.apache.maven.plugins:maven-jxr-plugin:3.0.0` configuration.
    01. Publishes `jxr:jxr` report.
    01. Publishes `jxr:test-jxr` report.
01. :gift: Added `org.apache.maven.plugins:maven-surefire-report-plugin:3.0.0-M4` configuration.
01. :gift: Added `ut` profile.
    01. Performs `jacoco:prepare-agent`.
    01. Performs `surefire:test`.
    01. Performs `jacoco:report`.
    01. Publishes `surefire-report:report-only` report.
    01. Publishes `jacoco:report` report.
01. :gift: Added `it` profile.
    01. Performs `jacoco:prepare-agent-integration`.
    01. Performs `failsafe:integration-test`.
    01. Performs `failsafe:verify`.
    01. Performs `jacoco:report-integration`.
    01. Publishes `surefire-report:failsafe-report-only` report.
    01. Publishes `jacoco:report-integration` report.
01. :gift: Added `pre-release` profile.
    01. Performs `clirr:check` without failing in errors.
01. :gift: Added `release` profile.
    01. Performs `clirr:check` failing in errors.
01. :gift: Added `mayor-release` profile.
    01. Performs `clirr:check` without failing in errors.

