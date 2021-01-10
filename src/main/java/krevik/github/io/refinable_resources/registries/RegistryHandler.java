package krevik.github.io.refinable_resources.registries;

import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class RegistryHandler {

    public static void register(){
        BlocksRegistry.registerBlocks();
        ItemsRegistry.registerItems();
    }
}
