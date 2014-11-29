package com.rokketmc.kitmanager.kits;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PermissionKit extends Kit {

    private String permission;

    public PermissionKit(String name, String permission, ItemStack... items) {
        super(name, items);
        this.permission = permission;
    }

    @Override
    public boolean canRedeem(Player player) {
        return player.hasPermission(permission);
    }

    @Override
    public void awardToPlayer(Player player) {
        if(canRedeem(player)) {
            super.awardToPlayer(player);
        }
    }
}
