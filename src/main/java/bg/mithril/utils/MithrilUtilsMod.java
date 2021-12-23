package bg.mithril.utils;

import bg.mithril.utils.blocks.MithrilUtilsBlocks;
import bg.mithril.utils.features.MithrilUtilsFeatures;
import bg.mithril.utils.items.MithrilUtilsCauldronBehaviour;
import bg.mithril.utils.items.MithrilUtilsItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public class MithrilUtilsMod implements ModInitializer {

	@Override
	public void onInitialize() {
		MithrilUtilsItems.init();
		MithrilUtilsBlocks.init();
		MithrilUtilsFeatures.init();

		MithrilUtilsCauldronBehaviour.registerBehaviour();
	}

	public static Identifier id(String name) {
		return new Identifier("mithrilutils", name);
	}
}
