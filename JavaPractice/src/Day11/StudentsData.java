package Day11;

public class StudentsData {

	int sid;
	String sname;
	char sgrade;
	
	void printStudentData()
	{
		System.out.println(sid+"  "+sname+"  "+sgrade);
	}
	
	void setStudentData(int id,String name,char grade)
	{
		sid=id;
		sname=name;
		sgrade=grade;
	}
	
	StudentsData(int id,String name,char grade)
	{
		sid=id;
		sname=name;
		sgrade=grade;
	}
	
	public static void main(String[] args) {
		//using constructor
		StudentsData sd=new StudentsData(10, "Joe", 'A');
		sd.printStudentData();
		
		//Using Object Reference variables
		sd.sid=100;
		sd.sname="Aisha";
		sd.sgrade='A';
		sd.printStudentData();
		
		//using method
		sd.setStudentData(101, "Sangu", 'B');
		sd.printStudentData();
		
		
		
		
	}
}
