import java.util.ArrayList;

public class Persons {
    ArrayList < Person > persons = new ArrayList < Person > ();
    public void addPerson(String personID, String name, String gender, Integer weight, Integer height, Integer birthYear) {
        persons.add(new Person(personID, name, gender, weight, height, birthYear));
    }
    public ArrayList<Person> getPersons() {
        return persons;
    }
}
class Person {
    private String personID;
    private String name;
    private Gender gender;
    private Integer weight;
    private Integer height;
    private Integer age;
    private Integer dailyCalorieNeed;
    private Integer dailyCaloire = 0;
    private Integer calorieTaken = 0;
    private Integer calorieBurned = 0;
    public Person(String personID, String name, String gender, Integer weight, Integer height, Integer birthYear) {
        this.personID = personID;
        this.name = name;
        if (gender.toLowerCase().equals("male")) {
            this.gender = Gender.male;
        } else {
            this.gender = Gender.female;
        }
        this.weight = weight;
        this.height = height;
        this.age = (2022 - birthYear);
        this.DailyCalorieCalculate();
        this.subDailyCaloire(this.dailyCalorieNeed);
    }
    private void DailyCalorieCalculate() {
        if (this.gender == Gender.male) {
            double calculation = (66 + (13.75 * this.weight) + (5 * this.height) - (6.8 * this.age));
            this.dailyCalorieNeed = (int) Math.round(calculation);
        } else {
            double calculation = (665 + (9.6 * this.weight) + (1.7 * this.height) - (4.7 * this.age));
            this.dailyCalorieNeed = (int) Math.round(calculation);
        }
    }
    public Integer getCalorieTaken() {
        return calorieTaken;
    }
    public void addCalorieTaken(Integer calorieTaken) {
        this.calorieTaken += calorieTaken;
    }
    public Integer getCalorieBurned() {
        return calorieBurned;
    }
    public void addCalorieBurned(Integer calorieBurned) {
        this.calorieBurned += calorieBurned;
    }
    public Integer getDailyCaloire() {
        return dailyCaloire;
    }
    public void addDailyCaloire(Integer dailyCaloire) {
        this.dailyCaloire += dailyCaloire;
    }
    public void subDailyCaloire(Integer dailyCaloire) {
        this.dailyCaloire -= dailyCaloire;
    }
    public String getPersonID() {
        return personID;
    }
    public String getName() {
        return name;
    }
    public Gender getGender() {
        return gender;
    }
    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }
    public Integer getAge() {
        return this.age;
    }
    public Integer getDailyCalorieNeed() {
        return dailyCalorieNeed;
    }
    public void setDailyCalorieNeed(Integer dailyCalorieNeed) {
        this.dailyCalorieNeed += dailyCalorieNeed;
    }
}
enum Gender {
    male,
    female;
}