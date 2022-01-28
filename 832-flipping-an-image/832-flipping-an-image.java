class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
    for (int i=0;i<image.length;i++) {     //reversing row elements
                int start=0;
                int end=image.length-1;
                while(start<end){
                    int temp=image[i][start];
                    image[i][start]=image[i][end];
                    image[i][end]=temp;
                    start++;
                    end--;
               }
            }
            for(int i=0;i<image.length;i++){     //changing element from 0 to 1 and 1 to 0
                for(int j=0;j<image.length;j++){
                    if(image[i][j]==0){
                        image[i][j]=1;
                    }
                    else
                        image[i][j]=0;
                }
            }
        return image;
    }
}