package Activity;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Ram");
        hs.add("Shyam");
        hs.add("Balram");
        hs.add("Akbar");
        hs.add("Amar");
        hs.add("Anthony");
        
        System.out.println("Original HashSet: " + hs);        
  
        System.out.println("Size of HashSet: " + hs.size());
        

        System.out.println("Removing Balram from HashSet: " + hs.remove("Balram"));
        
        if(hs.remove("Tom")) {
        	System.out.println("Tom removed from the Set");
        } else {
        	System.out.println("Tom is not present in the Set");
        }
        
        
        System.out.println("Checking if Amar is present: " + hs.contains("Amar"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}