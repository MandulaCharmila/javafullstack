package AssignmentDay06;

public class Reverse {
    public static void main(String[] args){
        int n =12345,reverse=0;
        while(n!=0){
            int remainder = n%10;
            reverse = reverse*10 + remainder;
            n=n/10;
        }
        System.out.println(+ reverse);
    }

}
