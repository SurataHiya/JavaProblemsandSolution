class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {

            return -3;
        }
    }

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        System.out.println("Add (100 + 1000): " + myCalc.add(100, 1000));
        System.out.println("Subtract (1000 - 60): " + myCalc.subtract(1000, 60));
        System.out.println("Multiplication (10000 * 55): " + myCalc.multiply(10000, 55));
        System.out.print("Divide (10000 / 0): "+" " + "Taking  0 as denominator occurs ERROR"+ "," + " "+ myCalc.divide(10000, 0));
        System.out.println();
        System.out.println("Divide (100000 / 60): " + myCalc.divide(100000, 60));
    }
}
