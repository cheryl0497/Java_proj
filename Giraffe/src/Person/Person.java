package Person;
import java.util.*;
public class Person {
	public static void main(String args[])
	{
		HashSet<AddressClass> set=new HashSet<AddressClass>();  
	    //Creating Address Book  
	    AddressClass b1=new AddressClass(101,"Cheryl","Dsouza");  
	    AddressClass b2=new AddressClass(102,"Carol","Dcruz");
	    AddressClass b3=new AddressClass(103,"Anitha","Dmello");
	    //add adress
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3);  
	    System.out.println("An initial list of Addresses: "+set);
	    //to remove specified person
	    set.remove(b1);
	    System.out.println("Updated List: "+set); 
	   //System.out.println(set.contains(101));
	    AddressClass key = new AddressClass(102,"Carol","Dcruz");
        System.out.println("Does set contains key? "+set.contains(key));
	    
       
	}
}
