package org.usfirst.frc.team1989.robot.subsystems;

import org.usfirst.frc.team1989.robot.CANTalon1989;
import org.usfirst.frc.team1989.robot.JsScaled;
import org.usfirst.frc.team1989.robot.commands.Drive;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

	CANTalon1989 left;
	CANTalon1989 right;
	Hand kLeft;
	Hand kRight;
	
    public void getJoystickValues(JsScaled left, JsScaled right) {
    	double leftJoystickValue = left.sgetY();
    	double rightJoystickValue = right.sgetY();
    	
    	this.left.set(leftJoystickValue);
    	this.right.set(rightJoystickValue);
    }
    
    public void getJoystickValues(XboxController controller) {
    	left.set(-(controller.getY(kLeft)));
    	right.set(-(controller.getY(kRight)));
    }
    
    public void stop() {
    	left.set(0);
    	right.set(0);
    }

    public void initDefaultCommand() {
    	setDefaultCommand(new Drive());
    }
}

