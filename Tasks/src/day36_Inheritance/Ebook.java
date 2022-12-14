package day36_Inheritance;

public class Ebook extends Book {

    public String size;
    public int pages;

    public Ebook(String size, int pages) {
        this.size = size;
        this.pages = pages;
    }

    public void read(){
        System.out.println("reading "+title);
    }

    public String toString() {
        return "Ebook{" +
                "size='" + size + '\'' +
                ", pages=" + pages +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
        '}';
    }
}


