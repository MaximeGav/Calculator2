/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

/**
 *
 * @author Michael
 */
public class OperationFactory {
    
    private Operation op;
  
    public Operation createOperation(String type)
    {
        switch(type)
        {
            case "Plus" : op = new PlusOperation() ;break;
            case "Minus" : op = new MinusOperation();break;
            case "Divide" : op = new DivideOperation(); break;
            case "Multiply" : op = new MultiplyOperation();break;
            case "Modulus" : op = new ModulusOperation();    
        }
        return op;
    }
    
    
}
