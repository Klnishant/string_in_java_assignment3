public class check_pallindrome {
    public static void main(String[] args) {
        String str = "2552";
        String rev_str = "";

        char[] arr = str.toCharArray();

        for (int i=arr.length-1; i>=0; i--)
        {
            rev_str += arr[i];
        }

        if (str.equals(rev_str))
        {
            System.out.println("It is a pallindrom");
        }
        else
            System.out.println("It is not a pallindrome");
    }
}
