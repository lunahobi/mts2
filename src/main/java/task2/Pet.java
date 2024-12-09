package task2;

import java.time.LocalDate;

public class Pet extends AbstractAnimal{

    /** Конструктор для создания объектов типа Pet
     * @param breed порода
     * @param name имя
     * @param cost цена
     * @param character характер
     * @param birthDate дата рождения
     */
    public Pet(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }
}
