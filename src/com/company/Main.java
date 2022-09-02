package com.company;

public class Main
{

    public static void main(String[] args)
    {
	    int[] arr = {-3, 2, 6, -11, 3, 14};
        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        System.out.println(sum[0]);

        for (int a = 1; a < arr.length; a++)
        {
            sum[a] = sum[a-1] + arr[a];
            System.out.println(sum[a]);
        }
    }
}
