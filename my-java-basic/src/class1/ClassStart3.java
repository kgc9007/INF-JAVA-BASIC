package class1;

public class ClassStart3 {
    public static void main(String[] args) {

        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);

        // 변수 선언과 객체 생성

        // Student student1;
        // Student 타입을 받을 수 있는 변수 student1 선언

        // student1 = new Student();
        // 메모리에 실제 Student 객체(인스턴스) 생성, 메모리 공간 확보
        // student1 변수는 new 키워드를 통해 만들어낸 Student 객체의 참조값을 보관

    }
}
