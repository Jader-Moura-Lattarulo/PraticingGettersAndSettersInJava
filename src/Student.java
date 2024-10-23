public class Student {
    private String name;
    private double grade;
    private double finalGrade;
    private double sumOfGrades;
    private int totalOfGrades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 3) throw new IllegalArgumentException("O nome deve ter pelo menos 3 letras.");
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade < 0 || grade > 10) throw new IllegalArgumentException("A nota deve ser entre 0 e 10.");
        this.grade = grade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void evaluates(double grade) {
        sumOfGrades += grade;
        totalOfGrades ++;
    }

    public double averageGrades() {
        if (totalOfGrades == 0) throw new IllegalArgumentException("Não foi feita nenhuma avaliação");
        finalGrade = sumOfGrades / totalOfGrades;
        return finalGrade;
    }

}
