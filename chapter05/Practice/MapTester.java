import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MapTester
{
    
    private HashMap<String,Integer> phoneBook; 

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        phoneBook = new HashMap<String,Integer>();
        initialisePhoneBook();
    }
    
    public void enterNumber(String name, Integer number)
    {
        phoneBook.put(name, number);
    }
    
    public Integer lookupNumber(String name)
    {
        return phoneBook.get(name);
    }

    private void initialisePhoneBook()
    {
         phoneBook.put("Lisa", 49913860);
         phoneBook.put("Joe", 49913860);
         phoneBook.put("Anne", 49913860);
    }
}
