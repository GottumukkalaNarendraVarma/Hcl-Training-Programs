package org.hcl.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) throws IOException {
		List<Student> students=new ArrayList();
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		for(int i=1;i<=1;i++) {
			System.out.println("Enter the student"+i+"details");
		    String name = br.readLine();
		    String college=br.readLine();
		    String erank=br.readLine();
		    students.add(new Student(name,college,erank));
		    
		}
		System.out.println(students);
		
		
		
		
		

	}

}
