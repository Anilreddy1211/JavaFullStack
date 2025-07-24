import java.util.*;

class Perfect {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("number");
		int n=s.nextInt();
		double sq=Math.sqrt(n);
		if(sq==Math.floor(sq)) {
			System.out.println("perfect square");	
		}
		else {
			System.out.println("not a perfect squqre");
		}
		if (n >= 0) {
            for (int i = 1; i * i <= n; i++) {
                if (i * i == n) {
                	System.out.println("perfect squqre");
                	break;
                }
                else {
                	System.out.println("not a perfect squqre");
                }
                    
                }
            }

	}

}
