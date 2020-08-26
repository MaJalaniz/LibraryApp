# LibraryApp

*The project will use JDBC, JSPs, Servlets and Maven

OBJECTIVE: Create a website for a library where you can login as 
  - A librarian who will manage books and approve patron accounts.
  - A patron who can checkout and return books.
  
  
Patron User Actions-SIGN UP
  1. Pass info for account in a form.
  2. Account will be "frozen" once created and will not be able to check out any books.
  3. Librarian will have to unfreeze account.

Patron User Actions-LOGIN/ACCOUNT PRIVILEGES
  1. Check out books (if available)
  2. Return books.
  3. View all books previously checked out, as well as, current books checked out.
  4. List of books at the library.
  5. Update Name, Username and Password.
  
  
Librarian User Actions-ADD BOOKS
  1. Must have false set for rented column.
  2. Must have todays date for Added_To_Library column.
  
Librarian User Actions-UPDATE BOOKS
  1. Update books title and description.
  
Librarian User Actions-ACCOUNT MANAGEMENT
  1. Change the user accounts from "Frozen" to "Unfrozen" to allow for book checkout.
  
  
