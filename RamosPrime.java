package MartulloGiuliano;
import robocode.*;
import java.awt.*;


public class RamosPrime extends JuniorRobot
{

public void run() {
       
        setColors(white, black, blue);

       
        while (true) {
			
            ahead(100);
            turnGunRight(360);
            back(100); 
            turnGunRight(360); 
        }
    }

   
    public void onScannedRobot() {
      
        turnGunTo(scannedAngle);

      
        fire(1000);
    }

   
    public void onHitByBullet() {
       
        // move in a random direction to evade further bullets
    turnRight(90 + (int)(Math.random() * 180));
    ahead(100);
    }
	public void onHitWall() {
    // back up and turn in a different direction
    back(50);
    turnRight(90);
}




}
