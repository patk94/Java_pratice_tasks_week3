package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] tab = {10, 8, 9, 4, 15, 3, 7};
	    int lo = 0;
	    int hi = (tab.length - 1);
	    int i = (lo - 1);
	    int pivot = tab[hi];

        System.out.println("Unsorted array (initial array):");
        for(int k = 0; k < tab.length; k++){
            System.out.print(tab[k] + " ");
        }
        System.out.println("");
        //partition
	    for(int j = lo; j<hi; j++) {
	        if (tab[j] < pivot) {
	            i++;
	            int temp = tab[j];
	            tab[j] = tab[i];
	            tab[i] = temp;
            }
        }
	    int temp = tab[i+1];
	    tab[i+1] = tab[hi];
	    tab[hi] = temp;
	    int p = i + 1;

        int pivot2 = tab[p-1];
        lo = 0;
        i = (lo - 1);
	    for(int l = lo; l < (p-1); l++) {
	        if (tab[l] < pivot2) {
	            i++;
	            temp = tab[l];
	            tab[l] = tab[i];
	            tab[i] = temp;
            }
        }
        temp = tab[i+1];
        tab[i+1] = tab[p-1];//pivot2
        tab[p-1] = temp;

        int pivot3 = tab[hi];
        lo = p + 1;
        i = lo - 1;

	    for(int m = (p + 1); m < hi; m++) {
            if(tab[m] < pivot3) {
                i++;
                temp = tab[m];
                tab[m] = tab[i];
                tab[i] = temp;
            }
        }
	    temp = tab[i+1];
	    tab[i+1] = tab[hi];//pivot3
        tab[hi] = temp;

        System.out.println("Sorted array (quick sort algorithm was used):");
        for(int k = 0; k < tab.length; k++){
            System.out.print(tab[k] + " ");
        }
        System.out.println("");
    }
}
