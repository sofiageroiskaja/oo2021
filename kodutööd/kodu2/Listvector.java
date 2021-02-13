import java.util.Vector;
public class Listvector {
    public static void main(String[] args) {
        Vector<String> games = new Vector<String>(); 
        /*
        Vector<String> games = new Vector<String>(10);
        Vector<String> games = new Vector<String>(10, 1);  
        */

        //add
        games.add("Monopoly");  
        games.add("Scrabble"); 

        games.addElement("Battleship");  
        games.addElement("Risk"); 
        System.out.println("Games are: "+ games); 

        //size and capacity
        System.out.println("Size is: "+games.size());  
        System.out.println("Default capacity is: "+games.capacity()); 
        
        //contains
        if(games.contains("Monopoly")){  
            System.out.println("Monopoly is present at the index " +games.indexOf("Monopoly"));  
        }  
        else{  
            System.out.println("Monopoly is not present in the list.");  
        }  

        //get
        System.out.println("The first is "+games.firstElement());    
        System.out.println("The last is "+games.lastElement());   

        //remove
        System.out.println("Remove first occourence of element Risk: "+games.remove((String)"Risk"));  
        System.out.println("Remove element at index 2: " +games.remove(2));  
        games.removeElementAt(1);        
        System.out.println("Vector after removal: " + games); 
    
        System.out.println(games.clone()); 
        System.out.println(games.toArray()); 
        System.out.println(games.toString()); 
    
    }
}
