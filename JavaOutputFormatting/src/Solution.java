import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("================================");
		for(int i=0;i<3;i++){
			String s1=sc.next();
			int x=sc.nextInt();
			System.out.print(s1);
			int size = s1.length();

			if(size<15){
				for(int j =size+1;j<=15;j++){
					System.out.print(" ");   
				}
			} else {
				System.out.println(x);
			}
			if(x<=99 && x>=10){
				System.out.print("0"+x);
				System.out.println();
			}else if(x<10){
				System.out.print("00"+x);
				System.out.println();
			}
			else{
				System.out.print(x);
				System.out.println();
			}
			//Complete this line
		}
		System.out.println("================================");
	}
}

