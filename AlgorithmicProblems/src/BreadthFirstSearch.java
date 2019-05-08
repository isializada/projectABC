import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
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

        BreadthFirstSearch bf = new BreadthFirstSearch();
        bf.bfs(node1);
    }

    public void bfs(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();

        root.setVisited(true);
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode actual = queue.remove();
            System.out.print(actual + " -> ");
             for(TreeNode node : actual.getChildren()){
                 if(node.getVisited() == null || !node.getVisited()){
                     node.setVisited(true);
                     queue.add(node);
                 }
             }
        }
    }
}
