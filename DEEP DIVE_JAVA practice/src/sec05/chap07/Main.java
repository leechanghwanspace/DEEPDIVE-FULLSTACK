package sec05.chap07;

public class Main {
    public static void main(String[] args) {

        String ycCreed = YalcoChicken.CREED;
//        YalcoChicken.CREED = "우리의 튀김옷은 바삭하다"; // ⚠️ 불가

        final YalcoChicken store1 = new YalcoChicken(3, "판교");

        //  ⚠️ 불가
//        store1 = new YalcoChicken(17, "강남");
        // 집문서는 final이라 바꿀 수 없지만,
        // 가구는 즉, 인테리어는 바꿀 수 있다.
        //  💡 요소 변경은 가능
        store1.name = "선릉";
    }
}
