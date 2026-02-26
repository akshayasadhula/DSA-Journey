//platform:gfg
//topic:multidimensional array
//date:26/02/26
public class SumofeleInMatrix { 
    public static int  sumOfMatrix(int N, int M, int[][] Grid) {
        int sum=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                sum+=Grid[i][j];
            }
        }
        return sum;
        
    }
    public static void main(String[] args) {
        int[][] Grid ={{1,0,1},{-8,9,-2}};
        System.out.println(sumOfMatrix(2,3,Grid));
    }
    
}

