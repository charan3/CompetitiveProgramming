
import java.util.Stack;

public class QueueTwoStacks<T> {

    Stack<T> inStack = new Stack();
    Stack<T> outStack = new Stack();
    

    public T deQueue(){
        T temp = null;
        if(!inStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
            if (!outStack.isEmpty())
                temp = outStack.pop();
            while (!outStack.isEmpty()) {
                inStack.push(outStack.pop());
            }
        }
        else
        {
            System.out.println("Queue is empty");
        }
        return temp;
    }

    public void enQueue(T x){
        inStack.push(x);
    }


    public static void main(String[] args) {

        QueueTwoStacks<Integer> q = new QueueTwoStacks();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        System.out.println(q.deQueue());

        q.enQueue(4);
        q.enQueue(8);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());






    }
}