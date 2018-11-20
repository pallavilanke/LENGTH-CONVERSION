package com.epam.metricconversion;
/** class to convert meters to inches.
 * @author Rithika
 */
public class MetersToInches implements Convert {
    /** converts meters to inches.
     * @param  input **input that the user wants to convert.**
     * @return **converted value**
     */
    public double convertMetric(final double input) {
       final double conversionFactor = 39.3;
       return  (input * conversionFactor);
     }
}
