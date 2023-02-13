public class Task8 {
    public void task8(){
        int numberOfWorker;
        float hoursWork = 640F, timeWorkWorker = 8F;
        numberOfWorker = (int) (hoursWork / timeWorkWorker);
        System.out.println("Task8\nВсего работников в компании: " + numberOfWorker + " человек");
        numberOfWorker += 94;
         timeWorkWorker = hoursWork / numberOfWorker;
        System.out.println("Если в компании работает " + numberOfWorker + " человек, то всего " + timeWorkWorker + " часов работы может быть поделено между сотрудниками");
    }
}
