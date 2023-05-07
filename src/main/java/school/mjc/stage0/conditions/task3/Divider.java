package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        int div5 = number%5;
        int div11 = number%11;
        if (number==0) {
            System.out.println("cannot divide by zero");
        }
        else if (div5==0 && div11==0) {
            System.out.println("Dividable");
        }
        else {
            System.out.println("Non-dividable");
        }
    }
}
