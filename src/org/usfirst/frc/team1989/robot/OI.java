/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1989.robot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static final int leftJoystickPort = 1;
	public static final int rightJoystickPort = 0;
	
	public static JsScaled leftStick = new JsScaled(leftJoystickPort);
	public static JsScaled rightStick = new JsScaled(rightJoystickPort);
}
