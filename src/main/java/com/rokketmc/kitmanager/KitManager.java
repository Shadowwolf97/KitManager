package com.rokketmc.kitmanager;

import com.rokketmc.kitmanager.kits.Kit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KitManager {

    private HashMap<String, Kit> kits = new HashMap();

    public Kit getKit(String name) {
        return kits.get(name.toLowerCase());
    }

    public List<Kit> getRedeemableKits(Player player) {
        List<Kit> kit = new ArrayList<Kit>();
        for (Kit k : kits.values()) {
            if (k.canRedeem(player))
                kit.add(k);
        }
        return kit;
    }

    public void addKit(Kit kit) {
        kits.put(kit.getName().toLowerCase(), kit);
    }

}
