package task2;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    private final AnimalFactory animalFactory = new AnimalFactory();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Override
    public List<Animal> createAnimals() {
        List<Animal> animals = new ArrayList<>();
        int i = 0;
        while (i != 10) {
            Animal animal = animalFactory.createAnimal(randomAnimalType());
            animals.add(animal);
            System.out.println("Создано новое животное: " + formatAnimal(animal));
            i++;
        }
        return animals;
    }


    public List<Animal> createAnimals(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Количество животных должно быть больше 0.");
        }
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Animal animal = animalFactory.createAnimal(randomAnimalType());
            animals.add(animal);
            System.out.println("Создано новое животное: " + formatAnimal(animal));
        }
        return animals;
    }

    @Override
    public List<Animal> createAnimalsDoWhile(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Количество животных должно быть больше 0.");
        }
        List<Animal> animals = new ArrayList<>();
        int count = 0;
        do {
            Animal animal = animalFactory.createAnimal(randomAnimalType());
            animals.add(animal);
            System.out.println("Создано новое животное: " + formatAnimal(animal));
            count++;
        } while (count < n);
        return animals;
    }

    /**
     * Форматирует информацию о животном для вывода на консоль.
     * @param animal объект Animal.
     * @return строка с информацией о животном.
     */
    private String formatAnimal(Animal animal) {
        return String.format(
                "Тип: %s, Порода: %s, Имя: %s, Цена: %.2f, Характер: %s, Дата рождения: %s",
                animal.getClass().getSimpleName(),
                animal.getBreed(),
                animal.getName(),
                animal.getCost(),
                animal.getCharacter(),
                animal.getBirthDate().format(formatter)
        );
    }

    private AnimalType randomAnimalType() {
        AnimalType[] types = AnimalType.values();
        return types[new Random().nextInt(types.length)];
    }

}