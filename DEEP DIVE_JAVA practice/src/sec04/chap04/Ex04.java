package sec04.chap04;

public class Ex04 {
    public static void main(String[] args) {

        int lineWidth = 5;

        while (lineWidth > 0) {
            int starsToPrint = lineWidth--;
            while (starsToPrint-- > 0) {
                System.out.print("*");
            }
            System.out.println();
        }

        //  for 문으로 다시 작성
        for (int i = lineWidth; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
