class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] result=new String[n];
        for(int i=0;i<n;i++)
        {
            int r=1;
            for(int j=0;j<n;j++)
            {
                if(score[j]>score[i])
                {
                    r++;
                }
            }
            if(r==1)
            {
                 result[i]="Gold Medal";
            }
            else if(r==2)
            {
                result[i]="Silver Medal";
            }
            else if(r==3)
            {
                result[i]="Bronze Medal";
            }
            else
            {
                result[i]=String.valueOf(r);
            }
        }
        return result;
    }
}
