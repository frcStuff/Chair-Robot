package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Compressor;

public class Launcher
{
    public Compressor compressor = new Compressor(1, 1);
    //(PressureSwitch, Compressor)
    
    int d = 0;
    
    public void setDegree(int distanceInFeet)
    {
        d = distanceInFeet/10;
        switch (d)
        {
            case 3:
            {
                //set motor controler for 30ft
                break;
            }
            case 2:
            {
                //set motor controler for 20ft
                break;
            }
            case 1:
            {
                //set motor controler for 10ft
                break;
            }
        }
    }
}
