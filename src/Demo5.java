void main() {
    int[] myArray1 = {10, 20, 30};
    int[] myArray2 = new int[]{10, 20, 30};
    int[] myArray3 = null;
    int[][] my2dArray = {myArray1, myArray2, myArray3};
    System.out.println(my2dArray[0]);
    myArray1 = null;
    System.out.println(myArray1);
    System.out.println(my2dArray[0]);

}