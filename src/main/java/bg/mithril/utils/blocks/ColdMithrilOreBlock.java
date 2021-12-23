package bg.mithril.utils.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ColdMithrilOreBlock extends Block {

    protected BlockState nextMeltingState;

    public ColdMithrilOreBlock(Settings settings, BlockState nextMeltingState) {
        super(settings);
        this.nextMeltingState = nextMeltingState;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int lavaAmount = surroundingLavaAmount(world, pos);
        
        if (world.getDimension().isUltrawarm() || random.nextInt(6) < lavaAmount) {
            this.melt(state, world, pos);
        }

    }

    private int surroundingLavaAmount(World world, BlockPos pos) {
        int amount = 0;

        if (isLava(world, pos.add( 1,  0,  0))) amount++;
        if (isLava(world, pos.add(-1,  0,  0))) amount++;
        if (isLava(world, pos.add( 0,  1,  0))) amount++;
        if (isLava(world, pos.add( 0, -1,  0))) amount++;
        if (isLava(world, pos.add( 0,  0,  1))) amount++;
        if (isLava(world, pos.add( 0,  0, -1))) amount++;

        return amount;
    }

    private boolean isLava(World world, BlockPos pos) {
        return world.getBlockState(pos).getBlock() == Blocks.LAVA;
    }

    protected void melt(BlockState state, World world, BlockPos pos) {
        world.setBlockState(pos, nextMeltingState);
    }
    
}
