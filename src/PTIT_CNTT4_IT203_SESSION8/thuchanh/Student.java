package PTIT_CNTT4_IT203_SESSION8.thuchanh;

public class Student {
    private String idStudent;
    private String fullName;
    private int age;
    private String sex;
    private double mathScore;
    private double logicalScore;
    private double chemistryScore;

    public Student(String idStudent, String fullName, int age, String sex,
                   double mathScore, double logicalScore, double chemistryScore) {
        this.idStudent = idStudent;
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
        this.mathScore = mathScore;
        this.logicalScore = logicalScore;
        this.chemistryScore = chemistryScore;
    }

    // ===== NGHIỆP VỤ =====
    public double getAverageScore() {
        return (mathScore + logicalScore + chemistryScore) / 3;
    }

    public String getRank() {
        double avg = getAverageScore();
        if (avg >= 8) return "Gioi";
        else if (avg >= 6.5) return "Kha";
        else if (avg >= 5) return "Trung binh";
        else return "Yeu";
    }

    public void display() {
        System.out.println(idStudent + " | " + fullName + " | DTB: "
                + String.format("%.2f", getAverageScore()) + " | " + getRank());
    }

    // ===== GETTER / SETTER =====
    public String getIdStudent() { return idStudent; }
    public String getFullName() { return fullName; }
    public int getAge() { return age; }
    public String getSex() { return sex; }
    public double getMathScore() { return mathScore; }
    public double getLogicalScore() { return logicalScore; }
    public double getChemistryScore() { return chemistryScore; }

    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setAge(int age) { this.age = age; }
    public void setSex(String sex) { this.sex = sex; }
    public void setMathScore(double mathScore) { this.mathScore = mathScore; }
    public void setLogicalScore(double logicalScore) { this.logicalScore = logicalScore; }
    public void setChemistryScore(double chemistryScore) { this.chemistryScore = chemistryScore; }
}