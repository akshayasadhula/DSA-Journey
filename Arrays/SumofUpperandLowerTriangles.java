import java.util.ArrayList;

public class SumofUpperandLowerTriangles {
     public ArrayList<Integer> sumTriangles(int mat[][]) {
        ArrayList<Integer> al =new ArrayList<>();
        int n=mat.length;
        int sum_up=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){
                sum_up+=mat[i][j];
            }
        }
        int sum_low=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
            sum_low+=mat[i][j];
        }
    }
     al.add(sum_up);
        al.add(sum_low);
     return al;
}
}
