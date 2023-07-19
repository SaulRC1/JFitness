package jfitness.basal.metabolic.rate;

/**
 * This interface represents basal metabolic rate calculated with a formula
 * that supports a certain activity level criteria.
 * 
 * <p>
 * The basal metabolic rate is the rate of energy expenditure per unit time by
 * endothermic animals at rest. This rate is often reported in units ranging from
 * watt(joule/second) to joule per hour per kilogram of body mass (J/(h*kg)).
 * </p>
 * 
 * <p><strong>
 * In a nutritional context basal metabolic rate is usually expressed in kilocalories
 * per day (Kcal/day).
 * </strong></p>
 * 
 * <p>
 * Metabolism comprises the processes that the body needs to keep functioning at rest.
 * This includes processes like breathing, blood circulation, cell growth, brain
 * and nerve function, contraction of muscles, etc.
 * </p>
 * 
 * <p>
 * Ultimately the basal metabolic rate affects the rate that an individual burns
 * calories and whether said individual maintains, gains or loses weight. This
 * rate accounts for 60 to 75% of the daily calorie expenditure, hence the need
 * to accompany this value with an activity level that will provide the full
 * individual's kilocalorie expenditure per day.
 * </p>
 * 
 * <p>
 * Basal metabolic rate is calculated by an equation, and multiplied by an activity
 * level compatible with said equation. Please refer to 
 * {@link jfitness.basal.metabolic.rate.formula.BMRFormula} for more information.
 * </p>
 * 
 * @author Saúl Rodríguez Naranjo
 * 
 * @param <ActivityLevelT> The activity level compatible with the BMR formula that
 *                         calculated this basal metabolic rate.
 * 
 * @see jfitness.basal.metabolic.rate.formula.BMRFormula
 */
public interface BasalMetabolicRate<ActivityLevelT extends Enum<ActivityLevelT>> 
{
    public double getTotalCalorieExpenditurePerDay(ActivityLevelT activityLevel);
    
    public double getBasalMetabolicRateValue();
}
