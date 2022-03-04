package home.company.day21.task2;

public abstract class Animal {
    public abstract String sound();

    public int info(int weight) {
        return weight;
    }

    public void info(int weight, boolean mammal) {
        System.out.println(weight + " " + mammal);
    }
}
