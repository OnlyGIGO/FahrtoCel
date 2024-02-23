package fi.metropolia;

/**
 * Hello world!
 *
 */
public class FahrToCel
{
   public static float convertFahrToCel(float fahr) {
      return Math.round((float)((float)(fahr - 32.0) * 5.0 / 9.0));
   }
   public static float kelvintoCel(float kel){
      return (float) (kel-273.15);
   }
}
