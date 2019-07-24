package net.fluxinc.craftingadditions;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.Collection;

import static net.fluxinc.craftingadditions.utils.StaticStorage.FURNACE_RECIPE;
import static net.fluxinc.craftingadditions.utils.StaticStorage.SLAB_TO_BLOCK;

public final class CraftingAdditions extends JavaPlugin {
    public Collection<NamespacedKey> recipeKeys;

    @Override
    public void onEnable() {
        recipeKeys = new ArrayList<>();
        SLAB_TO_BLOCK.forEach((slab, block) -> {
            NamespacedKey nsKey = new NamespacedKey(this, slab.toString() + "_BACK_CONVERSION");
            recipeKeys.add(nsKey);
            ShapedRecipe slabToBlock = new ShapedRecipe(nsKey, new ItemStack(block));
            slabToBlock.shape("S", "S");
            slabToBlock.setIngredient('S', slab);
            getServer().addRecipe(slabToBlock);
        });

        /*
         * Furnace Recipe takes 5 Arguments:
         * NamespacedKey (Unique Identifier)
         * Result (ItemStack)
         * Source (Material)
         * XP Granted (0.15 for Charcoal, 0.2 for Cactus, 0.35 for meats)
         * Cooking Time (200 ticks by default)
         */
        FURNACE_RECIPE.forEach((material, result) -> {
            FurnaceRecipe smeltingRecipe = new FurnaceRecipe(
                    new NamespacedKey(this, material.toString() + "_TO_" + result.toString()),
                    new ItemStack(result),
                    material,
                    (float) 0.2,
                    200);
            getServer().addRecipe(smeltingRecipe);
        });



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
