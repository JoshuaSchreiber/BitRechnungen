public class Main {
    public static void main(String[] args) {
        System.out.println(a2returnResult(0b10010011, 0b10011100, "&"));
        System.out.println(a2returnResult(0b10010011, 0b10011100, "|"));
        System.out.println(a2returnResult(0b10010011, 0b10011100, "^"));
    }

    public static String a2returnResult(int value, int maske, String operation){
        int result = 0;
        if(operation == "&"){
            result = value & maske;
        }else if(operation == "|"){
            result = value | maske;
        }else if(operation == "^"){
            result = value ^ maske;
        }
        return String.format("%8s", Integer.toBinaryString(result)).replace(' ', '0');
    }

}
