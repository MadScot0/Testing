package org.usfirst.frc.team3826.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

//import org.opencv.core.Rect;
//import org.opencv.imgproc.Imgproc;

//import com.ctre.CANTalon;
//import com.ctre.CANTalon.TalonControlMode;
//import com.kauailabs.navx.frc.AHRS;

//import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
//import edu.wpi.first.wpilibj.RobotDrive;//
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.Talon;
//import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.vision.VisionThread;
//                                          2018 Bot Code
/**
 *
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	Talon A;
	Talon B;
	Talon C;
	Talon D;
	Joystick xBox;
	int a;
	
	
    public void robotInit() {
    	Talon A = new Talon(0);
    	Talon B = new Talon(1);
    	Talon C = new Talon(2);
    	Talon D = new Talon(3);
    	Joystick xBox = new Joystick(0);
    }
    
    /**
     * This function is run once each time the robot enters autonomous mode
     */
    public void autonomousInit() {
    	
    }
    
    /**
     * This function is called periodically during autonomous
     */
	public void autonomousPeriodic() {
		
		
    }
    	
    
    /**
     * This function is called once each time the robot enters teleoperated mode
     */
    public void teleopInit(){
    	a = 0;
    }

    /**
     * This function is called periodically during operator control
     */
    /* (non-Javadoc)
     * @see edu.wpi.first.wpilibj.IterativeRobot#teleopPeriodic()
     */
    public void teleopPeriodic() {
    	if(xBox.getRawButton(1))
    	{
    		A.set(0);
    		B.set(0);
    		C.set(0);
    		D.set(0);
    	}
    	else
    	{
    		A.set(0.5);
    		B.set(0.5);
    		C.set(0.5);
    		D.set(0.5);
    	}
    	a++;
    }
    
    public void testInit()
    {
    	
    }
    
    /**
     * This function is called periodically during test mode
     */
    
    public void testPeriodic() {
    
   
    
    }
       
       
}
