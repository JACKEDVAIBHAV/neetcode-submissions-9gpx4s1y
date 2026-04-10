class Solution {
    public boolean hasDuplicate(int[] nums) {
        
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         for(int j=i+1;j<nums.length;j++)
    //         {
    //             if(nums[i]==nums[j])
    //             {
    //                 return true;
    //             }
    //         }

    //     }
    //     return false;
    // }
    HashSet<Integer> num = new HashSet<>();
    for(int i=0;i<nums.length;i++)
    {
        if(!num.contains(nums[i]))
        {
            num.add(nums[i]);
        }
        else{
            return true;
        }
    }
    return false;
}
}
