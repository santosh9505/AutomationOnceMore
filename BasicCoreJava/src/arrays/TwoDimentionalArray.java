package arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		/*String[][] data = new String[4][2];
		
		//Row1
		data[0][0] = "username";
		data[0][1] = "password";
		
		data[1][0] = "user1";
		data[1][1] = "password1";
		
		data[2][0] = "user2";
		data[2][1] = "password"; */
		
		int [][] t = new int[5][2];
		
		t[0][0] = 1;
		t[0][1] = 100;
		
		t[1][0] = 2;
		t[1][1] = 200;
		
		t[2][0] = 3;
		t[2][1] = 300;
		
		t[3][0] = 4;
		t[3][1] = 400;
		
		t[4][0] = 5;
		t[4][1] = 500;
		
		
		System.out.println(t[0][1]);
		
	for (int r=0;r<5;r++){
		 
		for (int c=0;c<2;c++) {
				System.out.println(t[r][c]);
			}
		}
		
		
	}
		
		
	}


