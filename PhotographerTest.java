import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  AnalogueCamera a_camera;
  DigitalCamera d_camera;


  @Before
  public void begin() {
    photographer = new Photographer("David Bailey");
    a_camera = new AnalogueCamera();
    d_camera = new DigitalCamera();
  }

  @Test
  public void hasName(){
    assertEquals("David Bailey", photographer.getName() );
  } 

  @Test
  public void canAddCamera() {
    photographer.addCamera(a_camera);
    assertEquals(1, photographer.countCameras() );
  }
  
  @Test
  public void canRemoveCamera() {
    photographer.addCamera(a_camera);
    photographer.addCamera(a_camera);
    assertEquals(2, photographer.countCameras() );
    photographer.removeCamera(a_camera);
    assertEquals(1, photographer.countCameras() );
  }

  @Test 
  public void canPrintDetails() {
    photographer.addCamera(a_camera);
    assertEquals("click!", photographer.getCamera(a_camera).printDetails() );
    photographer.addCamera(d_camera);
    assertEquals("beep!", photographer.getCamera(d_camera).printDetails() );
  }

  @Test 
  public void hasPrintDetails() {
    photographer.addCamera(a_camera);
    photographer.addCamera(d_camera);
    assertEquals("click!beep!", photographer.printAllCameraDetails() );

  }
}