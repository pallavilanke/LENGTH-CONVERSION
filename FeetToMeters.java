package com.epam.metricconversion;
/** class to convert feet to meters.
 * @author Rithika
 */
public class FeetToMeters implements Convert {
    /** converts feet to meters.
     * @param  input **input that the user wants to convert.**
     * @return **converted value**
     */
    public double convertMetric(final double input) {
        final double conversionFactor = 0.3;
        return (input * conversionFactor);
   }
}
