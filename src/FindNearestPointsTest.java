import org.junit.Assert;

import static org.junit.Assert.*;

public class FindNearestPointsTest {
    FindNearestPoints test = new FindNearestPoints();

    @org.junit.Test
    public void shortestDistanceBetweenTwoPoints() throws Exception {
        double [][] arr = {{0.0 ,0.0},{ 1.0, 1},{ -1,-1},{ 2, 2},{ -2 ,-2},{ -3, -3},{ -4, -4},{ 5, 5}};
        Assert.assertTrue(test.ShortestDistanceBetweenTwoPoints(arr));
}
}