package com.company;



public interface Node {

    String getName();
    void setName(String name);
    Node createNewChildNode(String name);
    void DeleteNodeByName(String name);
    void DeleteAllChildren();
    Node getChildByName(String childNodeName);
}
