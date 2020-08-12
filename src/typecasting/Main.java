package typecasting;

public class Main {

	public static void main(String[] args) {
		Boy b = new Boy();
		Girl g = new Girl();
		Student sb = new Boy();//Up Casting
		Student sg = new Girl();//Up Casting
		Student s1 = sb;
		Student s2 = sg;
		Boy bs = (Boy)s1;//Down Casting
		Girl gs = (Girl)s2;//Down Casting
		Student[] stu = {b,g};
		for(int i = 0; i <= 100; i++) {
			switch(i % 2) {
			case 0:
				System.out.println(((Boy)stu[0]).name);
				break;
			case 1:
				System.out.println(((Girl)stu[1]).name);
				break;
			}
		}
		System.out.println(b.getTotalStudents());
	}
}
