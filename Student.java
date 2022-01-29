package bilgisistemi;

public class Student {
	Course c1;
	Course c2;
	Course c3;
	String name;
	String stuno;
	String classes;
	double avarage;
	boolean isPass;
	
	Student(String name, String stuno, String classes, Course c1, Course c2, Course c3){
		this.name = name;
		this.stuno=stuno;
		this.classes= classes;
		this.c1 =c1;
		this.c2=c2;
		this.c3=c3;
		this.avarage=0.0;
		this.isPass=false;
	}
	
	void addBulkExamNote(int note1, int note2, int note3, int sozluNote1, int etkisi1, int sozluNote2, int etkisi2, int sozluNote3, int etkisi3) {
		if(note1>=0 && note1 <=100) {
		this.c1.note=note1;
		}
		if(note2>=0 && note2 <=100) {
			this.c2.note=note2;
			}
		if(note3>=0 && note3 <=100) {
			this.c3.note=note3;
			}
		if(sozluNote1>=0 && sozluNote1 <=100) {
			this.c1.sozluNote = sozluNote1;
			this.c1.sozluNoteetkisi= etkisi1;
		}
		if(sozluNote2>=0 && sozluNote2 <=100) {
			this.c2.sozluNote = sozluNote2;
			this.c2.sozluNoteetkisi= etkisi2;
		}
		if(sozluNote3>=0 && sozluNote3 <=100) {
			this.c3.sozluNote = sozluNote3;
			this.c3.sozluNoteetkisi= etkisi3;
}
		}
		
	void printNote() {
		System.out.println(c1.name + " sýnavý notu : " + c1.note);
		System.out.println(c2.name + " sýnavý notu : " + c2.note);
		System.out.println(c3.name + " sýnavý notu : " + c3.note);
		System.out.println(c1.name + " sözlüsü notu : " + c1.sozluNote + ". notun etkisi : %" + c1.sozluNoteetkisi);
		System.out.println(c2.name + " sözlüsü notu : " + c2.sozluNote + ". notun etkisi : %" + c2.sozluNoteetkisi);
		System.out.println(c3.name + " sözlüsü notu : " + c3.sozluNote + ". notun etkisi : %" + c3.sozluNoteetkisi);
		System.out.println("Ortalama : " + this.avarage);
	}
	void isPass() {
		this.avarage=( ((this.c1.note * (100-this.c1.sozluNoteetkisi)/100) + (this.c1.sozluNote* this.c1.sozluNoteetkisi/100)) +
				((this.c2.note * (100-this.c2.sozluNoteetkisi)/100) + (this.c2.sozluNote* this.c2.sozluNoteetkisi/100)) +
				((this.c3.note * (100-this.c3.sozluNoteetkisi)/100) + (this.c3.sozluNote* this.c3.sozluNoteetkisi/100)) ) / 3;
		if(this.avarage>55) {
			System.out.println("Geçti");
			this.isPass = true;
		} else {
			System.out.println("Kaldý");
			this.isPass=false;
		}
		printNote();
	}
}
