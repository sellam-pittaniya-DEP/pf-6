import java.math.BigDecimal;

void main() {
    System.out.println(new String[5]);
    System.out.println(new String[]{"IJSE, Dep, 2024"});

    System.out.println(new int[5][6][][][]);

    byte myByte = 5;
    short myShort = 3;
    char myChar = 1;
    int myInt = 50;
    long myLong = 5;

    System.out.println(new double[myByte + myShort + myChar + myInt]);
  //  System.out.println(new double[myLong]) // this is compile error;


    System.out.println(new BigDecimal[-5]); // <- Negative ArraySize Exception
}