package domain.impl;

import domain.IGridOps;

import java.lang.reflect.Array;


public class GridOpsImpl<T extends Number> implements IGridOps<T, Double> {
  private T[][] grid;

  public GridOpsImpl(T[][] grid) {
    this.grid = grid;
  }

  @Override
  public T[][] getSubGrid(int i, int j, int sizeX, int sizeY) {
    if(i < 0 || j < 0 || i + sizeX > grid.length || j + sizeY > grid[0].length ) {
      throw new IllegalArgumentException("Subgrid arguments exceed bounds of underlying grid");
    }

    Class c = grid[0].getClass();
    T[][] resultGrid = (T[][]) Array.newInstance(c.getComponentType(), sizeX, sizeY);

    for(int x=i;x<i + sizeX;x++) {
      for(int y=j;y<j + sizeY; y++) {
         resultGrid[x-i][y-j] = grid[x][y];
      }
    }

    return resultGrid;
  }

  @Override
  public T[][] getGrid() {
    return grid;
  }

  @Override
  public Double getGridAverageValue(T[][] grid) {
    if(grid.length == 0) {
      throw new IllegalArgumentException("Invalid input grid size "+grid.length);
    }
    double result = getGridTotalValue(grid);
    return result/(grid.length*grid[0].length);
  }

  @Override
  public Double getGridTotalValue(T[][] grid) {
    if(grid.length == 0) {
      throw new IllegalArgumentException("invalid input grid size "+grid.length);
    }
    double result = 0;
    for(int i = 0;i<grid.length; i++) {
      for(int j = 0; j< grid[i].length;j++) {
        result+= grid[i][j].doubleValue();
      }
    }
    return result;
  }
}
