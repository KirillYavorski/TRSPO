package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        Image_message m1 = new Image_message("1", "2", "3");
        m1.send();
    }   
}
/*Абстрактный класс*/
abstract class Mess {
    
    protected String m_from;
    protected String m_to;
         
    public Mess(String from, String to){
        this.m_from=from;
        this.m_to=to;
    }
    public abstract void send();
}


 class Image_message extends Mess{
    protected String m_image;
         
    public Image_message(String from, String to, String image){
        super(from, to);
        this.m_image=image;
    }
    
    public void send(){
        System.out.println(m_from+" "+m_to+" "+m_image);
    }
              
}

/*Интерфейс*/
interface Message{
    public void Send_mess();
}

class Standart_message implements Message{
    protected String m_text;
         
    public Standart_message(String m_text){
        this.m_text=m_text;
    }
    
    public void  Send_mess(){
        System.out.println(m_text);
    }
              
}