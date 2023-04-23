public class Test1 {
    public int solution(long num) {
        int answer = 0;


        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;
            }

            answer++;

            if (answer == 500) {
                answer = -1;
                break;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Test1 sol = new Test1();
        sol.solution(626331);
        sol.solution(6);
    }
}
