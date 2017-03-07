import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  AnalogueCamera a_camera;


  @Before
  public void begin() {
    photographer = new Photographer("David Bailey");
    a_camera = new AnalogueCamera();
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
}