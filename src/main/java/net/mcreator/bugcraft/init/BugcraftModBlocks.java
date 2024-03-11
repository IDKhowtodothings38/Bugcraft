
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bugcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bugcraft.block.Elf_PissOreBlock;
import net.mcreator.bugcraft.block.Elf_PissBlockBlock;
import net.mcreator.bugcraft.BugcraftMod;

public class BugcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BugcraftMod.MODID);
	public static final RegistryObject<Block> ELF_PISS_BLOCK = REGISTRY.register("elf_piss_block", () -> new Elf_PissBlockBlock());
	public static final RegistryObject<Block> ELF_PISS_ORE = REGISTRY.register("elf_piss_ore", () -> new Elf_PissOreBlock());
}
