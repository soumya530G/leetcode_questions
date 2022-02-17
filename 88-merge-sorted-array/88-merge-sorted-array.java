class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] c = new int[n+m];
        while(i < m && j < n && k < n+m)
        {
            if(a[i] <= b[j])
            {
                c[k++] = a[i++];
            }
            else
            {
                c[k++] = b[j++];
            }
        }
        while(i < m)
        {
            c[k++] = a[i++];
        }
        while(j < n)
        {
            c[k++] = b[j++];
        }
        for(int t = 0; t < k; t++)
        {
            a[t] = c[t];
        }
    }
}