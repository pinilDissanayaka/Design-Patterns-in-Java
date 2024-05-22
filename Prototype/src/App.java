public class App {
    public static void main(String[] args) throws Exception {
        Shape c1=new Circle("Red");

        c1.draw();

        Shape c2=c1.clone();

        c2.draw();
    }
}
