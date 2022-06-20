package com.mahbubalam.algorithms.sorting;

public class MBinaryInsertionSort extends Sort{

        static int binarySearch(int[] a, int item, int low, int high)
        {
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (item == a[mid])
                    return mid + 1;
                else if (item > a[mid])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            return low;
        }

        // Function to sort an array a[] of size 'n'
        @Override
        public void sort(int[] a)
        {
            int i, loc, j, selected;
            int n= a.length;
            for (i = 1; i < n; ++i) {
                j = i - 1;
                selected = a[i];

                // find location where selected should be inseretd
                loc = binarySearch(a, selected, 0, j);

                // Move all elements after location to create space
                while (j >= loc) {
                    a[j + 1] = a[j];
                    j--;
                }
                a[j + 1] = selected;
            }
        }

        // Driver Code
        public static void main (String[] args)
        {
            int[] a = new int[500];
            for(int i = 0; i < 500; i++) {
                a[i] = (int)(Math.random() * 500)+1;
            }

            new MBinaryInsertionSort().sort(a);
            printArray(a);
        }

    }


