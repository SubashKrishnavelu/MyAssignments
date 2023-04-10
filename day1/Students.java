package Week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("Student Id: "+id);
	}
	
	public void getStudentInfo(int id, String name) {
		
		System.out.println("Student Id: "+id+ " Student Name: "+name);
	}
	
	public void getStudentInfo(String email, String phoneNumber) {
		
		System.out.println("Email Id: "+email+" Phone Number"+phoneNumber);
	}

	public static void main(String[] args) {
		
		Students st = new Students();
		
		st.getStudentInfo(20);
		st.getStudentInfo(20, "Subash");
		st.getStudentInfo("subash@gmail.com","9566908018");
	}

}
