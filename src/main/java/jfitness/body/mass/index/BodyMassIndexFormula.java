package jfitness.body.mass.index;

import jfitness.body.mass.index.category.BodyMassIndexCategoriser;
import jfitness.person.fitness.data.PersonFitnessData;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public interface BodyMassIndexFormula
{
    public BodyMassIndex calculateBodyMassIndex(PersonFitnessData personFitnessData);
    
    public String getFormulaName();
    
    public BodyMassIndexCategoriser getBodyMassIndexCategoriser();
    
    public void setBodyMassIndexCategoriser(BodyMassIndexCategoriser bodyMassIndexCategoriser);
    
    public boolean isBodyMassIndexCategoriserCompatible(BodyMassIndexCategoriser bodyMassIndexCategoriser);
}
