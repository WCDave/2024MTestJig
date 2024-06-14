package main;

import RVMath.VMath;
import orbits.Abstract3DModelObject;
import orbits.CoordSys;
import orbits.World3DContainer;

import javax.swing.*;

import Foundation.Utils;

import java.awt.*;
import java.util.Collection;

public abstract class AbstractView<T extends Abstract3DModelObject> extends JPanel implements Updateable {

  protected Dimension d;
  protected CoordSys viewingCoordSys;
  private ArrayWrapper<T> drawableList = new ArrayWrapper<T>(15000);
  private double[] objectVectorFromView;
  private double distanceDrawingFactorForView;

  //public abstract void setViewCanvas(RenderingCanvas pilotViewCanvas);
  public abstract RenderingCanvas getViewCanvas();

  public abstract CoordSys getCoordSys();

  public abstract int getDetailLevel();

  /*--------------------------------------------------------------------------*/
  public AbstractView() {
    super();
  }

  public void setD(Dimension d) {
    this.d = d;
  }

  public Dimension getD() {
    return d;
  }


  public void setViewingCoordSys(CoordSys sys) {
    this.viewingCoordSys = sys;
  }

  @Override
  public void update() {

    Collection<T> items = (Collection<T>) World3DContainer.getInstance().getItems();

    drawableList.clear();
   
   //long t0 = System.nanoTime();
    for (T item : items) {
      distanceDrawingFactorForView = 0;
      objectVectorFromView = VMath.vecSubtract(item.getCoordSys().getPositionVec(), getCoordSys().getPositionVec());
      item.set3DObjectForDraw(this);
    }
    //System.out.println("dt= "+(System.nanoTime() - t0));
   
    World3DContainer.getInstance().getBackground().draw(this);
   

    drawableList.sort();
//    drawableList.pruneList();
    for (int i = 0; i < drawableList.size(); i++) {
      drawableList.get(i).draw(this);
    }

   
    getViewCanvas().repaint();
//    Utils.sleep(200);
  }


  public ArrayWrapper<T> getDrawableList() {
    return drawableList;
  }

  public double[] getObjectVectorFromView() {
    return objectVectorFromView;
  }

  public double getDistanceDrawingFactorForView() {
    return distanceDrawingFactorForView;
  }


  public void setDistanceDrawingFactorForView(double distanceDrawingFactorForView) {
    this.distanceDrawingFactorForView = distanceDrawingFactorForView;
  }
}
