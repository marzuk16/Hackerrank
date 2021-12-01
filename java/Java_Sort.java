import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Java_Sort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        
        Collections.sort(studentList, (a, b) -> {
            if(a.getCgpa() == b.getCgpa()) {
                if(a.getFname().compareTo(b.getFname()) == 0) return 0;
                else return a.getFname().compareTo(b.getFname());
            }else if(a.getCgpa() > b.getCgpa()){
                return -1;
            }else return 1;
        });
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
