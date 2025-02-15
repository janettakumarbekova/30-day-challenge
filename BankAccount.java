public class MathOperations {
    // Метод для сложения двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения трех чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод для сложения чисел с плавающей точкой
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.add(5, 10));        // 15
        System.out.println(math.add(3, 4, 5));      // 12
        System.out.println(math.add(2.5, 3.7));    // 6.2
    }
}
