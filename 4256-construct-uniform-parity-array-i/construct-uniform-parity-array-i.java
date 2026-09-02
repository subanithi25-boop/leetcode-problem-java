class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(j != i){
                    ans[i] = nums1[i];
                    if(ans[i] == nums1[i] - nums1[j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}