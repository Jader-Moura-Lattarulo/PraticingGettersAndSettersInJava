public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.length() < 5) throw new IllegalArgumentException("O título precia ter mais de 5 caracteres");
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author.length() < 2) throw new IllegalArgumentException("O nome do autor precisa ter mais de 2 letras.");
        this.author = author;
    }

    public void displaysBookInformation() {
        System.out.printf("""
                ***************************
                Título: %s
                Autor: %s
                ***************************
                """, this.title, this.author);
    }
}
