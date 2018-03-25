/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

public class P13_NumbersRight {
	public static void main(String[] args) {
		for (int i=1;i<6 ;i++ ){
			for(int j=5;j>i;j--){
	            System.out.print(" ");
	        }
	        for(int y=0;y<i;y++){
	            System.out.print(i);
	        }
	        System.out.print("\n");
	    }
	}
}

// I used a help from stackoverflow.com, that gave me the idea of how to do this exercise.
