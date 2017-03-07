import java.util.*;

public class Photographer {
  private String name; 
  private ArrayList<Camera> cameras;
  private HashMap journal;

  public Photographer ( String name) {
    this.name = name;
    this.cameras = new ArrayList<Camera>() ;
    this.journal = new HashMap<String, Integer>();
  }

  public String getName(){
    return this.name;
  }

  public void addCamera(Camera camera) {
    cameras.add(camera);
  }

  public void removeCamera(Camera camera) {
    cameras.remove(camera);
  }  

  public int countCameras() {
    return cameras.size();
  }

  public Camera getCamera(Camera camera) {
    return cameras.get(cameras.indexOf(camera));
  }

  public String printAllCameraDetails() {
    String detailsList = "";
    for (Camera camera : cameras) {
      detailsList = detailsList + camera.printDetails();
    }
    return detailsList;
  }

  public void addJournalEntry(String day, Integer photos){

  }
}