
public class TestDriverMain {
	public static void main(String args[])
	{
		//initialize a MembersList object
		MembersList rewardsMembers=new MembersList();
		
		//Populate map in MembersList object
		rewardsMembers.addMember("06102001", "Ayla", "Gilmer");
		rewardsMembers.addMember("01022000", "Joe", "Nugent");
		rewardsMembers.addMember("12201999", "James", "Kamowski");
		rewardsMembers.addMember("06152000", "Tony", "Waldron");
		rewardsMembers.addMember("00000220", "Professor", "Spacco");
		rewardsMembers.addMember("00000000", "Earl", "Greysworth");
		
		//give prof. Spacco a coupon because everyone likes free caffeine
		rewardsMembers.getMember("00000220").addCoupon(new GetOneFreeCoupon());
		rewardsMembers.getMember("00000220").addCoupon(new GetOneFreeCoupon());
		
		System.out.println(rewardsMembers.toString()+"\n---------------");
		
		//take one away because too much caffeine is bad
		rewardsMembers.getMember("00000220").removeCoupon(new GetOneFreeCoupon());
		
		System.out.println(rewardsMembers.toString()+"\n---------------");
		
		//remove Earl Greysworth
		rewardsMembers.removeMember("00000000");
		
		System.out.println(rewardsMembers.toString()+"\n---------------");
		
		//give Joe some coffee
		for(int i=0; i<2; i++)
		{
			rewardsMembers.getMember("01022000").addCoffee();
		}
		
		System.out.println(rewardsMembers.toString()+"\n---------------");
		
		//Joe gets one more coffee
		rewardsMembers.getMember("01022000").addCoffee();
		System.out.println(rewardsMembers.toString()+"\n---------------");
		
		//set Ayla's favorite drink to Pumpkin Spice Latte because I know nothing about coffee
		rewardsMembers.getMember("06102001").setPreferredCoffee("Pumpkin Spice Latte");
		
		System.out.println(rewardsMembers.toString());
		
	}
}
