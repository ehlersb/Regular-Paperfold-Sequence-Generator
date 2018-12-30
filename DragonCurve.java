/**
 * Created by Benjamin Ehlers on 12/30/2018.
 */
public class DragonCurve {

    public DragonCurve() {}

    public String generateCurve(int cycles) {
        String curve = "";
        for(int i = 0; i < cycles; i++) {
            curve = generateNext(curve);
        }
        return curve;
    }

    private String generateNext(String previous) {
        String nextString = "1";
        if(previous.equals("")) return nextString;
        nextString = previous + nextString;
        nextString += flipBits(reverseString(previous));
        return nextString;
    }

    private String reverseString(String string) {
        String reverseString = "";
        for(int i = string.length(); i > 0; i--) {
            reverseString += string.substring(i - 1, i);
        }
        return reverseString;
    }

    private String flipBits(String string) {
        String flippedString = "";
        for(int i = 0; i < string.length(); i++) {
            if(string.substring(i, i+ 1).equals("0")) flippedString+="1";
            else {
                flippedString+="0";
            }
        }
        return flippedString;
    }
}
