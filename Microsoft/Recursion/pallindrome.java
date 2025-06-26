import java.util.*;
class pallindrome{
    public static  boolean  check(int i, int n, String s) {
        if(i>=n/2) return true;
        if(s.charAt(i)!=s.charAt(n-i-1))
        return false;
        return check(i+1, n, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String S="madsm";
        int i=0;
        int n = S.length();
        boolean ans=check(i,n,S);
        System.out.println(ans);
    }

}