package krevik.github.io.refinable_resources.registries;

import krevik.github.io.refinable_resources.RefinableResources;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlocksRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RefinableResources.MOD_ID);

    public static void registerBlocks(){
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
