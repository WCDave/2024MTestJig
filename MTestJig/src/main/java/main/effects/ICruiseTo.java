package main.effects;

import enums.CRUISE_SPEED;
import orbits.CoordSys;


public interface ICruiseTo {
   Thread cruiseTo(CoordSys target, CoordSys start, CRUISE_SPEED cruiseSpd);
}
