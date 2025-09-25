class Solution {
    public boolean rotateString(String s, String goal) {
        // Step 1: lengths must match
        if (s.length() != goal.length()) {
            return false;
        }

        // Step 2: concatenate s with itself
        String doubled = s + s;

        // Step 3: check if goal is substring of doubled
        return doubled.contains(goal);
    }
}
