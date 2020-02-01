/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Drive_Train extends SubsystemBase {

  public WPI_VictorSPX frontLeft;
  public WPI_VictorSPX rearLeft;
  public WPI_VictorSPX frontRight;
  public WPI_VictorSPX rearRight;

  /**
   * Creates a new Drive_Train.
   */
  public Drive_Train() {
    frontLeft = new WPI_VictorSPX(1);
		rearLeft = new WPI_VictorSPX(2);
		frontRight = new WPI_VictorSPX(4);
    rearRight = new WPI_VictorSPX(3);  

    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
