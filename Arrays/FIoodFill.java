public class FIoodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialcolor=image[sr][sc];
        if(initialcolor==color){
            return image;
        }
        dfs(image,sr,sc,initialcolor,color);
            return image;
        }
        public void dfs(int[][] image,int r,int c,int initialcolor,int color){
            if(r<0 || c<0 || r>=image.length ||c>=image[0].length){
                return;
            }
            if(image[r][c]!=initialcolor){
                return;
            }
            image[r][c]=color;
            dfs(image,r+1,c,initialcolor,color);
            dfs(image,r-1,c,initialcolor,color);
            dfs(image,r,c+1,initialcolor,color);
            dfs(image,r,c-1,initialcolor,color);
        }
    }


