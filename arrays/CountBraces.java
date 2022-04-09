package loops.arrays;

import java.util.Scanner;

public class CountBraces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String name = scan.nextLine();
        char a[] = name.toCharArray();
        char unique[] = new char[a.length];  //storing unique values
        int n = 0; //n is index of unique array

        int count[] = new int[a.length];  //storing count of each array value
        int c = 0; //c is index of count array
        for (int i = 0; i < a.length; i++) {
            int counter = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j])
                    counter++;
            }
            int find = 0;
            for (int k = 0; k < n; k++) {
                if (unique[k] == a[i])
                    find++;
            }
            if (find == 0) {
                unique[n++] = a[i];
                count[c++] = counter;
            }
        }


        for (int i = 0; i < n; i++) {
            System.out.println(unique[i] + "   " + count[i]);
        }
    }
}
