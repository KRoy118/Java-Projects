public class NonRepeatingNosBetween {
    
    static int find(int n1, int n2) {
        int count = 0;
        for (int i = n1 ; i <= n2 ; i++) {
            int num = i;

            boolean[] visited = new boolean[10];

            while (num > 0) {
                if (visited[num % 10] == true)
                    break;
                visited[num % 10] = true;
                num /= 10;
            }

            if (num == 0)
                count++;
        }
        return count;
    }
    public static void main(String[] args)
     {
        int n1 = 101, n2 = 200;//could take user input too
        System.out.println(find(n1, n2));
    }
    
}
