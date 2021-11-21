package com.company;
import ibcsutils.ReadViaURL;
public class Main {

    public static void main(String[] args) {
        //#1.1
//        final int[] numbers = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
//        final int key = 15;
//        boolean found = false;
//        for (int index = 0;!found && index < numbers.length; index++)
//          if (numbers [index] == key)
//        {
//            found = true;
//            break;
//        }
//        System.out.println(found);
        //#1.2
//        int[] arr = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
//        int N = arr.length;
//        int key = 15;
//        int lo = 0;
//        int hi = N -1;
//        boolean found = false;
//        while (!found && lo <= hi)
//        {
//            int mid = (lo + hi) / 2;
//            int v = arr[mid];
//            System.out.println(v);
//            if (key == v)
//                found = true;
//            else if (key < v)
//                hi = mid -1;
//            else
//                lo = mid +1;
//        }

        //#2
//        String[] names = {"Alissa", "Ben", "Charlie", "Dianna"};
//        String[] grade = {"B", "D", "B", "A"};
//        String key = "Charlie";
//        boolean found = false;
//        int index;
//        for (index = 0; index < names.length; index++)
//            if (names [index].equals (key))
//            {
//                found = true;
//                break;
//            }
//        if (!found)
//            System.out.println(key + "not found");
//        else
//            System.out.println(key + " is in grade " + grade [index]);

        //#4
//        String addr=
//                "http://www-personal.umich.edu/~jlawler/wordlist";
//
//        String[] words =
//                ReadViaURL.readWords(addr, true, true, true);
//        System.out.println(words[99]);
//
//        String key = "bye";
//        String[] smallarr = {"hello", "bye", "evening"};
//        for (int x = 0; x < words.length; x++)
//        {
//            if (words[x].equals(key) == true) {
//                System.out.println("key found");
//                break;
//            }
//            if (x == words.length - 1 && words[x].equals(key) != true)
//                System.out.println("key not found");
//        }

        //#3.1
//        int[] arr = {-4, 11, 7, -12, 6, 1};
//        for (int i = 0; i < arr.length - 1; i++) {
//            int indSmallest = i;
//            for (int j = i + 1; j < arr.length; j++)
//                if (arr[j] < arr[indSmallest])
//                    indSmallest = j;
//            swap(arr, i, indSmallest);
//            for (int b : arr)
//                System.out.print(b + " ");
//            System.out.println();
//        }
//        for (int a : arr)
//            System.out.print(a + " ");
//
//    }
//
//    static void swap(int[] array, int ind1, int ind2) {
//        int tmp = array[ind1];
//        array[ind1] = array[ind2];
//        array[ind2] = tmp;
//    }

        //#3.2
//        int[] numbers = {-4, 11, 7, -12, 6, 1};
//        final int N = numbers.length;
//        boolean changed = true;
//        while (changed) {
//            changed = false;
//            for (int i = 0; i <= N - 2; i++) {
//                if (numbers[i] > numbers[i + 1]) {
//                    swap(numbers, i, i + 1);
//                    for (int k : numbers)
//                        System.out.print(k + " ");
//                    System.out.println();
//                    changed = true;
//                }
//            }
//        }
//        for (int n : numbers)
//            System.out.print(n + " ");
//    }
//
//    static void swap(int[] array, int ind1, int ind2) {
//        int tmp = array[ind1];
//        array[ind1] = array[ind2];
//        array[ind2] = tmp;
        
 }
}
