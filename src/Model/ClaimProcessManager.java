package Model;

import java.util.List;

import Model.Claim.Status;

public interface ClaimProcessManager {
	public void add(Claim claim);
	public void update(String claimId, Status newStatus);
	public void delete(String claimId);
	public void getOne(String claimId);
	public void getAll();
}
