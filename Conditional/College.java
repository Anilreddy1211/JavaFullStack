public class College{
	public static void main(String[] args) {
		int sem = 4;
        String dept = "CS";
        switch (sem) {
            case 1,2:
                System.out.println("Basic Science Subjects");
                break;
            case 3, 4:
                if (dept.equals("CS")) {
                    System.out.println("Subjects: DS, DBMS");
                } else if (dept.equals("ME")) {
                    System.out.println("Subjects: Thermo, Fluids");
                }
                break;
            case 5,6:
                System.out.println("Add electives if credits > 20");
                break;
            case 7, 8:
                System.out.println("Project/Internship Decision");
                break;
        }
	}

}
