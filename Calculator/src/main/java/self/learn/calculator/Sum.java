/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package self.learn.calculator;

/**
 *
 * @author aminos
 */
public class Sum {
    public int sum(int nums[]) {
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        return sum;
    }
}
