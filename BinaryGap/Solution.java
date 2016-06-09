/**
 A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is
 surrounded by ones at both ends in the binary representation of N.

 For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
 The number 529 has binary representation 1000010001 and contains two binary gaps: one of length
 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap
 of length 1. The number 15 has binary representation 1111 and has no binary gaps.

 Write a function: that, given a positive integer N, returns the length of its longest binary gap.
 The function should return 0 if N doesn't contain a binary gap.

  Assume that:

 N is an integer within the range [1..2,147,483,647].
 */
public class Solution {

    public int solution(int N) {
        if (N<0) return 0;
        int returnValue = 0;
        String bin = Integer.toBinaryString(N);
        int gap = 0;
        for (int i=1;i<bin.length();i++) {
            if(bin.charAt(i)=='0') {
                gap++;
            } else {
                if(gap>returnValue) returnValue = gap;
                gap = 0;
            }
        }
        return returnValue;
    }
}
