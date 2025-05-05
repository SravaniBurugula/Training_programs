package com.ibm.exceptions;

class IllegalAgeException extends Exception{
	
}
class ElectionVoting{
	public void register(int age)throws IllegalAgeException{
		if(age<18) {
			throw new IllegalAgeException();
			
		}
		System.out.println("Registration completed");
	}
	}

	public class UserDefinedException {
		public static void main(String[] args) {
			System.out.println("start");
			ElectionVoting electionVoting = new ElectionVoting();
			try {
				electionVoting.register(17);
			}catch(IllegalAgeException e) {
				e.printStachTrace();
			}
			System.out.println("End");
		}

}

	public void printStachTrace() {
		// TODO Auto-generated method stub
		
	}
