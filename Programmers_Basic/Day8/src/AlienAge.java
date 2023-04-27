import java.util.HashMap;
import java.util.Map;

public class AlienAge {
    public String solution(int age) {
        String answer = "";
        Map<Integer, Character> map = new HashMap<>();

        for (int i = 0; i <= 9; i++) {
            map.put(i, (char) ('a' + i));
        }

        String ageStr = Integer.toString(age);
        int[] nums = new int[ageStr.length()];
        int cnt = 0;
        for (String item : ageStr.split("")) {
            nums[cnt] = Integer.parseInt(item);
            cnt++;
        }

        for (int i = 0; i < nums.length; i++) {
            answer += map.get(nums[i]);
        }

        return answer;
    }

}
