public class Ecommerce{
	public static void main(String[] args) {
		int category = 1; // 1 = Electronics, 2 = Clothing, 3 = Books
        int days = 5;
        boolean tagAttached = true;
        switch (category) {
            case 1:
                if (days <= 7) {
                    System.out.println("Return allowed");
                } else {
                    System.out.println("Return not allowed");
                }
                break;
            case 2:
                if (tagAttached) {
                    System.out.println("Return allowed");
                } else {
                    System.out.println("Return denied");
                }
                break;
            case 3:
                System.out.println("Return denied");
                break;
        }

	}

}
	
