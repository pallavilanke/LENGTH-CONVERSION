package com.epam.metricconversion;
/** class to convert inches to feet.
 * @author Rithika
 */
public class InchesToFeet implements Convert {
    /** converts inches to feet.
     * @param  input **input that the user wants to convert.**
     * @return **converted value**
     */
    public double convertMetric(final double input) {
        final double conversionFactor = 0.08;
        return (input * conversionFactor);
    }
}
