package test;

    public class Main {
    public static void main(String[] args) {

        Student kim = new Student();    //Student 타입의 kim객체 생성 (new라는 키워드를 사용했다)
        kim.printStudentInfo();         //Student의 printStudentInfo 메소드 호출
        kim.setName("태균");               //객체 kim의 name 필드 초기화
        kim.setAge(35);                   //객체 kim의 age 필드 초기화
        kim.setGrade('A');                //객체 kim의 grade 필드 초기화

        System.out.println("-----");

        System.out.println(kim.getName());

        System.out.println("-----");
        kim.printStudentInfo();


    }
}
