import java.util.*;


public class PatientNum {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] emerge2 = emergency.clone();
        Arrays.sort(emerge2);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < emerge2.length; i++) {
            map.put(emerge2[emerge2.length - 1 - i], i + 1);
        }

        for (int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        PatientNum sol = new PatientNum();
        sol.solution(new int[]{3, 76, 24});
    }
}
