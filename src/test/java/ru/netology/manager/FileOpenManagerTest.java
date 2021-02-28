package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {
    private FileOpenManager manager = new FileOpenManager();

    @BeforeEach
    public void before() {
        manager.regNewApp("html", "Google");
        manager.regNewApp("pdf", "Adobe");
        manager.regNewApp("xls", "Excel");
    }

    @Test
    void shouldRegNewApp() {
        Map<String, String> map = new HashMap<>();
        map.put("html", "google");
        map.put("pdf", "adobe");
        map.put("xls", "excel");
        map.put("txt", "notepad");
        assertEquals(map, manager.regNewApp("txt", "notepad"));
    }

    @Test
    void shouldGetNameAppToOpenFile() {
        String expected = "google";
        String actual = String.valueOf(manager.getNameAppToOpenFile("html"));
        assertEquals(expected, actual);
    }

    @Test
    void shouldRemoveAppBindingToSpecificExtension() {
        Map<String, String> map = new HashMap<>();
        map.put("xls", "excel");
        map.put("html", "google");
        Map expected = map;
        Map actual = manager.removeAppBindingToSpecificExtension("pdf");
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetListOfAllRegisteredExtensions() {
        Set<String> expected = Set.of("html", "pdf", "xls");
        Set actual = manager.getListOfAllRegisteredExtensions();
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetListAllApp() {
        List<String> expected = List.of("adobe", "google", "excel");
        ArrayList actual = manager.getListAllApp();
        assertEquals(expected, actual);
    }
}