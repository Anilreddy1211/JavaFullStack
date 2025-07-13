import java.util.Scanner;
public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("num");
		int sum=0;
		int num=sc.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
				System.out.println(i);
			}
			
			
				
		}
		if(sum==num) {
			System.out.println("Perfect");
	
			
		}

	}

}
