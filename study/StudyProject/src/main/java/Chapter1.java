import io.reactivex.Observable;

public class Chapter1 {

    public void emit() {
        // Observable : 데이터의 변호가 발생하는 테이터 소스
        // just() : Observable 선언 방식
        // subscribe() : Observable을 구독, 위 함수를 호출해야 데이터가 변화됐을 때 이벤트를 수신할 수 있음
        // emit : RXJava에서는 Observable이 subscribe() 함수를 호출한 구독자에게 데이터를 발행하는것으로 표현
        Observable.just("Hello", "RXJava 2!!")
                .subscribe(System.out::println);
    }
    public static void main(String[] args) {
        Chapter1 demo = new Chapter1();
        demo.emit();
    }
}
