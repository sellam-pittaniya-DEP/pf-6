void main() {
    int[] myArray1 = new int[]{10, 20, 30, 40};
    int[] myArray2 = {10, 20, 30, 40};
    int[][] my2DArray = new int[][]{myArray1, myArray2};
    System.out.println(my2DArray[0] == myArray1);
    System.out.println(my2DArray[1] == myArray2);
    System.out.println(my2DArray[0][0]);
    System.out.println(my2DArray[1][0]);
    System.out.println(my2DArray[my2DArray.length-1][1]);



}