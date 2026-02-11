package frc.robot.commands;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.DriveTrain;

public class DriveCommand extends Command {
    private final DriveTrain driveTrain;
    private final CommandXboxController controller;

    public DriveCommand(DriveTrain driveTrain, CommandXboxController controller) {
        this.driveTrain = driveTrain;
        this.controller = controller;

        addRequirements(driveTrain);
    }

    @Override
    public void execute() {
        driveTrain.SetSpeed(MathUtil.applyDeadband(-controller.getRawAxis(1), 0.0206767), MathUtil.applyDeadband(-controller.getRawAxis(4), 0.0206767));
    }

    @Override
    public void end(boolean interrupted) {
        driveTrain.StopMotors();
    }

}
