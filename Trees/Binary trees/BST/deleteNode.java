public class deleteNode {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    public static Node DeleteNode(Node root,int val){
        if(root.data<val){
            root.right=DeleteNode(root.right,val);
        }else if(root.data>val){
            root.left=DeleteNode(root.left,val);
        }else{//voila case
            //case1-leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            //case2-single child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            //case3-two children
            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=DeleteNode(root.right, IS.data);
        }
        return root;

    }

    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void dfs(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        dfs(node.left);   
        dfs(node.right);   
    }
    public static void main(String args[]){
        Node root=new Node(5);
        root.left=new Node(3);
        root.right=new Node(7);
        root.left.left=new Node(2);
        root.left.right=new Node(4);
        root.right.left=new Node(6);
        root.right.right=new Node(9);

        DeleteNode(root,9);

        dfs(root); 
    }
}
