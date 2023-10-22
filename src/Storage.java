import java.util.ArrayList;

public class Storage implements Subject {
    private ArrayList<Observer> observers;
    private String storageName;
    private Inventory items;

    public Storage(String name, Inventory startingInventory) {
        storageName = name;
        items = startingInventory;
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    public void notifyObserver(){
        for(Observer observer : observers){
            observer.update(storageName, items);
        }
    }

    public Inventory getInventory() {
        return items;
    }

    public String getName() {
        return storageName;
    }
    
    public void store(ItemInterface item) {
        items.addOne(item);
        //Hey Players! New Item!
        notifyObserver();
    }

    public ItemInterface retrieve(ItemInterface item) throws ItemNotAvailableException {
        ItemInterface removed = items.remove(item);
        //Hey Players! One less item!
        notifyObserver();
        return removed;
    }
    
}