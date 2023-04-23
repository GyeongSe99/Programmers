public class Test2 {
    public String solution(String phone_number) {


        String[] str = phone_number.split("");
        for (int i = 0; i < phone_number.length() - 4; i++) {
            str[i] = "*";
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }
        System.out.println(sb);

        return sb.toString();
    }
    public static void main(String[] args) {
        Test2 sol = new Test2();
        sol.solution("01033334444");

    }
}
