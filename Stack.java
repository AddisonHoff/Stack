
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
        T obj = topNode.getObj();
        topNode = topNode.getChild();
        size--;
        return obj;
    }
    
}

//    void push(E element)    //add an element
//    E pop()                 //remove and return the top element
//    boolean isEmpty()
//    int size()
//    E peek()                //look at the top element without removing