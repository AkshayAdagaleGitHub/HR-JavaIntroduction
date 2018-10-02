import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many nodes would you like to add : ");
		int n = sc.nextInt();		
		list lt = new list();
		for(int i=0;i<n;i++) {
			int j = sc.nextInt();
			lt.createList(j);
		}
		//lt.printList();
		//System.out.println("Printing in Reverse : ");
		System.out.println();
		//lt.printReverse();
		System.out.println("Enter two numbers to swap : ");
		int first,second;
		first = sc.nextInt();
		second = sc.nextInt();
		lt.swap(first, second);
		sc.close();
	}

}
