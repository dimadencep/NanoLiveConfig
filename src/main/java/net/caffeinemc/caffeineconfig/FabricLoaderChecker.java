package net.caffeinemc.caffeineconfig;

public class FabricLoaderChecker {
    public static final boolean HAS_FABRIC_LOADER = hasFabricLoader();

    private static boolean hasFabricLoader() {
        try {
            Class.forName("net.fabricmc.loader.api.FabricLoader");

            return true;
        } catch (Throwable throwable) {
            return false;
        }
    }
}
