import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  Camera camera;


  @Before
  public void begin() {
    photographer = new Photographer("David Bailey");
    camera = new Camera();
  }

  @Test
  public void hasName(){
    assertEquals("David Bailey", photographer.getName() );
  } 

  @Test
  public void canAddCamera() {
    photographer.addCamera(camera);
    assertEquals(1, photographer.countCameras() );
 }

}