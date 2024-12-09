package task2;

import java.time.LocalDate;

public abstract class AbstractAnimal implements Animal{
    protected String breed; // порода
    protected String name; // имя
    protected Double cost; // цена в магазине
    protected String character; // характер
    protected LocalDate birthDate; //дата рождения

    /**
     * Конструктор
     * @param breed порода
     * @param name имя
     * @param cost цена
     * @param character характер
     * @param birthDate дата рождения
     */
    public AbstractAnimal(String breed, String name, Double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AbstractAnimal that = (AbstractAnimal) obj;
        return breed.equals(that.breed) &&
                name.equals(that.name) &&
                cost.equals(that.cost) &&
                character.equals(that.character) &&
                birthDate.equals(that.birthDate);
    }

}
