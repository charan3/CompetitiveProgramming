import java.util.*;
public class LargestStack {

    // Complexity Time : O(1), Extra Space : no. of operations on stack.

    Stack<Integer> maxStack = new Stack<>();

    private int max = Integer.MIN_VALUE;

    public void push(Stack s, Integer ele){
        if (maxStack.isEmpty() || maxStack.peek()<=ele) {
            maxStack.push(ele);
        }
        else{
            maxStack.push(maxStack.peek());
        }

        s.push(ele);
    }


    public Integer pop(Stack s){
        Integer temp = null;
        if (!s.isEmpty()) {
            temp = (int)s.pop();
            maxStack.pop();
        }
        return temp;
    }

    public Integer getMax(Stack s){
        if (!s.isEmpty()) {
            return maxStack.peek();
        }
        else {
            return null;
        }
    }


    public static void main(String[] args) {
        LargestStack ls = new LargestStack();
        Stack<Integer> st = new Stack();

        ls.push(st,5);
        System.out.println("Max element is : "+ls.getMax(st));

        ls.push(st,4);
        ls.push(st,7);
        ls.push(st,7);
        ls.push(st,8);
        System.out.println("Max element is : "+ls.getMax(st));
        System.out.println("Popped element is :"+ls.pop(st));
        System.out.println("Max element is : "+ls.getMax(st));
        System.out.println("Popped element is :"+ls.pop(st));
        System.out.println("Max element is : "+ls.getMax(st));
        System.out.println("Popped element is :"+ls.pop(st));
        System.out.println("Max element is : "+ls.getMax(st));
        System.out.println("Popped element is :"+ls.pop(st));


        System.out.println("Max element is : "+ls.getMax(st));

    }
}