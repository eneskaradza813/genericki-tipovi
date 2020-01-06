package generics;

import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {

        ArrayList<Person> personList = new ArrayList<>();
        
        Person p1 = new Person("John");
        Person p2 = new Person("David");
       
        personList.add(p1);
        personList.add(p2);
        
         ArrayList<Student> studentList = new ArrayList<>();
        
        Student s1 = new Student("Ben", "001/4");
        Student s2 = new Student("Adam", "002/5");
       
        studentList.add(s1);
        studentList.add(s2);
        
        show(studentList);
    }
    
    static void show(ArrayList<? extends Person> pList){
        for(Person person : pList){
            System.out.println(person.name);
        }
    }

}
