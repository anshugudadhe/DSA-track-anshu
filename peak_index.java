class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // we are in the ascending part, move right
                left = mid + 1;
            } else {
                // we are in the descending part (or at peak)
                right = mid;
            }
        }
        // left == right → peak index
        return left;
    }
}
