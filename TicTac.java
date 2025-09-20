package Javaproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TicTac {
	private int choice;
	private String Value;
 
static HashMap<Integer, int[]> mp = new HashMap<>();

static String[][]BackendBoard = new String[3][3];

public static void Updatevalues (int choice,String Value,HashMap<Integer, int[]> mp,String [][]BackendBoard) {
	
	int arr[] = mp.get(choice);
	int i = arr[0];
	int j = arr[1];
	if(BackendBoard[i][j] == null) {
		BackendBoard[i][j] = Value;
		System.out.println("Added Successfully");
	}
	
	else {
		System.out.println("already Booked");
	}
	
}

public static boolean WinorDraw(String [][]BackendBoard, String Value) {
	
		if(BackendBoard[0][0] == Value && BackendBoard [1][1] == Value &&  BackendBoard[2][2] == Value) {
			System.out.println(Value + "Wins");
			return true;
		}
		if(BackendBoard[0][2] == Value && BackendBoard [0][1] == Value &&  BackendBoard[2][1] == Value) {
			System.out.println(Value + "Wins");
			return true;
		}
		if(BackendBoard[0][0] == Value && BackendBoard [1][0] == Value &&  BackendBoard[2][0] == Value) {
			System.out.println(Value + "Wins");
			return true;
		}
		if(BackendBoard[0][1] == Value && BackendBoard [1][1] == Value &&  BackendBoard[2][1] == Value) {
			System.out.println(Value + "Wins");
			return true;
		}
		if(BackendBoard[0][2] == Value && BackendBoard [1][2] == Value &&  BackendBoard[2][2] == Value) {
			System.out.println(Value + "Wins");
			return true;
		}
		if(BackendBoard[0][0] == Value && BackendBoard [0][1] == Value &&  BackendBoard[0][2] == Value) {
			System.out.println(Value + "Wins");
			return true;
		}
		if(BackendBoard[1][0] == Value && BackendBoard [1][1] == Value &&  BackendBoard[1][2] == Value) {
			System.out.println(Value + "Wins");
			return true;
		}
		if(BackendBoard[2][0] == Value && BackendBoard [2][1] == Value &&  BackendBoard[2][2] == Value) {
			System.out.println(Value + "Wins");
			return true;
		}
		return false;
}
	
    
public static void main(String [] args) {
	
	for(String[] can:BackendBoard) {
	System.out.println(Arrays.toString(can));
	}
	ArrayList<int[]> lis = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	TicTac User1 = new TicTac();
	TicTac User2 = new TicTac();
	
	int arr1[] = {0,0};
	mp.put(1, arr1);
	int arr2[] = {0,1};
	mp.put(2, arr2);
	int arr3[] = {0,2};
	mp.put(3, arr3);
	int arr4[] = {1,0};
	mp.put(4, arr4);
	int arr5[] = {1,1};
	mp.put(5, arr5);
	int arr6[] = {1,2};
	mp.put(6, arr6);
	int arr7[] = {2,0};
	mp.put(7, arr7);
	int arr8[] = {2,1};
	mp.put(8, arr8);
	int arr9[] = {2,2};
	mp.put(9, arr9);
	

	System.out.println("Welcome to TickTack");
	System.out.println("Once the game is initated the user starts first will always be x and the second user would be o");
	System.out.println("Think of the tic-tak as a 2d array displayed below");
	
	int [][] twod = new int [3][3];
	int num = 1;
	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
			twod[i][j] = num++;
		}
	}
	
	for(int [] val : twod) {
		System.out.println(Arrays.toString(val));
	}
	
	
	int l = 0;
	
	while(l < BackendBoard.length * BackendBoard.length) {
		System.out.println("X turn - Specify the number");
		User1.choice = scan.nextInt();
		User1.Value = "X";
		TicTac.Updatevalues(User1.choice, User1.Value, mp, BackendBoard);
		boolean flag1 = TicTac.WinorDraw(BackendBoard, User1.Value);
		if(flag1 == true) {
			return;
		}
		for(String[] can:BackendBoard) {
			System.out.println(Arrays.toString(can));
			}
		l++;
		System.out.println("O turn - Specify the number");
	    User2.choice = scan.nextInt();
	    User2.Value = "O";
		TicTac.Updatevalues(User2.choice, User2.Value, mp, BackendBoard);
		boolean flag2 = TicTac.WinorDraw(BackendBoard, User2.Value);
		if(flag2) {
			return;
		}
		for(String[] can:BackendBoard) {
			System.out.println(Arrays.toString(can));
			}
		l++;
		if(l==9) {
			break;
		}
		
	}
	
	System.out.println("MatchDraw");
}

}
