package oocl.eshop.po;

public class Permission {
	
	private int mId;
	private int mStatus;
	
	public Permission(int mId, int mStatus) {
		super();
		this.mId = mId;
		this.mStatus = mStatus;
	}
	
	public int getmId() {
		return mId;
	}
	
	public void setmId(int mId) {
		this.mId = mId;
	}
	
	public int getmStatus() {
		return mStatus;
	}
	
	public void setmStatus(int mStatus) {
		this.mStatus = mStatus;
	}
	
}
