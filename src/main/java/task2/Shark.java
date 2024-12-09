package task2;

import java.time.LocalDate;

public class Shark extends Predator{

    /**
     * Конструктор для Акул
     * @param breed порода
     * @param name имя
     * @param cost цена
     * @param character характер
     * @param birthDate дата рождения
     */
    public Shark(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }
}
