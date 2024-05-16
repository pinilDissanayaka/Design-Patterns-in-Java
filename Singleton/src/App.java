public class App {
    public static void main(String[] args) throws Exception {
        Singleton obj=Singleton.getSingleton(10);
        obj.doSomething();
    }
}
