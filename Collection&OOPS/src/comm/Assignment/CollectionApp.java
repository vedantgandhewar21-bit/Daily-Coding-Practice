package comm.Assignment;

import java.util.*;

class Student {
	private int roll;
	private String name;
	private double marks;

	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	// Override equals() to search/delete by Roll No
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return roll == other.roll;
	}

	@Override
	public String toString() {
		return  String.format("Roll : %d  Name : %s  Marks : %.2f", roll, name, marks);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(roll);
	}
}

public class CollectionApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
//	Breakdown of the Code
//	List<Student>: This declares a variable of type List.
//	The <Student> part is a Generic, ensuring this list can only store Student objects (or their subclasses), which prevents errors like accidentally adding a String or Integer.
//	list: This is the name (identifier) of your variable.
//	new ArrayList<>(): This part creates the actual object in memory.
//	ArrayList is a specific implementation of the List interface that uses a resizable array internally.
//	The <> (diamond operator) tells Java to infer the type (Student) from the left side of the assignment.
        int choice;
        do {
        	System.out.println("\n 1.Add \n 2.Display \n 3. Search \n 4. Sort(Marks)\n 0.  Exit ");
        	System.out.println("Enter choice : ");
        	choice = sc.nextInt();
        	
        	switch(choice) {
        	case 1://Add
        		System.out.println("Enter Roll, Name, Marks : ");
        		list.add(new Student(sc.nextInt(),sc.next(),sc.nextDouble()));
        		break;
        		
        	case 2://Display
        		if(list.isEmpty()) 
        			System.out.println("List is Empty");
        		else
        			list.forEach(System.out::println );
        		break;
        		
        	case 3://Search
        		System.out.println("Enter Roll No to search :");
        		int r = sc.nextInt();
        		int idx= list.indexOf(new Student(r,"",0));
        		if (idx !=-1) 
        			System.out.println("Found : "+list.get(idx));
        		else
        			System.out.println("Stuent not found ");
        		break;
        		
        	case 4://Sort
        		list.sort(Comparator.comparing(Student::getMarks).reversed().thenComparing(Student::getName));
//        		How it works:
//        			Comparator.comparing(Student::getMarks): It first looks at the students' marks.
//        			.reversed(): This makes the primary sort descending. The students with the highest marks will appear at the top of the list.
//        			.thenComparing(Student::getName): This is the "tie-breaker." If two students have the exact same marks, it sorts them by their name in ascending (alphabetical) order.
                System.out.println("Sorted by marks (desc) and name (asc).");
        		break;
        		
        	}
        }while(choice!=0);
        sc.close();
	}
}

















































