package com.rokketmc.kitmanager.kits;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public abstract class Kit {

    protected ItemStack[] items;
    private String name;

    public Kit(String name, ItemStack... is) {
        this.items = is;
        this.name = name;
    }

    public abstract boolean canRedeem(Player player);

    public ItemStack[] getItems() {
        return this.items;
    }

    public void addItem(ItemStack ix) {
        ItemStack[] temp = new ItemStack[items.length + 1];
        for(int i = 0; i < items.length; i++)
            temp[i] = items[i];
        temp[temp.length] = ix;
        items = temp;
    }

    public String getName() {
        return this.name;
    }

    public void awardToPlayer(Player player) {
        player.getInventory().addItem(items);
        player.updateInventory();
    }

}
