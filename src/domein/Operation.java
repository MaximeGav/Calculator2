/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

/**
 *
 * @author Michael
 */
public abstract class Operation {
    
    private int waarde1,waarde2, uitkomst;
    private String type;
    
    

    public abstract void operation(int nr1, int nr2);
    public abstract int combinate(Operation op1, Operation op2);

    
    
    
  //getters and setters
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWaarde1() {
        return waarde1;
    }

    public void setWaarde1(int waarde1) {
        this.waarde1 = waarde1;
    }

    public int getWaarde2() {
        return waarde2;
    }

    public void setWaarde2(int waarde2) {
        this.waarde2 = waarde2;
    }

    public int getUitkomst() {
        return uitkomst;
    }

    public void setUitkomst(int uitkomst) {
        this.uitkomst = uitkomst;
    }

    
   
    
    
 
    
}
 