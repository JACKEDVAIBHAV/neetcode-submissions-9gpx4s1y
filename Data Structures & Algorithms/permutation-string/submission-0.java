class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1arr=s1.toCharArray();
        Arrays.sort(s1arr);
        String sorteds1=new String(s1arr);
        for(int i=0;i<s2.length();i++)
        {
            for(int j=i;j<s2.length();j++)
            {
                char[] subAr=s2.substring(i,j+1).toCharArray();
                Arrays.sort(subAr);
                String sub=new String(subAr);
                if(sorteds1.equals(sub))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
