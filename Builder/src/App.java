public class App {
    public static void main(String[] args) throws Exception {
        Student student1=new Student();

        System.out.println(student1.toString());

        student1.setId(1).setName("Anu").setPhoneNumber("04545445454345");

        System.out.println(student1.toString());

    }
}
