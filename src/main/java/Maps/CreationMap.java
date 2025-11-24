package Maps;

import java.util.HashMap;

public class CreationMap {
    public static void main(String[] args) {

        HashMap<String,Integer>lesSalaires=new HashMap<>();
        lesSalaires.put("Paul", 1750);
        lesSalaires.put("Hicham", 1825);
        lesSalaires.put("Yu", 2250);
        lesSalaires.put("Ingrid", 2015);
        lesSalaires.put("Chantal", 2418);
        System.out.println("Taille de la map "+lesSalaires.size());
    }
}
