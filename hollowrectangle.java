public class hollowrectangle {
    public static void main(String[] args) {
        for(int i=0;i<=8;i++){
        for(int j=0;j<=6;j++){
            if(j==0 || j==6 || i==0|| i==8){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

        }
            System.out.println();
    }
    }
    
}
