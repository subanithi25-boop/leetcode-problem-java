class Solution {
    public int countElements(int[] a) {
        int n = a.length;
        int min = a[0];
        int max = a[0];
        int c = 0;
        for(int i = 0; i < n; i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(a[i] > min && a[i] < max){
                c++;
            }
        }
        return c;
    }
}