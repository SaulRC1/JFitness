package jfitness.basal.metabolic.rate.formula;

import jfitness.basal.metabolic.rate.BasalMetabolicRate;
import jfitness.basal.metabolic.rate.BasalMetabolicRateHarrisBenedict;
import jfitness.basal.metabolic.rate.activity.level.HarrisBenedictActivityLevel;
import jfitness.person.fitness.data.BiologicalSex;
import jfitness.person.fitness.data.PersonFitnessData;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public class RozaShizgalFormula implements BMRFormula<HarrisBenedictActivityLevel>
{

    /**
     * The name of this formula.
     */
    public static final String FORMULA_NAME = "Roza-Shizgal Equation 1984";
    
    @Override
    public BasalMetabolicRate<HarrisBenedictActivityLevel> calculateBasalMetabolicRate(PersonFitnessData personFitnessData)
    {
        double weight = personFitnessData.getWeight();
        double height = personFitnessData.getHeight();
        int age = personFitnessData.getAge();
        BiologicalSex biologicalSex = personFitnessData.getBiologicalSex();
        
        double basalMetabolicRateValue = 0;
        
        if(biologicalSex == BiologicalSex.MAN)
        {
            basalMetabolicRateValue = (13.397 * weight) + (4.799 * height) - (5.677 * age) + 88.362;
        }
        else if(biologicalSex == BiologicalSex.WOMAN)
        {
            basalMetabolicRateValue = (9.247 * weight) + (3.098 * height) - (4.33 * age) + 447.593;
        }
        
        return new BasalMetabolicRateHarrisBenedict(basalMetabolicRateValue);
    }

    @Override
    public double calculateTotalCalorieExpenditurePerDay(PersonFitnessData personFitnessData, HarrisBenedictActivityLevel activityLevel)
    {
        BasalMetabolicRate<HarrisBenedictActivityLevel> basalMetabolicRate =
                this.calculateBasalMetabolicRate(personFitnessData);
        
        return basalMetabolicRate.getTotalCalorieExpenditurePerDay(activityLevel);
    }

    @Override
    public double calculateTotalCalorieExpenditurePerDay(BasalMetabolicRate<HarrisBenedictActivityLevel> basalMetabolicRate, HarrisBenedictActivityLevel activityLevel)
    {
        return basalMetabolicRate.getTotalCalorieExpenditurePerDay(activityLevel);
    }

    @Override
    public String getFormulaName()
    {
        return FORMULA_NAME;
    }

}
