
public class Ex3PaybackCard extends Ex3{
	Integer pointsEarned;
	 Double totalAmount;
	public Ex3PaybackCard(String holderName, String cardNumber, String expiryDate, Integer pointsEarned,
			Double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}
	public Ex3PaybackCard() {
		// TODO Auto-generated constructor stub
	}
	public Integer getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(Integer pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	 

}
