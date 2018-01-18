
/**
 * Loan class.
 *
 * @Andy Hayman 
 * @1.0
 */

/**
 *  Loan class
 *  member - type int containing membership number of member taking out loan
 *  book - type int containing reference number of loaned book
 */
public class Loan
{
    private int member;
    private int book;
    
      
    /**
     * Constructor for objects of class Loan
     */
    public Loan()
    {
        // initialise instance variables
        
    }
    /**
    * Create loan object
    * member - type int containing membership number of member taking out loan
    *  book - type int containing reference number of loaned book
    */
    public Loan(int member, int book)
    {
        this.member = member;
        this.book = book;      
    }
    /**
     * Set membership number of member loaning book.
     * memberRef - type int containg membership number of member taking out loan
     */
    
    public void setMemberNumber(int memberRef)
    {
        this.member = memberRef;
    }
    /**
    * Set refernce number of book being loaned
    * bookRef - type int containing reference number of loaned book
    */
    public void setBookref(int bookRef)
    {
        this.book = bookRef;
    }
    /**
     * return the membership number of member taking out loan
     */
    public int getMember()
    {
        return member;
    }
    /**
     * return the book reference number of book being loaned
     */
    public int getBook()
    {
        return book;
    }
   
    


}
