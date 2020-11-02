/*
Addison Hoff
11/1/20
This is a node data structure class.
 */
public class StackNode<T> {
    private T obj;
    private StackNode child;

    public StackNode() {

    }

    public StackNode(T obj, StackNode<T> child) {
        this.obj = obj;
        this.child = child;
    }

    public T getObj() {
       return this.obj;
    }

    public StackNode getChild() {
        return this.child;
    }

    public void setChild(StackNode child) {
        this.child = child;
    }


}