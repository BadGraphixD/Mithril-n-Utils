package bg.mithril.utils.items;

import net.minecraft.block.*;
import net.minecraft.block.cauldron.CauldronBehavior;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class MithrilMoldItem extends Item {

    public MithrilMoldItem(Item.Settings settings) {
        super(settings);
    }

    /*
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        HitResult hitResult = raycast(world, user, RaycastContext.FluidHandling.SOURCE_ONLY);

        if (hitResult.getType() == HitResult.Type.MISS) {
            return TypedActionResult.pass(itemStack);
        }
        else {
            if (hitResult.getType() == HitResult.Type.BLOCK) {
                BlockPos pos = ((BlockHitResult)hitResult).getBlockPos();
                if (!world.canPlayerModifyAt(user, pos)) {
                    return TypedActionResult.pass(itemStack);
                }

                BlockState blockState = world.getBlockState(pos);
                Block block = blockState.getBlock();

                if (block == Blocks.CAULDRON) {
                    int cauldronLevel = blockState.get(CauldronBlock.LEVEL);
                    if (cauldronLevel > 0) {
                        world.playSound(user, pos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.NEUTRAL, 1.0F, 1.0F);

                        Block.dropStack(world, pos.add(.5, .5, .5), new ItemStack(MithrilUtilsItems.MITHRIL_CLUMP));

                        world.setBlockState(pos, blockState.with(CauldronBlock.LEVEL, MathHelper.clamp(cauldronLevel - 1, 0, 3)), 2);
                        world.updateComparators(pos, block);
                        return TypedActionResult.success(pourOut(itemStack, user, new ItemStack(MithrilUtilsItems.MOLD)), world.isClient());
                    }
                }
            }

            return TypedActionResult.pass(itemStack);

        }
    }

    protected ItemStack pourOut(ItemStack itemStack, PlayerEntity playerEntity, ItemStack itemStack2) {
        playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        return ItemUsage.method_30012(itemStack, playerEntity, itemStack2);
    }
    */
}
