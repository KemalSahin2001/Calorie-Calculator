import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class printer {
    static void foodPrint(Person person, Food food, Integer count) {
        try (FileWriter writer = new FileWriter("monitoring.txt", true)) {
            writer.write(person.getPersonID() + "\thas\ttaken\t" + count * food.calorie + "kcal\tfrom\t" + food.name + "\n");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    static void sportPrint(Person person, Sport sport, Integer count) {
        try (FileWriter writer = new FileWriter("monitoring.txt", true)) {
            writer.write(person.getPersonID() + "\thas\tburned\t" +
                (count) + "kcal\tthanks to\t" + sport.getName() + "\n");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    static void printPrintID(Person person) {
        try (FileWriter writer = new FileWriter("monitoring.txt", true)) {
            if(person.getDailyCaloire() <= 0){
                writer.write(person.getName() + "\t" + person.getAge() + "\t" +
                person.getDailyCalorieNeed() + "kcal\t" + person.getCalorieTaken() + "kcal\t" + 
                person.getCalorieBurned() + "kcal\t" + person.getDailyCaloire() + "kcal\n");
            }
            else{
                writer.write(person.getName() + "\t" + person.getAge() + "\t" +
                person.getDailyCalorieNeed() + "kcal\t" + person.getCalorieTaken() + "kcal\t" + 
                person.getCalorieBurned() + "kcal\t+" + person.getDailyCaloire() + "kcal\n");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    static void printWarn(ArrayList < Person > given) {
        boolean isAny = false;
        try (FileWriter writer = new FileWriter("monitoring.txt", true)) {
            for (Person person: given) {
                if (person.getDailyCaloire() > 0) {
                    isAny = true;
                    if(person.getDailyCaloire() <= 0){
                        writer.write(person.getName() + "\t" + person.getAge() + "\t" +
                        person.getDailyCalorieNeed() + "kcal\t" + person.getCalorieTaken() + "kcal\t" + 
                        person.getCalorieBurned() + "kcal\t" + person.getDailyCaloire() + "kcal\n");
                    }
                    else{
                        writer.write(person.getName() + "\t" + person.getAge() + "\t" +
                        person.getDailyCalorieNeed() + "kcal\t" + person.getCalorieTaken() + "kcal\t" + 
                        person.getCalorieBurned() + "kcal\t+" + person.getDailyCaloire() + "kcal\n");
                    }
                    
                }
            }
            if (!isAny) {
                writer.write("there\tis\tno\tsuch\tperson" + "\n");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    static void printList(ArrayList < Person > given) {
        try (FileWriter writer = new FileWriter("monitoring.txt", true)) {
            for (Person person: given) {
                if(person.getDailyCaloire() <= 0){
                    writer.write(person.getName() + "\t" + person.getAge() + "\t" +
                    person.getDailyCalorieNeed() + "kcal\t" + person.getCalorieTaken() + "kcal\t" + 
                    person.getCalorieBurned() + "kcal\t" + person.getDailyCaloire() + "kcal\n");
                }
                else{
                    writer.write(person.getName() + "\t" + person.getAge() + "\t" +
                    person.getDailyCalorieNeed() + "kcal\t" + person.getCalorieTaken() + "kcal\t" + 
                    person.getCalorieBurned() + "kcal\t+" + person.getDailyCaloire() + "kcal\n");
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    static void printStar() {
        try (FileWriter writer = new FileWriter("monitoring.txt", true)) {
            writer.write("***************\n");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}