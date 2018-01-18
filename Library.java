import java.util.ArrayList;
import java.util.Iterator;
import java.util.GregorianCalendar;

/**
 * Houghton library main class to implement
 * functionality
 * @author Andy Hayman
 * @version 1.0
 */
public class Library
{
    // instance variables 
    private ArrayList<Member> members;
    private ArrayList<Book> books;
    private ArrayList<Loan> loans;
    
    

    /**
    * Constructor for objects of class Library
    * members is Array List of type Member
    * books is Array List of type Book
    * loans is Array List of type Loan
    */
    
    public Library()
    {
      members = new ArrayList<Member>(); 
      books = new ArrayList<Book>();
      loans = new ArrayList<Loan>();
    }

    
    /**
     *  User requirement 1A
     *  
     *  Add a Member object
     */
     
    public void addMember(Member m)
    {
        members.add(m);
           
    }
    
    /**
     *  User requirement 1A
     *  
     *  Pass paramters to Member class
     *  firstName - type string contains members first name
     *  lastName - type string contains members last name
     *  phoneNumber - type string contains members phone number (not using long or double)
     *  membershipNumber - type int contains members membership number
     *  
     */
     
    public void addMember(String firstName, String lastName, String phoneNumber, int membershipNum)
    {
        members.add(new Member( firstName, lastName,  phoneNumber,  membershipNum));
    }
    
    /**
     *   User requirement 1C
     *   Output list of all members
     */
    public void showAllMembers()
    {
        for (Member m : members) {
            System.out.println(m);
        }
    }
    
    /**
     *  User requirement 1B
     *  find member by passing int to method findMember
     *  memNo - type int, membership number of member we are trying to get the details of
     */
    public void findMember(int memNo)
    {
        Iterator<Member> it = members.iterator();
        while (it.hasNext()){
            Member member = it.next();
            if (member.getMembershipNumber() == memNo) {
                System.out.println(member);
            }
             
        }

    }  
    
    /**
     *  User requirement 2A
     *  Add a book object
     */
    public void addBook (Book b)
    {
        books.add(b);
    }
    /**
     * Add a book by passing parameters to book class
     * bookTitle - type String contains title of book
     * bookAuthor - type string contains book author
     * bookRef - type int contains book reference number
     * bookFiction - type boolean is book fiction or not
     */
    
    public void addBook (String bookTitle, String bookAuthor, int bookRef, boolean bookFiction)
    {
        books.add(new Book(bookTitle,bookAuthor,bookRef, bookFiction));
    }
    /**
     * User requirement 2B
     * find book by passing book ref number to find book method
     * bookNo - type int reference number of book we are looking for
     */
    public void findBook(int bookNo)
    {
        Iterator<Book> it = books.iterator();
        while (it.hasNext()){
            Book book = it.next();
            if (book.getBookRef() == bookNo){
                System.out.println(book);
            }
        }
    }
    
    /**
     * User requirement 2C
     * output list of all books
     */
    public void showAllBooks()
    {
        for (Book b : books) {
            System.out.println(b);
        }
    }
    
    /**
     * User requirement 3A
     * Return Member object given membership number
     * searchNumber - type int containing mebership number of member object we are looking for
     */
    public Member searchMember(int searchNumber)
    {
      Iterator<Member> it = members.iterator();
        while (it.hasNext()){
            Member member = it.next();
            if (member.getMembershipNumber() == searchNumber) {
                System.out.println ("Member " + member +" found");
                return member;
            }
             
        }  
        return null; 
    }
    
    /**
     * User requirement 4A
     * Return book object given book reference number
     * searchRef - type int containing reference number of book we are looking for
     */
    public Book searchBook(int searchRef)
    {
      Iterator<Book> it = books.iterator();
        while (it.hasNext()){
            Book book = it.next();
            if (book.getBookRef() == searchRef) {
                System.out.println("Book "+book+" found");
                return book;
            }
             
        }  
        return null; 
    }
    
    /**
     * User requirement 4B
     * Find books that contain text in search string
     * searchString - type String containing text in book title we are looking for
     */
    public void seachBookText(String searchString)
    {
        int index = 0;
        Iterator<Book> it = books.iterator();
        while (it.hasNext()){
            Book book = it.next();
            String title = book.getBookTitle();
            if (title.contains(searchString)){
                System.out.println (" Matching Book "+ index + " "+ books.get(index));
                index++;
            }
            else {
                index++; 
            }
        }
    }
    
    /**
     * User requirement 3B
     * Find member that has surname containing text in search string
     * searchString - type String containing part of surname we are looking for
     */
     public void seachMemberText(String searchString)
    {
        int index = 0;
        Iterator<Member> it = members.iterator();
        while (it.hasNext()){
            Member member = it.next();
            String name = member.getLastName();
            if (name.contains(searchString)){
                System.out.println (" Matching Member "+ index + " "+ members.get(index));
                index++;
            }
            else {
                index++; 
            }
        }
    }
    
    /**
     * User requirement 3C
     * Remove a member given membership number in search number
     * searchNumber - type int containing membership number of member we wish to remove
     */
    public void removeMember (int searchNumber)
    {
        ArrayList<Member> purgedMembers;
        purgedMembers = new ArrayList<Member>();
        Iterator<Member> it = members.iterator();
        while (it.hasNext()){
            Member member = it.next();
            if (member.getMembershipNumber() == searchNumber) {
                System.out.println("Member found "+ member);
                purgedMembers.add(member);
                it.remove();
                }
        }
    }
    /**
     * User requirement 4C
     * Remove a book given reference number in search number
     * searchNumber - type int containing book reference number of book we wish to remove
     */
    public void removeBook (int searchNumber)
    {
        ArrayList<Book> purgedBooks;
        purgedBooks = new ArrayList<Book>();
        Iterator<Book> it = books.iterator();
        while (it.hasNext()){
            Book book = it.next();
            if (book.getBookRef() == searchNumber) {
                System.out.println("Book found "+ book);
                purgedBooks.add(book);
                it.remove();
            }
        }  
    }
    
    /**
     * User requirement 5A
     * Add a Loan object
     */
    public void addLoan (Loan l)
    {
         loans.add(l);        
    }
    
    /**
     * Pass paramters to Loan class
     * member - type int containg membership number of member taking out loan
     * book - type int containing reference number of book being loaned
     */
    public void addLoan (int member, int book)
    {
        loans.add(new Loan(member,book));
    }
    /**
     * User requirement 5B
     * removeloan by passing membership number and book reference
     * searchBookNumber - type int containing reference number of book loaned
     * searchMemberNumber - type int containing membership number of member taking out loan
     */
    public void removeLoan (int searchBookNumber,int searchMemberNumber)
    {
        ArrayList<Loan> purgedLoans;
        purgedLoans = new ArrayList<Loan>();
        Iterator<Loan> it = loans.iterator();
        while (it.hasNext()){
            Loan loan = it.next();
            if ((loan.getBook() == searchBookNumber) && (loan.getMember() == searchMemberNumber)){
                System.out.println("Loan found "+ loan);
                purgedLoans.add(loan);
                it.remove();
            }
           
        }  
        
    }
    
    /**
     * User requirements 5C
     * Show all loans - take membership number and book reference number and looks up details
     */
    public void showAllLoans()
    {
        Iterator<Loan> it = loans.iterator();
        while (it.hasNext()){
            System.out.println("*******************************************************************");
            Loan loan = it.next();
            int bookRef = loan.getBook();{
                Iterator<Book> bit = books.iterator();
                while (bit.hasNext()){
                Book book = bit.next();{
                    if (book.getBookRef() == bookRef) {
                        System.out.println(book);
                    }    
                }
            }
        }
        
            int memberRef = loan.getMember();{
                Iterator<Member> mit = members.iterator();
                while (mit.hasNext()){
                Member member = mit.next();{
                    if (member.getMembershipNumber() == memberRef){
                        System.out.println(member);
                    }
                }
            }
        }
   } 
}
}

