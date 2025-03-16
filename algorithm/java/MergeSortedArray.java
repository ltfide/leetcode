public class MergeSortedArray {
    
    /**
     * nums1  = [1,2,3,0,0,0] m = 3
     * nums2  = [2,5,6]       n = 3
     * output = [1,2,2,3,5,6]
     */
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        if (m == 0) {
            nums1 = nums2; 
            return;
        }

        int k = 0;
        int j = 0;
        int i = 0;
        int[] tmp = new int[m+n];

        while (k < m || j < n) {
            if (nums1[k] < nums2[j]) {
                if (k > 1 && tmp[i - 2] > nums1[k]) {
                    tmp[i] = tmp[i - 1];
                    tmp[i - 1] = tmp[i -2];
                    tmp[i - 2] = nums1[k];
                    i++;
                    tmp[i++] = nums2[j];
                } else if (k > 0 && tmp[i-1] > nums1[k]) {
                    int x = tmp[i-1];
                    tmp[i-1] = nums1[k];
                    tmp[i++] = x;
                    tmp[i++] = nums2[j];
                } else {
                    tmp[i++] = nums1[k];
                    tmp[i++] = nums2[j];
                }
            }

            if (nums1[k] > nums2[j]) {
                if (j > 1 && tmp[i - 2] > nums2[j]) {
                    tmp[i] = tmp[i - 1];
                    tmp[i - 1] = tmp[i -2];
                    tmp[i - 2] = nums2[j];
                    i++;
                    tmp[i++] = nums1[k];
                } else if (j > 0 && tmp[i-1] > nums2[j]) {
                    int x = tmp[i-1];
                    tmp[i-1] = nums2[j];
                    tmp[i++] = x;
                    tmp[i++] = nums1[k];
                } else {
                    tmp[i++] = nums2[j];
                    tmp[i++] = nums1[k];
                }
            }

            k++; 
            j++;
        }

        nums1 = tmp;
        
        for (int nums12 : nums1) {
            System.out.println(nums12);
        }
    }

    public static void main(String[] args) {
        int[] i1 = {1,2,3,0,0,0};
        int[] i2 = {2,5,6};
        int m1 = 3, n1 = 3;

        merge(i1, m1, i2, n1);

        int[] i3 = {1};
        int[] i4 = {};
        int m2 = 1, n2 = 0;
        merge(i3, m2, i4, n2);

        int[] i5 = {0};
        int[] i6 = {1};
        int m3 = 0, n3 = 1;
        merge(i5, m3, i6, n3);

        int[] i7 = {2,5,6};
        int[] i8 = {1,2,3};
        int m4 = 3, n4 = 3;
        merge(i7, m4, i8, n4);

        int[] i9 = {1,2,3,0,0,0};
        int[] i10 = {4,5,6};
        int m5 = 3, n5 = 3;
        merge(i9, m5, i10, n5);

        int[] i11 = {10,16,19};
        int[] i12 = {9,13,21};
        int m6 = 3, n6 = 3;
        merge(i11, m6, i12, n6);
    }
}
