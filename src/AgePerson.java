public class AgePerson {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 ) throw new IllegalArgumentException("Idade não pode ser negativa.");
        this.age = age;
    }

    public boolean ageVerify(){
        return this.age > 18;
    }

    public String ageVerifyMessage(){
        boolean ofLegalAge = ageVerify();
        String legalAge;

        if (ofLegalAge) {
            legalAge = "É maior de idade.";
        } else {
            legalAge = "É menor de idade.";
        }
        return legalAge;
    }
}
