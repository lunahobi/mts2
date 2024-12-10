package task2;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class SearchServiceImpl implements SearchService{

    @Override
    public List<String> findLeapYearNames(List<Animal> animals) {
        return animals.stream()
                .filter(animal -> animal.getBirthDate().isLeapYear())
                .map(Animal::getName)
                .collect(Collectors.toList());
    }

    @Override
    public List<Animal> findOlderAnimal(List<Animal> animals, int n) {
        LocalDate currentDate = LocalDate.now();
        return animals.stream()
                .filter(animal -> currentDate.minusYears(n).isAfter(animal.getBirthDate()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Animal> findDuplicate(List<Animal> animals) {
        return animals.stream()
                .filter(animal -> animals.stream()
                        .filter(animal::equals)
                        .count() > 1)
                .distinct()
                .collect(Collectors.toList());
    }
}
