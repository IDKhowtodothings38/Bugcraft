
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bugcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.bugcraft.BugcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BugcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BugcraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> BUGCRAFT_CREATIVE_TAB = REGISTRY.register("bugcraft_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bugcraft.bugcraft_creative_tab")).icon(() -> new ItemStack(BugcraftModItems.THEODON_STICK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BugcraftModItems.THEODON_STICK.get());
				tabData.accept(BugcraftModItems.THEODON_SWORD.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(BugcraftModBlocks.ELF_PISS_BLOCK.get().asItem());
			tabData.accept(BugcraftModBlocks.ELF_PISS_ORE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(BugcraftModItems.ELF_PISS_ARMOR_HELMET.get());
			tabData.accept(BugcraftModItems.ELF_PISS_ARMOR_CHESTPLATE.get());
			tabData.accept(BugcraftModItems.ELF_PISS_ARMOR_LEGGINGS.get());
			tabData.accept(BugcraftModItems.ELF_PISS_ARMOR_BOOTS.get());
			tabData.accept(BugcraftModItems.LAPIS_ARMOR_HELMET.get());
			tabData.accept(BugcraftModItems.LAPIS_ARMOR_CHESTPLATE.get());
			tabData.accept(BugcraftModItems.LAPIS_ARMOR_LEGGINGS.get());
			tabData.accept(BugcraftModItems.LAPIS_ARMOR_BOOTS.get());
			tabData.accept(BugcraftModItems.ELF_PISS_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(BugcraftModItems.SHITTER_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(BugcraftModItems.ELF_PISS_DUST.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BugcraftModItems.ELF_PISS_AXE.get());
			tabData.accept(BugcraftModItems.ELF_PISS_PICKAXE.get());
			tabData.accept(BugcraftModItems.ELF_PISS_SHOVEL.get());
			tabData.accept(BugcraftModItems.ELF_PISS_HOE.get());
		}
	}
}
