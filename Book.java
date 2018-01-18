/**
 * Houghton Library book details
 *
 * @author Andy Hayman
 * @version 1.0
 */
public class Book
{
    // Title of book
    private String bookTitle;
    // Name of the books author
    private String bookAuthor;
    // Book reference number
    private int bookRef;
    // fiction or non-fiction
    private boolean bookFiction;
    


    /**
     * Constructor for objects of class Book
     * bookTitle - type String containing title of book
     * bookAuthor - type string containing book author
     * bookRef - type int containg reference number of book
     * bookFiction - type boolean is it fiction or not
     */
    public Book()
    {
        bookTitle = null;
        bookAuthor = null;
        bookRef = 0;
        bookFiction = false;
      
    }

    
    /**
    * bookTitle - type String containing title of book
     * bookAuthor - type string containing book author
     * bookRef - type int containg reference number of book
     * bookFiction - type boolean is it fiction or not
     */
    
    public Book(String bookTitle, String bookAuthor, int bookRef, boolean bookFiction)
    {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookRef = bookRef;
        this.bookFiction = bookFiction;
    }

    
    /**
     * return the book title
     *
     * 
     */
    public String getBookTitle()
    {
        return bookTitle;
    }
    
    /**
     * Set the book title
     * bookTitle - type String containing title of book we are adding
     */
    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }
    
    
    /**
     * return the book author
     */
     
    public String getBookAuthor()
    {
        return bookAuthor;
    }
    
    /**
     *  Set the book author
     *  bookAuthor - type string containing author of book we are adding
     */
    public void setBookAuthor(String bookAuthor)
    {
        this.bookAuthor = bookAuthor;
    }
    
    /**
     * return the book ref number
    */
    public int  getBookRef()
    {
        return bookRef;
    }
    
    /**
     *  set the book ref number
     *  bookRef - type int containing reference number of book we are adding
     */
    public void setBookRef(int bookRef)
    {
        this.bookRef = bookRef;
    }
    
    
    /**
     * return fiction or non-fiction
    */
    public boolean  getBookFiction()
    {
        return bookFiction;
    }
    
    /**
     * set if book is fiction of non-fiction
     * bookFiction - type boolean, is it fiction or not
     */
    public void setBookFiction(boolean bookFiction)
    {
        this.bookFiction = bookFiction;
    }
     
     /**
     * The string to use when printing out
     */
    public String toString()
    {
        return bookTitle + " " + bookAuthor + " ref :" + bookRef + " Fiction "+ bookFiction;
    }

}
