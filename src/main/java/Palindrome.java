import java.util.ArrayList;
import java.util.List;

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
        List<Integer> unitArray = new ArrayList<Integer>();
        int arrayIndex = 0;

        if(i < 0) {
            return false;
        }

        while(i > 0) {
            unitArray.add(i % 10);
            i = i / 10;
        }

        int startIndex = 0;
        int endIndex = unitArray.size() - 1;
        while(startIndex < endIndex) {
            if(unitArray.get(startIndex) != unitArray.get(endIndex)) {
                return false;
            } else {
                startIndex++;
                endIndex--;
            }
        }

        return true;
    }
}
