public class palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
    private static boolean palindrome(String value){
        char[] valueArray = value.toCharArray();
        String reverseValue = "";
        for(int a=0; a<value.length(); a++){
            reverseValue = value.charAt(a) + reverseValue;
        }
        if(value.equals(reverseValue)){
            return true;
        }
        return false;
    }
}
