package sit707_9P_TaskPlanner;

import org.junit.Assert;
import org.junit.Test;

public class TaskPlannerServiceTest {

    @Test
    public void testEstimateNormal() {
        Assert.assertEquals(5, TaskPlannerService.estimateCompletionDays(15, 3));
    }

    @Test
    public void testEstimateExactDivision() {
        Assert.assertEquals(4, TaskPlannerService.estimateCompletionDays(12, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEstimateInvalidDailyHours() {
        TaskPlannerService.estimateCompletionDays(10, 0);
    }
}
