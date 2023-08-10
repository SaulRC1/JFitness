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
 * Basal metabolic rate is influenced by several factors. This includes body
 * weight, lean body mass, height, age, the person's sex, etc. Formulas estimate
 * an individual's basal metabolic rate using these paremeters, though depending
 * on the formula, certain parameters are used or not.
 * </p>
 *
 * <p>
 * Once basal metabolic rate is calculated, normally an activity level is used
 * to provide the individual's daily calorie expenditure. <strong>This activity
 * level must be compatible with this formula.</strong>
 * </p>
 *
 * @author Saúl Rodríguez Naranjo
 *
 * @param <ActivityLevelT> The activity level that this formula is compatible
 * with.
 */
public interface BMRFormula<ActivityLevelT extends Enum<ActivityLevelT>>
{

    /**
     * This method will calculate the basal metabolic rate based on a person
     * fitness parameters.
     *
     * @return The basal metabolic rate.
     *
     * @see BasalMetabolicRate
     */
    public BasalMetabolicRate<ActivityLevelT> calculateBasalMetabolicRate();

    /**
     * This method will calculate the total calorie expenditure per day in Kcal
     * (kilocalories).
     *
     * @param activityLevel An activity level compatible with this formula.
     * @return Total calorie expenditure per day in kilocalories.
     */
    public double calculateTotalCalorieExpenditurePerDay(ActivityLevelT activityLevel);

    /**
     * This method will calculate the total calorie expenditure per day in Kcal
     * (kilocalories).
     *
     * <p>
     * The calculation will be done using a previously calculated basal
     * metabolic rate. Said basal metabolic rate must have been calculated with
     * this exact same formula, or a compatible one that uses the same activity
     * level.
     * </p>
     *
     * @param basalMetabolicRate A basal metabolic rate compatible with this
     * formula's activity level.
     *
     * @param activityLevel An activity level compatible with this formula.
     *
     * @return Total calorie expenditure per day in kilocalories.
     *
     * @see BasalMetabolicRate
     */
    public double calculateTotalCalorieExpenditurePerDay(BasalMetabolicRate<ActivityLevelT> basalMetabolicRate,
            ActivityLevelT activityLevel);

    /**
     * This method will return this formula's name.
     *
     * @return This formula's name
     */
    public String getFormulaName();
}
