/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libaray_system_app;

/**
 *
 * @author thinktec
 */
public class jaurnal  extends Book{
    private String name ;
    private int coNO;

    public jaurnal(String name, int coNO, String title, String author, int id, String genre, int version, boolean available) {
        super(title, author, id, genre, version, available);
        this.name = name;
        this.coNO = coNO;
    }

    public String getName() {
        return name;
    }

    public int getCoNO() {
        return coNO;
    }

    @Override
    public String toString() {
        return "jaurnal{" + "name=" + name + ", coNO=" + coNO + '}';
    }
    
}
