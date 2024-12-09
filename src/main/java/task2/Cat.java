package task2;

import java.time.LocalDate;

public class Cat extends Pet{
    /**
     * Конструктор для создания кота
     * @param breed порода
     * @param name имя
     * @param cost цена
     * @param character характер
     * @param birthDate дата рождения
     */
    public Cat(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }
}
