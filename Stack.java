/*
Addison Hoff
11/1/20
A stack data structure composed of nodes.
*/
public class Stack<T> {
    private int size;
    private StackNode topNode;

    public Stack() {
        topNode = new StackNode();
        size = 0;
    }

    public void push(T obj) {
        this.topNode = new StackNode(obj, this.topNode);
        size++;
    }

    public T pop() {
        T obj = (T) topNode.getObj();
        topNode = topNode.getChild();
        size--;
        return obj;
    }

    public boolean isEmpty() {
        return topNode == null;
    }

    public int size() {
        return size;
    }

    public T peek() {
        return (T) topNode.getObj();
    }
    
}

