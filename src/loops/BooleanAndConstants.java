package loops;

public class BooleanAndConstants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In Eclipse, create the following Boolean variables and choose what values they hold:
		//isHotOutside * yes
		//isWeekday * no
		//hasMoneyInPocket * yes
				boolean isHotOutside = true;
				boolean hasMoneyInPocket = true;
				boolean isWeekday = true;
		//
		//Create the following variables (not boolean type, choose the best data type for the variable):
		//costOfMilk * double
		//moneyInWallet *double
		//thirstLevel (how thirsty you are on a scale of 1-10) *int
		//
				double costOfMilk = 2.95;
				double moneyInWallet = 25;
				int thirstLevel = 10;
		//
		//Using the variables you created above and Boolean operators, create variables
		//for the following scenarios:
		//
		//shouldByIcecream – this should be true if it is hot outside and there is money in your pocket
		//willGoSwimming – this should be true if it is hot outside and it is not a weekday
		//isAGoodDay – this should be true if it is hot outside, there is money in your pocket, and it is not a weekday
		//willBuyMilk – this should be true if it is hot outside, and thirstLevel is greater than or equal to 3, 
		//and moneyInWallet is greater than or equal to 2 times the cost of milk.
		//
				boolean shouldBuyIcecream = (isHotOutside && hasMoneyInPocket == true);
				boolean willGoSwimming = (isHotOutside && !isWeekday);
				boolean isAGoodDay = (isHotOutside && hasMoneyInPocket && !isWeekday);
				boolean willBuyMilk = (isHotOutside && thirstLevel >= 3 && moneyInWallet >= (costOfMilk*2));
						
			}
	}


