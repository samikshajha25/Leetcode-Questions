class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int seenA[] = new int[n+1];
        int seenB[] = new int[n+1];
        int C[] = new int[n];
        for(int i = 0; i<n; i++){
            seenA[A[i]] = 1;
            seenB[B[i]] = 1;
            int count = 0;
            for(int j = 1; j<=n; j++){
                if(seenA[j]==1 && seenB[j]==1){
                    count++;
                }
            }
            C[i]= count;
        }
        return C;
    }
}