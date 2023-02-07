class PangramChecker {
    public static boolean isPangram(String s) {
        int[] chars = new int[26];
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                chars[c - 'a'] = 1;
            }
        }

        for (int i : chars) {
            if (i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        if (isPangram(s)) {
            System.out.println(s + " is a pangram.");
        } else {
            System.out.println(s + " is not a pangram.");
        }
    }
}

