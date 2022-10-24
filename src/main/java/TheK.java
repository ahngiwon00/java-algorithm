import java.util.Arrays;

public class TheK {

        public int[] solution(int[] arr, int[][] commands) {
            int[] answer = new int[commands.length];
            int idx=0;
            for (int[] command : commands) {
                int[] slicedArr = Arrays.copyOfRange(arr, command[0] - 1, command[1]);
                Arrays.sort(slicedArr);
                answer[idx]=slicedArr[command[2]-1];
                idx++;
            }
            return answer;
        }


    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 6, 3, 7, 4};
        int commadns[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        TheK theK = new TheK();
        System.out.println(Arrays.toString(theK.solution(arr,commadns)));

    }
}
