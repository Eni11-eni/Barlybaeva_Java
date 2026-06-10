public class Task3 {

    public void evenNumbers( int[] numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Task3 task = new Task3();
        task.evenNumbers(numbers);
    }
}
