public class ShapeFactory {
    private static Shape shape;

    public static Shape getInstant(String request){
        if(request == null){
            shape=null;
        }
        else if(request.equalsIgnoreCase("circle")){
            shape=new Circle();
        }
        else if(request.equalsIgnoreCase("triangle")){
            shape=new Triangle();
        }
        else{
            shape=null;
        }
        return shape;
    }
}
