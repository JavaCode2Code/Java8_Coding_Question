package com.scjp.java.code;

import java.time.LocalDate;
import java.time.Period;

/*Calculate the age of a person in years
*/
public class Calculate_Person_Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate birthDate=LocalDate.of(1985,12,13);
LocalDate currentDate=LocalDate.now();
int age=Period.between(birthDate, currentDate).getYears();
System.out.println("Age of Person: "+age);
	}

}
