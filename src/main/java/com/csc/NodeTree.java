package com.csc;

public class NodeTree {

    private String name;
    private NodeTree left;  // Reference to the left child
    private NodeTree right; // Reference to the right child


      NodeTree(Squirrel squirrel)
      {
             this.name = squirrel.getName();
             this.left = null;
             this.right = null;
      }  
      public void setleft (NodeTree nodeTree)
      {
        this.left = nodeTree;
      }
      public void setright (NodeTree nodeTree)
      {
        this.right = nodeTree;
      }
      public NodeTree getleft()
      {
        return this.left;
      }
      public NodeTree getright()
      {
        return this.right;
      }
      public String getName() {
        return this.name;
      }
} 

