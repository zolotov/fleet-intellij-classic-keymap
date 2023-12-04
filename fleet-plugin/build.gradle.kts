plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.20"
    id("org.jetbrains.fleet-plugin") version "0.3.120"
}

repositories {
    mavenCentral()
    // needed to retrieve `rhizomedb-compiler-plugin` and `noria-compiler-plugin`
    maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
}

version = "0.1.0"

// `fleetPlugin` DSL documentation (for JetBrains internal use only until release)
// https://jetbrains.team/p/ij/repositories/intellij/files/fleet/build/fleet-sdk-gradle-plugin/README.md#dsl
fleetPlugin {
     id = "fleet.keymaps.ijClasic"

     metadata {
         readableName = "IntelliJ Classic Keymap"
         description = "IntelliJ Classic Keymap for Fleet"
     }

    fleetRuntime {
        version = "1.27.192"
    }
}
