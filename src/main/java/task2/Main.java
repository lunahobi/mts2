package task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем сервисы
        CreateAnimalService createService = new CreateAnimalServiceImpl();
        SearchService searchService = new SearchServiceImpl();
        // Форматтер для даты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Генерируем список животных
        List<Animal> animals = createService.createAnimalsDoWhile(10);

        Animal a1 = new Cat("Abyssinian", "Bella", 50.0, "Friendly", LocalDate.of(2020, 1, 1));
        Animal a2 = new Cat("Abyssinian", "Bella", 50.0, "Friendly", LocalDate.of(2020, 1, 1)); // дубликат a1

        animals.add(a1);
        animals.add(a2);

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
                animal.getBirthDate().format(formatter)
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
                animal.getBirthDate().format(formatter)
        ));

    }
}
