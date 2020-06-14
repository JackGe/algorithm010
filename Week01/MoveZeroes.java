class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j =0 ;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!= 0 ){
                // 当i==j 时无需交换
                if(i!=j){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j++] = tmp;
                }else{
                    j++;
                }
            }
        }
    }
}
