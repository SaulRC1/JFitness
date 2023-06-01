package jfitness.basal.metabolic.rate.formula;

import jfitness.basal.metabolic.rate.BasalMetabolicRate;
import jfitness.basal.metabolic.rate.activity.level.HarrisBenedictActivityLevel;
import jfitness.person.fitness.data.PersonFitnessData;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public class MifflinStJeorFormula implements BMRFormula<HarrisBenedictActivityLevel>
{
    
    /**
     * The name of this formula.
     */
    public static final String FORMULA_NAME = "Mifflin and St Jeor Equation";
    
    @Override
    public BasalMetabolicRate<HarrisBenedictActivityLevel> calculateBasalMetabolicRate(PersonFitnessData personFitnessData)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public double calculateTotalCalorieExpenditurePerDay(PersonFitnessData personFitnessData, HarrisBenedictActivityLevel activityLevel)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public double calculateTotalCalorieExpenditurePerDay(BasalMetabolicRate<HarrisBenedictActivityLevel> basalMetabolicRate, HarrisBenedictActivityLevel activityLevel)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String getFormulaName()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
