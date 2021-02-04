// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMSparkMax;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * This is a demo program showing the use of the DifferentialDrive class. Runs the motors with
 * arcade steering.
 */
public class Robot extends TimedRobot {
  private final PWMSparkMax m_leftMotor1 = new PWMSparkMax(5);
  private final PWMSparkMax m_leftMotor2 = new PWMSparkMax(6);
  private final PWMSparkMax m_rightMotor1 = new PWMSparkMax(7);
  private final PWMSparkMax m_rightMotor2 = new PWMSparkMax(8);
  private final DifferentialDrive m_robotDrive1 = new DifferentialDrive(m_leftMotor1, m_rightMotor1);
  private final DifferentialDrive m_robotDrive2 = new DifferentialDrive(m_leftMotor2, m_rightMotor2);
  private final Joystick m_stick = new Joystick(0);

  @Override
  public void teleopPeriodic() {
    // Drive with arcade drive.
    // That means that the Y axis drives forward
    // and backward, and the X turns left and right.
    m_robotDrive1.arcadeDrive(m_stick.getY(), m_stick.getX());
    m_robotDrive2.arcadeDrive(m_stick.getY(), m_stick.getX());
  }
}
