package com.mycompany.libaray_system_app;
import java.util.ArrayList; 

class student implements display {
    private int id;
    private String name;
    private String address;
    private String major;
    private ArrayList<loans> loans;
    private ArrayList<Book> books; 

    public student(int id, String name, String address, String major, ArrayList<loans> loans, ArrayList<Book> books) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.major = major;
        this.loans = loans;
        this.books = books;
    }

    public void addBook(Book book)
    {
        books.add(book); 
    }
    
    public void addloan(loans loan)
    {
        loans.add(loan);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public ArrayList<loans> getloans() {
        return loans;
    }

    public void setloans(ArrayList<loans> loans) {
        this.loans = loans;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public student(int id, String name, String address, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.major = major;
        this.loans = new ArrayList<loans>();
        this.books = new ArrayList<Book>(); 
    }
    

    @Override
    public String getInfo() {
        return "Student: " + "( "+ name + ", Major: " + major + " , Has Loans : " + this.inloans() + " )";
    }

    @Override
    public boolean inloans() {
        return !loans.isEmpty();
    }
    
    
}
