package com.epam.metricconversion;
/** class to convert feet to inches.
 * @author Rithika
 */
public class FeetToInches implements Convert {
    /** converts feet to inches.
     * @param  input **input that the user wants to convert.**
     * @return **converted value**
     */
    public double convertMetric(final double input) {
        final int conversionFactor = 12;
        return (double) (input * conversionFactor);
    }
}
