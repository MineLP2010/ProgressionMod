package net.jefreythesquirrl.progressionmod.item;

import net.jefreythesquirrl.progressionmod.ProgressionMod;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.minecraft.item.TridentItem.ATTACK_DAMAGE;

public class ModItems {
    public static final Item STONE_PEBBLE = registerItem("stone_pebble", new Item(new Item.Settings()));
    public static final Item SHARP_STICK = registerItem(
            "sharp_stick",
            new PickaxeItem(SharpStickToolMaterial.INSTANCE, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ProgressionMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ProgressionMod.LOGGER.info("Registering Mod Items for "+ ProgressionMod.MOD_ID);


    }
}
