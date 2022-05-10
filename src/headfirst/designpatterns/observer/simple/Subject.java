package headfirst.designpatterns.observer.simple;

/**
 * 主题
 */
public interface Subject {
    /**
     * 注册
     *
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 移除注册
     *
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
