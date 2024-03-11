
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bugcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bugcraft.item.TheodonSwordItem;
import net.mcreator.bugcraft.item.TheodonStickItem;
import net.mcreator.bugcraft.item.LapisArmorItem;
import net.mcreator.bugcraft.item.Elf_PissSwordItem;
import net.mcreator.bugcraft.item.Elf_PissShovelItem;
import net.mcreator.bugcraft.item.Elf_PissPickaxeItem;
import net.mcreator.bugcraft.item.Elf_PissHoeItem;
import net.mcreator.bugcraft.item.Elf_PissDustItem;
import net.mcreator.bugcraft.item.Elf_PissAxeItem;
import net.mcreator.bugcraft.item.Elf_PissArmorItem;
import net.mcreator.bugcraft.BugcraftMod;

public class BugcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BugcraftMod.MODID);
	public static final RegistryObject<Item> THEODON_STICK = REGISTRY.register("theodon_stick", () -> new TheodonStickItem());
	public static final RegistryObject<Item> ELF_PISS_ARMOR_HELMET = REGISTRY.register("elf_piss_armor_helmet", () -> new Elf_PissArmorItem.Helmet());
	public static final RegistryObject<Item> ELF_PISS_ARMOR_CHESTPLATE = REGISTRY.register("elf_piss_armor_chestplate", () -> new Elf_PissArmorItem.Chestplate());
	public static final RegistryObject<Item> ELF_PISS_ARMOR_LEGGINGS = REGISTRY.register("elf_piss_armor_leggings", () -> new Elf_PissArmorItem.Leggings());
	public static final RegistryObject<Item> ELF_PISS_ARMOR_BOOTS = REGISTRY.register("elf_piss_armor_boots", () -> new Elf_PissArmorItem.Boots());
	public static final RegistryObject<Item> LAPIS_ARMOR_HELMET = REGISTRY.register("lapis_armor_helmet", () -> new LapisArmorItem.Helmet());
	public static final RegistryObject<Item> LAPIS_ARMOR_CHESTPLATE = REGISTRY.register("lapis_armor_chestplate", () -> new LapisArmorItem.Chestplate());
	public static final RegistryObject<Item> LAPIS_ARMOR_LEGGINGS = REGISTRY.register("lapis_armor_leggings", () -> new LapisArmorItem.Leggings());
	public static final RegistryObject<Item> LAPIS_ARMOR_BOOTS = REGISTRY.register("lapis_armor_boots", () -> new LapisArmorItem.Boots());
	public static final RegistryObject<Item> ELF_PISS_BLOCK = block(BugcraftModBlocks.ELF_PISS_BLOCK);
	public static final RegistryObject<Item> ELF_PISS_ORE = block(BugcraftModBlocks.ELF_PISS_ORE);
	public static final RegistryObject<Item> ELF_PISS_DUST = REGISTRY.register("elf_piss_dust", () -> new Elf_PissDustItem());
	public static final RegistryObject<Item> ELF_PISS_AXE = REGISTRY.register("elf_piss_axe", () -> new Elf_PissAxeItem());
	public static final RegistryObject<Item> ELF_PISS_PICKAXE = REGISTRY.register("elf_piss_pickaxe", () -> new Elf_PissPickaxeItem());
	public static final RegistryObject<Item> ELF_PISS_SWORD = REGISTRY.register("elf_piss_sword", () -> new Elf_PissSwordItem());
	public static final RegistryObject<Item> ELF_PISS_SHOVEL = REGISTRY.register("elf_piss_shovel", () -> new Elf_PissShovelItem());
	public static final RegistryObject<Item> ELF_PISS_HOE = REGISTRY.register("elf_piss_hoe", () -> new Elf_PissHoeItem());
	public static final RegistryObject<Item> THEODON_SWORD = REGISTRY.register("theodon_sword", () -> new TheodonSwordItem());
	public static final RegistryObject<Item> SHITTER_SPAWN_EGG = REGISTRY.register("shitter_spawn_egg", () -> new ForgeSpawnEggItem(BugcraftModEntities.SHITTER, -138213, -11983102, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
