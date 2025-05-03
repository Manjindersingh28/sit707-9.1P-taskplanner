package sit707_9P_TaskPlanner;

public class TaskPlannerService {

    public static int estimateCompletionDays(int taskHours, int dailyStudyHours) {
        if (dailyStudyHours <= 0) {
            throw new IllegalArgumentException("Daily study hours must be greater than zero.");
        }
        return (int) Math.ceil((double) taskHours / dailyStudyHours);
    }
}
