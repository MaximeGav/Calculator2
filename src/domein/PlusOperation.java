/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

/**
 *
 * @author Michael
 */
public class PlusOperation extends Operation{

    public PlusOperation()
    {
        setType("Plus");
    }
    
    
    @Override
    public void operation(int nr1, int nr2) {
        setWaarde1(nr1);
        setWaarde2(nr2);
        setUitkomst(nr1 + nr2);
    }

    @Override
    public int combinate(Operation op1, Operation op2) {
        return op1.getUitkomst() + op2.getUitkomst();
    }
    
}
