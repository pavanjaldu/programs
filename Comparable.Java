/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Student implements Comparable<Student>{
    int no;
    String name;
    int age;
    String course;
    Student(int no, String name, int age,String course){
        this.no = no;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    

    public int compareTo(Student st){
        if(this.age > st.age)
            return 1;
        else if(this.age < st.age)
            return -1;
        else
            return 0;
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Student s1 = new Student(101, "michael",25,"arts");
		Student s2 = new Student(102, "james",20,"science");
		Student s3 = new Student(103, "pam",26,"IT");
		
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		Collections.sort(listOfStudents);
		listOfStudents.forEach( st -> System.out.println( st.no +" : " +st.name + " : " +st.age +" : " +st.course));
	}
}
