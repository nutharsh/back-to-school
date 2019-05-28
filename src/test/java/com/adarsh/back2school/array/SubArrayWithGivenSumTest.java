package com.adarsh.back2school.array;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Adarsh Thimmappa
 */
public class SubArrayWithGivenSumTest {
  @Test public void test01() throws Exception {
    int[] array = {1, 2, 3, 4, 5};
    int sum = 5;
    final int[] subArray = SubArrayWithGivenSum.findSubArray(array, sum);
    Assert.assertTrue(subArray != null);
    int calculatedSum = 0;
    for (int x = 0; x < subArray.length; x++) {
      calculatedSum += array[subArray[x]];
    }
    Assert.assertEquals(calculatedSum, sum, "sum need to match.");
  }
}
