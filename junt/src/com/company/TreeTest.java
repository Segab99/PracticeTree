package com.company;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static junit.framework.TestCase.assertEquals;

public class TreeTest {

    @Test
    @DisplayName("Создание дерева")
    public void rootCreation(){
        TreeImpl tree = new TreeImpl();
        tree.createRootNode("1");
        assertEquals("1", tree.getRootNode().getName());
    }

    @Test
    @DisplayName("Создание дерева с параметром")
    public void rootCreationParam(){
        TreeImpl tree = new TreeImpl("1");
        assertEquals("1", tree.getRootNode().getName());
    }



}
