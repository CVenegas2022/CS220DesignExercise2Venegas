
public class GetOneFreeCoupon extends Coupon{

	
	public GetOneFreeCoupon()
	{
		super("Get One Free", "Gets one free coffee");
		
	}
	
	/**
	 * returns the title of the coupon
	 * 
	 * @return title of coupon
	 * 
	 */
	@Override
	public String getTitle()
	{
		return super.title;
	}
	
	
	/**
	 * returns the description of the coupon
	 * 
	 * @return description of coupon
	 * 
	 */
	@Override
	public String getDescription()
	{
		return description;
	}
	
	
	/**
	 * returns 0.  This is the equivalent of modifying the price to be free.
	 * 
	 * @param double price
	 * @return always returns 0
	 */
	@Override
	public double applyCoupon(double price)
	{
		return 0;
	}
	
	/**
	 * returns GetOneFreeCoupon as a String
	 * @return String get one free coupon
	 */
	public String toString()
	{
		String toString="Title: "+title+"\nDescription: "+description;
		return toString;
	}
	
}
