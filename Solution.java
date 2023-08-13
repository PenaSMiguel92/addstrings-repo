public class Solution {
    public String addStrings(String num1, String num2) {
        System.out.println(stringToValue(num1));
        System.out.println(stringToValue(num2));
        return "";//Long.toString(stringToValue(num1) + stringToValue(num2));
    }

    public long stringToValue(String num) {
        long value = 0;
        for (int index = num.length() - 1; index >= 0; index--) {
            int digitVal = Character.getNumericValue(num.charAt(index));
            value += digitVal * Math.pow(10, num.length() - (index + 1));
        }
        return value;
    }
}
