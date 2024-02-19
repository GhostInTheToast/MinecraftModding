package ghostinthetoast.minecraftmodding.core;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static ghostinthetoast.minecraftmodding.MinecraftModding.MOD_ID;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static final RegistryObject<Block> MOD_BLOCK = BLOCKS.register("mod_block", () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)));

}
