package jfitness.body.mass.index;

import jfitness.body.mass.index.category.BodyMassIndexCategoriser;
import jfitness.person.fitness.data.PersonFitnessData;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public class AncelKeysBMIFormula implements BodyMassIndexFormula
{
    private static final String FORMULA_NAME = "Ancel Keys BMI formula 1972";
    
    private BodyMassIndexCategoriser bodyMassIndexCategoriser;
    
    @Override
    public BodyMassIndex calculateBodyMassIndex(PersonFitnessData personFitnessData)
    {
        BodyMassIndex bodyMassIndex = new BodyMassIndex();
        
        bodyMassIndex.setBodyMassIndexFormulaUsed(FORMULA_NAME);
        
        bodyMassIndex.setBodyMassIndexCategoriserUsed(bodyMassIndexCategoriser.getCategoriserName());
        
        double bodyMassIndexValue = this.calculateBodyMassIndexValue(personFitnessData);
        
        bodyMassIndex.setBodyMassIndexValue(bodyMassIndexValue);
        
        String bodyMassIndexCategory = bodyMassIndexCategoriser.categoriseBodyMassIndex(bodyMassIndexValue);
        
        bodyMassIndex.setBodyMassIndexCategory(bodyMassIndexCategory);
        
        return bodyMassIndex;
    }
    
    public double calculateBodyMassIndexValue(PersonFitnessData personFitnessData)
    {
        return (personFitnessData.getWeight() / Math.pow(personFitnessData.getHeight(), 2));
    }
    
    @Override
    public String getFormulaName()
    {
        return FORMULA_NAME;
    }

    @Override
    public BodyMassIndexCategoriser getBodyMassIndexCategoriser()
    {
        return bodyMassIndexCategoriser;
    }

    @Override
    public void setBodyMassIndexCategoriser(BodyMassIndexCategoriser bodyMassIndexCategoriser)
    {
        if(isBodyMassIndexCategoriserCompatible(bodyMassIndexCategoriser))
        {
            this.bodyMassIndexCategoriser = bodyMassIndexCategoriser;
        }
    }

    @Override
    public boolean isBodyMassIndexCategoriserCompatible(BodyMassIndexCategoriser bodyMassIndexCategoriser)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
