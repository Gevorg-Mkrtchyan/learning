package home.company.day18;

/**
 * 3.Write a Triangle class which `
 * -        has a sideA, sideB, sideC
 * -        write getters and setters for that
 * all sides must be in range 1 - 20
 * -        define constructor
 * -        also your class must have an isTriangleValid() private method.
 * -        and also a public check() method which will get as a parameter triangle object
 * and will call isValidTriangle() method.
 * <p>
 * -        also add a method which will check if your triangle is right or not.
 * -        if the triangle count square else count perimeter.
 * -        use method overloading
 */
public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    private Triangle() {

    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 1 || sideA > 20) {
            System.out.println("invalid parameter sideA");
        } else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 1 || sideB > 20) {
            System.out.println("invalid parameter sideB");
        } else {
            this.sideB = sideB;
        }
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC < 1 || sideC > 20) {
            System.out.println("invalid parameter sideC");
        } else {
            this.sideC = sideC;
        }
    }

    private boolean isTriangleValid() {
        return ((sideA + sideB) > sideC || ((sideA + sideC) > sideB) || (sideC + sideB) > sideA);
    }


    public boolean check(Triangle triangle) {
        return isTriangleValid();
    }

    private int isArea() {
        if (sideA * sideA == sideB * sideB + sideC * sideC || sideC == sideB) {
            return 1; // true , if sideA
        } else if (sideB * sideB == sideC * sideC + sideA * sideA || sideC == sideA) {
            return 2;// true , if sideB
        } else if (sideC * sideC == sideB * sideB + sideA * sideA || sideB == sideA) {
            return 3;// true if sideC
        } else {
            return -1;
        }
    }

    public int perimeter() {
        int isSquare = isArea();
        int perimeter = 0;
        switch (isSquare) {
            case 1:
                perimeter = 2 * sideB + 2 * sideC;
                break;
            case 2:
                perimeter = 2 * sideC + 2 * sideA;
                break;
            case 3:
                perimeter = 2 * sideB + 2 * sideA;
                break;
            default:
                System.out.println("triangle count is not area");
        }
        return perimeter;
    }


}
