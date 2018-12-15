package arpit.com.farmis.homerv;

public class Presenter {
    private final Item item;

    public Presenter(Item item) {
        this.item = item;
    }

    public void onBindListRowViewAtPosition(int position, DataLoaded rowView) {
        switch (position) {
            case 0:
                rowView.onDataLoaded(item.getHumidity(), "Humidity");
                break;
            case 1:
                rowView.onDataLoaded(item.getTemps(), "Temperature");
                break;
            case 2:
                rowView.onDataLoaded(item.getLevel(), "Level");
                break;
            case 3:
                rowView.onDataLoaded(item.getSiloLevel(), "Silo Level");
                break;
        }

    }

    public int getListRowsCount() {
        return item.getCount();
    }
}
