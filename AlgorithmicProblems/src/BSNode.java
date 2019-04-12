import java.util.ArrayList;
import java.util.List;

public class BSNode {
    int data;
    BSNode left;
    BSNode right;
    BSNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    void insert(int data){
        if(data < this.data && this.left != null){
            this.left.insert(data);
        } else if(data < this.data){
            this.left = new BSNode(data);
        } else if(data > this.data && this.right != null){
            this.right.insert(data);
        } else if(data > this.data){
            this.right = new BSNode(data);
        }
    }

    BSNode contains(int data){
        if(this.data == data){
            return this;
        }

        if(data < this.data && this.left != null){
            this.left.contains(data);
        } else if(data > this.data && this.right != null){
            this.right.contains(data);
        }

        return null;
    }

    BSNode getMax(){
        if(this.right != null){
            return this.right.getMax();
        }else{
            return this;
        }
    }

    BSNode getMin(){
        if(this.left != null){
            return this.left.getMin();
        }else{
            return this;
        }
    }

}
