package home.company.day22.task2;

import java.util.Scanner;

public class DefaultStack implements Stack {
    private static final int MAX_SIZE = 5;
    private final  int[] nums ;
    private int index;

    public DefaultStack() {
        this.nums = new int[MAX_SIZE];
    }

    @Override
    public void push(int val) throws StackIndexOutOfBoundsException {
        if (index == MAX_SIZE) {
            throw new StackIndexOutOfBoundsException("index out of bounds");
        } else {
            nums[index++] = val;
        }
    }

    @Override
    public int pop() {
        if (index == 0) {
            throw new EmptyStackException("empty");
        }
        index--;
        return nums[index];
    }

    public static void main(String[] args) throws StackIndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);
        DefaultStack defaultStack = new DefaultStack();
        defaultStack.push(scanner.nextInt());
        defaultStack.push(scanner.nextInt());
        defaultStack.push(scanner.nextInt());
        defaultStack.push(scanner.nextInt());
        defaultStack.push(scanner.nextInt());
        defaultStack.push(scanner.nextInt());
        System.out.println(defaultStack.pop());
    }
}
