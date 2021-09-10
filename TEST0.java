import java.util.Scanner;

public class TEST0 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("number? ");
			num = sc.nextInt();
			if(num > 0) {
				System.out.println("positive intteger");
			} else if (num < 0) {
				System.out.println("negative number");
			}
			} while (num != 0);
			
			sc.close();
	
}
}
