public class Main {
    public static void main(String[] args) throws ThreeStack.MyEmptyStackException, ThreeStack.NoStackException {
        ThreeStack threeStack = new ThreeStack();

        threeStack.push(1, "\"{name:\"object1\"}\"");
        threeStack.push(1, "\"{name:\"object2\"}\"");
        threeStack.push(2, "\"{name:\"object3\"}\"");
        threeStack.push(2, "\"{name:\"object4\"}\"");
        threeStack.push(2, "\"{name:\"object5\"}\"");
        threeStack.push(3, "\"{name:\"object6\"}\"");
        threeStack.push(3, "\"{name:\"object7\"}\"");


        threeStack.pop(2);
        threeStack.pop(2);
        threeStack.pop(1);
        threeStack.pop(1);
        threeStack.pop(3);
        threeStack.pop(1);
        threeStack.pop(4);
    }
}