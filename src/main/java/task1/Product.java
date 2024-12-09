package task1;
/*
 * Класс Product представляет информацию о товаре, включая его количество,
 * цену за единицу и скидку. Предоставляет методы для расчета общей стоимости
 * покупки с учетом скидки и без нее.
*/
public class Product {
    private int count; //количество товаров
    private double price; //цена товара
    private double discount; //скидка на товар

    /**
     * Конструктор класса Product.
     *
     * @param count количество товаров (должна быть больше 0)
     * @param price цена за единицу товара (должна быть больше 0)
     * @param discount скидка на товар в процентах (должна быть неотрицательной)
     */

    public Product(int count, double price, double discount) {
        if (count <= 0 || price <= 0 || discount < 0){
            throw new IllegalArgumentException("Invalid product count/product price/discount");
        }
        this.count = count;
        this.price = price;
        this.discount = discount;
    }

    /**
     * Метод для расчета и вывода общей суммы покупки
     *
     * @param product объект Product
     */
    public static void calculateAndDisplayTotal(Product product) {
        double totalWithoutDiscount = product.count * product.price;
        double totalWithDiscount = totalWithoutDiscount * (1 - product.discount / 100);

        System.out.printf("Общая сумма без скидки: %.2f%n", totalWithoutDiscount);
        System.out.printf("Общая сумма со скидкой: %.2f%n", totalWithDiscount);
    }

}
