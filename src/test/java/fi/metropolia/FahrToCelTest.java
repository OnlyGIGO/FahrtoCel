package fi.metropolia;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FahrToCelTest
    extends TestCase
{
    @Test
    public void testFahrToCel()
    {
        assertEquals(0.0, FahrToCel.convertFahrToCel(32),0.01f);
        assertEquals(100.0, FahrToCel.convertFahrToCel(212),0.01f);
        assertEquals(-40.0, FahrToCel.convertFahrToCel(-40),0.01f);
        assertEquals(37.0, FahrToCel.convertFahrToCel(98.6f),0.01f);
    }
    @Test
    public void testKelvintoCel()
    {
        assertEquals(100.0, FahrToCel.kelvintoCel(373.15f),0.01f);
        assertEquals(0.0, FahrToCel.kelvintoCel(273.15f),0.01f);
        assertEquals(-100.0, FahrToCel.kelvintoCel(173.15f),0.01f);
    }
    @Test
    public void testKelvinToFahr()
    {
        assertEquals(80.51, FahrToCel.kelvinToFahr(300.1f),0.01f);
        assertEquals(32.0, FahrToCel.kelvinToFahr(273.15f),0.01f);
        assertEquals(-148.0, FahrToCel.kelvinToFahr(173.15f),0.01f);
    }
}
