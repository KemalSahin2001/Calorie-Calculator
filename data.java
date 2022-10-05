import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class data {
    private ArrayList<Person> givens = new ArrayList<Person>();
    public ArrayList<Person> getGivens() {
        return givens;
    }
    public void accessFoodData(Foods foods){
        try (Scanner scanFood = new Scanner(new BufferedReader(new FileReader("food.txt")))) {
            while (scanFood.hasNext()){
                String foodID = scanFood.next();
                String name = scanFood.next();
                Integer calorie = scanFood.nextInt();
                foods.addFood(foodID, name, calorie);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void accessPersonData(Persons persons){
        try (Scanner scanPerson = new Scanner(new BufferedReader(new FileReader("people.txt")))) {
            while (scanPerson.hasNext()){
                String personID = scanPerson.next();
                String name = scanPerson.next();
                String gender = scanPerson.next();
                Integer weight = scanPerson.nextInt();
                Integer height = scanPerson.nextInt();
                Integer birthYear = scanPerson.nextInt();
                persons.addPerson(personID, name,gender,weight,height,birthYear);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void accessSportData(Sports sports){
        try (Scanner scanSport = new Scanner(new BufferedReader(new FileReader("sport.txt")))) {
            while (scanSport.hasNext()){
                String sportID = scanSport.next();
                String name = scanSport.next();
                Integer calorieBurn = scanSport.nextInt();
                sports.addSport(sportID, name, calorieBurn);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
