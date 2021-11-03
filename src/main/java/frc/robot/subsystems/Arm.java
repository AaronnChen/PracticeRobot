package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;

import frc.robot.constants.armConstants;
import frc.robot.constants.PWMportConstants;

public class Arm {
    private VictorSP armMotor;

    public Arm() {
        armMotor = new VictorSP(PWMportConstants.armMotorPort);
    }

    public void move() {
        armMotor.set(armConstants.armSpeed);
    }

}
