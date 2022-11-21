
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива:\n");
        int n=in.nextInt();
	    int [] arr = new int [n];
        int sum=0;
        float middle;
        for (int i=0;i<n;i++){
            int k=in.nextInt();
            arr[i]=k;
        }
        for(int i=0;i<n;i++) {
            sum+=arr[i];
        }
        System.out.println("Сумма: "+ sum);
        middle= (float) (sum*1.0/n);
        System.out.println("Средннее арифметическое: "+middle);
    }
}
