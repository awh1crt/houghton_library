
/**
 * Houghton Library member details
 *
 * @author Andy Hayman
 * @version 1.0
 */
public class Member
{
    // First name of the member
    private String firstName;
    // Last name of the member
    private String lastName;
    // Members phone number
    private String phoneNumber;
    // Members membership number
    private int membershipNumber;
    
    /**
     * Constructor for objects of class Member
     *  firstName - type string contains members first name
     *  lastName - type string contains members last name
     *  phoneNumber - type string contains members phone number (not using long or double)
     *  membershipNumber - type int contains members membership numbe
     */
    public Member()
     {
        // initialise instance variables
        firstName = null;
        lastName = null;
        phoneNumber = null;
        membershipNumber = 0;
             
    }
    
    /**
     * Parameter constructor for Member
     * firstName - type string contains members first name
     *  lastName - type string contains members last name
     *  phoneNumber - type string contains members phone number (not using long or double)
     *  membershipNumber - type int contains members membership numbe
     */
    public Member(String firstName, String lastName, String phoneNumber, int membershipNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.membershipNumber = membershipNumber;
   }
    
    /**
     * Set the members first name
     * firstName - type String containing members first name
     * 
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    
    /**
     * Return the members first name
     *
     * 
     */
    public String getFirstName()
    {
        return firstName;
    }
    
      /**
     * Set the members last name
     * lastName - type String containing members last name
     * 
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    /**
     * Return the members last name
     *
     * 
     */
    public String getLastName()
    {
       return lastName;
    }
    
      /**
     * Set the members phone number
     * phoneNumber - type string containing phone number of member
     * note string used as int is too short and double or long require more memory
     * 
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    /**
     * Return the members phone number
     *
     * 
     */
    public String getPhoneNumber()
    {
       return phoneNumber;
    }
    
    
     /**
     * Set the members membership number
     * membershipNumber - type int containing membership number of member
     * 
     */
    public void setMembershipNumber(int membershipNumber)
    {
        this.membershipNumber = membershipNumber;
    }
    /**
     * Return the members membership number
     *
     * 
     */
    public int getMembershipNumber()
    {
       return membershipNumber;
    }
    
     /**
     * The string to use when printing out
     */
    public String toString()
    {
        return firstName + " " + lastName + " Phone :" + phoneNumber + " Membership No. "+ membershipNumber;
    }
    
    
}
