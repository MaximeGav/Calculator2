/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

/**
 *
 * @author Michael
 */
public class Calculator {
    
    public static void main(String[]args)
    {
        OperationFactory opFac = new OperationFactory();
       
        Operation minOperatie = opFac.createOperation("Minus");
        Operation plusOperatie = opFac.createOperation("Plus");
        Operation maalOperatie = opFac.createOperation("Multiply");
       
        plusOperatie.operation(1, 1);
        maalOperatie.operation(4, 4);
        
        
        System.out.println( minOperatie.combinate(plusOperatie, maalOperatie));
        
        
    }
    
    
}
