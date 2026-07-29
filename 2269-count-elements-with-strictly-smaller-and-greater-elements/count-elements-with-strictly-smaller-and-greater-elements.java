class Solution {
    public int countElements(int[] a) {
        int c = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
            if(a[i] > max){
                max = a[i];
            }
        }
        for(int i = 0; i < a.length; i++){
             if(a[i] < max && a[i] > min){
                c++;
            }
        }
        return c;
    }
}