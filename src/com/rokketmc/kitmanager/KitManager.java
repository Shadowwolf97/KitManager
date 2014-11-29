package com.rokketmc.kitmanager;

import com.rokketmc.kitmanager.kits.Kit;

import java.util.HashMap;

public class KitManager {

    private HashMap<String, Kit> kits = new HashMap();

    public Kit getKit(String name) {
        return kits.get(name.toLowerCase());
    }

    public void addKit(Kit kit) {
        kits.put(kit.getName(), kit);
    }

}
