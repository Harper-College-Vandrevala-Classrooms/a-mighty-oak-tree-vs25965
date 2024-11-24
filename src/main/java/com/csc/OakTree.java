package com.csc;

public class OakTree {
  public static void main(String[] args) {
    
    Squirrel squirrel1 = new Squirrel("Filip");
    NodeTree Node1 = new NodeTree(squirrel1);

    Squirrel squirrel2 = new Squirrel("Jimmy");
    NodeTree Node2 = new NodeTree(squirrel2);
    Squirrel squirrel3 = new Squirrel("Billy");
    NodeTree Node3 = new NodeTree(squirrel3);

    Node1.setleft(Node3);
    Node1.setright(Node2);
    
    NodeTree retrievedLeft = Node1.getleft();
    NodeTree retrievedRight = Node1.getright();

    System.out.println("Root squirrel: " + Node1.getName());
    System.out.println("Left squirrel: " + retrievedLeft.getName());
    System.out.println("Right squirrel: " + retrievedRight.getName());
  }
}
