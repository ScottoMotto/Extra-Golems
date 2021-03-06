package com.golems.blocks;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockUtility extends Block
{
	public static final AxisAlignedBB SINGULAR_AABB = new AxisAlignedBB(0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D);

	public BlockUtility()
	{
		super(Material.AIR);
		setDefaultState(blockState.getBaseState());
		setTickRandomly(false);
		blockHardness = -1F;
		this.translucent = true;
	}
	
	@Nullable
	@Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos)
    {
        return NULL_AABB;
    }
/*
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return NULL_AABB;
	}

	@Override
	public AxisAlignedBB getSelectedBoundingBox(IBlockState blockState, World worldIn, BlockPos pos)
	{
		return SINGULAR_AABB;
	}
*/
	@Override
	public boolean isFullyOpaque(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullBlock(IBlockState state)
	{
		return false;
	}

	/**
	 * Used to determine ambient occlusion and culling when rebuilding chunks for render
	 */
	 @Override
	 public boolean isOpaqueCube(IBlockState state)
	 {
		 return false;
	 }

	 @Override
	 public boolean canCollideCheck(IBlockState state, boolean hitIfLiquid)
	 {
		 return false;
	 }

	 /**
	  * Spawns this Block's drops into the World as EntityItems.
	  */
	 @Override
	 public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
	 {
	 }

	 /**
	  * Whether this Block can be replaced directly by other blocks (true for e.g. tall grass)
	  */
	 @Override
	 public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos)
	 {
		 return true;
	 }

	 @Override
	 public boolean isFullCube(IBlockState state)
	 {
		 return false;
	 }

	 @Override
	 public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	 {
		 return true;
	 }

	 @Override
	 public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	 {
		 return getDefaultState();
	 }

	 @Override
	 public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
	 {
		 return;
	 }

	 @Override
	 public IBlockState getStateFromMeta(int meta)
	 {
		 return getDefaultState();
	 }

	 @Override
	 public int getMetaFromState(IBlockState state)
	 {
		 return 0;
	 }

	 @Override
	 public EnumBlockRenderType getRenderType(IBlockState state)
	 {
		 return EnumBlockRenderType.INVISIBLE;
	 }

	 @Override
	 @SideOnly(Side.CLIENT)
	 public BlockRenderLayer getBlockLayer()
	 {
		 return BlockRenderLayer.CUTOUT;
	 }

	 @Override
	 public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
	 {
		 return;
	 }

	 @Override
	 public void onLanded(World worldIn, Entity entityIn)
	 {
		 return;
	 }

	 @Override
	 protected BlockStateContainer createBlockState()
	 {
		 return new BlockStateContainer(this, new IProperty[0]);
	 }
}