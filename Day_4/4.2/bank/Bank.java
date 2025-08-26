package bank;

class Acc{
    public String name;
    protected String email;
    private String password;
    //default are set defaulty by java
   
   
    public void info(){
        System.out.println(name);
        System.out.println(email);
    }

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password=pass;
    }

}
public class Bank {
    public static void main(String[] args) {
        Acc acc1= new Acc();
        acc1.name="New User1";
        acc1.email="callvk@gmail.com";
        acc1.info();
        

        // acc1.password="ABCS";
        
        acc1.setPassword("Nothing");
        System.out.println("Password :"+acc1.getPassword());
        

        
    }
    
}
