interface Computer{
    
    void code();
    
    void test();

}
class Laptop implements Computer{
    
    @Override
    public void code(){
        System.out.println("code,compile,run");
    }
    
    @Override
    public void test(){
        System.out.println("Testing..");
    }

}
class Desktop implements Computer{
    
    @Override
    public void code(){
        System.out.println("code,compile,run: Faster");
    }
    
    @Override
    public void test(){
        System.out.println("Testing Fast..");
    }

}

class Developer{
   
    public void devApp(Computer com){
        com.code();
        com.test();
    }

}

public class Interfaces {
    public static void main(String[] args){
        
        Developer dev = new Developer();
        
        dev.devApp(new Laptop());
        
        dev.devApp(new Desktop());
    }

}