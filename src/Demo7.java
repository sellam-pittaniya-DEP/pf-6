void main() {
    int[][] my2dArray = new int[3][];
    int[][] my2dArray2 = new int[3][2];

    System.out.println(my2dArray2[0][1]);
    System.out.println(my2dArray2[1][1]);
    System.out.println(my2dArray2[2][1]);

    for (int i = 0; i< my2dArray.length;i++){
        my2dArray[i] = my2dArray2[i];
    }

    my2dArray2[0][1] = 20;
    System.out.println(my2dArray[0][1]);
}