package bg.mithril.utils.features;

import bg.mithril.utils.MithrilUtilsMod;
import bg.mithril.utils.blocks.MithrilUtilsBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class MithrilUtilsFeatures {

    public static ConfiguredFeature<?, ?> MITHRIL_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
        MithrilUtilsBlocks.COLD_MITHRIL_ORE_0.getDefaultState(), 16)).uniformRange(YOffset.fixed(0), YOffset.fixed(5)).spreadHorizontally().repeat(2);
    
    public static void init() { // CONFIGURED_FEATURE_WORLDGEN
        RegistryKey<ConfiguredFeature<?, ?>> mithrilOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, MithrilUtilsMod.id("mithril_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, mithrilOreOverworld.getValue(), MITHRIL_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, mithrilOreOverworld);
    }

}
