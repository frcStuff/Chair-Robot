package edu.wpi.first.wpilibj.templates;

//import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;
public class Robot1 extends SimpleRobot
{
    Launcher l = new Launcher();
    Victor frontLeft = new Victor(1);
    Victor frontRight = new Victor(2);
    Victor backLeft = new Victor(3);
    Victor backRight = new Victor(4);
    JoyStick stick = new JoyStick();
    DoubleSolenoid ds = new DoubleSolenoid(1,2);
    RobotDrive chassis = new RobotDrive(frontLeft, frontRight, backLeft, backRight);
    boolean compEnabled = l.compressor.enabled();
    
    //code to run on init
    public void robotInit()
    {
        l.compressor.start();
    }
    
    //code to run when autonomous is enabled
    public void autonomous()
    {
        
    }

    //code that runs from driver station
    public void operatorControl()
    {
        int i = stick.getValue();
        
        //4 = move left
        //5 = move right
        
        //3 = 30ft
        //2 = 20ft
        //1 = 10ft
        
        switch(i)
        {
            case 6:
            {
                ds.set(DoubleSolenoid.Value.kForward);
                break;
            }
            case 7:
            {
                ds.set(DoubleSolenoid.Value.kReverse);
                break;
            }
            case 4:
            {
                l.setDegree(30);
                break;
            }
            case 3:
            {
                l.setDegree(20);
                break;
            }
            case 5:
            {
                l.setDegree(10);
                break;
            }
        }
    }
    
    public void test()
    {
        
    }
}