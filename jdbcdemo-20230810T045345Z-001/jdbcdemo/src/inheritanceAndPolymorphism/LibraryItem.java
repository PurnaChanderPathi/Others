package inheritanceAndPolymorphism;

class LibraryItem {
    private String title;
    private String authorOrDirector;
    private int uniqueIdentifier;

    public LibraryItem(String title, String authorOrDirector, int uniqueIdentifier) {
        this.title = title;
        this.authorOrDirector = authorOrDirector;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author/Director: " + authorOrDirector);
        System.out.println("Unique Identifier: " + uniqueIdentifier);
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getUniqueIdentifier() {
		return uniqueIdentifier;
	}

	public void setUniqueIdentifier(int uniqueIdentifier) {
		this.uniqueIdentifier = uniqueIdentifier;
	}

	public String getAuthorOrDirector() {
		return authorOrDirector;
	}

	public void setAuthorOrDirector(String authorOrDirector) {
		this.authorOrDirector = authorOrDirector;
	}
}

class Book extends LibraryItem {
    public Book(String title, String author, int uniqueIdentifier) {
        super(title, author, uniqueIdentifier);
    }
}

class DVD extends LibraryItem {
    public DVD(String title, String director, int uniqueIdentifier) {
        super(title, director, uniqueIdentifier);
    }
}
