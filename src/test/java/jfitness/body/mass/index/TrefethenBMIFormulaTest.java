package jfitness.body.mass.index;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public class TrefethenBMIFormulaTest 
{

    /**
     * Will test if the constructor throws a NullPointerException when a null
     * {@link BodyMassIndexCategoriser} is passed as an argument.
     */
    @Test
    public void test1()
    {
        Assertions.assertThrows(NullPointerException.class, () -> {
            BodyMassIndexFormula trefethenBMIFormula = new TrefethenBMIFormula(null, 75, 175);
        } , "NullPointerException was expected.");
    }
    
    public void test2()
    {
        
    }
}
