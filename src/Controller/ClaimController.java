package Controller;

import java.util.List;

import Model.Claim;
import Model.Claim.Status;
import Model.ClaimProcessManager;
import Model.Customer;

public class ClaimController implements ClaimProcessManager {
	private Customer customer;
	
	public ClaimController(Customer customer) {
		super();
		this.customer = customer;
	}

	@Override
	public void add(Claim claim) {
		// TODO Auto-generated method stub
		this.customer.addClaim(claim);
	}

	@Override
	public void update(String claimId, Status newStatus) {
		// TODO Auto-generated method stub
		this.customer.setClaim(claimId, newStatus);
	}

	@Override
	public void delete(String claimId) {
		// TODO Auto-generated method stub
		this.customer.deleteClaim(claimId);
	}

	@Override
	public void getOne(String claimId) {
		// TODO Auto-generated method stub
		Claim claim = this.customer.getClaim(claimId);
		
		System.out.println("Claim ID: " + claim.getId());
        System.out.println("Claim Date: " + claim.getClaimDate());
        System.out.println("Insured Person: " + claim.getInsuredPerson());
        System.out.println("Card Number: " + claim.getCardNumber());
        System.out.println("Exam Date: " + claim.getExamDate());
        System.out.println("Claim Amount: " + claim.getClaimAmount());
        System.out.println("Status: " + claim.getStatus());
        System.out.println("Receiver Banking Info: " + claim.getReceiverBankingInfo());
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		for (Claim claim : this.customer.getClaims()) {
			System.out.println("Claim ID: " + claim.getId());
		}
	}
	
}
