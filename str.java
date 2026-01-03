public class str {
    static void main(String... args){
        StringBuffer s=new StringBuffer(" hello");
        s.insert(0,"hlo");
        s.deleteCharAt(7);
        s.delete(2,4);
        System.out.println(s);
        System.out.println();
        System.out.println(s.charAt(1));
        System.out.println(s.reverse());
    }
    
}
