public class NumberPalindrome {
    public static boolean isPalindrome(int number){
       int temp=number;
    int reverse =0;
while(number!=0){int lastDigit=number%10;
        reverse=reverse*10;
        reverse =reverse+lastDigit;
        number=number/10;
    }
        if(temp==reverse){
            return true;
        }
        else{
            return false;
        }
    }
 
}
