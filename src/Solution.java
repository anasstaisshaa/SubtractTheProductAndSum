class Solution {
    public int subtractProductAndSum(int n) {
        String stringNumber = Integer.toString(n);
        int[] arr = new int[stringNumber.length()];
        for (int i = 0; i < stringNumber.length(); i++){
            arr[i] = stringNumber.charAt(i) - '0';
        }
        int product = 1;
        int sum = 0;
        for(int j = 0; j< arr.length; j++ ){
            product *= arr[j];
            sum += arr[j];
        }
        int result = product - sum;
        return result;
    }
}
