package home.company.day17;

public class TestDay17 {
    public static void main(String[] args) {
        Day17 day17 = new Day17();
//        day17.add(1, 2);//task1
//        day17.printFloat(1, 2);//task 2 and 3
        int[] arr1 = {1, 2, 3};
        float[] arr2 = {1.1f, 1.2f, 1.3f};
        double[] arr3 = {2.1, 2.2, 2.3};
        System.out.println(day17.print(arr2)); //task 4
        System.out.println(day17.search(arr1));
        System.out.println(day17.search(arr1,1));
        System.out.println(day17.search(arr1,1,1)); // task 5
        System.out.println(day17.area(5,4));//task 6
        System.out.println(day17.max(5,9,9,10));//task 7
        System.out.println(day17.distance(1,2,3,4));
        day17.fahrenheitCelsius(1,1.1f);//task9
        System.out.println(day17.remainder(333,2));//task10
    }
}
