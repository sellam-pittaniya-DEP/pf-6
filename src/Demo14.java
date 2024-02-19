void main() {
    String[][] CUSTOMERS = {
            {"1", "Kasun", "077-1234567", "011-1234567"},
            {"2", "Nimal", "078-1234567"},
            {"3", "Ruwan", "074-1234567", null},
            {"4", "Supun", "072-1234567", "033-1234567"},
    };
    final String LINE = STR."+\{"-".repeat(5)}+\{"-".repeat(10)}+\{"-"
            .repeat(15)}+\{"-".repeat(15)}+";
    final String HEADER = "\033[43;1m|%-5s|%-10s|%-15s|%15s|\033[0m"
            .formatted("ID", "NAME", "Contact 1", "Contact 2");
    final String ROW = "|%-5s|%-10s|%-15s|%15s|\n";
    System.out.println(LINE);
    System.out.println(HEADER);
    System.out.println(LINE);
    for (String[] customer : CUSTOMERS) {
        String id = customer[0];
        String name = customer[1];
        String contact = customer[2];
        //String contact2 = customer[3];
        System.out.printf(ROW, getID(id), getName(name),getContact(contact), ",");
    }
    System.out.println(LINE);
}

String getID(String id) {
    return "C%03d".formatted(Integer.parseInt(id));
}

String getName(String name) {
    return name;
}
String getContact(String[] contact) {
    return contact.length!=2 || contact[2] == null ? "-":contact[2];
}
//String getContact2(String contact2) {
//    return contact2.length() !=
//    //return contact2 != null? contact2: "-";
//}

//String getLastName(String[] name) {
//    return name.length != 2 || name[1] == null ? "-" : name[1];
//}