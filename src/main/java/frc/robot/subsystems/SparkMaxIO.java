package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import frc.robot.Constants;

public class SparkMaxIO implements DriveTrainIO {

    private final SparkMax motorLeft;
    private final SparkMax motorRight;

    public SparkMaxIO() {
        motorLeft = new SparkMax(Constants.MOTOR_ID_LEFT, MotorType.kBrushless);
        motorRight = new SparkMax(Constants.MOTOR_ID_RIGHT, MotorType.kBrushless);
    }

    @Override
    public void SetSpeed(double leftSpeed, double rightSpeed) {
        motorLeft.set(leftSpeed);
        motorRight.set(rightSpeed);
    }

    @Override
    public void StopMotors() {
        motorLeft.stopMotor();
        motorRight.stopMotor();
    }
}
