package Activity;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> Colors = new HashMap<Integer, String>();
        Colors.put(1, "Blue");
        Colors.put(2, "Green");
        Colors.put(3, "Yellow");
        Colors.put(4, "White");
        Colors.put(5, "Cyan");

        
        System.out.println("The Original map: " + Colors);
        
       
        Colors.remove(3);
 
        System.out.println("After removing Yellow: " + Colors);
        
 
        if(Colors.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }
        
  
        System.out.println("Number f colors in the Map is: " + Colors.size());
    }
}