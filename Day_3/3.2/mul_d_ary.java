public class mul_d_ary {
    public static void main(String[] args) {
        int[][][] a={};
        int b=1;
        for(int i=0;i<=2;i++){
            for(int j=0;j<=3;j++){
                for(int k=0;k<=3;k++){
                    a[i][j][k]=b++;
                }
            }
        }
        for(int i=0;i<=a.length;i++){
            for(int j=0;j<=a[i].length;j++){
                for(int k=0;k<=a[i][j].length;k++){
                    System.out.println(a[i][j][k]);
                }
            }
        }
    }
    
}
