package ie.atu.Passenger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PassengerTest {
    Passenger testPass = new Passenger("mrs", "Iwo", "1346789021", 1245612, 32);
    @BeforeEach
    void setUp() {

    }


    @Test
    void testTitle(){
       assertEquals("Mrs", testPass.title("mrs") );
    }
    @Test
    void testFailTitle()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Passenger ("rs", "Iwo", "12346", 1245612, 32));
        assertEquals("Can only be Mr, Ms or Mrs",e_message.getMessage());
    }

    @Test
    void TestName()
    {
        assertEquals("Iwo", testPass.name("Iwo"));
    }
    @Test
    void testFailName()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Passenger ("mr", "Io", "12346", 1245612, 32));
        assertEquals("Name has to have a minimum of 3 characters",e_message.getMessage());
    }

    @Test
    void TestID()
    {
        assertEquals(1622991122, testPass.id("1622991122"));
    }
    @Test
    void testFailID()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Passenger ("mr", "Iwo", "62299112", 24612, 111));
        assertEquals("ID has to have a minimum of 10 digits",e_message.getMessage());
    }

    @Test
    void TestPhone()
    {
        assertEquals(1231231, testPass.phone(1231231));
    }
    @Test
    void testFailPhone()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Passenger ("mr", "Iwo", "1622991122", 12311, 3));
        assertEquals("Phone number has to have a minimum of 7 digits",e_message.getMessage());
    }

    @Test
    void TestAge()
    {
        assertEquals(18, new Passenger("mrs", "Iwo", "1234125426", 1245612, 32).age(18));
    }
    @Test
    void testFailAge()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> new Passenger ("mr", "Iwo", "1622991122", 1231211, 11));
        assertEquals("Must be at least 16 years of age to fly",e_message.getMessage());
    }

    @Test
    void testObject()
    {
        Passenger passTest;
        passTest = new Passenger("mr", "Iwo", "1622991122", 23123166, 22);
    }

    @AfterEach
    void tearDown() {
    }
}