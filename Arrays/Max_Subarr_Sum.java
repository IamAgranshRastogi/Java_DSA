class Max_Subarr_Sum{
    public static void maxSubarrSum1(int nums[]){
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                cursum=0;
                for(int k=start;k<=end;k++){
                    cursum += nums[k];
                }
                System.out.println(cursum);
                if(maxsum<cursum){
                    maxsum=cursum;
                }
            }
        }
        System.out.println("Max Sum: "+ maxsum);
    }
    public static void main(String[] args) {
        int nums[]={1,-2,6,-1,3};
        maxSubarrSum1(nums);
    }

}