package leetcode;
class Solution {
    public String defangIPaddr(String address) 
    {
        address=address.eplace(".", "[.]");
        return address;     
    }
}
