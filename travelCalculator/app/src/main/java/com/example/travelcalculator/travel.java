package com.example.travelcalculator;

public class travel {
    Double exp;

    void CalcExp(double mtod, double mperg, double gas)
    {
        exp=(mtod/mperg)*gas;
    }
    double getExp()
    {
        return exp;
    }

}
