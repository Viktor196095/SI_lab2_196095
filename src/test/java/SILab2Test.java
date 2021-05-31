import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    public void test1() {
        Time time = new Time(-1,0,0);

        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try{
            SILab2.function(timesList);
        }
        catch (Exception e){
            assertEquals(e.getMessage(),"The hours are smaller than the minimum");
        }
    }
    @Test
    public void test2(){
        Time time = new Time(25,0,0);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try{
            SILab2.function(timesList);
        }
        catch (Exception e){
            assertEquals(e.getMessage(),"The hours are grater than the maximum");
        }
    }
    @Test
    public void test3(){
        Time time = new Time(22,60,0);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try{
            SILab2.function(timesList);
        }
        catch (Exception e){
            assertEquals(e.getMessage(),"The minutes are not valid!");
        }
    }
    @Test
    public void test4() {
        Time time = new Time(12,34,48);
        List<Time> timesList = new ArrayList<>();
        List<Integer> result;
        timesList.add(time);
        result = SILab2.function(timesList);
        assertEquals(result.get(0).intValue(),time.getHours()*3600 + time.getMinutes()*60 + time.getSeconds());
    }
    @Test
    public void test5(){
        Time time = new Time(22,30,-5);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try{
            SILab2.function(timesList);
        }
        catch (Exception e){
            assertEquals(e.getMessage(),"The seconds are not valid");
        }
    }
    @Test
    public void test6() {
        Time time = new Time(24,0,0);
        List<Time> timesList = new ArrayList<>();
        List<Integer> result;
        timesList.add(time);
        result = SILab2.function(timesList);
        assertEquals(result.get(0).intValue(),time.getHours()*3600 + time.getMinutes()*60 + time.getSeconds());
    }
    @Test
    public void test7(){
        Time time = new Time(24,30,5);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try{
            SILab2.function(timesList);
        }
        catch (Exception e){
            assertEquals(e.getMessage(),"The time is greater than the maximum");
        }
    }
}