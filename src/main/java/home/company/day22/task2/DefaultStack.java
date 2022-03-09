package home.company.day22.task2;

import java.util.Scanner;

public class DefaultStack implements Stack {
    private static final int MAX_SIZE = 5;
    private static int[] nums = new int[MAX_SIZE];
    private int index;

    public DefaultStack(final int[] nums) {
        DefaultStack.nums = nums;
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
        DefaultStack defaultStack = new DefaultStack(new int[5]);
        defaultStack.push(scanner.nextInt());
        defaultStack.push(scanner.nextInt());
        defaultStack.push(scanner.nextInt());
        defaultStack.push(scanner.nextInt());
        defaultStack.push(scanner.nextInt());
        defaultStack.push(scanner.nextInt());
        System.out.println(defaultStack.pop());
    }
}
