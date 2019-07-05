package com.company;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static junit.framework.TestCase.assertEquals;

public class NodeTest {

    @Test
    @DisplayName("Добавление узла")
    public void CreateNewChildNodeTest(){
        NodeImpl rootNode = new NodeImpl("1");
        rootNode.createNewChildNode("1.1");
        Node childNode = rootNode.getChildByName("1.1");
        assertEquals("1.1", childNode.getName());
    }

    @Test
    @DisplayName("Удаление узла")
    public void DelChildTest(){
        NodeImpl rootNode = new NodeImpl("1");
        rootNode.createNewChildNode("1.1");
        rootNode.DeleteNodeByName("1.1");
        Node childNode = rootNode.getChildByName("1.1");
        assertEquals(null, childNode);
    }

    @Test
    @DisplayName("Изменение имени")
    public void ChangeNodeNameTest(){
        NodeImpl rootNode = new NodeImpl("1");
        rootNode.setName("1new");
        assertEquals("1new", rootNode.getName());
    }

    @Test
    @DisplayName("Удаление дерева")
    public void DelAllTest(){
        NodeImpl rootNode = new NodeImpl("1");
        rootNode.createNewChildNode("1.1");
        rootNode.DeleteAllChildren();

        assertEquals(null, rootNode.getChildByName("1.1"));
    }
}
