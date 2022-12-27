package com.example.miniprojectdevops;

import com.example.miniprojectdevops.controller.ConverterController;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class ConverterTest {
    private static final double DELTA = 1e-2;

    ConverterController converterController = new ConverterController();

    @Test
    public void lengthConverterTruePositive(){
        Map<String,String> body1 = new HashMap();
        body1.put("to", "Meters");
        body1.put("from", "cm");
        body1.put("val", "10");

        Map<String,String> body2 = new HashMap();
        body2.put("to","Feet");
        body2.put("from","Inches");
        body2.put("val", "10");

        Assert.assertEquals("Length Converter for True Positive", 1000, converterController.getLength(body1), DELTA);
        Assert.assertEquals("Length Converter for True Positive", 120, converterController.getLength(body2), DELTA);
    }

    @Test
    public void lengthConverterFalsePositive(){
        Map<String,String> body1 = new HashMap();
        body1.put("to", "Meters");
        body1.put("from", "cm");
        body1.put("val", "10");

        Map<String,String> body2 = new HashMap();
        body2.put("to","Feet");
        body2.put("from","Inches");
        body2.put("val", "10");

        Assert.assertNotEquals("Length Converter for False Positive", 100, converterController.getLength(body1), DELTA);
        Assert.assertNotEquals("Length Converter for False Positive", 125, converterController.getLength(body2), DELTA);
    }

    @Test
    public void speedConverterTruePositive(){
        Map<String,String> body1 = new HashMap();
        body1.put("to", "MPH");
        body1.put("from", "KPH");
        body1.put("val", "10");

        Map<String,String> body2 = new HashMap();
        body2.put("to","MPH");
        body2.put("from","Knots");
        body2.put("val", "10");

        Assert.assertEquals("Speed Converter for True Positive", 16.09344, converterController.getSpeed(body1), DELTA);
        Assert.assertEquals("Speed Converter for True Positive", 8.6897, converterController.getSpeed(body2), DELTA);
    }

    @Test
    public void speedConverterFalsePositive(){
        Map<String,String> body1 = new HashMap();
        body1.put("to", "MPH");
        body1.put("from", "KPH");
        body1.put("val", "10");

        Map<String,String> body2 = new HashMap();
        body2.put("to","MPH");
        body2.put("from","Knots");
        body2.put("val", "10");

        Assert.assertNotEquals("Speed Converter for False Positive", 100, converterController.getSpeed(body1), DELTA);
        Assert.assertNotEquals("Speed Converter for False Positive", 125, converterController.getSpeed(body2), DELTA);
    }

    @Test
    public void temperatureConverterTruePositive(){
        Map<String,String> body1 = new HashMap();
        body1.put("to", "Fahrenheit");
        body1.put("from", "Celsius");
        body1.put("val", "10");

        Map<String,String> body2 = new HashMap();
        body2.put("to","Fahrenheit");
        body2.put("from","Kelvin");
        body2.put("val", "10");

        Assert.assertEquals("Temperature Converter for True Positive", -12.222, converterController.getTemperature(body1), DELTA);
        Assert.assertEquals("Temperature Converter for True Positive", 260.927, converterController.getTemperature(body2), DELTA);
    }

    @Test
    public void temperatureConverterFalsePositive(){
        Map<String,String> body1 = new HashMap();
        body1.put("to", "Fahrenheit");
        body1.put("from", "Celsius");
        body1.put("val", "10");

        Map<String,String> body2 = new HashMap();
        body2.put("to","Fahrenheit");
        body2.put("from","Kelvin");
        body2.put("val", "10");

        Assert.assertNotEquals("Temperature Converter for False Positive", 100, converterController.getTemperature(body1), DELTA);
        Assert.assertNotEquals("Temperature Converter for False Positive", 125, converterController.getTemperature(body2), DELTA);
    }

    @Test
    public void weightConverterTruePositive(){
        Map<String,String> body1 = new HashMap();
        body1.put("to", "Pounds");
        body1.put("from", "Grams");
        body1.put("val", "10");

        Map<String,String> body2 = new HashMap();
        body2.put("to","Pounds");
        body2.put("from","Ounces");
        body2.put("val", "10");

        Assert.assertEquals("Weight Converter for True Positive", 4535.970, converterController.getWeight(body1), DELTA);
        Assert.assertEquals("Weight Converter for True Positive", 160.00, converterController.getWeight(body2), DELTA);
    }

    @Test
    public void weightConverterFalsePositive(){
        Map<String,String> body1 = new HashMap();
        body1.put("to", "Pounds");
        body1.put("from", "Grams");
        body1.put("val", "10");

        Map<String,String> body2 = new HashMap();
        body2.put("to","Pounds");
        body2.put("from","Ounces");
        body2.put("val", "10");

        Assert.assertNotEquals("Weight Converter for False Positive", 100, converterController.getWeight(body1), DELTA);
        Assert.assertNotEquals("Weight Converter for False Positive", 125, converterController.getWeight(body2), DELTA);
    }


}