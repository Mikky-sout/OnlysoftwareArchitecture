

import java.util.ArrayList;

public class NewsPublisher implements Publishable {// เปลี่ยนไปใช้ Interface ที่สร้างขึ้นเอง
    private ArrayList<NewsSubscriber> newsSubscriberList = new ArrayList<>();

    @Override
    public void subscribe(NewsSubscriber newsSubscriber){
        this.newsSubscriberList.add(newsSubscriber);
    }

    @Override
    public void publish(News news){
        for(NewsSubscriber newsSubscriber : newsSubscriberList){
            newsSubscriber.update(news.getContent());
        }
    }

}
