class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],2);
            }else{
                map.put(nums[i],1);
            }          
        }
        int result=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                result=entry.getKey();
            }
        }
        return result;
    }
}


//多使用map.containsKey少用get
