package com.csc;

public class OakTree {
    public static void main(String[] args) {
        
        Squirrel squirrel1 = new Squirrel("Filip");
        NodeTree<Squirrel> node1 = new NodeTree<>(squirrel1);

        Squirrel squirrel2 = new Squirrel("Jimmy");
        NodeTree<Squirrel> node2 = new NodeTree<>(squirrel2);
        Squirrel squirrel3 = new Squirrel("Billy");
        NodeTree<Squirrel> node3 = new NodeTree<>(squirrel3);

        node1.setLeft(node3);
        node1.setRight(node2);
        
        NodeTree<Squirrel> retrievedLeft = node1.getLeft();
        NodeTree<Squirrel> retrievedRight = node1.getRight();

        System.out.println("Root squirrel: " + node1.getData().getName());
        System.out.println("Left squirrel: " + retrievedLeft.getData().getName());
        System.out.println("Right squirrel: " + retrievedRight.getData().getName());
    }
}
