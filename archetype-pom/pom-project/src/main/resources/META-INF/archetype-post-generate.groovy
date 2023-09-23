import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

baseDir = Paths.get(request.outputDirectory)
projectDir = baseDir.resolve(request.artifactId)
isModule = Files.exists(baseDir.resolve("pom.xml"))

def removeRootProjectGitHubActions() {
    githubDir = projectDir.resolve(".github")
    workflowsDir = githubDir.resolve("workflows")
    Files.list(workflowsDir).forEach({ file ->
        try {
            Files.deleteIfExists(file)
        } catch (IOException e) {
            throw new RuntimeException(e)
        }
    })
    Files.deleteIfExists workflowsDir
    Files.deleteIfExists githubDir.resolve("toolchains.xml")
    Files.deleteIfExists githubDir
}

def removeRootProjectLaunchers() {
    projectSettings = projectDir.resolve(".settings");
    Files.deleteIfExists projectSettings.resolve(request.artifactId + " - Finish Feature.launch")
    Files.deleteIfExists projectSettings.resolve(request.artifactId + " - Finish Hotfix.launch")
    Files.deleteIfExists projectSettings.resolve(request.artifactId + " - Finish Release.launch")
    Files.deleteIfExists projectSettings.resolve(request.artifactId + " - Start Feature.launch")
    Files.deleteIfExists projectSettings.resolve(request.artifactId + " - Start Hotfix.launch")
    Files.deleteIfExists projectSettings.resolve(request.artifactId + " - Start Release.launch")
    Files.deleteIfExists projectSettings.resolve(request.artifactId + " - Start Support.launch")
    Files.deleteIfExists projectSettings.resolve(request.artifactId + " - Update Version.launch")
}

def removeRootProjectPomConfiguration() {
    projectPom = projectDir.resolve("pom.xml")
    out = Files.readAllLines(projectPom)
    // Remove SCM configuration
    for (int i = 50; i >= 46; i--) {
        out.remove(i);
    }
    // Remove GitHub and Sonar project configuration
    out.remove(40)
    out.remove(39)
    out.remove(38)
    // Remove project URL configuration
    out.remove(26)
    // Fix parent configuration
    for (int i = 16; i >= 8; i--) {
        out.remove(i)
    }
    out.add(3, "")
    Files.write(projectPom, out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)
}

def removeModuleProjectPomConfiguration() {
    projectPom = projectDir.resolve("pom.xml")
    out = Files.readAllLines(projectPom)
    // Fix parent configuration
    out.remove(12)
    out.remove(5)
    Files.write(projectPom, out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)
}

def removeRootProjectDoc() {
    Files.deleteIfExists projectDir.resolve("README.md")
    Files.deleteIfExists projectDir.resolve("CHANGELOG.md")
}

def removeRootProjectSiteConfiguration() {
    siteDesc = projectDir.resolve("src").resolve("site").resolve("site.xml")
    out = Files.readAllLines(siteDesc)
    // Remove skin configuration
    for (int i = 19; i >= 6; i--) {
        out.remove(i)
    }
    Files.write(siteDesc, out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)
}

def removeModuleProjectSiteConfiguration() {
    siteDesc = projectDir.resolve("src").resolve("site").resolve("site.xml")
    out = Files.readAllLines(siteDesc)
    // Remove parent menu
    out.remove(24)
    Files.write(siteDesc, out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)
}

if (isModule) {
    removeRootProjectGitHubActions()
    removeRootProjectLaunchers()
    removeRootProjectPomConfiguration()
    removeRootProjectDoc()
    removeRootProjectSiteConfiguration()
} else {
    removeModuleProjectPomConfiguration()
    removeModuleProjectSiteConfiguration()
}
