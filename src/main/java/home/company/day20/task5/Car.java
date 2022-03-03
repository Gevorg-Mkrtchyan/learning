package home.company.day20.task5;

public abstract class Car {
    protected byte seats;
    protected int horsepower;
    protected int maxSpeed;
    protected int wheel;
    protected String nameOfMark;

    public byte getSeats() {
        return seats;
    }

    public void setSeats(byte seats) {
        this.seats = seats;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getNameOfMark() {
        return nameOfMark;
    }

    public void setNameOfMark(String nameOfMark) {
        this.nameOfMark = nameOfMark;
    }

    protected abstract void speed();
    protected abstract void cost();

}
