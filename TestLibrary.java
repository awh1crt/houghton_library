import java.util.ArrayList;
/**
 * Provide a test of the houghton Library.
 *
 * @author Andy Hayman
 * @version 1.0
 */
public class TestLibrary
{
    /**
     * Constructor for objects of class TestLibrary
     */
    public TestLibrary()
    {
    }

    /**
     * Add some members and then display them
     *
     * 
     */
    public void test_001()
    {
       
        Library library = new Library();
        populateWithMembers(library);
        library.showAllMembers();
        
    }
    
    /**
     * Add some books and then display them - library is already created
     */
    public void test_002()
    {
        Library library = new Library();
        populateWithBooks(library);
        library.showAllBooks();
    }
    
    /**
     * Test user requirement B3
     */
    public void test_003()
    {
       Library library = new Library();
       populateWithMembers(library);
       library.showAllMembers(); 
       System.out.println ("Search for member with membership No. 2");
       library.searchMember(2);
       System.out.println("Search for all members with Hay in their name");
       library.seachMemberText("Hay");
       System.out.println("Remove user 3");
       library.removeMember(3);
       
    }
    
    /**
     * Test user requirement B4
     */
    public void test_004()
    {
        Library library = new Library();
        populateWithBooks(library);
        library.showAllBooks();
        System.out.println ("Search for Book with reference No. 2");
       library.searchBook(2);
       System.out.println("Search for all books with # in the title");
       library.seachBookText("#");
       System.out.println("Remove book 1");
       library.removeBook(1);
    }
   
    /**
     * test user requirement C5
     * 
    */
   public void test_005()
   {
       Library library = new Library();
       populateWithLoans(library);
       library.showAllBooks();
       library.showAllMembers(); 
       library.showAllLoans();
       System.out.println ("Remove loan of C# to Andy Hayman");
       library.removeLoan(2,1);
       library.showAllLoans();
       
   }   
    private void populateWithMembers(Library library)
    {
        library.addMember(new Member("Andy", "Hayman","0204 111111",1));
        library.addMember(new Member("Andy", "Hay","061 111111",2));
        library.addMember(new Member("Bill", "Gates","061 111111",3));
        library.addMember(new Member("Steve", "Jobs","061 111111",4));
    }
    
    private void populateWithBooks(Library library)
    {
        library.addBook(new Book("The Bible","God",1,true));
        library.addBook(new Book("c#","Bill Gates",2,true));
        
    }
    
    private void populateWithLoans(Library library)
    {
        library.addMember(new Member("Andy", "Hayman","0204 111111",1));
        library.addMember(new Member("Andy", "Hay","061 111111",2));
        library.addMember(new Member("Bill", "Gates","061 111111",3));
        library.addMember(new Member("Steve", "Jobs","061 111111",4));
        library.addBook(new Book("The Bible","God",1,true));
        library.addBook(new Book("c#","Bill Gates",2,true));
        library.addLoan(new Loan(2,1));
        library.addLoan(new Loan(1,2));
        library.addLoan(new Loan(4,1));
        
    }
}

    