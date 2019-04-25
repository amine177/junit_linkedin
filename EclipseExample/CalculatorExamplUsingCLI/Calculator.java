package test;
public class Calculator {
  public int evaluate(int[] nums) {
    int sum = 0;
    for (int num : nums)
      sum += num;
    return sum;
  }
}
