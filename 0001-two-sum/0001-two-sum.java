// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int ans[]=new int[2];
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     ans[0]=i;
//                     ans[1]=j;
//                     //break : it is not imp to write for optimization we write this 
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int ans[]=new int[2];
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[]{i,j}*************************** most impt direct array.
//                     //break : it is not imp to write for optimization we write this 
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }


// hasmap is use to store 2 things at the same time. in this we will put value and its index
class Solution{
    public int[] twoSum(int[] nums,int target){
        // we will put things in map one by one then campare things for making 9 if not then store 

        //[2,11,15,7]
        //map=[2:0,11:1,15:2]
         //parent : map child: hashmap


        HashMap<Integer,Integer> m=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int othervalue= target-nums[i];
            if(m.containsKey(othervalue)){
                ans[0]=m.get(othervalue);
                ans[1]=i;
                break;
            }
            m.put(nums[i],i);
        }
        return ans;

    }
}