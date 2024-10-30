package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();
    /* SingletonService 클래스의 인스턴스를 하나만 생성하여, instance 변수에 저장한다.
    static : 해당 인스턴스는 클래스 로딩 시점에 생성되며, 애플리케이션이 실행되는 동안 계속 유지된다.
    final : 인스턴스는 재할당이 불가능하고 변경할 수 없다. */

    /* 다른 클래스에서 인스턴스를 생성하지 않고도, 이미 생성된 인스턴스를 공유하여 사용한다.
    public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.
     */
    public static SingletonService getInstance(){
        return instance;
    }

    //외부에서 new SingletonService()를 통해 인스턴스를 생성하지 못하도록 막음
    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}