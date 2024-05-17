public class Shape {
    private float area;
    
    public Shape(){
        this.area=0;
    }

    public void getshape(){
        System.out.println("This is the shape");
    }
}

class Circle extends Shape{
    public void getshape(){
        System.out.println("This is the circle");
    }
}

class Triangle extends Shape{
    public void getshape(){
        System.out.println("This is the triangle");
    }
}


