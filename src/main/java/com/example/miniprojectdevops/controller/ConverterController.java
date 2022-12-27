package com.example.miniprojectdevops.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConverterController {


    @RequestMapping(value = "/getSpeed", method = RequestMethod.POST)
    public double getSpeed(@RequestBody Map<String,String> body){

        String to = (body.get("to").toString());
        String from = (body.get("from").toString());
        double val = Double.parseDouble(body.get("val"));

        if(to.equals(from))
        {
            return val;
        }

        if(to.equals("KPH"))
        {
            val/=1.609344;
        }
        else if(to.equals("Knots"))
        {
            val*=1.150779;
        }
        else if(to.equals("Mach")){
            val*=761.207;
        }

        if(from.equals("KPH"))
        {
            val*=1.609344;
        }
        else if(from.equals("Knots"))
        {
            val/=1.150779;
        }
        else if(from.equals("Mach")) {
            val/=761.207;
        }

        return val  ;
    }

    @RequestMapping(value = "/getTemperature", method = RequestMethod.POST)
    public double getTemperature(@RequestBody Map<String,String> body){

        String to = (body.get("to").toString());
        String from = (body.get("from").toString());
        double val = Double.parseDouble(body.get("val"));

        if(to.equals(from))
        {
            return val;
        }

        if(to.equals("Celsius"))
        {
            val=(val*1.8)+32;
        }
        else if(to.equals("Kelvin"))
        {
            val=((val-273.15)*1.8)+32;
        }

        if(from.equals("Celsius"))
        {
            val=(val-32)/1.8;
        }
        else if(from.equals("Kelvin"))
        {
            val=((val-32)/1.8)+273.15;
        }

        return val  ;
    }

    @RequestMapping(value = "/getWeight", method = RequestMethod.POST)
    public double getWeight(@RequestBody Map<String,String> body){

        String to = (body.get("to").toString());
        String from = (body.get("from").toString());
        double val = Double.parseDouble(body.get("val"));

        if(to.equals(from))
        {
            return val;
        }

        if(to.equals("Kilograms"))
        {
            val/=0.001;
        }
        else if(to.equals("Pounds"))
        {
            val/=0.0022046;
        }
        else if(to.equals("Ounces")) {
            val/=0.035274;
        }
        else if(to.equals("Stones")) {
            val/=0.00015747;
        }

        if(from.equals("Kilograms"))
        {
            val*=0.001;
        }
        else if(from.equals("Pounds"))
        {
            val*=0.0022046;
        }
        else if(from.equals("Ounces")) {
            val*=0.035274;
        }
        else if(from.equals("Stones")) {
            val*=0.00015747;
        }

        return val  ;
    }

    @RequestMapping(value = "/getLength", method = RequestMethod.POST)
    public double getLength(@RequestBody Map<String,String> body){

        String to = (body.get("to").toString());
        String from = (body.get("from").toString());
        double val = Double.parseDouble(body.get("val"));

        if(to.equals(from))
        {
            return val;
        }

        if(to.equals("cm"))
        {
            val/=100;
        }
        else if(to.equals("Feet"))
        {
            val/=3.2808;
        }
        else if(to.equals("Inches")){
            val/=39.370;
        }
        else if(to.equals("Yards"))
        {
            val/=1.0936;
        }
        else if(to.equals("Miles")){
            val/=0.00062137;
        }

        if(from.equals("cm"))
        {
            val/=0.01;
        }
        else if(from.equals("Feet"))
        {
            val*=3.2808;
        }
        else if(from.equals("Inches")){
            val*=39.370;
        }
        else if(from.equals("Yards"))
        {
            val*=1.0936;
        }
        else if(from.equals("Miles")){
            val*=0.00062137;
        }


        return val  ;
    }

}
