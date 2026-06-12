// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {}
  private final TalonFX KrakenX60 = new TalonFX(1);

  public void emergencyStop(){
    KrakenX60.stopMotor();
  }// checking if wakatime works
  /**
   * Example command factory method.
   *check functionality
   * @return a command/
   */
// as you can see running such a program is very difficulteedefefevwcvwewewv
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
          // understaind is very iportant, it is crucial to notice the issues at hand regardin wpilib, js read the docs atp bro
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */ // euweihfwiehwiiuwviuwvw
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.ubelwhahceahvbiufewiewufewhbf
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
    // hello what is going on this s atest to see if hackatime will work as intended idk bruh lololl
  }
}
