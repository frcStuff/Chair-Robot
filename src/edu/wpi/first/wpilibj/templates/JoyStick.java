/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.*;

/**
 *
 * @author Beehive Robotics
 */
public class JoyStick
{
    public JoyStick()
    {
        
    }
    
    public double getX()
    {
        return stick.getX();
    }
    
    public double getY()
    {
        return stick.getY();
    }
    
    Joystick stick = new Joystick(1);
    public int getValue()
    {
        if (stick.getRawButton(1))
        {
            return 1;
        }
        if (stick.getRawButton(2))
        {
            return 2;
        }
        if (stick.getRawButton(3))
        {
            return 3;
        }
        if (stick.getRawButton(4))
        {
            return 4;
        }
        if (stick.getRawButton(5))
        {
            return 5;
        }
        if (stick.getRawButton(6))
        {
            return 6;
        }
        if (stick.getRawButton(7))
        {
            return 7;
        }
        if (stick.getRawButton(8))
        {
            return 8;
        }
        if (stick.getRawButton(9))
        {
            return 9;
        }
        if (stick.getRawButton(10))
        {
            return 10;
        }
        if (stick.getRawButton(11))
        {
            return 11;
        }
        return 0;
    }
}
