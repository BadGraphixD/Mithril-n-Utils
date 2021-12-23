package bg.mithril.utils.blocks;

import bg.mithril.utils.MithrilUtilsMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class MithrilUtilsBlocks {

    public static final Block MITHRIL_ORE = new MithrilOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(50.0F, 1200.0F)
        .allowsSpawning(MithrilUtilsBlocks::never).breakByTool(FabricToolTags.PICKAXES, 4));
    public static final Block COLD_MITHRIL_ORE_1 = new ColdMithrilOreBlock(FabricBlockSettings.of(Material.STONE).strength(-1.0F, 3600000.0F)
        .dropsNothing().ticksRandomly().sounds(BlockSoundGroup.STONE).requiresTool().allowsSpawning(MithrilUtilsBlocks::never), MITHRIL_ORE.getDefaultState());
    public static final Block COLD_MITHRIL_ORE_0 = new ColdMithrilOreBlock(FabricBlockSettings.of(Material.STONE).strength(-1.0F, 3600000.0F)
        .dropsNothing().ticksRandomly().sounds(BlockSoundGroup.STONE).requiresTool().allowsSpawning(MithrilUtilsBlocks::never), COLD_MITHRIL_ORE_1.getDefaultState());
        
    public static final Block MITHRIL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(50.0F, 1200.0F)
        .sounds(BlockSoundGroup.NETHERITE).breakByTool(FabricToolTags.PICKAXES, 4));

    public static void init() {
        Registry.register(Registry.BLOCK, MithrilUtilsMod.id("cold_mithril_ore_0"), COLD_MITHRIL_ORE_0);
        Registry.register(Registry.BLOCK, MithrilUtilsMod.id("cold_mithril_ore_1"), COLD_MITHRIL_ORE_1);
        Registry.register(Registry.BLOCK, MithrilUtilsMod.id("mithril_ore"), MITHRIL_ORE);
        Registry.register(Registry.BLOCK, MithrilUtilsMod.id("mithril_block"), MITHRIL_BLOCK);
    }
    
    private static Boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return false;
    }
    
}
