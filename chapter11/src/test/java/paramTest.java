/**
 * Created by Administrator on 2015/4/22.
 */
public class paramTest {

 public static void main(String[]args){
     paramTest pt = new paramTest();
     Long[] a = {1L};
     pt.param1("1",a);
 }
 public void param1(String param1,Long...ids){
     System.out.println(param1);
     System.out.println(ids);
 }
}
