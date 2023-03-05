// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */

  private Victor rightMotor1;
  private Victor rightMotor2;
  private Victor leftMotor1;
  private Victor leftMotor2;


  public DriveTrain() {

  rightMotor1 = new Victor(Constants.RIGHT_MOTOR_1);
  rightMotor2 = new Victor(Constants.RIGHT_MOTOR_2);
  leftMotor1 = new Victor(Constants.LEFT_MOTOR_1);
  leftMotor2 = new Victor(Constants.LEFT_MOTOR_2);

  }

  public void setRightMotors(double Speed){

    rightMotor1.set(Speed*Constants.ROBOT_SPEED);
    rightMotor2.set(Speed*Constants.ROBOT_SPEED);
  }

  public void setLeftMotors(double Speed){

    leftMotor1.set(-Speed*Constants.ROBOT_SPEED);
    leftMotor2.set(-Speed*Constants.ROBOT_SPEED);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
