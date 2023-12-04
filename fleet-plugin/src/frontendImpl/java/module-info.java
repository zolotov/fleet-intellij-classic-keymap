module fleet.keymaps.ijClassic.frontendImpl {
    requires fleet.frontend;
    requires fleet.kernel;
    requires fleet.noria.ui;
    requires fleet.rhizomedb;
    requires fleet.frontend.ui;

    exports fleet.keymaps.ijClassic.frontendImpl;
    provides fleet.kernel.plugins.Plugin with fleet.keymaps.ijClassic.frontendImpl.IntelliJClassicKeymapPlugin;
}