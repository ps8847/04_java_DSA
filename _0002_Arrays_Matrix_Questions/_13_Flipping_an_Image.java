import java.util.Arrays;

public class _13_Flipping_an_Image {
    public static void main(String[] args) {
        
        int image[][] = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        
        int rowlength = image.length;
        int columnlength = image[0].length;

        System.out.println(rowlength);
        System.out.println(columnlength);
        
        for(int i = 0; i < rowlength; i++){
            for (int j = 0; j < columnlength / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][columnlength - j - 1];
                image[i][columnlength - j - 1] = temp;
            }
            
            for (int j = 0; j < columnlength; j++) {
                image[i][j] = 1 - image[i][j];
            }
        }

          
        return image;
       
    }
}
