public class BST {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private static Node root;
    public BST(int[] arr){
        root = createTree(arr, 0, arr.length - 1);

    }
    private Node createTree(int[] arr,int low,int high){
        Node n=new Node();
        if(low<high)
        return null;
        int mid=(low+high)/2;
        n.val=arr[mid];
        n.left=createTree(arr, low, mid-1);
        n.right=createTree(arr, mid+1, high);
        return n;

    }

    public void Display(Node nn){
        if(nn== null) return;
        String s= "";
        s= "<--"+nn.val+"-->";
        if(nn.left!= null)
            s= nn.left.val+s;
        else
            s= "Null "+s;
        
        if(nn.right!= null)
            s+= nn.right.val;
        else
            s+= " Null";
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        BST bst= new BST(arr);
        bst.Display(root);
    }
}
