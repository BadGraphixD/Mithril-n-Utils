package bg.mithril.utils.items;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PortalCalculatorItem extends Item {
    
    public PortalCalculatorItem(Settings settings) {
        super(settings);
    }
 
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        World world = context.getWorld();
        if (!world.isClient)
            return ActionResult.PASS;
        
        BlockPos pos = context.getBlockPos();
        BlockState state = world.getBlockState(pos);

        if (state.getBlock() == Blocks.NETHER_PORTAL) {

            PlayerEntity player = context.getPlayer();
            boolean inNether = player.world.getRegistryKey().equals(World.NETHER);

            float factor = inNether ? 8F : 0.125F;

            int x = Math.round(pos.getX() * factor);
            int y = Math.round(pos.getY());
            int z = Math.round(pos.getZ() * factor);
            
            Text msg = Text.of("In " + (inNether ? "overworld" : "nether") + ": "
                + Integer.toString(x) + " "
                + Integer.toString(y) + " "
                + Integer.toString(z));

            player.sendMessage(msg, false);
            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }
}

