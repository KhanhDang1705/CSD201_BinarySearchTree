package bnrtree;

public class BSTree extends TreeNode{
    private TreeNode root;

    public BSTree(TreeNode root) {
        this.root = root;
    }

    public BSTree(int data, TreeNode root) {
        super(data);
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void insert(int data){
        root = insert(root, data);
    }

    public TreeNode insert(TreeNode root, int data){
        if (root == null){
            root = new TreeNode(data);
            return root;
        }
        if (data < root.getData()){
            root.setLeft(insert(root.getLeft(), data));
        } else if (data > root.getData()){
            root.setRight(insert(root.getRight(), data));
        }
        return root;
    }

    public TreeNode search(TreeNode root, int key){
        if (root.getData() == key || root == null){
            return root;
        }
        if (key < root.getData()){
            return search(root.getLeft(), key);
        } else if (key > root.getData()){
            return search(root.getRight(), key);
        }
        return root;
    }
}
