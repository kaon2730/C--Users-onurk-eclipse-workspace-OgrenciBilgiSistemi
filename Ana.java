package bilgisistemi;

public class Ana {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "+9050000000");
		Teacher t2 = new Teacher("Graham Bell", "FZK", "+5000303404");
		Teacher t3 = new Teacher("Kül Yutmaz", "Biyo","0345454");
		Course tarih = new Course("Tarih", "101", "TRH");
		tarih.addTeacher(t1);
		Course fizik = new Course("Fizik", "101","FZK");
		fizik.addTeacher(t2);
		Course biyoloji= new Course("Biyoloji","101","Biyo");
		biyoloji.addTeacher(t3);
		 
		Student s1 = new Student("Ýnek Þaban", "123","4", tarih,fizik,biyoloji);
		s1.addBulkExamNote(100, 50, 60, 40, 20, 60, 30, 75,20);
		s1.isPass();
	
	
	}

}
