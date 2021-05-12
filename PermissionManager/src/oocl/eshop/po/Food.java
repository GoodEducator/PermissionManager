package oocl.eshop.po;

public class Food {
	private int fId;
	private String fName;
	private int mId;
	private double fPrice;
	private String fViewPath;

	public Food(String fName, int mId, double fPrice, String fViewPath) {
		super();
		this.fName = fName;
		this.mId = mId;
		this.fPrice = fPrice;
		this.fViewPath = fViewPath;
	}

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public double getfPrice() {
		return fPrice;
	}

	public void setfPrice(double fPrice) {
		this.fPrice = fPrice;
	}

	public String getfViewPath() {
		return fViewPath;
	}

	public void setfViewPath(String fViewPath) {
		this.fViewPath = fViewPath;
	}

}
