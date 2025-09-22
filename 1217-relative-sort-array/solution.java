class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] array = new int[arr1.length];
        int k = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    array[k++] = arr1[j];
                }
            }
        }
        int leftoverStart = k;
        for (int j = 0; j < arr1.length; j++) {
            boolean found = false;
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[j] == arr2[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                array[k++] = arr1[j];
            }
        }

       
        Arrays.sort(array, leftoverStart, array.length);

        return array;
    }
}

