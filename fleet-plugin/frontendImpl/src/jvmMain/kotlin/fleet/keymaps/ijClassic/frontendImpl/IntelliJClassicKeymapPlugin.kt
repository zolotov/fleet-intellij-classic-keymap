package fleet.keymaps.ijClassic.frontendImpl

import fleet.frontend.keymap.KeymapId
import fleet.frontend.keymap.KeymapOS
import fleet.frontend.keymap.registerKeymap
import fleet.kernel.plugins.*

class IntelliJClassicKeymapPlugin : Plugin<Unit> {
    companion object : Plugin.Key<Unit>

    override val key: Plugin.Key<Unit> = IntelliJClassicKeymapPlugin

    override fun ContributionScope.load(pluginScope: PluginScope) {
        val keymapId = KeymapId("ij-classic")
        val presentableName = "IntelliJ Classic"

        registerKeymap(id = keymapId, supportedOS = setOf(KeymapOS.MACOS), presentableName = presentableName)
    }
}
