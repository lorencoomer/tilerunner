// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.DriveCommand;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.DriveTrainIO;
import frc.robot.subsystems.SparkMaxIO;

public class RobotContainer {

  private final DriveTrain driveTrain;
  private final CommandXboxController controller;

  public RobotContainer() {
    driveTrain = new DriveTrain(new SparkMaxIO());
    controller = new CommandXboxController(Constants.CONTROLLER_PORT);
    configureBindings();
  }

  private void configureBindings() {
    driveTrain.setDefaultCommand(new DriveCommand(driveTrain, controller));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }

}
