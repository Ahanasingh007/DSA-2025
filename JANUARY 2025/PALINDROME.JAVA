/**Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.**/
class Solution {
    public boolean isPalindrome(int x) {
   int s=x;
   int r=0;
    while(x!=0){
        r=(r*10)+(x%10);
        r=r/10;

    }
    if(s==r){
        return true;
    }
    else{
        return false;
    }
        
    }
}