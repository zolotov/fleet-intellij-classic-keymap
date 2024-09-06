plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.1.0"

fleetPlugin {
    id = "fleet.keymaps.ijClassic"

    metadata {
        readableName = "IntelliJ Classic Keymap"
        description = "IntelliJ Classic Keymap for Fleet"
    }

    fleetRuntime {
        version = "1.40.82"
        minVersion = "1.40.82"
        maxVersion = "1.40.999"
    }
}
