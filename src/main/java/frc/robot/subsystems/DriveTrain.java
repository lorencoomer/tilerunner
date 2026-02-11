package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {

    private final DriveTrainIO io;

    public DriveTrain(DriveTrainIO io) {
        this.io = io;
    }

    public void SetSpeed(double leftSpeed, double rightSpeed) {
        io.SetSpeed(leftSpeed, rightSpeed);
    }

    public void StopMotors() {
        io.StopMotors();
    }
}
