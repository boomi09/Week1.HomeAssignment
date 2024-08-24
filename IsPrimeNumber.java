package week1.Day2;

public class IsPrimeNumber {
    //Home Assignment
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int number=16;
         for (int i = 2; i < number; i++) {
        	 if(number%2==0) {
        		 System.out.println(number + "Is a Prime Number");
        	 }
        	 else {
        		 System.out.println(number+"Is Not a Prime Number");
        	 }
        	 break;
			
		}
	}

}
