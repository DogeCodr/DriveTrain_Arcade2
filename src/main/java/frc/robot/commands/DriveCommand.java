// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrain;

public class DriveCommand extends CommandBase {
  /** Creates a new DriveCommand. */
private final DriveTrain m_DriveTrain;
private final XboxController m_XboxController;
private double RightStickY;
private double LeftStickY;

  public DriveCommand(DriveTrain driveTrain, XboxController xboxController) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_DriveTrain = driveTrain;
    m_XboxController = xboxController;
    addRequirements(m_DriveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    LeftStickY=m_XboxController.getRawAxis(Constants.LEFT_STICK_Y);
    RightStickY=m_XboxController.getRawAxis(Constants.RIGHT_STICK_Y);

    m_DriveTrain.setRightMotors(RightStickY);
    m_DriveTrain.setLeftMotors(LeftStickY);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
