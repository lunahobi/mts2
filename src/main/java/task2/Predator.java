package task2;

import java.time.LocalDate;

public class Predator extends AbstractAnimal {

    /**
     * Конструктор для создания Хищников
     * @param breed порода
     * @param name имя
     * @param cost цена
     * @param character характер
     * @param birthDate дата рождения
     */
    public Predator(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }
}
