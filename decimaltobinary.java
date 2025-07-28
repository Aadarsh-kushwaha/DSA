
class decimaltobinary {
    public static void convert(int a){
        int binary[] = new int[40];
        int i = 0;

        while(a > 0){
            binary[i] = a % 2;
            a = a / 2;
            i++;
        }

        i--; // IMPORTANT: reduce i by 1 before accessing array

        while(i >= 0){
            System.out.print(binary[i]);
            i--;
        }
    }

    public static void main(String[] args) {
        int d = 16;
        convert(d);  // Output: 1111
    }
}