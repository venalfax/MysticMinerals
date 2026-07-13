package com.venalfax.mysticminerals.items;

import com.venalfax.mysticminerals.tags.MineralTags;

import net.minecraft.world.item.ToolMaterial;

public class MineralToolTiers {
	
	public static final ToolMaterial RUBY = new ToolMaterial(MineralTags.Blocks.INCORRECT_FOR_MINERAL_TOOL,
			1750, 8.5f, 3.75f, 20, MineralTags.Items.RUBY_REPAIRABLE);
	public static final ToolMaterial SAPPHIRE = new ToolMaterial(MineralTags.Blocks.INCORRECT_FOR_MINERAL_TOOL,
			1678, 9.5f, 3.25f, 17, MineralTags.Items.SAPPHIRE_REPAIRABLE);
	public static final ToolMaterial EMERALD = new ToolMaterial(MineralTags.Blocks.INCORRECT_FOR_MINERAL_TOOL,
			1494, 9.0f, 3.5f, 25, MineralTags.Items.EMERALD_REPAIRABLE);
	public static final ToolMaterial FLINT = new ToolMaterial(MineralTags.Blocks.INCORRECT_FOR_FLINT_TOOL,
			99, 3.0f, 0.75f, 9, MineralTags.Items.FLINT_REPAIRABLE);
	public static final ToolMaterial SHARPENED_FLINT = new ToolMaterial(MineralTags.Blocks.INCORRECT_FOR_SHARPENED_FLINT_TOOL,
			147, 4.75f, 1.5f, 12, MineralTags.Items.SHARPENED_FLINT_REPAIRABLE);
	
}
