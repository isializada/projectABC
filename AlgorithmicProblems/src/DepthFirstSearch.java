import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class DepthFirstSearch {
    public static void main(String[] args){
        System.out.println("Ismail's code");
        System.out.println();

        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node9 = new TreeNode(9);

        node1.addChild(node3);
        node1.addChild(node4);
        node4.addChild(node7);
        node3.addChild(node6);
        node3.addChild(node9);

        DepthFirstSearch df = new DepthFirstSearch();
        df.dfsRecursion(node1);
    }

    public void dfsRecursion(TreeNode node){
        node.setVisited(true);
        System.out.print(node.data + "->");

        for(TreeNode nodeIns : node.children){
            if(nodeIns.getVisited() == null || !nodeIns.getVisited()){
                dfsRecursion(nodeIns);
            }
        }
    }
}
