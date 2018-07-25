package com.lab6_2;


public class Person {


		private String firstName;
		private String lastName;
		private char gender;

		public Person() {
			super();
		}
		
		public Person(String firstName, String lastName, char gender) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}
		
		public String getFullName() {
			return firstName +" "+lastName;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			String str="First Name: "+ firstName +"\nLast Name: "+ lastName +"\nGender: "+ gender; 
			return str;
		}
		
			
		
	}



