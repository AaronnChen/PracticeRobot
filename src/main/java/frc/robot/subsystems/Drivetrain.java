package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.constants.PWMportConstants;

public class Drivetrain {
    private VictorSP leftMotor, rightMotor; 

    public Drivetrain() {
        leftMotor = new VictorSP(PWMportConstants.leftMotorPort);
        rightMotor = new VictorSP(PWMportConstants.rightMotorPort);
    }



    public void drive(double speed) {
        leftMotor.setSpeed(speed);
        rightMotor.setSpeed(speed);
    }
}
