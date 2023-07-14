
import java.util.HashMap;


public class Abbreviations {

    private HashMap<String, String> abbrMap;

    public Abbreviations() {

        this.abbrMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {

        abbrMap.put(cleanString(abbreviation), explanation);

    }

    public boolean hasAbbreviation(String abbreviation) {

        return this.abbrMap.containsKey(abbreviation);

    }

    public String findExplanationFor(String abbreviation) {

        return this.abbrMap.get(cleanString(abbreviation));

    }

    public void printKeys() {

        for (String e : this.abbrMap.keySet()) {
            System.out.println(e);
        }

    }

    public String cleanString(String strToClean) {

        if (strToClean == null) {
            return "";
        }

        return strToClean.toLowerCase().trim();

    }

}