package task2;

import java.time.LocalDate;

public interface Animal {
    /**
     * Геттер для вывода породы
     * @return порода
     */
    String getBreed();

    /**
     * Геттер для вывода имени
     * @return имя животного
     */
    String getName();

    /**
     * Геттер для вывода цены
     * @return цена
     */
    Double getCost();

    /**
     * Геттер для вывода характера
     * @return характер животного
     */
    String getCharacter();

    /**
     * Геттер для вывода даты рождения
     * @return дата рождения
     */
    LocalDate getBirthDate();
}
