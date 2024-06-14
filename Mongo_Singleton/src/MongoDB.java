
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class MongoDB {
    private int port;
    private static MongoDB connection;

    private MongoDB(port){
        this.port=port;
        this.connection=null;
    }

    public static MongoDB getConnection(){
        if(connection == null){
            synchronized(MongoDB.class){
                if(connection==null){
                    try {
                        MongoClient connection = new MongoClient("localhost", this.port);
             
                        MongoCredential credential = MongoCredential.createCredential(
                                      "GFGUser", "mongoDb",
                                      "password".toCharArray());

                        System.out.println(
                            "Successfully Connected"
                            + " to the database");
             
                        MongoDatabase database = connection.getDatabase("mongoDb");

                        System.out.println("Credentials are: " + credential);

                        return  connection;
                    }
                    catch (Exception e) {
                        System.out.println("Connection establishment failed");
                        System.out.println(e);
                    }
                }
                else{
                    System.out.println("Connection already exists.");
                }
            }
        }
        else{
            System.out.println("Connection already exists.");
        }
    }
    
}