package com.csc;

public class NodeTree<T> {

  private T data;
  private NodeTree<T> left;  // Reference to the left child
  private NodeTree<T> right; // Reference to the right child

  NodeTree(T data) {
    this.data = data;
    this.left = null;
    this.right = null;
   }
  
      public void setLeft (NodeTree<T> nodeTree)
      {
        this.left = nodeTree;
      }
      public void setRight (NodeTree<T> nodeTree)
      {
        this.right = nodeTree;
      }
      public NodeTree<T> getLeft()
      {
        return this.left;
      }
      public NodeTree<T> getRight()
      {
        return this.right;
      }
      public T getData() {
        return this.data;
      }
} 

