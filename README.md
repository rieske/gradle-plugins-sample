## Example Gradle plugin bundlings

This example explores different ways to bundle a Gradle plugin:
- an externally published plugin - applied by id and version
- a plugin published to a local maven repository - applied by id and version
- a buildSrc plugin applied using its class name
- a buildSrc plugin configured with `java-gradle-plugin` and applied by plugin id
- a plugin from an included JAR file - applied by id

In order to run the sample, first execute the supplied `init.sh` script
- it will build and publish a plugin to a local maven repository as well as build a jar with another plugin.
Then, run `./gradlew` in the root project.
