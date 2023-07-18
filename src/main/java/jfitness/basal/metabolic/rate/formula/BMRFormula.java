package jfitness.basal.metabolic.rate.formula;

import jfitness.basal.metabolic.rate.BasalMetabolicRate;
import jfitness.person.fitness.data.PersonFitnessData;

/**
 * This interface represents an equation that calculates an individual's basal
 * metabolic rate (BMR).
 * 
 * <p>
 * <strong>
 * For more information about basal metabolic rest, check 
 * {@link jfitness.basal.metabolic.rate.BasalMetabolicRate}.
 * </strong>
 * </p>
 * 
 * <p>
 * Basal metabolic rate is influenced by several factors. This includes body weight,
 * lean body mass, height, age, the person's sex, etc. Formulas estimate an
 * individual's basal metabolic rate using these paremeters, though depending on
 * the formula, certain parameters are used or not.
 * </p>
 * 
 * <p>
 * Once basal metabolic rate is calculated, normally an activity level is used to
 * provide the individual's daily calorie expenditure. <strong>This activity level must
 * be compatible with this formula.</strong>
 * </p>
 * 
 * @author Saúl Rodríguez Naranjo
 * 
 * @param <ActivityLevelT> The activity level that this formula is compatible with.
 */
public interface BMRFormula<ActivityLevelT extends Enum<ActivityLevelT>> {
    
    public BasalMetabolicRate<ActivityLevelT> calculateBasalMetabolicRate(PersonFitnessData personFitnessData);
    
    public double calculateTotalCalorieExpenditurePerDay(PersonFitnessData personFitnessData, ActivityLevelT activityLevel);
    
    public double calculateTotalCalorieExpenditurePerDay(BasalMetabolicRate<ActivityLevelT> basalMetabolicRate, ActivityLevelT activityLevel);
    
    public String getFormulaName();
}
