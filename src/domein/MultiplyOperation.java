/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

/**
 *
 * @author Michael
 */
public class MultiplyOperation extends Operation{
    
    public MultiplyOperation()
    {
        setType("Multiply");
    }
    
    @Override
    public void operation(int nr1, int nr2) {
        setWaarde1(nr1);
        setWaarde2(nr2);
        setUitkomst(nr1 * nr2);
    }

   
    @Override
    public int combinate(Operation op1, Operation op2) 
    {
        if(op1.getType().equals("Minus") && op2.getType().equals("Minus"))
        {
            setUitkomst(op1.getWaarde1() - op1.getWaarde2() * op2.getWaarde1() - op2.getWaarde2());
        }
        if(op1.getType().equals("Minus") && op2.getType().equals("Plus"))
        {
            setUitkomst(op1.getWaarde1() - op1.getWaarde2() * op2.getWaarde1() + op2.getWaarde2());
        }
        if(op1.getType().equals("Plus") && op2.getType().equals("Minus"))
        {
            setUitkomst(op1.getWaarde1() + op1.getWaarde2() * op2.getWaarde1() - op2.getWaarde2());
        }
        if(op1.getType().equals("Minus") && op2.getType().equals("Plus"))
        {
            setUitkomst(op1.getWaarde1() - op1.getWaarde2() * op2.getWaarde1() + op2.getWaarde2());
        }
        else
        {
            setUitkomst(op1.getUitkomst() * op2.getUitkomst());
        }
        
        return getUitkomst();
      
    }
    
}
