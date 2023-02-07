
class MaximumOccurringCharacter {
    public static char findMaxOccurringCharacter(String s) {
        int[] chars = new int[256];
        int max = 0;
        char maxChar = ' ';

        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)]++;
            if (chars[s.charAt(i)] > max) {
                max = chars[s.charAt(i)];
                maxChar = s.charAt(i);
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Maximum occurring character: " + findMaxOccurringCharacter(s));
    }
}
