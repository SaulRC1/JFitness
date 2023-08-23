package jfitness.body.mass.index;

import jfitness.body.mass.index.category.BodyMassIndexCategoriser;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public final class AncelKeysBMIFormula implements BodyMassIndexFormula
{
    private static final String FORMULA_NAME = "Ancel Keys BMI formula 1972";
    
    private BodyMassIndexCategoriser bodyMassIndexCategoriser;
    
    private double personWeight;
    
    private double personHeight;

    public AncelKeysBMIFormula(BodyMassIndexCategoriser bodyMassIndexCategoriser, double personWeight, double personHeight)
    {
        if(this.isBodyMassIndexCategoriserCompatible(bodyMassIndexCategoriser))
        {
            this.bodyMassIndexCategoriser = bodyMassIndexCategoriser;
        }
        else
        {
            throw new IncompatibleBodyMassIndexCategoriserException();
        }
        
        this.personWeight = personWeight;
        this.personHeight = personHeight;
    }
    
    @Override
    public BodyMassIndex calculateBodyMassIndex()
    {
        BodyMassIndex bodyMassIndex = new BodyMassIndex();
        
        bodyMassIndex.setBodyMassIndexFormulaUsed(FORMULA_NAME);
        
        bodyMassIndex.setBodyMassIndexCategoriserUsed(bodyMassIndexCategoriser.getCategoriserName());
        
        double bodyMassIndexValue = this.calculateBodyMassIndexValue();
        
        bodyMassIndex.setBodyMassIndexValue(bodyMassIndexValue);
        
        String bodyMassIndexCategory = bodyMassIndexCategoriser.categoriseBodyMassIndex(bodyMassIndexValue);
        
        bodyMassIndex.setBodyMassIndexCategory(bodyMassIndexCategory);
        
        return bodyMassIndex;
    }
    
    public double calculateBodyMassIndexValue()
    {
        return (personWeight / Math.pow(personHeight, 2));
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
        else
        {
            throw new IncompatibleBodyMassIndexCategoriserException();
        }
    }

    @Override
    public boolean isBodyMassIndexCategoriserCompatible(BodyMassIndexCategoriser bodyMassIndexCategoriser)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getPersonWeight()
    {
        return personWeight;
    }

    public void setPersonWeight(double personWeight)
    {
        this.personWeight = personWeight;
    }

    public double getPersonHeight()
    {
        return personHeight;
    }

    public void setPersonHeight(double personHeight)
    {
        this.personHeight = personHeight;
    }
}
