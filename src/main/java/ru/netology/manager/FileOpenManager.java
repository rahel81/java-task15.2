package ru.netology.manager;

import java.util.*;

public class FileOpenManager {
    HashMap<String, String> map = new HashMap<>();

    public Map<String, String> regNewApp(String key, String item) {
        map.put(key.toLowerCase(), item.toLowerCase());
        return map;
    }

    public String getNameAppToOpenFile(String key) {
        String item = map.get(key.toLowerCase());
        return item;
    }

    public Map<String, String> removeAppBindingToSpecificExtension(String key) {
        map.remove(key.toLowerCase());
        return map;
    }

    public Set<String> getListOfAllRegisteredExtensions() {
        Set<String> keySet = map.keySet();
        return keySet;
    }

    public ArrayList<String> getListAllApp() {
        ArrayList<String> value = new ArrayList<>(map.values());
        return value;
    }
}
