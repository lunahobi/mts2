package task2;

import java.time.LocalDate;

public class Dog extends Pet{

    /**
     * Конструктор для создания объектов типа Dog
     * @param breed порода
     * @param name имя
     * @param cost цена
     * @param character характер
     * @param birthDate дата рождения
     */
    public Dog(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }
}
