package DS.Tree;

public class BinarySearchTree {

  private Node root;

  private void insertNode(int ele) {
    handleInsert(root, ele);
  }

  private void handleInsert(Node root, int ele) {

    if(root == null) {
      this.root = new Node(ele);
      return;
    }
    if(ele < root.getData())
      if(root.getLeft() == null)
        root.setLeft(new Node(ele));
      else
        handleInsert(root.getLeft(), ele);

    else
      if(root.getRight() == null)
        root.setRight(new Node(ele));
      else
        handleInsert(root.getRight(), ele);
  }


  private void deleteNode(int ele) {

    if(root == null)
      return;

    if(root.getData() == ele)
      if(root.getLeft() == null && root.getRight() == null) {
        root = null;
        System.out.println(ele + " deleted !");
        return;
      }

    root = handleDelete(root, ele);
  }


  private Node handleDelete(Node root, int ele) {

    if(root == null) {
      System.out.println(ele + " not found !");
      return null;
    }

    if(root.getData() == ele) {
      if(root.getLeft() == null && root.getRight() == null) {
        System.out.println(ele + " deleted !");
        return null;
      }
      if(root.getRight() == null) {
        root = root.getLeft();
        System.out.println(ele + " deleted !");
        return root;
      }
      if(root.getLeft() == null) {
        root = root.getRight();
        System.out.println(ele + " deleted !");
        return root;
      }
      if(root.getLeft() != null && root.getRight() != null) {
        Node tempNode = root.getRight();
        Node tempLeftNode = tempNode;
        while(tempLeftNode.getLeft() != null) {
          tempLeftNode = tempLeftNode.getLeft();
        }
        tempLeftNode.setLeft(root.getLeft());

        root = tempNode;
        System.out.println(ele + " deleted !");
        return root;
      }
    }
    else if(ele < root.getData()) {
      root.setLeft(handleDelete(root.getLeft(), ele));
      return root;
    }
    else if(ele > root.getData()) {
      root.setRight(handleDelete(root.getRight(), ele));
      return root;
    }

    return root;
  }


  private void serachElement(int ele) {

    int searchValidate = handleSearch(root, ele);
    if (searchValidate == -1)
      System.out.println("Search ele " + ele + " not found");
    else
      System.out.println("Search ele " + ele + " found");
  }

  private int handleSearch(Node root, int ele) {

    if(root == null) {
      return -1;
    }
    else {
      if(ele == root.getData())
        return 1;
      else if(ele < root.getData())
        return handleSearch(root.getLeft(), ele);
      else
        return handleSearch(root.getRight(), ele);
    }
  }


  private void treeTraversalBFS() {
    int breadth = findBreadth(root);
    for(int i=0; i<breadth; i++)
      printElementsBFS(root, i);
    System.out.println();
  }

  private int findBreadth(Node root) {

    if(root == null)
      return 0;
    return 1 + Math.max(findBreadth(root.getLeft()), findBreadth(root.getRight()));
  }

  private void printElementsBFS(Node root, int level) {

    if(root == null)
      return;
    if(level == 0)
      System.out.print(root.getData() + " ");
    if(level > 0) {
      printElementsBFS(root.getLeft(), level-1);
      printElementsBFS(root.getRight(), level-1);
    }
  }


  private void treeTraversalPreOrderDFS() {
    preOrderHelper(root);
    System.out.println();
  }

  private void preOrderHelper(Node root) {

    if(root != null) {
      System.out.print(root.getData() + " ");
      preOrderHelper(root.getLeft());
      preOrderHelper(root.getRight());
    }
  }


  private void treeTraversalInOrderDFS() {
    inOrderHelper(root);
    System.out.println();
  }

  private void inOrderHelper(Node root) {
    if(root != null) {
      inOrderHelper(root.getLeft());
      System.out.print(root.getData() + " ");
      inOrderHelper(root.getRight());
    }
  }


  private void treeTraversalPostOrderDFS() {
    postOrderHelper(root);
    System.out.println();
  }

  private void postOrderHelper(Node root) {
    if(root != null) {
      postOrderHelper(root.getLeft());
      postOrderHelper(root.getRight());
      System.out.print(root.getData() + " ");
    }
  }


  public static void main(String args[]) {

    BinarySearchTree searchTree = new BinarySearchTree();
    searchTree.insertNode(11);
    searchTree.insertNode(7);
    searchTree.insertNode(9);
    searchTree.insertNode(5);
    searchTree.insertNode(13);
    searchTree.insertNode(15);
    searchTree.insertNode(12);
    searchTree.insertNode(16);
    searchTree.insertNode(14);
    searchTree.insertNode(10);
    searchTree.insertNode(8);
    searchTree.insertNode(1);

    searchTree.deleteNode(130);
    searchTree.serachElement(150);

//elements used to thoroughly test tree traversal
//    searchTree.insertNode(15);
//    searchTree.insertNode(8);
//    searchTree.insertNode(20);
//    searchTree.insertNode(5);
//    searchTree.insertNode(12);
//    searchTree.insertNode(11);
//    searchTree.insertNode(13);
//    searchTree.insertNode(10);
//    searchTree.insertNode(9);

    System.out.println("BFS");
    searchTree.treeTraversalBFS();

    System.out.println("DFS PreOrder");
    searchTree.treeTraversalPreOrderDFS();

    System.out.println("DFS InOrder");
    searchTree.treeTraversalInOrderDFS();

    System.out.println("DFS PostOrder");
    searchTree.treeTraversalPostOrderDFS();
  }
}
