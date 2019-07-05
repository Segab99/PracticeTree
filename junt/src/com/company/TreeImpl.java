package com.company;

public class TreeImpl implements Tree {

    public Node rootNode;
    public TreeImpl(){

    }

    public TreeImpl(String rootNodeName){

        rootNode = new NodeImpl(rootNodeName);
    }

    @Override
    public Node createRootNode(String name) {
        rootNode = new NodeImpl(name);
        return rootNode;
    }

    @Override
    public Node getRootNode() {
        return rootNode;
    }
}
