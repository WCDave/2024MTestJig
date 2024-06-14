package orbits;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import RVMath.VMath;
import main.AbstractView;

public class NavigationForeground extends Drawable3DDecorator {

	private NavComputer computer;
	private static final Color HDG_COLOR = new Color(255, 255, 255, 150);
	private static final Font HDG_FONT = new Font("Monospaced", Font.BOLD, 15);

	public NavigationForeground(Drawable3D drawable3d, NavComputer computer) {
		super(drawable3d);
		this.computer = computer;
	}

	@Override
	public void draw(AbstractView<?> view) {
		super.draw(view);
		CoordSys refPlanetSys = computer.getReferenceObject().getCoordSys();
		CoordSys craftSys = computer.getCraft().getCoordSys();
		int hdg = VMath.calculateHeading(refPlanetSys, craftSys);

		Graphics2D g2 = view.getViewCanvas().getG2();
		Font f = g2.getFont();
		Color c = g2.getColor();
		g2.setFont(HDG_FONT);
		g2.setColor(HDG_COLOR);
		g2.drawString("" + hdg, view.getViewCanvas().getWidth() / 2 - 5, 15);
		g2.setFont(f);
		g2.setColor(c);
	}

}
