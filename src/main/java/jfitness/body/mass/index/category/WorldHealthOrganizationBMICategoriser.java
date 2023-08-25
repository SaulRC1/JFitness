package jfitness.body.mass.index.category;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public class WorldHealthOrganizationBMICategoriser implements BodyMassIndexCategoriser
{

    private static final String CATEGORISER_NAME = "World Health Organization BMI Categoriser";

    @Override
    public String categoriseBodyMassIndex(double bodyMassIndexValue)
    {
        if(bodyMassIndexValue < 0)
        {
            throw new IllegalArgumentException("Body Mass Index value must be a positive number.");
        }
        
        if (bodyMassIndexValue < 16)
        {
            return WorldHealthOrganizationBMICategory.UNDERWEIGHT_SEVERE_THINNESS.getCategoryName();
        }

        if (bodyMassIndexValue >= 16 && bodyMassIndexValue <= 16.9)
        {
            return WorldHealthOrganizationBMICategory.UNDERWEIGHT_MODERATE_THINNESS.getCategoryName();
        }
        
        if(bodyMassIndexValue >= 17 && bodyMassIndexValue <= 18.4)
        {
            return WorldHealthOrganizationBMICategory.UNDERWEIGHT_MILD_THINNESS.getCategoryName();
        }
        
        if(bodyMassIndexValue >= 18.5 && bodyMassIndexValue <= 24.9)
        {
            return WorldHealthOrganizationBMICategory.NORMAL_RANGE.getCategoryName();
        }
        
        if(bodyMassIndexValue >= 25 && bodyMassIndexValue <= 29.9)
        {
            return WorldHealthOrganizationBMICategory.OVERWEIGHT_PRE_OBESE.getCategoryName();
        }
        
        if(bodyMassIndexValue >= 30 && bodyMassIndexValue <= 34.9)
        {
            return WorldHealthOrganizationBMICategory.OBESE_CLASS_1.getCategoryName();
        }
        
        if(bodyMassIndexValue >= 35 && bodyMassIndexValue <= 39.9)
        {
            return WorldHealthOrganizationBMICategory.OBESE_CLASS_2.getCategoryName();
        }
        
        if(bodyMassIndexValue >= 40)
        {
            return WorldHealthOrganizationBMICategory.OBESE_CLASS_3.getCategoryName();
        }
        
        return "";
    }

    @Override
    public String getCategoriserName()
    {
        return CATEGORISER_NAME;
    }

}
