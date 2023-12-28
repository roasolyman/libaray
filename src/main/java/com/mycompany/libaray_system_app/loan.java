package com.mycompany.libaray_system_app;
import java.util.Date;

class loans implements display {
    private student student;
    private Book book;
    private Date dueDate;

    public loans(student student, Book book, Date dueDate) {
        this.student = student;
        this.book = book;
        this.dueDate = dueDate;
    }

    public student getstudent() {
        return student;
    }

    public void setstudent(student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String getInfo() {
        return "Loan: (" + " Book : " + book.getTitle() +  ", Student : " + student.getName() +", Due Date: " + dueDate.toString() +  " ) ";
    }

    @Override
    public boolean inloans() {
        return !dueDate.before(new Date());
    }
}

    

