import java.util.ArrayList;

public class Sports {
    private ArrayList < Sport > sports = new ArrayList < Sport > ();
    public void addSport(String sportID, String name, Integer calorieBurn) {
        if (sportID.substring(0, 2).equals("20")) {
            sports.add(new Sport(sportID, name, calorieBurn));
        } else {
            System.out.println("This is not a sport");
        }
    }
    public ArrayList<Sport> getSports() {
        return sports;
    }
}
class Sport {
    private String sportID;
    private String name;
    private Integer calorieBurn;
    public Sport(String sportID, String name, Integer calorieBurn) {
        this.sportID = sportID;
        this.name = name;
        this.calorieBurn = calorieBurn;
    }
    public String getSportID() {
        return sportID;
    }
    public String getName() {
        return name;
    }
    public Integer getCalorieBurn() {
        return calorieBurn;
    }
}