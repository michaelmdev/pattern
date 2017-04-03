package codility;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author michael.malevannyy@gmail.com, 31.03.2017
 */

class SolutionTest {
    @Test
    public void solution() {
        Solution s = new Solution();

        List<Sample> tests = new ArrayList<>();

        tests.add(new Sample(new int[][]{{1, 3, 2, 1}, {4, 2, 5, 3, 2}}, 2));

        tests.add(new Sample(new int[][]{{2, 4, 7}, {1, 1, 3, 3, 5, 7}}, 7));

        tests.add(new Sample(new int[][]{
                {2, 4, 4, 4, 5},
                {1, 1, 3, 3, 5, 7}},
                5));

        tests.add(new Sample(new int[][]{
                {2, 4, 4, 4, 5},
                {1, 1, 3, 3, 5, 7}},
                5));

        for (Sample t : tests) {
            System.out.println(tests.indexOf(t));
            assert (s.solution(t.a, t.b) == t.result);
        }

    }


    class Sample {
        int[] a;
        int[] b;
        int result;

        Sample(int[][] ints, int result) {
            a = ints[0];
            b = ints[1];
            this.result = result;
        }
    }

}

