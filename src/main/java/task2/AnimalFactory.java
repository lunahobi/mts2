package task2;

import java.time.LocalDate;
import java.util.Random;

/**
 * Простая фабрика для создания животных с уникальными породами для каждого типа.
 */
public class AnimalFactory {
    private static final String[] WOLF_BREEDS = {"Arctic Wolf", "Grey Wolf", "Red Wolf"};
    private static final String[] SHARK_BREEDS = {"Great White Shark", "Tiger Shark", "Hammerhead Shark"};
    private static final String[] DOG_BREEDS = {"Labrador Retriever", "German Shepherd", "Bulldog"};
    private static final String[] CAT_BREEDS = {"Persian Cat", "Siamese Cat", "Maine Coon"};

    private static final String[] NAMES = {"Max", "Bella", "Charlie", "Lucy", "Cooper"};
    private static final String[] CHARACTERS = {"Friendly", "Aggressive", "Calm", "Playful"};
    private final Random random = new Random();

    /**
     * Создает животное указанного типа.
     * @param type тип животного.
     * @return экземпляр Animal.
     */
    public Animal createAnimal(AnimalType type) {
        switch (type) {
            case WOLF:
                return new Wolf(randomWolfBreed(), randomName(), randomCost(), randomCharacter(), randomBirthDate());
            case SHARK:
                return new Shark(randomSharkBreed(), randomName(), randomCost(), randomCharacter(), randomBirthDate());
            case DOG:
                return new Dog(randomDogBreed(), randomName(), randomCost(), randomCharacter(), randomBirthDate());
            case CAT:
                return new Cat(randomCatBreed(), randomName(), randomCost(), randomCharacter(), randomBirthDate());
            default:
                throw new IllegalArgumentException("Неизвестный тип животного: " + type);
        }
    }

    // Уникальные методы для пород
    private String randomWolfBreed() {
        return WOLF_BREEDS[random.nextInt(WOLF_BREEDS.length)];
    }

    private String randomSharkBreed() {
        return SHARK_BREEDS[random.nextInt(SHARK_BREEDS.length)];
    }

    private String randomDogBreed() {
        return DOG_BREEDS[random.nextInt(DOG_BREEDS.length)];
    }

    private String randomCatBreed() {
        return CAT_BREEDS[random.nextInt(CAT_BREEDS.length)];
    }

    // Общие вспомогательные методы
    private String randomName() {
        return NAMES[random.nextInt(NAMES.length)];
    }

    private double randomCost() {
        return 10 + random.nextDouble() * 90; // Цена от 10 до 100
    }

    private String randomCharacter() {
        return CHARACTERS[random.nextInt(CHARACTERS.length)];
    }

    private LocalDate randomBirthDate() {
        return LocalDate.now().minusDays(random.nextInt(3650)); // За последние 10 лет
    }
}
