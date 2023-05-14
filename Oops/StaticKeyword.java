package Oops;

public class StaticKeyword {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.schoolName = "JMV";

        Student2 s2 = new Student2();
        System.out.println(s2.schoolName);

        Student2 s3 =  new Student2();
        s3.schoolName = "ABC";
    }
}
class Student2 {
    String name;
    int roll;

    static String schoolName;

    String getName() {
        return this.name;
    }
    void setName(String name) {
        this.name = name;
    }
}
