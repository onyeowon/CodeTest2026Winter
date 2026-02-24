import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException { // throws IOException은 readLine()을 사용할 때 필요함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int R = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);  // 문자열에서 j번째 문자 꺼냄

                for (int k = 0; k < R; k++) {
                    System.out.print(c);
                }
            }

            System.out.println();
        }
    }
}