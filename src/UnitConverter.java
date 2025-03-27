public class UnitConverter {

    public static String toBinary(int decimal) {
        // TODO: Convert decimal to binary string
        return Integer.toBinaryString(decimal); // Best practice : Use Integer built-in methods
    }

    public static String toHex(int decimal) {
        // TODO: Convert decimal to hexadecimal string
        return Integer.toHexString(decimal);
    }

    public static int binaryToDecimal(String binary) {
        // TODO: Convert binary string to decimal
        return Integer.parseInt(binary, 2);
    }


    public static void main(String[] args) {
        String binary =  toBinary(150) ; // 10010110
        String hex =  toHex(150); // 96

        System.out.println(binaryToDecimal("10010110")); // 150
    }
}
