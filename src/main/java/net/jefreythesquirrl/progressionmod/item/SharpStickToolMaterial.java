package net.jefreythesquirrl.progressionmod.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.block.Block;


public class SharpStickToolMaterial implements ToolMaterial {
    public static final SharpStickToolMaterial INSTANCE = new SharpStickToolMaterial();

    @Override
    public int getDurability() {
        return 4;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2.0F;
    }

    @Override
    public float getAttackDamage() {
        return 1.0F;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return BlockTags.INCORRECT_FOR_WOODEN_TOOL;
    }


    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.EMPTY;
    }
}
