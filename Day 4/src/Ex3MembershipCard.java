
public class Ex3MembershipCard extends Ex3 {
	Integer rating;
	

	public Ex3MembershipCard(String holderName, String cardNumber, String expiryDate, Integer rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

	public Ex3MembershipCard() {
		// TODO Auto-generated constructor stub
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
	

}
