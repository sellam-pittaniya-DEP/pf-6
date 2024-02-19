void main() {
    final String[][][] STUDENTS = {
            /* Student 1 */   {{"1"}, {"Kasun", "Sampath"}, {"30", "80", "65"}},
            /* Student 2 */   {{"2"}, {"Nuwan"}, {"40", "70", "-1"}},
            /* Student 3 */   {{"3"}, {"Ruwan", null}, {"-1", "65", "80"}},
    };

    final String LINE = STR."+\{"-".repeat(5)}+\{"-".repeat(8)}+\{"-"
            .repeat(8)}+\{"-".repeat(3)}+\{"-".repeat(5)}+\{"-".repeat(5)}+";
    final String HEADER = "\033[43;1m|%-5s|%-8s|%-8s|%3s|%5s|%5s|\033[0m"
            .formatted("ID", "F.NAME", "L.NAME", "SUB", "TOTAL", "AVG.");
    final String ROW = "|%-5s|%-8s|%-8s|%3s|%5s|%5s|\n";
    System.out.println(LINE);
    System.out.println(HEADER);
    System.out.println(LINE);
    for (String[][] student : STUDENTS) {
        String id = student[0][0];
        String[] name = student[1];
        String[] subjects = student[2];
        String[] totalMarks = student[2];
        String[] avgMarks = student[2];
        System.out.printf(ROW, getId(id), getFirstName(name), getLastName(name),
                getSubjects(subjects), getTotalMarks(totalMarks), getAvgMarks(avgMarks), "", "");

    }
    System.out.println(LINE);
}

String getId(String id) {
    return "S%03d".formatted(Integer.parseInt(id));
}

String getFirstName(String[] name) {
    return name[0];
}

String getLastName(String[] name) {
    return name.length != 2 || name[1] == null ? "-" : name[1];
}

String getSubjects(String[] subjects) {
    int subjetCount = 0;
    for (String marks : subjects) {
        if (Integer.parseInt(marks) == -1) continue;
        subjetCount++;

    }
    return STR."\{subjetCount}";

}

double getTotalMarks(String[] totalMarks) {
    double total = 0.0;
    for (String marks : totalMarks) {
        if (Double.parseDouble(marks) != -1) {
            total += Double.parseDouble(marks);
        }
    }
    return total;

}

double getAvgMarks(String[] avgMarks) {
    double total = 0.0;
    int subjectCount = 0;


    for (String mark : avgMarks) {
        if (!mark.equals("-1")) {
            total += Double.parseDouble(mark);
            subjectCount++;
        }
    }
    if (subjectCount == 0) {
        return 0.0; // Avoid division by zero
    }

    return total / subjectCount;

}