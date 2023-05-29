package jfitness.basal.metabolic.rate.formula;


/**
 * This class represents the Harris-Benedict equation to calculate an individual's
 * basal metabolic rate (BMR).
 * 
 * <p>
 * The Harris-Benedict equation also called Harris-Benedict principle is a method
 * used to estimate a person's basal metabolic rate (BMR). This basal metabolic rate
 * may be multipliead by a number corresponding to the individual's activity level,
 * leaving as a result the daily kilocalorie intake to maintain current body weight.
 * </p>
 * 
 * <p>
 * Please, check more information about Harris-Benedict's activity level here 
 * {@link jfitness.basal.metabolic.rate.activity.level.HarrisBenedictActivityLevel}
 * </p>
 * 
 * <p>
 * The original equations were released in 1918 and 1919, created by James Arthur
 * Harris and Francis Gano Benedict and published by the Carnegie Institution of 
 * Washington in the monograph 
 * <a href="https://archive.org/details/biometricstudyof00harruoft">A Biometric 
 * Study of Basal Metabolism in Man</a>.
 * </p>
 * 
 * <p>
 * In 1984 a revision from Allan M. Roza and Harry M. Shizgal improved its accuracy {@link RozaShizgalFormula}.
 * Also during 1990 there was a second revision by Mifflin et al. which published
 * an equation more predictive for modern lifestyle. check {@link MifflinStJeorFormula}.
 * Future articles produced BMR estimators that used lean body mass, instead of
 * traditional parameters. check {@link KatchMcardleFormula}.
 * </p>
 * 
 * <p>
 * Different equations are used for both men and women since the calorie requirements
 * per sex are not the same.
 * </p>
 * 
 * <p>
 * For Men --> <code>BMR (kcal/day) = (13.7516 * weight in kg) + (5.0033 * height in cm) - 
 * (6.755 * age in years) + 66.473</code>
 * </p>
 * 
 * <p>
 * For Women --> <code>BMR (kcal/day) = (9.5634 * weight in kg) + (1.8496 * height in cm) - 
 * (4.6756 * age in years) + 655.0955</code>
 * </p>
 * 
 * @author Saúl Rodríguez Naranjo
 * @see BMRFormula
 * @see RozaShizgalFormula
 * @see MifflinStJeorFormula
 * @see KatchMcardleFormula
 * @see jfitness.basal.metabolic.rate.activity.level.HarrisBenedictActivityLevel
 */
public class HarrisBenedictFormula {

}
