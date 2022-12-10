import org.junit.Assert;
import org.junit.Test;
public class Tester {
    
    @Test
    public void test(){
        Assert.assertEquals("Jadwal tidak bentrok\nNilai masuk kedalam kriteria\nCocok menjadi asisten dosen RPL",VersiTesting.test("RPL", 7, 8, "A", new int[]{0,0,1,1,1,1,1,1,1,1,1,1}));
    }
    @Test
    public void test2(){
        Assert.assertEquals("Bentrok\nNilai tidak masuk kedalam kriteria\nTidak cocok menjadi asisten dosen RPL",VersiTesting.test("RPL", 7, 8, "E", new int[]{1,1,1,1,1,1,1,1,1,1,1,1}));
    }
    @Test
    public void test3(){
        Assert.assertEquals("Bentrok\nNilai masuk kedalam kriteria\nTidak cocok menjadi asisten dosen RPL",VersiTesting.test("RPL", 7, 8, "A", new int[]{1,1,1,1,1,1,1,1,1,1,1,1}));
    }
    @Test
    public void test4(){
        Assert.assertEquals("Jadwal tidak bentrok\nNilai tidak masuk kedalam kriteria\nTidak cocok menjadi asisten dosen RPL",VersiTesting.test("RPL", 7, 8, "E", new int[]{0,0,1,1,1,1,1,1,1,1,1,1}));
    }
    
}
