package student;

public class Student {
    private String major;
    private int number;
    public String getMajor(){
        return major;
    }
    public int getNumber(){
        return number;
    }
    public void setMajor(String major){
        this.major=major;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public void printStudentInfo(){
        System.out.println(major);
        System.out.println(number);
    }
}
