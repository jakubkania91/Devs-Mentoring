package zaawansowane.tematyka4;

import java.util.ArrayList;
import java.util.List;

public class DataStoragre<K> {
    private List<K> date;

    public DataStoragre(List<K> date) {
        this.date = date;
    }

    public List<K> revers() {
        List<K> reversList = new ArrayList<>();
        for (int i = date.size() - 1; i >= 0; i--) {
            reversList.add(date.get(i));

        }
        return reversList;
    }
}
