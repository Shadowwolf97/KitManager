package com.rokketmc.kitmanager;

import com.rokketmc.kitmanager.kits.Kit;

import java.util.HashMap;

public class KitManager {

    private HashMap<String, Kit> kits = new HashMap();
    private static KitManager instance;

    public static Kit getKit(String name) {
        return getKitManager().kits.get(name.toLowerCase());
    }

    public static void addKit(Kit kit) {
        getKitManager().kits.put(kit.getName(), kit);
    }

    private static KitManager getKitManager() {
        if(instance == null)
            instance = new KitManager();
        return instance;
    }
}
