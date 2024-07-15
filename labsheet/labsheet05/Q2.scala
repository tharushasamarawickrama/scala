case class Book(title: String, author: String, isbn: String)

object LibraryManagement {
  var library: Set[Book] = Set(
    Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"),
    Book("1984", "George Orwell", "9780451524935"),
    Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565")
  )

  def addBook(book: Book): Unit = {
    library += book
    println(s"Book '${book.title}' added to the library.")
  }

  def removeBookByIsbn(isbn: String): Unit = {
    library.find(_.isbn == isbn) match {
      case Some(book) =>
        library -= book
        println(s"Book '${book.title}' removed from the library.")
      case None =>
        println(s"No book found with ISBN $isbn.")
    }
  }

  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    println("\nCurrent library collection:")
    library.foreach { book =>
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
    }
  }

  def searchBookByTitle(title: String): Unit = {
    library.find(_.title.equalsIgnoreCase(title)) match {
      case Some(book) =>
        println(s"\nBook found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None =>
        println(s"\nNo book found with title '$title'.")
    }
  }

  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.nonEmpty) {
      println(s"\nBooks by $author:")
      booksByAuthor.foreach { book =>
        println(s"Title: ${book.title}, ISBN: ${book.isbn}")
      }
    } else {
      println(s"\nNo books found by author '$author'.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayLibrary()

    // Add a new book
    val newBook = Book("Brave New World", "Aldous Huxley", "9780060850524")
    addBook(newBook)
    displayLibrary()

    // Remove a book by ISBN
    val isbnToRemove = "9780451524935"
    removeBookByIsbn(isbnToRemove)
    displayLibrary()

    // Check if a book is in the library by ISBN
    val isbnToCheck = "9780743273565"
    println(s"\nIs book with ISBN $isbnToCheck in the library? ${isBookInLibrary(isbnToCheck)}")

    // Search for a book by title
    val titleToSearch = "1984"
    searchBookByTitle(titleToSearch)

    // Display all books by a specific author
    val authorToSearch = "George Orwell"
    displayBooksByAuthor(authorToSearch)
  }
}