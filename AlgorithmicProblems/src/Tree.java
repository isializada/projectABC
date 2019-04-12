import java.util.ArrayList;
import java.util.List;

class TreeNode {
    Integer data;
    Boolean visited;
    List<TreeNode> children;

    TreeNode(Integer data){
        this.data = data;
        this.children = new ArrayList<>();
    }

    void add(Integer data){
        this.children.add(new TreeNode(data));
    }

    void addChild(TreeNode data){
        this.children.add(data);
    }

    void remove(Integer data){
        this.children.remove(data);
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Boolean getVisited() {
        return visited;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "" + this.data;
    }
}

public class Tree {
    TreeNode root;
    Tree(){
        this.root = null;
    }
}
