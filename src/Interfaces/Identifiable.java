package Interfaces;

public interface Identifiable {
    private String id;
    private String model;
    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getId(){
        return id;
    }

    public String getModel(){
        return model;
    }
}
