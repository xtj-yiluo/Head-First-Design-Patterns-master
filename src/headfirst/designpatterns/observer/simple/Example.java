package headfirst.designpatterns.observer.simple;

public class Example {

    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();
        // 注册
        SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

        //设置 更新
        simpleSubject.setValue(80);

        //移除注册
        simpleSubject.removeObserver(simpleObserver);
    }
}
