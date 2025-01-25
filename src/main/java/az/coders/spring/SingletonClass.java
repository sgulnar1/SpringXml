package az.coders.spring;

public class SingletonClass {
    private static SingletonClass singletonClass;
    private SingletonClass() {}
    public static SingletonClass getObject() {
        if(singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}
