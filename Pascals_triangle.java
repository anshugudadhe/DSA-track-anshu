import java.util.*;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows <= 0) {
            return triangle;
        }
        
       
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        
        for (int rowNum = 2; rowNum <= numRows; rowNum++) {
            List<Integer> prevRow = triangle.get(rowNum - 2);
            List<Integer> row = new ArrayList<>();
            
            row.add(1);
            
        
            for (int j = 1; j < rowNum - 1; j++) {
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                row.add(sum);
            }
            
        
            row.add(1);
            
            triangle.add(row);
        }
        
        return triangle;
    }
}
