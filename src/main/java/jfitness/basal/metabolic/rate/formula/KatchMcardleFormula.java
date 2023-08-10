package jfitness.basal.metabolic.rate.formula;

import jfitness.basal.metabolic.rate.BasalMetabolicRate;
import jfitness.basal.metabolic.rate.activity.level.KatchMcardleActivityLevel;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public class KatchMcardleFormula implements BMRFormula<KatchMcardleActivityLevel>
{

    /**
     * The name of this formula.
     */
    public static final String FORMULA_NAME = "Katch-Mcardle Equation 1975";

    @Override
    public double calculateTotalCalorieExpenditurePerDay(BasalMetabolicRate<KatchMcardleActivityLevel> basalMetabolicRate, KatchMcardleActivityLevel activityLevel)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getFormulaName()
    {
        return FORMULA_NAME;
    }

    @Override
    public BasalMetabolicRate<KatchMcardleActivityLevel> calculateBasalMetabolicRate()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calculateTotalCalorieExpenditurePerDay(KatchMcardleActivityLevel activityLevel)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
