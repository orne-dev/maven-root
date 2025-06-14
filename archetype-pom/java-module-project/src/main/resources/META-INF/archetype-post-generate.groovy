/*-
 * #%L
 * Orne Java 9+ Module Project Archetype
 * %%
 * Copyright (C) 2019 - 2025 Orne Developments
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */
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
    Files.deleteIfExists projectSettings.resolve(request.artifactId + " - Update License Headers.launch")
    Files.deleteIfExists projectSettings.resolve(request.artifactId + " - Update Version.launch")
}

def removeRootProjectPomConfiguration() {
    // NOP
}

def removeModuleProjectPomConfiguration() {
    projectPom = projectDir.resolve("pom.xml")
    out = Files.readAllLines(projectPom)
    // Fix project URL configuration
    out.remove(20)
    out.add(20, "  <url>\${github.page.url}</url>")
    Files.write(projectPom, out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)
}

def removeRootProjectDoc() {
    Files.deleteIfExists projectDir.resolve("README.md")
    Files.deleteIfExists projectDir.resolve("CHANGELOG.md")
}

def removeRootProjectSiteConfiguration() {
    siteDesc = projectDir.resolve("src").resolve("site").resolve("site.xml")
    out = Files.readAllLines(siteDesc)
    // NOP
    Files.write(siteDesc, out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)
}

def removeModuleProjectSiteConfiguration() {
    siteDesc = projectDir.resolve("src").resolve("site").resolve("site.xml")
    out = Files.readAllLines(siteDesc)
    // Remove inherited menus
    out.remove(25)
    out.remove(24)
    out.remove(23)
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
