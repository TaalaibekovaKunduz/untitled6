public class Student implements Comparable {
    private String name;

    private int agh;

    public Student(String name, int agh) {
        this.name = name;
        this.agh = agh;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgh() {
        return agh;
    }

    public void setAgh(int agh) {
        this.agh = agh;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", agh=" + agh +
                '}';
    }



    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        return this.agh-s.agh;
    }
}
