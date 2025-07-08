public class Pattern5 {
    public static void main(String[] args) {
        for(int i=0;i<=30;i++){
            for(int j=1;j<=30;j++){
               if(i + j == 9 + 1){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println(" ");
    }
}
