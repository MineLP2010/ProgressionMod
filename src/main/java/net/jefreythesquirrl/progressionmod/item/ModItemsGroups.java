package net.jefreythesquirrl.progressionmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jefreythesquirrl.progressionmod.ProgressionMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroups {
    public static final ItemGroup PROGRESSION_MOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ProgressionMod.MOD_ID, "progression_mod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SHARP_STICK))
                    .displayName(Text.translatable("itemgroup.progressionmodprogression_mod_items_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SHARP_STICK);
                        entries.add(ModItems.STONE_PEBBLE);

                    }).build());

    public static void registerItemGroups() {
        ProgressionMod.LOGGER.info("Registering Item Groups for " + ProgressionMod.MOD_ID);
    }
}
