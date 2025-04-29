package mavenproject;

public class Multidimesionalarray {
     public static void main(String[] args) {
    	 int nums[][];
    	 nums=new int[2][5];
    	 for (int[] row : nums) {
    		 for (int element : row) {
    			 System.out.print(element + " ");}
    		 System.out.println();

    		 
    	 }
     }
}
