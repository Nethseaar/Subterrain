package net.minecraft.block.trees;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public abstract class Tree {
   /**
    * Get a {@link net.minecraft.world.gen.feature.ConfiguredFeature} of tree
    */
   @Nullable
   protected abstract ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn);

   public boolean func_225545_a_(IWorld p_225545_1_, ChunkGenerator<?> p_225545_2_, BlockPos p_225545_3_, BlockState p_225545_4_, Random p_225545_5_) {
      ConfiguredFeature<TreeFeatureConfig, ?> configuredfeature = this.getTreeFeature(p_225545_5_);
      if (configuredfeature == null) {
         return false;
      } else {
         p_225545_1_.setBlockState(p_225545_3_, Blocks.AIR.getDefaultState(), 4);
         ((TreeFeatureConfig)configuredfeature.config).forcePlacement();
         if (configuredfeature.place(p_225545_1_, p_225545_2_, p_225545_5_, p_225545_3_)) {
            return true;
         } else {
            p_225545_1_.setBlockState(p_225545_3_, p_225545_4_, 4);
            return false;
         }
      }
   }
}