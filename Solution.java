import java.util.*;

public class Solution {
    public String addStrings(String num1, String num2) {
        List<Character> answer = new ArrayList<>();
        int num1Index = num1.length() - 1;
        int num2Index = num2.length() - 1;
        int carry = 0;
        while (num1Index >= 0 || num2Index >= 0) {
            int sum = carry;

            if (num1Index >= 0)
                sum += Character.getNumericValue(num1.charAt(num1Index--));

            if (num2Index >= 0)
                sum += Character.getNumericValue(num2.charAt(num2Index--));

            carry = sum > 9 ? 1 : 0;
            answer.add(Character.forDigit(sum % 10, 10));
        }
        if (carry != 0)
            answer.add(Character.forDigit(carry, 10));

        String ans = "";
        for (int index = 0; index < answer.size() / 2; index++) {
            Character valAt = answer.get(index);
            answer.set(index, answer.get((answer.size() - 1) - index));
            answer.set((answer.size() - 1) - index, valAt);
        }
        for (char charval : answer) {
            ans += charval;
        }
        return ans;
    }
}
