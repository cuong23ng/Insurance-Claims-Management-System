package Model;

import java.util.List;

import Model.Claim.Status;

public class Customer {
	private String id; // 7 numbers
	private String fullName;
    private InsuranceCard insuranceCard;
    private List<Claim> claims;
    
	public Customer(String id, String fullName, InsuranceCard insuranceCard, List<Claim> claims) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.insuranceCard = insuranceCard;
		this.claims = claims;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public InsuranceCard getInsuranceCard() {
		return insuranceCard;
	}
	
	public void setInsuranceCard(InsuranceCard insuranceCard) {
		this.insuranceCard = insuranceCard;
	}
	
	public List<Claim> getClaims() {
		return claims;
	}
	
	public void addClaim(Claim claim) {
		this.claims.add(claim);
	}
	
	public Claim getClaim(String id) {
		for (int i = 0; i < this.claims.size(); i++) {
			if (claims.get(i).getId().equals(id)) {
				return claims.get(i);
			}
		}
		
		return null;
	}
	
	public void setClaim(String id, Status status) {
		for (int i = 0; i < this.claims.size(); i++) {
			if (claims.get(i).getId().equals(id)) {
				claims.get(i).setStatus(status);
			}
		}
	}
	
	public void deleteClaim(String id) {
		for (int i = 0; i < this.claims.size(); i++) {
			if (claims.get(i).getId().equals(id)) {
				claims.remove(i);
			}
		}
	}
}
