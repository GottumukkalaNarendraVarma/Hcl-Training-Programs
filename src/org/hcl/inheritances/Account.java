package org.hcl.inheritances;

public class Account {
	protected String accName, accNo, bankName;
	Account a = new Account();

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

	protected void dispaly() {
		System.out.println(a.getAccName() + a.getAccNo() + a.getBankName());
	}

}
