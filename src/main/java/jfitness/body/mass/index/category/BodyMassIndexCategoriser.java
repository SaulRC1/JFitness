package jfitness.body.mass.index.category;

/**
 *
 * <p>
 * Take into account that Body Mass Index is used differently for people aged 2
 * to 20. The calculation performed is the same, but instead of using fixed
 * values for categorising if they are overweight or underweight, the BMI is
 * compared against percentiles of the same sex and age.
 * </p>
 *
 * @author Saúl Rodríguez Naranjo
 */
public interface BodyMassIndexCategoriser
{

    public String categoriseBodyMassIndex(double bodyMassIndexValue);

    public String getCategoriserName();
}
