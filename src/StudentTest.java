
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 st1= new Student1("John","CS", 3.5);
		Student1 st2=new Student1();
		Student1 st3= new Student1("John","CS", 3.5);


		System.out.println("Student 1 "+st1.toString());
		
		st2.setName("Mary Ann");
		st2.setMajor("CE");
		st2.setGpa(3.3);
		System.out.println("Student 2 "+st2.toString());
		
		if(st1.equals(st3)) {
			System.out.println("Student 1 and student 3 have the same name and major");
		}
		else {
			System.out.println("Student 1 and student 3 are different people");
		}
		

	}

}
