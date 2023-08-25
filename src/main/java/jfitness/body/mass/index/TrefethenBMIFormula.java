package jfitness.body.mass.index;

import jfitness.body.mass.index.category.BodyMassIndexCategoriser;

/**
 * New BMI (exponent of 2.5) formula proposed by Nick Trefethen, professor of
 * numerical analysis at the University of Oxford.
 *
 * <p>
 * This formula accounts for distortions of the traditional BMI formula for
 * shorter and taller individuals.
 * </p>
 *
 * <p>
 * The scaling factor of 1.3 was determined to make this formula align with the
 * traditional BMI formula for adults of average height, while the exponent of
 * 2.5 is a compromise between the exponent of 2 in the traditional formula for
 * BMI and the exponent of 3 that would be expected for the scaling of weight
 * with height.
 * </p>
 *
 * <p>
 * However, in Trefethen's analysis, an exponent of 2.5 seemed to fit empirical
 * data more closely with less distortion than either an exponent of 2 or 3.
 * </p>
 *
 * <p>
 * You can find more information in the following url:
 * <a href="https://people.maths.ox.ac.uk/trefethen/bmi.html">
 * https://people.maths.ox.ac.uk/trefethen/bmi.html
 * </a>
 * </p>
 *
 * @author Saúl Rodríguez Naranjo
 */
public final class TrefethenBMIFormula implements BodyMassIndexFormula
{

    private final String FORMULA_NAME = "Nick Trefethen BMI formula";

    private BodyMassIndexCategoriser bodyMassIndexCategoriser;

    private double personWeight;

    private double personHeight;

    /**
     * Builds Trefethen body mass index formula with the body mass index
     * categoriser and the person's weight and height provided.
     *
     * @param bodyMassIndexCategoriser The body mass index categoriser to be
     * used.
     * @param personWeight The person's weight to be used.
     * @param personHeight The person's height to be used.
     *
     * @throws NullPointerException When the body mass index categoriser
     * provided is null.
     *
     * @throws IncompatibleBodyMassIndexCategoriserException If the body mass
     * index categoriser provided is not compatible with this formula.
     */
    public TrefethenBMIFormula(BodyMassIndexCategoriser bodyMassIndexCategoriser, double personWeight, double personHeight)
    {
        if (personWeight <= 0)
        {
            throw new IllegalArgumentException("The person's weight must be a "
                    + "positive number greater than 0");
        }
        
        if (personHeight <= 0)
        {
            throw new IllegalArgumentException("The person's height must be a "
                    + "positive number greater than 0");
        }

        if (bodyMassIndexCategoriser == null)
        {
            throw new NullPointerException("bodyMassIndexCategoriser cannot be null.");
        }

        if (this.isBodyMassIndexCategoriserCompatible(bodyMassIndexCategoriser))
        {
            this.bodyMassIndexCategoriser = bodyMassIndexCategoriser;
        }
        else
        {
            throw new IncompatibleBodyMassIndexCategoriserException();
        }

        this.personWeight = personWeight;
        this.personHeight = personHeight;
    }

    @Override
    public BodyMassIndex calculateBodyMassIndex()
    {
        BodyMassIndex bodyMassIndex = new BodyMassIndex();

        bodyMassIndex.setBodyMassIndexFormulaUsed(this.getFormulaName());

        double bodyMassIndexValue = this.calculateBodyMassIndexValue();

        bodyMassIndex.setBodyMassIndexValue(bodyMassIndexValue);
        bodyMassIndex.setBodyMassIndexCategoriserUsed(this.bodyMassIndexCategoriser.getCategoriserName());
        bodyMassIndex.setBodyMassIndexCategory(this.bodyMassIndexCategoriser.categoriseBodyMassIndex(bodyMassIndexValue));

        return bodyMassIndex;
    }

    public double calculateBodyMassIndexValue()
    {
        double bodyMassIndexValue = 1.3 * (personWeight / Math.pow(personHeight, 2.5));

        return bodyMassIndexValue;
    }

    @Override
    public String getFormulaName()
    {
        return FORMULA_NAME;
    }

    @Override
    public BodyMassIndexCategoriser getBodyMassIndexCategoriser()
    {
        return bodyMassIndexCategoriser;
    }

    @Override
    public void setBodyMassIndexCategoriser(BodyMassIndexCategoriser bodyMassIndexCategoriser)
    {
        if (bodyMassIndexCategoriser == null)
        {
            throw new NullPointerException("bodyMassIndexCategoriser cannot be null.");
        }

        if (this.isBodyMassIndexCategoriserCompatible(bodyMassIndexCategoriser))
        {
            this.bodyMassIndexCategoriser = bodyMassIndexCategoriser;
        }
        else
        {
            throw new IncompatibleBodyMassIndexCategoriserException();
        }
    }

    @Override
    public boolean isBodyMassIndexCategoriserCompatible(BodyMassIndexCategoriser bodyMassIndexCategoriser)
    {
        return true;
    }

    /**
     * Returns the person's weight that is currently used by this formula.
     *
     * @return The currently used person's weight.
     */
    public double getPersonWeight()
    {
        return personWeight;
    }

    /**
     * Sets the person's weight to be used in this formula.
     *
     * @param personWeight The person's weight to be used in this formula.
     */
    public void setPersonWeight(double personWeight)
    {
        if (personWeight <= 0)
        {
            throw new IllegalArgumentException("The person's weight must be a "
                    + "positive number greater than 0");
        }
        
        this.personWeight = personWeight;
    }

    /**
     * Returns the person's height that is currently used by this formula.
     *
     * @return The currently used person's height.
     */
    public double getPersonHeight()
    {
        return personHeight;
    }

    /**
     * Sets the person's height to be used in this formula.
     *
     * @param personHeight The person's height to be used in this formula.
     */
    public void setPersonHeight(double personHeight)
    {
        if (personHeight <= 0)
        {
            throw new IllegalArgumentException("The person's height must be a "
                    + "positive number greater than 0");
        }
        
        this.personHeight = personHeight;
    }
}
