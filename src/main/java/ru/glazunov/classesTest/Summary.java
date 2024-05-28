package ru.glazunov.classesTest;

public class Summary {
    private int a;
    private int b;

    public Summary(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum() throws IncorrectNum{
        if (a != 3){
            throw new IncorrectNum("Введено неправильное число");
        }
        return a + b;
    }
}
