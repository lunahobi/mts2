package task1;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты Product с различными значениями
        Product product1 = new Product(10, 100.0, 0.75);
        Product product2 = new Product(5, 250.0, 42.575);
        Product product3 = new Product(20, 50.0, 59.1);

        // Вызываем метод расчета и вывода стоимости
        System.out.println("Товар 1:");
        Product.calculateAndDisplayTotal(product1);

        System.out.println("Товар 2:");
        Product.calculateAndDisplayTotal(product2);

        System.out.println("Товар 3:");
        Product.calculateAndDisplayTotal(product3);
    }
}
