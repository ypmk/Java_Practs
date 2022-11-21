Задание 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива:");
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
        System.out.println(sum);
        middle= (float) (sum*1.0/n);
        System.out.println(middle);
    }
}

![image](https://user-images.githubusercontent.com/55356699/203156284-f7a7c691-66be-40f9-86ac-e5f4962eff5b.png)
