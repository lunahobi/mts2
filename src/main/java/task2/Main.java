package task2;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем сервисы
        CreateAnimalService createService = new CreateAnimalServiceImpl();
        SearchService searchService = new SearchServiceImpl();

        // Генерируем список животных
        List<Animal> animals = createService.createAnimals(10);

        Animal a1 = new Pet("Cat", "Bella", 50.0, "Friendly", LocalDate.of(2020, 1, 1));
        Animal a2 = new Pet("Dog", "Max", 70.0, "Playful", LocalDate.of(2019, 5, 5));
        Animal a3 = new Pet("Cat", "Bella", 50.0, "Friendly", LocalDate.of(2020, 1, 1)); // дубликат a1

        animals.add(a1);
        animals.add(a2);
        animals.add(a3);

        // Выводим информацию о всех животных
        System.out.println("Список всех животных:");
        animals.forEach(animal -> System.out.printf(
                "Порода: %s, Имя: %s, Цена: %.2f, Характер: %s, Дата рождения: %s%n",
                animal.getBreed(),
                animal.getName(),
                animal.getCost(),
                animal.getCharacter(),
                animal.getBirthDate()
        ));

        // Поиск животных, родившихся в високосный год
        List<String> leapYearNames = searchService.findLeapYearNames(animals);
        System.out.println("\nЖивотные, родившиеся в високосный год:");
        leapYearNames.forEach(System.out::println);

        // Поиск животных старше 5 лет
        List<Animal> olderAnimals = searchService.findOlderAnimal(animals, 5);
        System.out.println("\nЖивотные старше 5 лет:");
        olderAnimals.forEach(animal -> System.out.printf(
                "Порода: %s, Имя: %s, Цена: %.2f, Характер: %s, Дата рождения: %s%n",
                animal.getBreed(),
                animal.getName(),
                animal.getCost(),
                animal.getCharacter(),
                animal.getBirthDate()
        ));

        // Поиск дубликатов
        List<Animal> duplicates = searchService.findDuplicate(animals);
        System.out.println("\nДубликаты животных:");
        duplicates.forEach(animal -> System.out.printf(
                "Порода: %s, Имя: %s, Цена: %.2f, Характер: %s, Дата рождения: %s%n",
                animal.getBreed(),
                animal.getName(),
                animal.getCost(),
                animal.getCharacter(),
                animal.getBirthDate()
        ));

    }
}
