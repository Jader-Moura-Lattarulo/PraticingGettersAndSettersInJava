import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber(4063);
        bankAccount.setBalance(1800);
        bankAccount.holder = "Jader";

        System.out.printf("""
                **************************
                Exercício Conta Bancária.
                Nº da conta: %d
                Saldo: %d
                Titular: %s
                **************************
                """, bankAccount.getAccountNumber(), bankAccount.getBalance(), bankAccount.holder);

        AgePerson agePerson = new AgePerson();

        agePerson.setName("Jader");
        agePerson.setAge(35);

        String message = agePerson.ageVerifyMessage();

        System.out.printf("""
                **************************
                Exercício Idade Legal.
                %s
                **************************
                """, message);

        Product product = new Product();

        product.setName("Camiseta");
        product.setPrice(125);

        double newPrice = product.applyDiscount(10);

        System.out.printf("""
                **************************
                Exercício Desconto Produto
                O valor com desconto é: R$%.2f
                **************************
                """, newPrice);


        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Jader", 10, 9, 9.5));
        students.add(new Student("Gabi", 10, 9.5, 9));

        for (Student student : students) {
            double average = student.averageGrades();

            System.out.printf("""
                    **************************
                    Exercício Média do Aluno
                    Nome: %s
                    Média final: %.2f
                    **************************
                    """, student.getName(), average);
        }

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Mais que tios da salinha", "Dan Lovaglia"));
        books.add(new Book("O Silmarillion", "J.R.R. Tolkien"));
        books.add(new Book("Reforma sexual", "Aimee Byrd"));

        for (Book book : books) {
            System.out.printf("""
                    **************************
                    Exercício Lista de Livros
                    Título: %s
                    Autor: %s
                    **************************
                    """, book.getTitle(), book.getAuthor());
        }

    }
}
