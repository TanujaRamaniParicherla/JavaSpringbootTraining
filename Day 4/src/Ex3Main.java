import java.util.Scanner;

public class Ex3Main {

	public static void main(String[] args) {

		int card;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.PaybackCard\r\n" + " 2.MembershipCard\r\n");
		System.out.println("Enter type of card");
		card = sc.nextInt();
		//String card1="PaybackCard";
		sc.nextLine();
		switch(card){
		
		case 1:
			String details;
			
			System.out.println("Enter holderName, cardNumber, expiryDate, pointsEarned, totalAmount.");
			Ex3PaybackCard ex = new Ex3PaybackCard();
			details = sc.nextLine();
			String[] arrOfStr = details.split(",");
			String a = arrOfStr[0];
			String b = arrOfStr[1];
			String c = arrOfStr[2];
			String d = arrOfStr[3];
			String e = arrOfStr[4];
			ex.setHolderName(a);
			ex.setCardNumber(b);
			ex.setExpiryDate(c);
			ex.setPointsEarned(Integer.valueOf(d));
			ex.setTotalAmount(Double.valueOf(e));
			System.out.println(ex.getHolderName() + "Payback Card Details:" + ex.getCardNumber() + "\n"
					+ ex.getPointsEarned() + "\n" + ex.getTotalAmount());
			break;
			
		case 2:
			String details1;
			Ex3MembershipCard ex1 = new Ex3MembershipCard();
			System.out.println("Enter holderName, cardNumber, expiryDate, rating");
			details = sc.nextLine();
			String[] arrOfStr1 = details.split(",");
			String a1 = arrOfStr1[0];
			String b1 = arrOfStr1[1];
			String c1 = arrOfStr1[2];
			String d1 = arrOfStr1[3];
			ex1.setHolderName(a1);
			ex1.setCardNumber(b1);
			ex1.setExpiryDate(c1);
			ex1.setRating(Integer.valueOf(d1));
			System.out
					.println(ex1.getHolderName() + "Payback Card Details:" + ex1.getCardNumber() + "\n" + ex1.getRating());
			break;
			
			
		}
			
		}

	}



