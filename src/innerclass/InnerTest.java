package innerclass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;

    static class InStaticClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 시용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");

        }

        static void sTest() {
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스 정적 변수 사용)");
            System.out.println("OutClass sInNum = " + sInNum + "(내부 클래스 정적 변수 사용)");

        }

    }

    private InClass inClass; //내부 클래스 자료형 변수를 먼저 선언

    public OutClass() {
        inClass = new InClass();
    }

    class InClass { //인스턴스 내부 클래스
        int inNum = 100; //내부 클래스의 인스턴스 변수
        //static int sInNum = 200; -> 인스턴스 내부 클래스에 정적 변수 선언 불가능

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");

        }

        //static void sTest() -? 정적 메서드도 정의 불가능
    }

    public void usingClass() {
        inClass.inTest();
    }
}
public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        sInClass.inTest();
        System.out.println( );
        System.out.println("정적 내부 클래스의 정적 메서드 호출");
        OutClass.InStaticClass.sTest();
       // outClass.usingClass();
    }
}
