
public class Coupon {
	
	
	protected String title;
	protected String description;
	
	public Coupon(String t, String d)
	{
		title=t;
		description=d;
	}
	
	/**
	 * returns a title of coupon.
	 * @return title of coupon
	 */
	public String getTitle()
	{
		return title;
	}
	
	/**
	 * returns a description.
	 * @return description of coupon
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * passing in a price, apply discount and return the price after discount
	 * 
	 * @param double price of item
	 * @return final cost
	 */
	public double applyCoupon(double price)
	{
		return price;
	}
	
}
