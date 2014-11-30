package com.rokketmc.kitmanager.kits;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BasicKit extends Kit {

    public BasicKit(String name, ItemStack... is) {
        super(name, is);
    }

    @Override
    public boolean canRedeem(Player player) {
        return true;
    }

}
