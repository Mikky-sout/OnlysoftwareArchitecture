
public class NewsSubscriber implements Subscribable {// เปลี่ยนไปใช้ Interface ที่สร้างขึ้นเอง
    private String name ;
    public NewsSubscriber(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String content) {
        System.out.println(getName() + " receives news : "+content);
    }
}
