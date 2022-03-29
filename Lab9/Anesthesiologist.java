public class Anesthesiologist extends HealthcareWorker{
    public Anesthesiologist(String name, double price) {
        super(name, price);
    }

    @Override
    public void service() {
        System.out.println(this.getName() + " make the patient sleep.");
    }
}
