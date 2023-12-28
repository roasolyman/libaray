/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libaray_system_app;

/**
 *
 * @author thinktec
 */
public class magazine extends Book {
    private int issueNo;

    public magazine(String title, String author, int id, String genre, int version, boolean available) {
        super(title, author, id, genre, version, available);
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    @Override
    public String toString() {
        return "magazine{" + "issueNo=" + issueNo + '}';
    }
    
    

}
