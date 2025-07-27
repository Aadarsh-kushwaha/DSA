public class binarytodecima {
    public static void convert(int a){
        int pow=0;
        int dec=0;
        while(a>0){
            int r= a%10;
            dec = dec+ r*(int)Math.pow(2,pow);
            a=a/10;
            pow++;

        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        convert(101);
    }
}
