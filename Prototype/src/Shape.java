public interface Shape {
    Shape clone();
    public void draw();
} 


class Circle implements Shape{
    private String color;

    public Circle(String color){
        this.color=color;
    }

    public void draw(){
        System.out.println("Draw circle.and it color is " + this.color);
    }

    public Circle clone(){
        Circle cloneCircle=new Circle(this.color);
        return cloneCircle;
    }
}


