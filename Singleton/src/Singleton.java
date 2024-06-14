public class Singleton {
    private int data;
    private static Singleton singleton;
    
    
    private Singleton(int data){
        this.data=data;
    }

    public static Singleton getSingleton(int data){
        if(singleton==null){
            synchronized(Singleton.class){
                if(singleton==null){
                    singleton=new Singleton(data);
                }
            }
        }
        else{
            singleton=null;
        }
        return  singleton;
    }

    public void doSomething(){
        System.out.println(this.data);
    }
    
}
