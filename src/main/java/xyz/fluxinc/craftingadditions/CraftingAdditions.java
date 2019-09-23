package xyz.fluxinc.craftingadditions;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.fluxinc.craftingadditions.utils.KnowledgeBookUpdater;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import static xyz.fluxinc.craftingadditions.utils.StaticStorage.*;

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

        processDyes(STAINED_GLASS_TO_DYE, STAINED_GLASS);
        processDyes(STAINED_GLASS_PANE_TO_DYE, STAINED_GLASS_PANE);
        processDyes(TERRACOTTA_TO_DYE, TERRACOTTA);
        processDyes(GLAZED_TERRACOTTA_TO_DYE, GLAZED_TERRACOTTA);
        processDyes(CONCRETE_TO_DYE, CONCRETE);
        processDyes(CONCRETE_POWDER_TO_DYE, CONCRETE_POWDER);


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

        getServer().getPluginManager().registerEvents(new KnowledgeBookUpdater(this), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void processDyes(HashMap<Material, Material> dyeMap, ArrayList<Material> blockList) {
        dyeMap.forEach((block, dye) -> {
            for (Material originBlock : blockList) {
                NamespacedKey nsKey = new NamespacedKey(this, dye.toString() + "_WITH_" + originBlock.toString());
                recipeKeys.add(nsKey);
                ShapedRecipe dyeToBlock = new ShapedRecipe(nsKey, new ItemStack(block, 8));
                dyeToBlock.shape("BBB", "BDB", "BBB");
                dyeToBlock.setIngredient('B', originBlock);
                dyeToBlock.setIngredient('D', dye);
                getServer().addRecipe(dyeToBlock);
            }
        });
    }
}
