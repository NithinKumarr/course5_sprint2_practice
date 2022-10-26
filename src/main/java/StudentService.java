import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor

        //create HashSet object and add all the students object inside it

        //return the HashSet object
        Student student=new Student("Roy",001,295);
        Student student1=new Student("John",006,282);
        Student student2=new Student("Tom",005,290);
        Student student3=new Student("Alex",003,298);
        Student student4=new Student("Angel",004,299);
        Student student5=new Student("Jack",002,293);
        Set<Student> studentSet=new HashSet<>();
        studentSet.add(student);
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);
        return studentSet;
    }

    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object
        Set<String> students=new TreeSet<>();
        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> iterator= studentSet.iterator();
        //get all the name and add it inside the TreeSet object
        while (iterator.hasNext())
        {
            Student student=iterator.next();
            String name=student.getName();
            students.add(name);
//            System.out.println(student.getName());
        }
        //return the TreeSet object;
        return students;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>
        HashMap<String,Integer> hashMap=new HashMap<>();

        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator <Student>iterator= studentSet.iterator();

        int avg=0;
        String name="";
        //retrieve the Student object from the iterator
        for (Student s:studentSet)
        {
            avg=s.getTotalMarks()/3;
            name=s.getName();
            hashMap.put(name,avg);
        }
        //Use getter method to get TotalMarks of each student. calculate the average

        //add the student name and average marks in the HashMap object created in the
        //first line and return the map

        return hashMap;

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(studentName);
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}