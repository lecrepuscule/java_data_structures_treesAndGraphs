class myBinarySearchTree<T implements Comparable<T>> implements Iterable<T>{
  BSTNode<T> root;

  public void insertIterative(Comparable key, AnyType data){

  }

  public BSTNode search(int key){

  }

  public void delete(int key){

  }

  private class BSTNode<T>{
    Comparable<T> key;
    BSTNode left;
    BSTNode right;
    public BSTNode(Comparable<T> key, Anytype data, BSTNode left, BSTNode right){
      this.key = key;
      this.data = data;
      this.left = left;
      this.right = right;
    }
    public BSTNode(Comparable<T> key, Anytype data){
      this.key = key;
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
}