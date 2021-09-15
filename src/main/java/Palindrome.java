
public class Palindrome {
    public static boolean verify(int i) {
        String iString = String.valueOf(i);
        int startIndex = 0;
        int endIndex = iString.length() -1;

        while(startIndex < endIndex) {
            if(iString.charAt(startIndex) != iString.charAt(endIndex)) {
                return false;
            } else {
                startIndex++;
                endIndex--;
            }
        }

        return true;
    }

    public static boolean verifyWithOutString(int i) {
        if(i < 0) {
            return false;
        }

        int reverse = 0;
        int tempI = i;
        while(tempI > 0) {
            reverse = reverse * 10 + tempI% 10;
            tempI = tempI / 10;
        }

        return reverse == i;
    }
}
