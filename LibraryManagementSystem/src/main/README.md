# Requirements

Create a command-line application for the library management system with the following requirements.

    Details about the Library:
        The library will have one or more copies of multiple books
        The library will have multiple racks and each rack can contain at most one copy of any book.
    Each book will have the following properties:
        Book ID
        Title
        Authors
        Publishers
    Details about Book Copies
        There could be multiple copies of the same book.
        Each book copy will have a unique ID.
        Each book copy will be placed on a rack.
        Each book copy can be borrowed by a user with a specific due date.
    Every rack will have a unique rack number (numbered serially from 1 to n where n is the total number of racks).
    Details about User:
        User details: User ID, Name
        A user can borrow a maximum of 5 books.
    The functions that the library management system can do:
        Create a library.
        Add a book to the library. The book should be added to the first available rack.
        Remove a book copy from the library.
        Allow a user to borrow a book copy given the book id, user id, and due date. The first available copy based on the rack number should be provided.
        Allow a user to borrow a book copy given the book copy id, user id, and due date.
        Allow a user to return a book copy given the book copy id. The book should be added to the first available rack.
        Allow a user to print the book copy ids of all the books borrowed by them.
        Allow a user to search for books using few book properties (Book ID, Title, Author, Publisher). Searching should return details about all the book copies that match the search query.


## Models
- Library
- books (multiple copies)
  - book id
  - title
  - authors
  - publishers
- Rack (each rack will contain at most one copy of any book)
  - rack no. (1 - n)
- User ( can borrow a max of 5 books) 
  - user id
  - name
  - books borrowed ?
- 

Info about copies : 
multiple copies of the same book
each copy --> unique id
each book copy on a rack
book copy can be borrowed with a specific due date


Commands : 
- create a library
- add a book to the library (first available rack)
- remove a book copy from library
- Allow a user to borrow a book copy given the book id, user id, and due date. The first available copy based on the rack number should be provided.

Todo :
1. create cli
2. create library