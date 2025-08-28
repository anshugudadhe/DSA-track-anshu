class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
       
    int s1 = 0, s2 = 0;
    int n = distance.length;
    
    for (int i = start; i != destination; i = (i + 1) % n) {
        s1 += distance[i];
    }

    for (int i = destination; i != start; i = (i + 1) % n) {
        s2 += distance[i];
    }
    return Math.min(s1, s2);
}

    
}
