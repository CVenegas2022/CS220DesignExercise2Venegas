
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import javax.swing.JOptionPane;


/**
 * @author Carlos Venegas
 * 
 * Class for a list of Starbucks rewards members
 *
 */
public class MembersList {
	
	Map<String, Customer> map;	//map
	
	public MembersList()
	{
		map=new HashMap<String, Customer>();
	}
	
	/**
	 * adds a member to the map by associating a given id with a new customer object with the passed in
	 * first and last name
	 * @param String id
	 * @param String first name
	 * @param String last name
	 */
	public void addMember(String id, String first, String last)
	{
		map.put(id, new Customer(first, last));
	}
	
	/**
	 * removes member if they exist in the map
	 * @param id
	 */
	public void removeMember(String id)
	{
		if(!map.containsKey(id))
		{
			JOptionPane.showMessageDialog(null, "Invalid id");
			return;
		}
		map.remove(id);
	}
	
	/**
	 * returns a customer given their id
	 * @param int customer id
	 * @return customer
	 */
	public Customer getMember(String id)
	{
		if(!map.containsKey(id))
		{
			JOptionPane.showMessageDialog(null, "Invalid id");
			return null;
		}
		
		return map.get(id);
	}
	
	/**
	 * returns the MembersList as a String
	 */
	public String toString()
	{
		String toString="";
		
		Set<String> ids=map.keySet();
		int counter=0;
		for(String idKey : ids)
		{
			toString+="ID: "+idKey+"\n"+map.get(idKey).toString();
			if(counter<ids.size()-1)
			{
				toString+="\n";
			}
		}
		
		return toString;
	}
	
}
