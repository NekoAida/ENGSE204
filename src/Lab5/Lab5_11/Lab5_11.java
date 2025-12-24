package Lab5.Lab5_11;
import java.util.Scanner;

class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + this.title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + this.title + ", Words: " + this.wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + this.title + ", Pages: " + this.pageCount);
    }
}

public class Lab5_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Text Document 1 Title: ");
        String t1Title = input.nextLine();
        System.out.print("Enter Word Count: ");
        int t1Words = input.nextInt();
        input.nextLine();

        System.out.print("Enter PDF Document 1 Title: ");
        String p1Title = input.nextLine();
        System.out.print("Enter Page Count: ");
        int p1Pages = input.nextInt();
        input.nextLine();

        System.out.print("Enter Text Document 2 Title: ");
        String t2Title = input.nextLine();
        System.out.print("Enter Word Count: ");
        int t2Words = input.nextInt();
        input.nextLine();

        System.out.print("Enter PDF Document 2 Title: ");
        String p2Title = input.nextLine();
        System.out.print("Enter Page Count: ");
        int p2Pages = input.nextInt();

        TextDocument t1 = new TextDocument(t1Title, t1Words);
        PDFDocument p1 = new PDFDocument(p1Title, p1Pages);
        TextDocument t2 = new TextDocument(t2Title, t2Words);
        PDFDocument p2 = new PDFDocument(p2Title, p2Pages);

        Document[] docs = {t1, p1, t2, p2};

        int totalPages = 0;
        for (Document doc : docs) {
            if (doc instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) doc;
                totalPages += pdf.pageCount;
            }
        }

        for (Document doc : docs) {
            doc.displayDetails();
        }

        System.out.println("Total Pages: " + totalPages);

        input.close();
    }
}