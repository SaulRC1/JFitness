package jfitness.body.mass.index.category;

/**
 * Body Mass Index Prime categoriser.
 * 
 * <p>
 * BMI Prime is a ratio of a person's BMI to the upper-level weight limit of
 * what is considered healthy weight.
 * </p>
 *
 * <p>
 * It is intended to give a quick answer to how far an individual differs upper
 * weight limits. Upper weight limits for “healthy weight” are normally 25
 * internationally, except in Southeast Asia which is 23.
 * </p>
 *
 * <p>
 * Example:
 * </p>
 * 
 * <p>
 * <code>
 * A person has a mass of 75 kg and is 1.78 m tall. The upper body weight
 * limit for the region they are using is 25 kg/m^2.
 * </code>
 * </p>
 * 
 * <p>
 * <code>
 * BMI[PRIME] = (75 ÷ 1.78^2) ÷ 25
 * </code>
 * </p>
 * 
 * <p>
 * <code>
 * BMI[PRIME] = (75 ÷ 3.1684) ÷ 25
 * </code>
 * </p>
 * 
 * <p>
 * <code>
 * BMI[PRIME] = 23.67 ÷ 25
 * </code>
 * </p>
 * 
 * <p>
 * <code>
 * BMI[PRIME] = 0.9468
 * </code>
 * </p>
 * 
 * <p>
 * <code>
 * This person’s BMI Prime is 0.9468.
 * </code>
 * </p>
 * 
 * @author Saúl Rodríguez Naranjo
 * @see BMIPrimeCategory
 */
public class BMIPrimeCategoriser implements BodyMassIndexCategoriser
{

    @Override
    public String categoriseBodyMassIndex(double bodyMassIndexValue)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getCategoriserName()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
