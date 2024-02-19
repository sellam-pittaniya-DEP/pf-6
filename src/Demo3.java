void main() {
    int[] myIntArray;
    myIntArray = new int[]{10, 20, 30, 40};
    System.out.println(myIntArray);
    System.out.println(myIntArray.length);
    //System.out.println(myIntArray.0);         // can't access index through dot notation.
    System.out.println(myIntArray[10 / 2 - 2]); // Result -> SOP(40)
    System.out.println(myIntArray[0]);          // 10
    System.out.println(myIntArray[1]);          // 20
    System.out.println(myIntArray[2]);          // 30
    System.out.println(myIntArray[3]);          // 40


}