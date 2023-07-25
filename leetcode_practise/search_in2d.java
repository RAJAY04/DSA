public class search_in2d {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 17;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int s = 0;
            int e=matrix[i].length-1;
            while (s<=e){
                int mid = s + (e-s)/2;
                if(matrix[i][mid]>target){
                    e=mid-1;
                }else if(matrix[i][mid]<target){
                    s=mid+1;
                }else{
                    return true;
                }
            }
        }return false;
    }
}
