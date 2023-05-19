class Solution {
    public int[] twoSum(int[] arr, int tar) {
        //TC=O(n) and SC=O(n)
       HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val=tar-arr[i];
            if(hm.containsKey(val)){
                return new int[]{i, hm.get(val)};
            }
            hm.put(arr[i],i);
        }
        return new int[] { -1 };
    }
}