package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    private final AnimalFactory animalFactory = new AnimalFactory();

    @Override
    public List<Animal> createDefaultAnimals() {
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            animals.add(animalFactory.createAnimal(randomAnimalType()));
        }
        return animals;
    }

    @Override
    public List<Animal> createAnimals(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Количество животных должно быть больше 0.");
        }
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            animals.add(animalFactory.createAnimal(randomAnimalType()));
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
            animals.add(animalFactory.createAnimal(randomAnimalType()));
            count++;
        } while (count < n);
        return animals;
    }

    private AnimalType randomAnimalType() {
        AnimalType[] types = AnimalType.values();
        return types[new Random().nextInt(types.length)];
    }

}