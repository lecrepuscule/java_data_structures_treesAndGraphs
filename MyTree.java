class myTree{
  public void insert(int key){

  }

  public BSTNode search(int key){

  }

  public void delete(int key){

  }

  private class BSTNode{
    Comparable key;
    BSTNode left;
    BSTNode right;
    public BSTNode(Comparable key, Anytype data, BSTNode left, BSTNode right){
      this.key = key;
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }
}