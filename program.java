import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class program {
    public void start(String args) {
        Foods foods = new Foods();
        Sports sports = new Sports();
        Persons persons = new Persons();
        data dt = new data();
        dt.accessFoodData(foods);
        dt.accessPersonData(persons);
        dt.accessSportData(sports);
        try (Scanner scan = new Scanner(new BufferedReader(new FileReader(args)))) {
            while (scan.hasNext()) {
                boolean isID = false;
                String personID = scan.next();
                for (Person prsn: persons.getPersons()) {
                    if (prsn.getPersonID().equals(personID)) {
                        isID = true;
                        String action = scan.next();
                        if(!dt.getGivens().contains(prsn)){
                            dt.getGivens().add(prsn);
                        }                        
                        switch (action.substring(0, 2)) {
                            case "10":
                                for (fruit ft: foods.getFruits()) {
                                    if (ft.foodID.equals(action)) {
                                        Integer times = scan.nextInt();
                                        prsn.addDailyCaloire(ft.calorie * times);
                                        prsn.addCalorieTaken(ft.calorie * times);
                                        printer.foodPrint(prsn, ft, times);
                                    }
                                }
                                break;
                            case "11":
                                for (dessert ds: foods.getDesserts()) {
                                    if (ds.foodID.equals(action)) {
                                        Integer times = scan.nextInt();
                                        prsn.addDailyCaloire(ds.calorie * times);
                                        prsn.addCalorieTaken(ds.calorie * times);
                                        printer.foodPrint(prsn, ds, times);
                                    }
                                }
                                break;
                            case "12":
                                for (meal ml: foods.getMeals()) {
                                    if (ml.foodID.equals(action)) {
                                        Integer times = scan.nextInt();
                                        prsn.addDailyCaloire(ml.calorie * times);
                                        prsn.addCalorieTaken(ml.calorie * times);
                                        printer.foodPrint(prsn, ml, times);
                                    }
                                }
                                break;
                            case "13":
                                for (nut nt: foods.getNuts()) {
                                    if (nt.foodID.equals(action)) {
                                        Integer times = scan.nextInt();
                                        prsn.addDailyCaloire(nt.calorie * times);
                                        prsn.addCalorieTaken(nt.calorie * times);
                                        printer.foodPrint(prsn, nt, times);
                                    }
                                }
                                break;
                            case "20":
                                for (Sport sprt: sports.getSports()) {
                                    if (sprt.getSportID().equals(action)) {
                                        Integer times = scan.nextInt();
                                        double calculation = ((sprt.getCalorieBurn() * times) / 60);
                                        prsn.subDailyCaloire((int) Math.round(calculation));
                                        prsn.addCalorieBurned((int) Math.round(calculation));
                                        printer.sportPrint(prsn, sprt, (int) Math.round(calculation));
                                    }
                                }
                                break;
                        }
                    }
                }
                if (!isID) {
                    if (personID.startsWith("print(")) {
                        for (Person prsn: persons.getPersons()) {
                            if (prsn.getPersonID().equals(personID.substring(6, 11))) {
                                printer.printPrintID(prsn);
                            }
                        }
                    } else if (personID.equals("printWarn")) {
                        printer.printWarn(dt.getGivens());
                    } else if (personID.equals("printList")) {
                        printer.printList(dt.getGivens());
                    }
                }
                if(scan.hasNext()){
                    printer.printStar();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}