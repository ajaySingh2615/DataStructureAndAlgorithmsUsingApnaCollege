public class Main {
    public static void main(String[] args) {
        //Binary AND Operator
//        System.out.println("AND= " + (5 & 6));

        //Binary OR Operator
//        System.out.println("OR= " + (5 | 6));

        //Binary XOR Operator
//        System.out.println("XOR= " + (5 ^ 6));

        //Binary 1's Operator
//        System.out.println("1's= " + (~5));

        //Binary left shift Operator
//        System.out.println("Left Shift= " + (5<<2));

        //Binary right shift Operator
//        System.out.println("Right Shift= " + (6 >> 1));


//        oddOrEven(10);
        System.out.println(getIthBit(10, 3));
    }

    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    private static void oddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            //even
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}