// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Or;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
//Robot Init{}: what will run when the robot turns on "
//Robot Periodic(): what runs contasly 
//AutoInit(): what will run when autonomous is on 
//Teleop Init(): what will run 

public class Robot extends TimedRobot {
  
  XboxController driver = new XboxController(0);
  XboxController operator = new XboxController(1);

  @Override
  public void robotInit() {
    // System.out.println("Robot Init");
  }

  @Override
  public void robotPeriodic() {
    // System.out.println("Robot Periodic");
  }

  @Override
  public void autonomousInit() {
    // System.out.println("Auto Init");
  }

  @Override
  public void autonomousPeriodic() {
    // System.out.println("Auto Periodic");
  }

  @Override
  public void teleopInit() {
    // System.out.println("Teleop Init");
  }

  @Override
  public void teleopPeriodic() {
    // System.out.println("Teleop Periodic");
    if(driver.getXButton() == true)
      System.out.println("X Button");
    if(driver.getYButton() == true)
      System.out.println("Y Button");
    if(driver.getAButton() == true)
      System.out.println("A Button");
    if(driver.getBButton() == true)
      System.out.println("B Button");
    if(driver.getStartButton() == true)
      System.out.println("Start Button");
    if(driver.getBackButton() == true)
      System.out.println("Back Button");
    if(driver.getStickButton() == true)
      System.out.println("Stick Button");
    if(driver.getY() != 0 || driver.getX() != 0)
      System.out.println(driver.getX() +", " + driver.getY());
    

    
    
  }
  public void disabledInit() {}

  /** This function is called periodically when disabled. */
  @Override 
  public void disabledPeriodic() {}

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {}

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {

   

  }
}
