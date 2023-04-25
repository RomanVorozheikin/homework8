package ru.roman;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task3();
        task4();
    }

    private static void task1() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        double[] dr = {1.57, 7.654, 9.986};
        for (int i = 0; i < dr.length; i++) {
            if (i == dr.length - 1) {
                System.out.print(dr[i]);
                break;
            }
            System.out.print(dr[i] + ",");
        }
        System.out.println();
        int[] frutsWeight = {5, 6, 4, 8, 9, 3, 2, 3, 10, 8};
        for (int i = 0; i < frutsWeight.length; i++) {
            if (i == frutsWeight.length - 1) {
                System.out.print(frutsWeight[i]);
                break;
            }
            System.out.print(frutsWeight[i] + ",");
        }
    }

    private static void task3() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        double[] dr = {1.57, 7.654, 9.986};
        for (int i = dr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(dr[i]);
                break;
            }
            System.out.print(dr[i] + ",");
        }
        System.out.println();
        int[] frutsWeight = {5, 6, 4, 8, 9, 3, 2, 3, 10, 8};
        for (int i = frutsWeight.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(frutsWeight[i]);
                break;
            }
            System.out.print(frutsWeight[i] + ",");
        }
    }

    private static void task4() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        int j;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                System.out.print(arr[i]);
            }else {
                j=arr[i]+1;
                System.out.println();
                    System.out.println(j);
            }
        }
    }
}
