import java.util.*;
class Key_value {
  public static void main(String[] args) {

    Scanner Scan= new Scanner (System.in);
    HashMap<String, Integer> hm= new HashMap<String, Integer>();

        hm.put("Milan", 222); 
        hm.put("Pankaj", 268); 
        hm.put("Nikhil", 251);

if (hm.isEmpty())  
        { 
            System.out.println("Empty"); 
        } 
          
        else
        { 
            System.out.println(hm); 
        } 

  
  }
}