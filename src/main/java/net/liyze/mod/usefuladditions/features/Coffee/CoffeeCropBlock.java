package net.liyze.mod.usefuladditions.features.Coffee;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.NotNull;

import static net.liyze.mod.usefuladditions.UsefulAdditions.*;
import static net.liyze.mod.usefuladditions.features.Coffee.Blocks.COFFEE_SEED;

public class CoffeeCropBlock extends CropBlock {
    private static final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[]{Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 1.5D, 12.0D),
            Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 4.0D, 12.0D),
            Block.createCuboidShape(3.0D, 0.0D, 3.0D, 13.0D, 6.5D, 13.0D),
            Block.createCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 9.0D, 14.0D),
            Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 11.5D, 15.0D),
            Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
            Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.5D, 16.0D)
    };

    public CoffeeCropBlock(Settings settings) {
        super(settings);
        if (cfg.enableCoffee)
            Registry.register(Registry.BLOCK, new Identifier(ID, "coffee_block"), this.asBlock());
    }

    @Override
    public ItemConvertible getSeedsItem() {
        return COFFEE_SEED;
    }

    @Override
    public VoxelShape getOutlineShape(@NotNull BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return AGE_TO_SHAPE[state.get(this.getAgeProperty())];
    }
}
