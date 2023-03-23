import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("hi" ,12);
        Student student1 = new Student("ti",17);
        Student student2 = new Student("hjk",16);
        Student student3 = new Student("hjk",16);
        Student student4 = new Student("hjk",16);
        Student student5 = new Student("hjk",16);
        Student student6 = new Student("hjk",16);
        Student student7 = new Student("hjk",16);
        Student student8 = new Student("hjk",16);
        Student student9 = new Student("hjk",16);
        LinkedList<Student> f = new LinkedList<>();
        f.add(student);
        f.add(student1);
        f.add(student2);
        f.add(student3);
        f.add(student4);
        f.add(student5);
        f.add(student6);
        f.add(student7);
        f.add(student8);
        f.add(student9);
        Collections.sort(f);

        System.out.println(f+"\n");

    }
}