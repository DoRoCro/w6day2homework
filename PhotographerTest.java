import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  Camera camera;


  @Test
  public void hasName(){
    photographer = new Photographer("David Bailey");
    assertEquals("David Bailey", photographer.getName() );
  } 

 // @Test
 // public void canAddCamera() {
 //   photographer.addCamera(camera);
 //   assertEquals(1, photographer.countCameras() );
 // }

}