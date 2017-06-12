public class NumArray {
    int numArray[];
    public NumArray(int[] nums) {
        numArray = nums;  
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        while(i <= j) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);

//*******************************************

public class NumArray {
    private int sum[];
    public NumArray(int[] nums) {
        int l = nums.length; 
        sum = new int[l];
        
        for(int i = 0; i < l; i++) {
            if(i == 0) {
                sum[i] = nums[i];
            } 
            else{
                sum[i] = sum[i-1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if(i == 0) {
            return sum[j];
        }
        else {
            return sum[j] - sum[i-1];
        }
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);