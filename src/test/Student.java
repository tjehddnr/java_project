package test;

public class Student {

    // 클래스의 멤버 -> 필드(멤버변수), 메소드
    // 클래스는 필드, 메소드, 생성자를 가지고 있다.

    //멤버변수
    private String name;
    private char grade;
    private int age;

    public void printStudentInfo(){
        System.out.println("학생의 이름은 " + name);
        System.out.println("학생의 나이는 " + age);
        System.out.println("학생의 성적은 " + grade);
    }

    public String getName(){
        return name;
    }

    public char getGrade(){
        return grade;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGrade(char grade){
        this.grade = grade;
    }

    public void setAge(int age){
        this.age = age;
    }
}
