import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private JSONArray arr;

    public JSONBookMetadataFormatter(){
        reset();
    }
    @Override
    public BookMetadataFormatter reset() {
        arr = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject obj = new JSONObject();
        obj.put("ISBN",new String(b.getISBN()));
        obj.put("Title",new String(b.getTitle()));

        arr.add(obj);
        return this;
    }

    @Override
    public String getMetadataString() {
        return arr.toString();
    }

    public JSONArray getJsonArray(){
        return arr;
    }
}
