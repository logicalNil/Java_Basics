public class HexatoBinary {
    public static void main(String[] args) {
        String hex = "1A";
        String bin = "";
        for (int i = 0; i < hex.length(); i++) {
            switch (hex.charAt(i)) {
                case '0':
                    bin += "0000";
                    break;
                case '1':
                    bin += "0001";
                    break;
                case '2':
                    bin += "0010";
                    break;
                case '3':
                    bin += "0011";
                    break;
                case '4':
                    bin += "0100";
                    break;
                case '5':
                    bin += "0101";
                    break;
                case '6':
                    bin += "0110";
                    break;
                case '7':
                    bin += "0111";
                    break;
                case '8':
                    bin += "1000";
                    break;
                case '9':
                    bin += "1001";
                    break;
                case 'A':
                    bin += "1010";
                    break;
                case 'B':
                    bin += "1011";
                    break;
                case 'C':
                    bin += "1100";
                    break;
                case 'D':
                    bin += "1101";
                    break;
                case 'E':
                    bin += "1110";
                    break;
                case 'F':
                    bin += "1111";
                    break;
            }
        }
        System.out.println(bin);

    }
}
