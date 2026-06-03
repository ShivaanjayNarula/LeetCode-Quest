class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int check = arr[0] - arr[1];
        for(int i = 1; i < n - 1; i++)
        {
            if(arr[i] - arr[i + 1] != check)
            {
                return false;
            }
        }
        return true;
    }
}
