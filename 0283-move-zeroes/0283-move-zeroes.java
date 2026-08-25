class Solution {
    public void moveZeroes(int[] a) {
        int j=0;
        int n= a.length;
       for(int i=0;i<n;i++)
       {
        if(a[i]!=0)
        {
           int temp =a[i];
            a[i]=a[j];
            a[j]=temp;
            j++;
        }
       }
       
    }
    
}