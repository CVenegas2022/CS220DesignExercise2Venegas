import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import javax.swing.JOptionPane;

public class Customer {
	private String firstName;
	private String lastName;
	private int coffeeCount;
	private Map<Coupon, Integer> couponColl;	//decided to use a HashMap for quicker calls to check for a specific coupon using contains()
	private String preferredCoffee;	//given time and more information, this could be turned into a class for more complex functionalities
	private Map<String, Coupon> couponMap;
	
	public Customer(String first, String last)
	{
		//initialize variables storing customer information
		firstName=first;
		lastName=last;
		coffeeCount=0;
		couponColl=new HashMap<Coupon, Integer>();
		preferredCoffee="None";
		couponMap=new HashMap<String, Coupon>();
	}
	
	/**
	 * adds coffee to the coffee count.  Increments the coffee count by +1.  If the count then equals 3, it sets it to 0,
	 * then adds one GetOneFreeCoupon to couponColl.
	 */
	public void addCoffee()
	{
		coffeeCount++;
		if(coffeeCount==3)
		{
			coffeeCount=0;
			addCoupon(new GetOneFreeCoupon());
		}
	}
	
	/**
	 * adds one coupon to the HashMap.  Replaces the old number with the old one+1 if coupon exists in the list, 
	 * otherwise, it just adds the coupon to the list and sets its mapped value to 1.
	 * 
	 * @param Coupon offer
	 */
	public void addCoupon(Coupon offer)
	{
		String name=offer.getTitle();
		if(couponMap.containsKey(name))
		{
			int temp=couponColl.get(couponMap.get(name))+1;
			couponColl.replace(couponMap.get(name), temp);
			
		}
		else
		{
			couponColl.put(offer, 1);
			couponMap.put(offer.getTitle(), offer);
		}
	}
	
	/**
	 * removes one coupon from the HashMap.  Replaces the old number with the old one-1 if coupon exists in the Map 
	 * and has value greater than 0.  otherwise, it just returns with a warning from JOptionPane
	 * 
	 * @param Coupon targetCoupon
	 */
	public void removeCoupon(Coupon targetCoupon)
	{
		String name=targetCoupon.getTitle();
		if(!couponMap.containsKey(name) || couponColl.get(couponMap.get(name))<=0)
		{
			JOptionPane.showMessageDialog(null, "Customer does not have any of this coupon remianing");
			return;
		}
		int temp=couponColl.get(couponMap.get(name))-1;
		couponColl.replace(couponMap.get(name), temp);
		
	}
	
	/**
	 * returns the first name of the customer
	 * @return first name
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * returns the last name of the customer
	 * @return last name
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * returns the customer's preferred coffee
	 * @return preferred coffee
	 */
	public String getPreferredCoffee()
	{
		return preferredCoffee;
	}
	
	/**
	 * sets preferred coffee to the String passed in
	 * @param String coffeeName
	 */
	public void setPreferredCoffee(String coffeeName)
	{
		preferredCoffee=coffeeName;
	}
	
	/**
	 * returns the customer object as a String
	 * @return String customer
	 */
	public String toString()
	{
		String toString="";
		
		String name="Name: "+firstName+" "+lastName+"\n";
		String coffees="Coffee count: "+coffeeCount+"\n";
		
		int counter=1;
		String couponNums="";
		Set<Coupon> couponList=couponColl.keySet();
		
		for(Coupon c : couponList)
		{
			
			couponNums+="Coupon "+counter+": "+c.getTitle()+", "+couponColl.get(c)+"\n";
		}
		
		String prefCoffee="Preferred Coffee: "+preferredCoffee;
		
		toString=name+coffees+couponNums+prefCoffee;
		
		return toString;
	}
	
}
