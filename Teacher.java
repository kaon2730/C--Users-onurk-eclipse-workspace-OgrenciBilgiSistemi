package bilgisistemi;
public class Teacher {
	String name;
	String mpno;
	String branch;
	
	Teacher(String name, String branch, String mpno){
		this.name = name;
		this.branch=branch;
		this.mpno=mpno;
		
		}
	void print() {
		System.out.println("Ad� \t: " + name);
		System.out.println("Tel No \t: " + mpno);
		System.out.println("Brans� \t: " + branch);
	}
}
