class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin=celsius+273.15000;
        double fahren=celsius*1.80000+32.00000;
        return new double[]{kelvin,fahren};
    }
}