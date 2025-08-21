package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메소드 호출 전: a = " + a);

        changePrimitive1(a);
        System.out.println("메소드1 호출 후: a = " + a);

        a = changePrimitive2(a);
        System.out.println("메소드2 호출 후: a = " + a);

    }

    static void changePrimitive1(int x) {
        x = 20;
    }

    static int changePrimitive2(int x) {
        x = 20;
        return x;
    }
}
