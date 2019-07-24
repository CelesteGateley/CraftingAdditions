package net.fluxinc.craftingadditions.utils;

import org.bukkit.Material;

import java.util.HashMap;

public class StaticStorage {
    /**
     * Value 1: Slab
     * Value 2: Full Block
     */
    public static HashMap<Material, Material> SLAB_TO_BLOCK;
    static {
        SLAB_TO_BLOCK = new HashMap<>();
        SLAB_TO_BLOCK.put(Material.OAK_SLAB, Material.OAK_PLANKS);
        SLAB_TO_BLOCK.put(Material.SPRUCE_SLAB, Material.SPRUCE_PLANKS);
        SLAB_TO_BLOCK.put(Material.BIRCH_SLAB, Material.BIRCH_PLANKS);
        SLAB_TO_BLOCK.put(Material.JUNGLE_SLAB, Material.JUNGLE_PLANKS);
        SLAB_TO_BLOCK.put(Material.ACACIA_SLAB, Material.ACACIA_PLANKS);
        SLAB_TO_BLOCK.put(Material.DARK_OAK_SLAB, Material.DARK_OAK_PLANKS);
        SLAB_TO_BLOCK.put(Material.STONE_SLAB, Material.STONE);
        SLAB_TO_BLOCK.put(Material.SMOOTH_STONE_SLAB, Material.SMOOTH_STONE);
        SLAB_TO_BLOCK.put(Material.SANDSTONE_SLAB, Material.SANDSTONE);
        SLAB_TO_BLOCK.put(Material.CUT_SANDSTONE_SLAB, Material.CUT_SANDSTONE);
        SLAB_TO_BLOCK.put(Material.COBBLESTONE_SLAB, Material.COBBLESTONE);
        SLAB_TO_BLOCK.put(Material.BRICK_SLAB, Material.BRICKS);
        SLAB_TO_BLOCK.put(Material.STONE_BRICK_SLAB, Material.STONE_BRICKS);
        SLAB_TO_BLOCK.put(Material.NETHER_BRICK_SLAB, Material.NETHER_BRICKS);
        SLAB_TO_BLOCK.put(Material.QUARTZ_SLAB, Material.QUARTZ_BLOCK);
        SLAB_TO_BLOCK.put(Material.RED_SANDSTONE_SLAB, Material.RED_SANDSTONE);
        SLAB_TO_BLOCK.put(Material.CUT_RED_SANDSTONE_SLAB, Material.CUT_RED_SANDSTONE);
        SLAB_TO_BLOCK.put(Material.PURPUR_SLAB, Material.PURPUR_BLOCK);
        SLAB_TO_BLOCK.put(Material.PRISMARINE_SLAB, Material.PRISMARINE);
        SLAB_TO_BLOCK.put(Material.DARK_PRISMARINE_SLAB, Material.DARK_PRISMARINE);
        SLAB_TO_BLOCK.put(Material.PRISMARINE_BRICK_SLAB, Material.PRISMARINE_BRICKS);
        SLAB_TO_BLOCK.put(Material.GRANITE_SLAB, Material.GRANITE);
        SLAB_TO_BLOCK.put(Material.POLISHED_GRANITE_SLAB, Material.POLISHED_GRANITE);
        SLAB_TO_BLOCK.put(Material.ANDESITE_SLAB, Material.ANDESITE);
        SLAB_TO_BLOCK.put(Material.POLISHED_ANDESITE_SLAB, Material.POLISHED_ANDESITE);
        SLAB_TO_BLOCK.put(Material.DIORITE_SLAB, Material.DIORITE);
        SLAB_TO_BLOCK.put(Material.POLISHED_DIORITE_SLAB, Material.POLISHED_DIORITE);
        SLAB_TO_BLOCK.put(Material.MOSSY_STONE_BRICK_SLAB, Material.MOSSY_STONE_BRICKS);
        SLAB_TO_BLOCK.put(Material.MOSSY_COBBLESTONE_SLAB, Material.MOSSY_COBBLESTONE);
        SLAB_TO_BLOCK.put(Material.END_STONE_BRICK_SLAB, Material.END_STONE_BRICKS);
        SLAB_TO_BLOCK.put(Material.SMOOTH_SANDSTONE_SLAB, Material.SMOOTH_SANDSTONE);
        SLAB_TO_BLOCK.put(Material.SMOOTH_QUARTZ_SLAB, Material.SMOOTH_QUARTZ);
        SLAB_TO_BLOCK.put(Material.RED_NETHER_BRICK_SLAB, Material.RED_NETHER_BRICKS);
        SLAB_TO_BLOCK.put(Material.SMOOTH_RED_SANDSTONE_SLAB, Material.SMOOTH_RED_SANDSTONE);
    }

    public static HashMap<Material, Material> FURNACE_RECIPE;
    static {
        FURNACE_RECIPE = new HashMap<>();
        FURNACE_RECIPE.put(Material.ROTTEN_FLESH, Material.LEATHER);
    }


}
