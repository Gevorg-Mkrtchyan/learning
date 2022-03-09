package home.company.day22.task2;

import java.util.Scanner;

public class DefaultStack implements Stack {
    private static final int MAX_SIZE = 5;
    private final int[] nums = new int[MAX_SIZE];
    int index;

    @Override
    public void push(int val) throws StackIndexOutOfBoundsException {
        try {
            if (index >= MAX_SIZE) {
                throw new StackIndexOutOfBoundsException("no");
            }
            index++;
            nums[index - 1] = val;
        } catch (StackIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }

    @Override
    public  int pop() {

        if (index == 0) {
            throw new EmptyStackException("empty");
        } else {
            index--;
        }
        return nums[index];
    }

    public static void main(String[] args) throws StackIndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);
        DefaultStack defaultStack = new DefaultStack();
//        defaultStack.push(scanner.nextInt());
//        defaultStack.push(scanner.nextInt());
//        defaultStack.push(scanner.nextInt());
//        defaultStack.push(scanner.nextInt());
//        defaultStack.push(scanner.nextInt());
//        System.out.println(defaultStack.pop());
    }
}
