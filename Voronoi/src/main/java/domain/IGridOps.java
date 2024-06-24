package domain;


public interface IGridOps<T, V extends Number> {

  T [][] getSubGrid(int i, int j, int sizeX, int sizeY);
  T [][] getGrid();
  V getGridAverageValue(T[][] grid);
  V getGridTotalValue(T[][] grid);
}
