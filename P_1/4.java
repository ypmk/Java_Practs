
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива:\n");
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            int k = in.nextInt();
            arr[j] = k;
        }
        int min=arr[0];
        int max=arr[0];
        do {
            sum += arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
            i++;
        }
        while(i<n);
        System.out.println("Сумма: " + sum);
        System.out.println("Максимальный элемент: "+ max);
        System.out.println("Минимальный элемент: "+ min);
    }
}
