class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean iterResult=true;
        // without rotation
        rotation0:
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                if(mat[i][j]!=target[i][j]) {
                    iterResult=false;
                    break rotation0;
                }
            }
        }
        if(iterResult) return true;


        iterResult=true;
        rotation1:
        for(int i=0; i<mat.length; i++) {
            for(int j1=0, j2=mat[0].length-1; j1<mat[0].length&&j2>=0; j1++, j2--) {
                if(mat[i][j1]!=target[j2][i]) {
                    iterResult=false;
                    break rotation1;
                }
            }
        }
        if(iterResult) return true;

        iterResult=true;
        rotation2:
        for(int i1=0, i2=mat.length-1; i1<mat.length&& i2>=0; i1++, i2--) {
            for(int j1=0, j2=mat[0].length-1; j1<mat[0].length&&j2>=0; j1++, j2--) {
                if(mat[i1][j1]!=target[i2][j2]) {
                    iterResult=false;
                    break rotation2;
                }
            }
        }
        if(iterResult) return true;

        iterResult=true;
        for(int i1=0, j2=mat.length-1; i1<mat.length&& j2>=0;i1++, j2--) {
            for(int j=0; j<mat.length; j++) {
                if(mat[i1][j]!=target[j][j2]) {
                    iterResult=false;
                    return false;
                }
            }
        }
        if(iterResult) return true;
        return false;

    }
}