package Model;

import java.util.Date;

public class InsuranceCard {
	private String cardNumber; // 10 digits
    private String cardHolder;
    private String policyOwner;
    private Date expirationDate;
    
	public InsuranceCard(String cardNumber, String cardHolder, String policyOwner, Date expirationDate) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolder = cardHolder;
		this.policyOwner = policyOwner;
		this.expirationDate = expirationDate;
	}

	public String getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getCardHolder() {
		return cardHolder;
	}
	
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}
	
	public String getPolicyOwner() {
		return policyOwner;
	}
	
	public void setPolicyOwner(String policyOwner) {
		this.policyOwner = policyOwner;
	}
	
	public Date getExpirationDate() {
		return expirationDate;
	}
	
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
}
