package org.hcl.inheritances;

public class CurrentAccount extends Account {
	private String tinNumber;
	String accName, accNo, bankName;

	public CurrentAccount() {

	}

	public CurrentAccount(String tinNumber, String accName, String accNo, String bankName) {
		super();
		this.tinNumber = tinNumber;
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	CurrentAccount ca = new CurrentAccount();

	public void display() {
		ca.dispaly();
		System.out.println(ca.getTinNumber());

	}

}
