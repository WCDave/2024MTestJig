package domain;


import domain.impl.GridOpsImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GridOpsImplTest {

  GridOpsImpl<Float> iut = new GridOpsImpl<Float>(new Float[10][10]);

  @Before
  public void setUp() {
    Float[][] input = new Float[][]{{1f,2f,3f,0f,0f,0f,0f,0f,0f,0f},
                                    {4f,5f,6f,0f,0f,0f,0f,0f,0f,0f},
                                    {7f,8f,9f,0f,0f,0f,0f,0f,0f,0f},
                                    {0f,0f,0f,0f,0f,0f,0f,0f,0f,0f},
                                    {0f,0f,0f,0f,0f,0f,0f,0f,0f,0f},
                                    {0f,0f,0f,0f,0f,0f,0f,0f,0f,0f},
                                    {0f,0f,0f,0f,0f,0f,0f,0f,0f,0f},
                                    {0f,0f,0f,0f,0f,0f,0f,0f,0f,0f},
                                    {0f,0f,0f,0f,0f,0f,0f,0f,0f,0f},
                                    {0f,0f,0f,0f,0f,0f,0f,0f,0f,0f}};
    for(int i= 0; i<input.length; i++) {
      iut.getGrid()[i] = input[i];
    }
  }

  @Test
  public void testGetSubGrid() {
    Float[][] result = iut.getSubGrid(1, 1, 3, 2);
    assertArrayEquals(result[0], new Float[]{5f,6f,});
    assertArrayEquals(result[1], new Float[]{8f,9f});
    assertArrayEquals(result[2], new Float[]{0f,0f});
  }

  @Test
  public void testGetGridAverageValue() {
    double result = iut.getGridAverageValue(iut.getSubGrid(1, 1, 3, 2));
    assertEquals(28f/6f, result, 0.001);
  }

  @Test
  public void testGetGridTotalValue() {
    double result = iut.getGridTotalValue(iut.getSubGrid(1, 1, 3, 2));
    assertEquals(28f, result,0);
  }
}
