public class QueueExample {
    

    int front  =  0, rear = -1;

    int[] queue = new int[5];

    void enqueue(int value) {


        queue[++rear] = value;
    }

    int dequeue() {

        return queue[front++];
    }

    public static void main(String[] args) {
        

        QueueExample q = new QueueExample();
        q.enqueue(10);
        q.enqueue(20);
        System.out.println(q.dequeue());
    }
}
