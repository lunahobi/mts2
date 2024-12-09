package task2;

import java.util.List;

public interface SearchService {
    /**
     * Находим животных, родившихся в високосный год.
     * @param animals список животных
     * @return список имен животных, родившихся в високосный год.
     */
    List<String> findLeapYearNames(List<Animal> animals);

    /**
     * Находит животных, возраст которых старше n лет
     * @param animals список животных.
     * @param n возраст в годах.
     * @return список животных старше n лет.
     */
    List<Animal> findOlderAnimal(List<Animal> animals, int n);

    /**
     * Находит дубликаты в списке животных.
     * @param animals список животных
     * @return список животных-дубликатов
     */
    List<Animal> findDuplicate(List<Animal> animals);
}
