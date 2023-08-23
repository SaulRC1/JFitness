package jfitness.body.mass.index;

import jfitness.body.mass.index.category.BodyMassIndexCategoriser;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public interface BodyMassIndexFormula
{
    public BodyMassIndex calculateBodyMassIndex();
    
    public String getFormulaName();
    
    public BodyMassIndexCategoriser getBodyMassIndexCategoriser();
    
    public void setBodyMassIndexCategoriser(BodyMassIndexCategoriser bodyMassIndexCategoriser);
    
    public boolean isBodyMassIndexCategoriserCompatible(BodyMassIndexCategoriser bodyMassIndexCategoriser);
}
