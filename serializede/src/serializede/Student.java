/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializede;

import java.io.Serializable;

/**
 *
 * @author KOL-FACULTY01
 */
public class Student implements Serializable{

    private static final long serialVersionUID = -8414182383383589555L;
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
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
    
    
}
