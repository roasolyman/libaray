/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libaray_system_app;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author thinktec
 */
public class library {

    public static void Addstudent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
     private ArrayList<Book> books;
    private ArrayList<jaurnal> jaurnals;
    private ArrayList<magazine> magazines;
    private ArrayList<student> students; 
   

    public ArrayList<jaurnal> getjaurnals() {
        return jaurnals;
    }

    public void setJournals(ArrayList<jaurnal> jaurnals) {
        this.jaurnals = jaurnals;
    }

    public ArrayList<magazine> getmagazines() {
        return magazines;
    }

    public void setmagazines(ArrayList<magazine> magazines) {
        this.magazines = magazines;
    }

    
    
    public ArrayList<student> getstudents() {
        return students;
    }

    public void setStudents(ArrayList<student> students) {
        this.students = students;
    }
    
    public void Addstudent(student student){
        students.add(student); 
    }
    
    public void Addjournal(jaurnal jaurnal){
        jaurnals.add(jaurnal);
                
    }
    public void Addmagazine(magazine magazine){
        magazines.add(magazine);
    }

    public library() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
        this.jaurnals = new ArrayList<>(); 
        this.magazines = new ArrayList<>(); 
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    
    
    public student FindstudentById(int id){
        for(student s : students)
       {
           if(s.getId() == id)
               return s; 
       }
        return null; 
    }
    
    
    public boolean returnBook(student student, Book book) {
        return false;
    }

    public String displayBooks() {
        return "List of Books: ...";
    }
    
    public ArrayList<Book> SearchAvailableBooks(){
        ArrayList<Book> stored= new ArrayList<>(); 
        for(Book b : books)
        {
            if(b.isAvailable())
                stored.add(b);
        }
        return stored; 
    }
    public Book SearchBookByTitle(String title){
        for(Book b : books)
            if(b.getTitle().equals(title)){
                System.out.println(title + " Book Found");
                return b; 
            }
        return null; 
    } 
    public Book SearchBookByNumber(int number){
        for(Book b : books)
            if(b.getNo() == number){
                System.out.println(b.getTitle() + " Book Found");
                return b;
            }
        return null; 
    } 
    public Book SearchBookByAuthor(String author){
        for(Book b : books)
            if(b.getAuthor().equals(author)){
                System.out.println(b.getTitle() + "Book Found");
                return b;
            }
        return null; 
    }

    public void Addjaurnal(jaurnal jaurnal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

