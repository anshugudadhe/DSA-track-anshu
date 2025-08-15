class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while(!seen.contains(n)) {
            seen.add(n);

            int happy = 0;
            while (n != 0) {
                happy += (n % 10) * (n % 10);
                n /= 10;
            }
            n = happy;
            
            if (n == 1) return true;
        }

        return false;
    }
}
