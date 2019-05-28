package com.adarsh.back2school.array;



import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * @author Adarsh Thimmappa
 */
@Slf4j public class SubArrayWithGivenSum {
  public static void main(String[] args) {
    // init scanner
    Scanner scanner = new Scanner(System.in);

    // array length
    final int arrayLength = scanner.nextInt();

    // target sum of continuous sub-array
    final int sum = scanner.nextInt();

    // array of non negative numbers
    int[] array = new int[arrayLength];

    // fill array elements
    for (int i = 0; i < arrayLength; i++) {
      array[i] = scanner.nextInt();
    }

    findSubArray(array, sum);

    // close scanner
    scanner.close();
  }

  // algorithm
  public static int[] findSubArray(int[] array, int finalSum) {
    int j = 0;
    while (j < array.length) {
      int k = j;
      int calculatedTotal = 0;
      while (calculatedTotal < finalSum) {
        calculatedTotal = calculatedTotal + array[k];
        k++;
      }
      log.info("arrayIndex={} finalSum={} calculatedTotal={}", j, finalSum, calculatedTotal);
      if (calculatedTotal == finalSum) {
        int[] indices = new int[k - j];
        for (int x = 0, i = j; i < k; i++, x++) {
          indices[x] = i;
        }
        log.info("indices={}", indices);
        return indices;
      }
      j++;
    }
    log.error("no continuous sub-array found");
    return null;
  }
}
