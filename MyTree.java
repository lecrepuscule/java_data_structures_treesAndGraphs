class myBinarySearchTree {
  
  BSTNode root;

  public BSTNode insertIterative(int key, Object data){
    if (root == null) {
        root = new BSTNode(key, data);
        return root;
    }
    BSTNode n = root;
    while (n.key != key) {
      if (n.key > key) {
        if (n.left == null) {
            n.left = new BSTNode(key, data); 
            return n.left;
        }
        n = n.left;
      } else {
        if (n.right == null) {
            n.right = new BSTNode(key, data);
            return n.right;
        }
        n = n.right;
      }
    }
    return n;
  }

  public BSTNode search(int key){

  }

  public void delete(int key){

  }

  private class BSTNode{
    int key;
    Object data;
    BSTNode left;
    BSTNode right;
    public BSTNode (int key, Object data, BSTNode left, BSTNode right){
      this.key = key;
      this.data = data;
      this.left = left;
      this.right = right;
    }
    public BSTNode (int key, Object data){
      this.key = key;
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
}