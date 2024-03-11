package Model;

import java.util.Date;
import java.util.List;

public class Claim {
	public enum Status {
		New,
		Processing,
		Done
	}
	
	private String id;
    private Date claimDate;
    private String insuredPerson;
    private String cardNumber;
    private Date examDate;
    private List<String> documents; // ClaimId_CardNumber_DocumentName.pdf
    private double claimAmount;
    private Status status; // New,Processing, Done
    private String receiverBankingInfo; // Bank – Name – Number
    
	public Claim(String id, Date claimDate, String insuredPerson, String cardNumber, Date examDate,
			List<String> documents, double claimAmount, Status status, String receiverBankingInfo) {
		super();
		this.id = id;
		this.claimDate = claimDate;
		this.insuredPerson = insuredPerson;
		this.cardNumber = cardNumber;
		this.examDate = examDate;
		this.documents = documents;
		this.claimAmount = claimAmount;
		this.status = status;
		this.receiverBankingInfo = receiverBankingInfo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getClaimDate() {
		return claimDate;
	}

	public String getInsuredPerson() {
		return insuredPerson;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public Date getExamDate() {
		return examDate;
	}

	public double getClaimAmount() {
		return claimAmount;
	}

	public String getReceiverBankingInfo() {
		return receiverBankingInfo;
	}
	
	
}
