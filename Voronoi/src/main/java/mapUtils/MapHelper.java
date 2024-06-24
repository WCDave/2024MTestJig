package mapUtils;

import org.apache.log4j.Logger;

import java.awt.*;
import java.util.Calendar;

public class MapHelper {

  private static final float RECT_SIZE = 10;
  private static final double TWO_PI = Math.PI * 2;
  private static final double PI_OVER_180 = Math.PI / 180;
  private static final double PI_OVER_12 = Math.PI / 12;

  private static Logger log = Logger.getLogger(MapHelper.class);
  static double testTime;

  static {

    Calendar c = Calendar.getInstance();
    int hr = c.get(Calendar.HOUR_OF_DAY);
    int min = c.get(Calendar.MINUTE);
    int sec = c.get(Calendar.SECOND);
    int ms = c.get(Calendar.MILLISECOND);
    testTime = hr + min / 60.0 + sec / 3600.0 + ms / (3600000.0);

  }

  public static int[] getFlatMapCoordsLatLong(float lat, float lon, Dimension dim) {

    return new int[]{(int) (dim.width * (lon + 180) / 360), (int) (dim.height / 2 * (1 - Math.sin(Math.toRadians(lat))))};
  }

  public static double getDecimalTimeOfDay() {
    Calendar c = Calendar.getInstance();
    int hr = c.get(Calendar.HOUR_OF_DAY);
    int min = c.get(Calendar.MINUTE);
    int sec = c.get(Calendar.SECOND);
    int ms = c.get(Calendar.MILLISECOND);
    double result = (hr + min / 60.0 + sec / 3600.0 + ms / (3600000.0));
    return result;
  }

  static float polygonArea(int[] X, int[] Y, int numPoints)
  {
    float area = 0;         // Accumulates area in the loop
    int j = numPoints-1;  // The last vertex is the 'previous' one to the first

    for (int i=0; i<numPoints; i++)
    { area = area +  (X[j]+X[i]) * (Y[j]-Y[i]);
      j = i;  //j is previous vertex to i
    }
    return area/2;
  }




}
