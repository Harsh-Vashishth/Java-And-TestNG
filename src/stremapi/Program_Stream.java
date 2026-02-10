package stremapi;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student{
	int rollNo;
	String name;
	String dept;
	int marks;
	public Student(int rollNo, String name, String dept, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(marks);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks;
	}
	
	
}


public class Program_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Rahul","ECE",90);
		Student s2 = new Student(2, "Rohan","CSE", 87);
		Student s3 = new Student(3, "Shreya","ECE",90);
		Student s4 = new Student(3, "Harsh","CSE",100);

		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);list.add(s2);list.add(s3);list.add(s4);
		
		//filter on the basis of R
//		List<Student> filterList = list.stream().filter(s->s.name.startsWith("R")).collect(Collectors.toList());
//		
//		filterList.stream().forEach(s->System.out.println(s.rollNo+":"+s.name));
		
	
		
		//sort on marks
		
		list.stream().sorted(Comparator.comparingInt(s->s.marks))
		.forEach(s->System.out.println(s.name));
		
		
		System.out.println("*****");
		
		//sort on marks in descending order
		
		list.stream().sorted(Comparator.comparing(Student:: getMarks).reversed())
		.forEach(s->System.out.println(s.name));
		
		System.out.println("*****");
		//sort on name in ascending order
		
		list.stream().sorted((a,b)->a.getName().compareTo(b.getName()))
		.forEach(s->System.out.println(s.name));
		
		//total marks
		System.out.println();
		System.out.println("Marks Total");
		
		int sum = list.stream().map(Student::getMarks).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		System.out.println();
		
		System.out.println("Maximum Marks");
		Optional max = list.stream().map(Student::getMarks).reduce(Integer::max);
		System.out.println(max.get());
		System.out.println();
		
		
		System.out.println("Count students scoring more than 95");
		Long count = list.stream().filter(s->s.marks>=95).count();
		System.out.println(count);
		
		System.out.println();
		
		System.out.println("First student scoring more than 95");
		Optional<Student> opt = list.stream().filter(s->s.marks>=95).findFirst();
		System.out.println(opt.get().name);
		
		System.out.println();
		System.out.println("Maximum marks in each group");
		Map<String, Optional<Student>> groupList = list.stream().collect(
				
				Collectors.groupingBy(Student::getDept,
						Collectors.maxBy((a,b)->a.getMarks()-b.getMarks())));
		
		for(Map.Entry<String, Optional<Student>>e:groupList.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue().get().marks);
		}
		
		System.out.println();
		System.out.println("Limit***");
		list.stream().limit(3).forEach(s->System.out.println(s.name));
		
		System.out.println();
		
		//distinct
		System.out.println("distinct***");
		list.stream().distinct().forEach(s->System.out.println(s.name));	
		
		//skip
		System.out.println();
		System.out.println("skip***");
		list.stream().skip(1).forEach(s->System.out.println(s.name));	
		
		System.out.println();
		System.out.println("Fibonacci****");
		Stream.iterate(new int[] {0,1}, arr-> new int[] {arr[1],arr[1]+arr[0]}).limit(10).forEach(s->System.out.print(s[0]+" "));
		
	
		System.out.println("\nRANDOM***");
		Stream<Double> randomList = Stream.generate(Math:: random).limit(3);
		randomList.forEach(s->System.out.print(s+" "));
		
		System.out.println("\nBoxed INT STREAM TO STREAM <INTEGER>");
		List<Integer>list2 = IntStream.range(1, 5).boxed().collect(Collectors.toList());
		list2.forEach(s->System.out.print(s+" "));
		
		System.out.println("Sort on the basis of length");
		List<String> listStr2 = Arrays.asList("Hello", "a", "Them", "no");
		listStr2.stream().sorted(Comparator.comparingInt(String::length)).forEach(s->System.out.println(s));
		
	}

}
