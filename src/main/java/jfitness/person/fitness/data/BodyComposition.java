package jfitness.person.fitness.data;

/**
 * Body composition stands for the percentages of fat, bone, water and muscle
 * present in a human body.
 *
 * <p>
 * Bone, water and muscle mass can be encapsulated together as "Lean Mass".
 * </p>
 *
 * <p>
 * Since muscular tissue occupies less space than fat tissue inside the body,
 * body composition determines leanness of a person. Two people of the same
 * gender, height, and body weight could have completely different body types.
 * The explanation would be that they have different body compositions.
 * </p>
 *
 * <p>
 * Body composition can be estimated by various methods, like body density
 * calculation, DEXA (Dual Energy X-ray Absorptiometry), BIA (Bioelectrical
 * Impedance Analysis), skin fold test, etc...
 * </p>
 *
 * @author Saúl Rodríguez Naranjo
 */
public class BodyComposition
{

    private double fatMass;
    private double leanMass;
    private double boneMass;
    private double waterMass;
    private double muscleMass;

    /**
     * Will build a {@link BodyComposition} object with the data passed by
     * parameter.
     *
     * @param fatMass Fat mass in kilograms.
     * @param leanMass bone + water + muscle mass in kilograms
     * @param boneMass bone mass in kilograms
     * @param waterMass water mass in kilograms
     * @param muscleMass muscle mass in kilograms
     */
    public BodyComposition(double fatMass, double leanMass, double boneMass, double waterMass, double muscleMass)
    {
        this.fatMass = fatMass;
        this.leanMass = leanMass;
        this.boneMass = boneMass;
        this.waterMass = waterMass;
        this.muscleMass = muscleMass;
    }

    /**
     * Will build a {@link BodyComposition} object with the body fat mass and
     * lean mass.
     *
     * @param fatMass Fat mass in kilograms.
     * @param leanMass Lean mass in kilograms.
     */
    public BodyComposition(double fatMass, double leanMass)
    {
        this.fatMass = fatMass;
        this.leanMass = leanMass;
    }

    public BodyComposition()
    {
    }

    /**
     * This method will return the amount of fat present in the body expressed
     * in kilograms.
     *
     * @return
     */
    public double getFatMass()
    {
        return fatMass;
    }

    /**
     * Will set the amount of fat present in the body. Fat mass must be
     * expressed in kilograms.
     *
     * @param fatMass The amount of body fat in kilograms.
     */
    public void setFatMass(double fatMass)
    {
        this.fatMass = fatMass;
    }

    /**
     * This method will return the amount of lean mass present in the body
     * expressed in kilograms.
     *
     * <p>
     * Lean mass stands for the sum of bone, water and muscle mass.
     * </p>
     *
     * @return Body lean mass expressed in kilograms.
     */
    public double getLeanMass()
    {
        return leanMass;
    }

    /**
     * Will set the amount of lean mass present in the body. Lean mass must be
     * expressed in kilograms.
     *
     * @param leanMass Lean mass expressed in kilograms.
     */
    public void setLeanMass(double leanMass)
    {
        this.leanMass = leanMass;
    }

    /**
     * This method will return the bone mass present in the body expressed in
     * kilograms.
     *
     * @return The body bone mass in kilograms..
     */
    public double getBoneMass()
    {
        return boneMass;
    }

    /**
     * Will set the amount of bone mass present in the body. Bone mass must be
     * expressed in kilograms.
     *
     * @param boneMass Bone mass expressed in kilograms.
     */
    public void setBoneMass(double boneMass)
    {
        this.boneMass = boneMass;
    }

    /**
     * This method will return the amount of water mass present in the body
     * expressed in kilograms.
     *
     * @return The amount of water mass in kilograms.
     */
    public double getWaterMass()
    {
        return waterMass;
    }

    /**
     * Will set the amount of water mass present in the body. Water mass must be
     * expressed in kilograms.
     *
     * @param waterMass Water mass expressed in kilograms.
     */
    public void setWaterMass(double waterMass)
    {
        this.waterMass = waterMass;
    }

    /**
     * This method will return the amount of muscle mass present in the body,
     * expressed in kilograms.
     *
     * @return The amount of muscle mass in kilograms.
     */
    public double getMuscleMass()
    {
        return muscleMass;
    }

    /**
     * Will set the amount of muscle mass present in the body. Muscle mass must
     * be expressed in kilograms.
     *
     * @param muscleMass Muscle mass expressed in kilograms.
     */
    public void setMuscleMass(double muscleMass)
    {
        this.muscleMass = muscleMass;
    }
}
