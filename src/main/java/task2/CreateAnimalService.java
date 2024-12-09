package task2;

import java.util.List;

public interface CreateAnimalService {

    /**
     * Создает коллекцию из 10 животных по умолчанию.
     * Животные генерируются с использованием случайных значений
     * и заранее заданных параметров.
     *
     * @return список из 10 сгенерированных животных.
     *         Каждый элемент списка должен быть корректно
     *         сгенерированным экземпляром Animal.
     */
    List<Animal> createDefaultAnimals();

    /**
     * Создает коллекцию животных заданного размера.
     * Метод использует цикл for для генерации животных.
     *
     * Требуется убедиться, что `n > 0`.
     *
     * @param n количество животных для генерации.
     *          Должно быть больше 0.
     * @return список из n сгенерированных животных.
     *         Каждый элемент списка должен быть корректно
     *         сгенерированным экземпляром Animal.
     * @throws IllegalArgumentException если n меньше или равно 0.
     */
    List<Animal> createAnimals(int n);

    /**
     * Создает коллекцию животных заданного размера.
     * Метод использует цикл do-while для генерации животных.
     *
     * Требуется убедиться, что `n > 0`.
     *
     * @param n количество животных для генерации.
     *          Должно быть больше 0.
     * @return список из n сгенерированных животных.
     *         Каждый элемент списка должен быть корректно
     *         сгенерированным экземпляром Animal.
     * @throws IllegalArgumentException если n меньше или равно 0.
     */
    List<Animal> createAnimalsDoWhile(int n);
}