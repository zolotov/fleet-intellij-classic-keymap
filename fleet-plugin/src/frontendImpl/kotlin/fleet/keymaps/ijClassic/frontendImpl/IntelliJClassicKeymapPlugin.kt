// Remove safely if not needed, the whole `src/frontendImpl` is for demo purposes
// if your plugin has no frontend part (which is rare), remove the `src/frontendImpl` directory
package fleet.keymaps.ijClassic.frontendImpl

import fleet.frontend.keymap.defaultKeymapLoader
import fleet.frontend.keymap.keymap
import fleet.kernel.plugins.*

class IntelliJClassicKeymapPlugin : Plugin<Unit> {
    companion object : Plugin.Key<Unit>

    override val key: Plugin.Key<Unit> = IntelliJClassicKeymapPlugin

    override fun ContributionScope.load(pluginScope: PluginScope) {
        val keymapName = "ij-classic"
        val presentableName = "IntelliJ Classic"

        val module = object {}::class.java.module
        val resourceReader = { path: String -> module.getResourceAsStream(path) }

        val (macosId, macosKeymapLoader) = defaultKeymapLoader(true, keymapName, resourceReader)
        val (pcId, pcKeymapLoader) = defaultKeymapLoader(false, keymapName, resourceReader)

        keymap(id = macosId, isMac = true, presentableName = presentableName) { macosKeymapLoader }
        keymap(id = pcId, isMac = false, presentableName = presentableName) { pcKeymapLoader }
    }
}