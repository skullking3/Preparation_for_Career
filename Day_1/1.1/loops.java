public class loops {
    public static void main(String[] args) {
        int i,j=11,k=21;
        //For loop used here
        for(i=0;i<=5;i++){
            System.out.println(i);
        }

        //For-each loop used here
        int[] l={20,50,30,60,40};
        for(int q : l){
            System.out.println(q);
        }


        //While loop used here
        while(j<=15){
            System.out.println(j);
            j++;
        }

        //do-while loop used here
        do{
            System.out.println(k);
            k++;
        }while(k<=25);
    }
}
