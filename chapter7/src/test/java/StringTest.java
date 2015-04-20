/**
 * Created by Administrator on 2015/4/16.
 */
public class StringTest{
    public static void main(String[] args){
        String a = "1111.jpe";
        int index = a.indexOf(".");
        System.out.println(index);
        String b = a.substring(index);
        System.out.println(b);
    }
}
