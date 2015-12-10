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
public class chassis
{
    Victor frontLeft = new Victor(1);
    Victor frontRight = new Victor(2);
    Victor backLeft = new Victor(3);
    Victor backRight = new Victor(4);
    JoyStick stick = new JoyStick();
    DoubleSolenoid ds = new DoubleSolenoid(1,2);
    RobotDrive chassis = new RobotDrive(frontLeft, frontRight, backLeft, backRight);
    private void move(){
        frontLeft.set((stick.getY()*-1)-stick.getX());
        frontRight.set((stick.getY()*-1)+stick.getX());
        backLeft.set((stick.getY()*-1)-stick.getX());
        backRight.set((stick.getY()*-1)+stick.getX());
        //makes robot move forward
    }
    
}