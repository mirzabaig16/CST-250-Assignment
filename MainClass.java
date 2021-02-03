package edu.ru.assignment1;

import java.util.Arrays;

public class MainClass {

    public static void copyArrayElements(String[] array1, String[] array2){
        for (int i = 0; i < array1.length; i++){
            array1[i] = "_" + array1[i];
            array2[i] = array1[i];
        }
    }

    public static int[] removeElement(int[] inputArray, int n){
        int[] newArray = new int[inputArray.length - 1];
        for (int i = 0, j = 0; i < inputArray.length; i++){
            if (inputArray[i] != n){
                newArray[j++] = inputArray[i];
            }
        }
        return newArray;
    }

    public static int removingOddElements(int[] inputArray){
        int newArraySize = 0;

        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] % 2 == 0){
                newArraySize++;
            }
        }
        int[] newArray = new int[newArraySize];
        int totalSum = 0;
        for (int i = 0, j = 0; i < inputArray.length; i++){
            if (inputArray[i] % 2 == 0){
                newArray[j++] = inputArray[i];
                totalSum = inputArray[i] + totalSum;
            }
        }
        System.out.println(Arrays.toString(newArray));
        return totalSum;
    }
    public static int highestElement(int[] inputArray){
        int highestNumber = 0;
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] > highestNumber){
                highestNumber = inputArray[i];
            }
        }
        return highestNumber;
    }


    public static void main(String[] args) {
        // write your code here
        String[] a = {"word1", "word2", "word3", "word4"};
        String[] b = new String[a.length];
        copyArrayElements(a, b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int[] one = {45,21,22,31,44,65,12,56,78,19,100};
        String result = Arrays.toString(removeElement(one, 100));
        System.out.println(result);

        System.out.println(removingOddElements(one));
        System.out.println(Arrays.toString(one));
        System.out.println(highestElement(one));
    }
}