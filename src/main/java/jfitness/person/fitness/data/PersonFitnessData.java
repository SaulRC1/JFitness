package jfitness.person.fitness.data;

/**
 *
 * @author Saúl Rodríguez Naranjo
 */
public class PersonFitnessData
{

    //Weight must be measured in kilograms
    private double weight;

    //Height must be measured in centimeters
    private double height;

    private BiologicalSex biologicalSex;

    //Age must be measured in years
    private int age;

    /**
     * Returns this person's weight in kilograms.
     *
     * @return This person's weight in kilograms.
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * Sets this person's weight. Weight must be expressed in kilograms.
     *
     * @param weight This person's weight in kilograms.
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    /**
     * Returns this person's height in centimeters.
     * 
     * @return This person's height in centimeters.
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * Sets this person's height. Height must be expressed in centimeters.
     * 
     * @param height This person's height in centimeters.
     */
    public void setHeight(double height)
    {
        this.height = height;
    }

    /**
     * Returns this person's biological sex, either man or woman.
     * 
     * @return This person's biological sex.
     * @see BiologicalSex
     */
    public BiologicalSex getBiologicalSex()
    {
        return biologicalSex;
    }

    /**
     * Sets this person's biological sex.
     * 
     * @param biologicalSex This person's biological sex.
     */
    public void setBiologicalSex(BiologicalSex biologicalSex)
    {
        this.biologicalSex = biologicalSex;
    }

    /**
     * Returns this person's age, expressed in years.
     * 
     * @return This person's age. 
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Sets this person's age. Age must be expressed in years.
     * 
     * @param age This person's age, in years. 
     */
    public void setAge(int age)
    {
        this.age = age;
    }

}
