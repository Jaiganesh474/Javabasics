package map;


class MapUsingHash {

    private Entity[] entities;

    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value); // overriding
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
public class HashMapDepthCode {
    public static void main(String[] args) {
        MapUsingHash map = new MapUsingHash();
        map.put("name", "Alice");
        map.put("age", "30");
        map.put("city", "New York");

        System.out.println("Name: " + map.get("name"));
        System.out.println("Age: " + map.get("age"));
        System.out.println("City: " + map.get("city"));

        map.remove("age");
        System.out.println("Age after removal: " + map.get("age"));
    }
}
