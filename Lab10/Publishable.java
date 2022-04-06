public interface Publishable {
    void subscribe(NewsSubscriber newsSubscriber);
    void publish(News news);
}
