void main() {
    int[] myArray1 = {10, 20};
    int[] myArray2 = {30, 40, 50};

    int[][][] my3dArray = new int[3][2][];
    System.out.println(my3dArray[0][0]);
    my3dArray[0][0] = myArray1;
    System.out.println(my3dArray[0][0][0]);
    my3dArray[2][0] = myArray2;
    System.out.println(my3dArray[2][0][0]);

    int[][][] my3dArray2 = {{null, {10, 20}}, null, {null, {40, 50}, null}};
    System.out.println(my3dArray2[2][1][1]);

    int[][][][] my4dArray = {null, {{null, {10, 20}}}};
    System.out.println(my4dArray[1][0][1][1]);

    int[][] my2dArray = {{10, 20}, null};
    //int[][][][] my4dIntArray = {null, {my2dArray, {{10, 20}, null}, my2dArray}, null};
    int[][][][] my4dIntArray = {null, {my2dArray = new int[][]{{10, 20}, null}, {{10, 20}, null}, my2dArray}, null};
    System.out.println(my4dIntArray[1][0] == my4dIntArray[1][2]);
    System.out.println(my4dIntArray[1][1][0][1]);

    int[] arr1 = {10, 20, 30}, arr2 = {10, 20};
    int[][] arr3 = {arr2, null};

    int[][][][][] my5dArray = {{{null, null, null}}, {{{{10, 20}, arr1}, {arr1, arr2}, arr3},
            {arr3, null},
            null}};
    System.out.println(my5dArray[1][0][1][1]);
    System.out.println(my5dArray[1][1][0][0]);
    System.out.println(my5dArray[1][0][1][1] == my5dArray[1][1][0][0]);

}
