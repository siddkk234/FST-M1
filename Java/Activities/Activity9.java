package Activity;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList<String>();
        
        myList.add("Buma");
        myList.add("Tuma");
        myList.add("Luma");
        myList.add("Chuma");
        myList.add("Huma");
        
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Luma is in list: " + myList.contains("Luma"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Chuma");
        
        System.out.println("Current Size of ArrayList: " + myList.size());
      
        System.out.println(myList);
        
    }
}