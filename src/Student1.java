
public class Student1 {
	private String name;
	private String major;
	private double gpa;
	
	public Student1() {}
	
	public Student1(String name, String major) {
		this.name=name;
		this.major=major;
	}
	
	public Student1(String name, String major, double gpa) {
		this.name=name;
		this.major=major;
		this.gpa=gpa;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getMajor() {
		return major;
		
	}
	public void setMajor(String major) {
		this.major=major;
	}
	public double getGpa() {
		return gpa;
		
	}
	public void setGpa(double gpa) {
		this.gpa=gpa;
	}
	
	public String toString() {
		return name + " " + major + " " + gpa;
	}
	
	public boolean equals (Student1 student) {
		
		return this.name.equals(student.getName())&&this.major.equals(student.getMajor());
	}


}
