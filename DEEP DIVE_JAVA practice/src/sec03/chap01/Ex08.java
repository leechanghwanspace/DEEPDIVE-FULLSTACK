package sec03.chap01;

public class Ex08 {
    public static void main(String[] args) {

        int int1 = 3;

        int int2 = int1++; // 🔴
        int int3 = ++int1;
        int int4 = -(int2-- * --int3);

        int x = 1;

        //  메서드 안으로도 '반환'되어 사용되는 것
        System.out.println(x++); //1, 1부터 출력하고 뒤에 증가해서 2
        System.out.println(++x); //3, 2의값이 증가되어서 3이 출력
        System.out.println(x);   //3, 그대로 출

//        //  ⚠️ 리터럴에는 사용 불가
//        int int5 = 3++;
//        int int6 = --3;
    }
}
