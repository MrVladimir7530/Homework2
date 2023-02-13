public class TaskSixSeven {
    private float weightOneBoxer = 78.2F, weightTwoBoxer = 82.7F, totalWeight, differenceWight;

    public void task6() {
        //Также надо найти разницу в весе, но нет смысла прописывать один и тот же код дважды, ведь эта задача стоит в task7
        totalWeight = weightOneBoxer + weightTwoBoxer;
        System.out.println("Task6\nWeight one boxer: " + weightOneBoxer + " kg\nWeight two boxer: " + weightTwoBoxer + " kg\nTotal weight: " + totalWeight + " kg\n");
    }

    public void task7() {
        differenceWight = weightTwoBoxer - weightOneBoxer;
        System.out.println("Task7\n1.Difference weight boxer: " + differenceWight);
        differenceWight = weightTwoBoxer % weightOneBoxer;
        System.out.println("2.Difference weight boxer: " + differenceWight + "\n");

    }
}
