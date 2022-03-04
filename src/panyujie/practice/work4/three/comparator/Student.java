package panyujie.practice.work4.three.comparator;

//Comparable 接口
public class Student{
    private String name;
    private String sno;
    private int age;

    public Student(String name, String sno, int age) {
        this.name = name;
        this.sno = sno;
        this.age = age;
    }

    Student(){
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Student)){
            return false;
        }
        Student student = (Student) o;
        return student.age == this.age && this.name.equals(student.name) && student.sno.equals(this.sno);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result*31 + name.hashCode();
        result = result*31 + sno.hashCode();
        result = result*31 + age;
        return result;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sno='" + sno + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
