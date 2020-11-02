/*
Addison Hoff
11/1/20
Tests function of Stack.java.
*/
class main {
    public static void main(String[] args) {
        Stack testStack = new Stack();

        testStack.pop();

        //Expected: true
        System.out.println(testStack.isEmpty());

        testStack.push(1);
        testStack.push(7);
        testStack.push(3);

        //Expected: 3
        System.out.println(testStack.peek());

        //Expected: 3
        System.out.println(testStack.size());

        testStack.pop();

        //Expected: 7
        System.out.println(testStack.peek());




    }
}