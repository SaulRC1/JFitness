package jfitness.person.fitness.data;

/**
 * This enum represents a person's sex, either male or female.
 *
 * <p>
 * An individual's sex is necessary to perform a calculation of its basal
 * metabolic rate, since in most of cases, it differs between women and men.
 * </p>
 *
 * @author Saúl Rodríguez Naranjo
 *
 * @see jfitness.basal.metabolic.rate.formula.BMRFormula
 * @see jfitness.basal.metabolic.rate.BasalMetabolicRate
 */
public enum PersonSex
{
    MAN,
    WOMAN
}
