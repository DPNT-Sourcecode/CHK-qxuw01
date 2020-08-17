package befaster.solutions.HLO;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class HelloSolutionTest {
  private HelloSolution helloSolution;

  @Before
  public void setUp(){
    helloSolution = new HelloSolution();
  }

  @Test
  public void testHello(){
    assertThat(helloSolution.hello("world"), is("world"));

  }

}