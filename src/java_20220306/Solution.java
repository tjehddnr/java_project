package java_20220306;

//public class Solution {
//    public static void main(String[] args) {
//        byte b = 1;
//        short s = 2;
//        char c = 'A';
//
//        int finger = 10;
//        long big = 100_000_000_000L;
//        long hex = 0xFFFF_FFFF_FFFF_FFFFL;
//        int octNum = 010;
//        int hexNum = 0x10;
//        int binNum = 0b10;
//
//        System.out.printf("b=%d%n", b);
//        System.out.printf("s=%d%n", s);
//        System.out.printf("c=%c, %d %n", c, (int)c);
//        System.out.printf("finger=[%5d]%n", finger);
//        System.out.printf("finger=[%-5d]%n", finger);
//        System.out.printf("finger=[%05d]%n", finger);
//        System.out.printf("big=%d%n", big);
//        System.out.printf("hex=%#x%n", hex);
//        System.out.printf("ocNum=%o, %d%n", octNum, octNum);
//        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
//        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
//    }
//}
// You may use import as below.

// You may use import as below.

class Solution {
    public int solution(int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length; i++)
            if (650 <= scores[i] || scores[i] < 800)
                count += 1;
        return count;   
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] scores = {650, 722, 914, 558, 714, 803, 650, 679, 669, 800};
        int ret = sol.solution(scores);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}