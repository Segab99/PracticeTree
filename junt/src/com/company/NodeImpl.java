package com.company;

import java.util.ArrayList;
import java.util.List;

public class NodeImpl implements Node {
    private String name;
    private List<NodeImpl> children = new ArrayList<>();

    public NodeImpl(){
    }

    public NodeImpl(String name){

        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Node createNewChildNode(String name) {
        NodeImpl child = new NodeImpl(name);
        children.add(child);
        return child;
    }

    @Override
    public void DeleteNodeByName(String name) {
        for(int i = 0; i < children.size(); i++){
            if ( children.get(i).getName().equals(name) ){
                children.remove(i);
                break;
            }
        }

    }

    @Override
    public void DeleteAllChildren() {
        children.clear();

    }

    @Override
    public Node getChildByName(String childNodeName) {
        for(int i = 0; i < children.size(); i++){
            if ( children.get(i).getName().equals(childNodeName) ){
                return children.get(i);
            }
        }
        return null;
    }
}
