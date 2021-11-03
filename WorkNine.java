package homework;

public class WorkNine {

    public static void main(String[] args) {

        Book bookOne = new Book("Robinson Crusoe", 1719,"Daniel Defoe");
        Book bookTwo = new Book("Clarissa", 1689,"Samuel Richardson");
        Book bookThree = new Book("Gulliver Travels", 1726,"Jonathan Swift");
        Book bookFour = new Book("Emma", 1815,"Jane Austen");
        Book bookFive = new Book("Abbey of nightmares", 1815,"Thomas Love Peacock");
        Book bookSix = new Book("Sibylla", 1705,"Maria Sibylla Merian");
        Book bookSeven = new Book("Jane Eyre", 1845,"Charlotte Bronte");
        Book bookEight = new Book("Vanity Fair", 1848,"William Makepeace Thackeray");
        Book bookNine = new Book("Moonstone", 1866,"Wilkie Collins");
        Book bookTen = new Book("Middlemarch", 1872,"George Eliot");
        Book bookEleven = new Book("Kidnapped", 1891,"Robert Louis Stevenson");
        Book bookTwelve = new Book("Sign of four", 1892,"Arthur Conan Doyle");

        Book[] books = new Book[12];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        books[4] = bookFive;
        books[5] = bookSix;
        books[6] = bookSeven;
        books[7] = bookEight;
        books[8] = bookNine;
        books[9] = bookTen;
        books[10] = bookEleven;
        books[11] = bookTwelve;


        for (int i = 0; i < books.length; i++) {

            Book elementBook = books[i];

            System.out.println((i+1)+ " The book name " + elementBook.name + " year  " + elementBook.year + " author " + elementBook.author);
        }
    }
}

