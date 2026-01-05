public class StackExample {
    
    int top = -1;

    int[] stack = new int[5];

    void push(int value) {

        stack[++top] = value;
    }

    int pop() {

        return stack[top--];
    }

    public static void main(String[] args) {
        

        StackExample s = new StackExample();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
    }
}
