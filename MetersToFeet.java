package com.epam.metricconversion;
/** class to convert meters to feet.
 * @author Rithika
 */
public class MetersToFeet implements Convert {
    /** converts meters to feet.
     * @param  input **input that the user wants to convert.**
     * @return **converted value**
     */
    public double convertMetric(final double input) {
        final double conversionFactor = 3.2;
        return (input * conversionFactor);
    }
}
