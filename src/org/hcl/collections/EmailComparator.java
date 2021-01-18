package org.hcl.collections;

import java.util.Comparator;

public class EmailComparator implements Comparator<UserMail> {

	@Override
	public int compare(UserMail e1, UserMail e2) {
		// TODO Auto-generated method stub
		return e1.getEmail().compareTo(e2.getEmail());
	}

}
