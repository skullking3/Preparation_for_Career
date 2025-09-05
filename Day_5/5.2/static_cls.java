class ner{
    public void printl(){
        System.out.println("Informations");
    }
    static class info{
        public void pri(){
            System.out.println("Car about");
        }
    }
}

public class static_cls {
    public static void main(String[] args) {
        ner sc = new ner();
        sc.printl();


        ner.info as = new ner.info();
        as.pri();
        
    }

    
}