package org.hcl.inheritances;

public class SavingsAccount extends Account {
	private String orgName;
	String accName, accNo, bankName, tinNumber;

	public SavingsAccount() {

	}

	public SavingsAccount(String orgName, String accName, String accNo, String bankName, String tinNumber) {
		super();
		this.orgName = orgName;
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
		this.tinNumber = tinNumber;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
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

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	SavingsAccount sa = new SavingsAccount();

	public void display() {
		System.out.println(sa.orgName);
		sa.dispaly();
	}

}
