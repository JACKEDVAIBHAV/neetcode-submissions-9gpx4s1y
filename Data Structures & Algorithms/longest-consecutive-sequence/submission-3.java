class Solution {
    public int longestConsecutive(int[] nums) {
    //    if(nums.length==0)
    //    {
    //     return 0;
    //    }
    //    int max=1;
    //    for(int i=0;i<nums.length;i++)
    //    {
    //     int count=1;
    //     int current=nums[i];
    //     while(true)
    //     {
    //         boolean found=false;
    //         for(int j=0;j<nums.length;j++)
    //         {
    //             if(nums[j]==current+1)
    //             {
    //                 found=true;
    //                 current++;
    //                 count++;
    //                 break;

    //             }

    //         }
    //         if(!found)
    //         {
    //             break;
    //         }
    //     }
    //     if(count>max)
    //     {
    //         max=count;
    //     }
    //    }
    //    return max;
                  

//USING HASHSET
int res=0;
Set<Integer> s=new HashSet<>();
for(int num:nums)
{
    s.add(num);
}

for(int num:nums)
{
    int streak=0;
    int curr=num;
    while(s.contains(curr))
    {
        streak++;
        curr++;
    }
    res=Math.max(res,streak);
}
return res;
}
}