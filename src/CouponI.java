/**
 * 
 * @author Carlos Venegas
 * 
 * Interface for Coupon objects.  
 * contains a common method to apply the coupon.
 *
 */
public interface CouponI {
	/**
	 * Assumes the class has a title.  returns a String.
	 * @return title of coupon
	 */
	String getTitle();
	
	/**
	 * Assumes the class has a description.  returns a String.
	 * @return description of coupon
	 */
	String getDescription();
	
	/**
	 * passing in a price, apply discount and return the price after discount
	 * 
	 * @param double price of item
	 * @return final cost
	 */
	double applyCoupon(double price);
	
}
