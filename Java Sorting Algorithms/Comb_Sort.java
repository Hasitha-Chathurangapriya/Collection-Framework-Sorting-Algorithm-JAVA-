class Comb_Sort {
    static int updatedGap(int gap) {
        gap = (gap * 10) / 13; // Shrink gap by Shrink factor

        if (gap < 1) {
            return 1;
        }
        return gap;
    }

    static void combSort(int a[], int n) {
        int gap = n; // initialize gap size equal to the size of array

        int swapped = 1;

        while (gap != 1 || swapped == 1) {
            gap = updatedGap(gap); // find updated gap
            // Initialize swapped as false so that we can
            // ckeck whether swap happened or not

            swapped = 0;

            for (int i = 0; i < n - gap; i++)
            // Compare all elements with current gap
            {
                if (a[i] > a[i + gap]) {
                    int temp = a[i];
                    a[i] = a[i + gap];
                    a[i + gap] = temp;
                    swapped = 1;
                }
            }
        }
    }
    static void printArr(int a[], int n)//function to print array elements
    {
        for (int i=0;i<n;i++){
            System.out.println(a[i]+"");
        }
    }
    public static void main(String[] args) {
        int[] a = {43,39,13,42,27,25,0,4,8};
        int n= a.length;
        System.out.println("Before sorting array elements are - ");
        printArr(a, n);
        combSort(a, n);
        System.out.println("After sorting array elements are -");
        printArr(a, n);
        System.out.println();
    }
}
