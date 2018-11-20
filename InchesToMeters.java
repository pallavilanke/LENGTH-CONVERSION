package com.epam.metricconversion;
/** class to convert inches to meters.
 * @author Rithika
 */
public class InchesToMeters implements Convert {
    /** converts inches to meters.
     * @param  input **input that the user wants to convert.**
     * @return **converted value**
     */
    public double convertMetric(final double input) {
        final double conversionFactor = 0.02;
        return (input * conversionFactor);
    }
}
