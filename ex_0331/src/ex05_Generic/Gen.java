package ex05_Generic;

import java.util.Arrays;

public class Gen<T> {
	public T[] data;

	public void printArr(T[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i].toString().compareTo(arr[j].toString()) > 0) {
	                T tmp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = tmp;
	            }
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	}

}

//
//public T[] data;
//
//public void printArr(T[] arr) {
//    System.out.println(Arrays.toString(arr));
//}