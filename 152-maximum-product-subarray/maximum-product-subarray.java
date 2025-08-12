class Solution {
    public int maxProduct(int[] nums) {

        int maxProd=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=i;j<nums.length;j++){
                p*=nums[j];
                if(p>maxProd){
                    maxProd=p;
                }
            }
        }return maxProd;
    }
}