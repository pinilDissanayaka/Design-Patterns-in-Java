public class Student{
    private int sId;
    private String name;
    private String phoneNumber;


    public Student setId(int sId){
        this.sId=sId;
        return this;
    }

    public Student setName(String name){
        this.name=name;
        return this;
    }

    public Student setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
        return this;
    }


    public String toString(){
        return "S ID =" + this.sId + "Name =" + this.name + "phone number ="+ this.phoneNumber;
    }

}