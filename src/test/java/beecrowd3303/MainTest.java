package beecrowd3303;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class MainTest {
  
  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  private Main word = new Main();

  @Before
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }

  @Test
  public void checkParalelepipedo() {
    word.CheckWord("paralelepipedo");
    assertEquals("palavrao", outputStreamCaptor.toString().trim());
  }

  @Test
  public void checkCarro() {
    word.CheckWord("carro");
    assertEquals("palavrinha", outputStreamCaptor.toString().trim());
  }

  @Test
  public void checkParadadada() {
    word.CheckWord("paradadada");
    assertEquals("palavrao", outputStreamCaptor.toString().trim());
  }

  @After
  public void tearDown() {
    System.setOut(standardOut);
  }
}