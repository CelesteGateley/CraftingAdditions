package net.fluxinc.craftingadditions.utils;

import net.fluxinc.craftingadditions.CraftingAdditions;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class KnowledgeBookUpdater implements Listener {

    private CraftingAdditions instance;
    public KnowledgeBookUpdater(CraftingAdditions inst) {
        this.instance = inst;
    }

    @EventHandler
    public void updateKnowledgeBook(PlayerJoinEvent p) {
        p.getPlayer().discoverRecipes(instance.recipeKeys);
    }
}
