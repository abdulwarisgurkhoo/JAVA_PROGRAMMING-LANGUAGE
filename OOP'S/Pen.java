/**************************OOP'S IMPLEMENT*******************/
public class Pen
{
        public static void main (String args[])
        {
            Car c1=new Car();
            c1.setname("MARUTI_800");
            c1.setcolor("white");
            c1.setmilege(20);
            c1.setengine(1500);

            c1.display();
        }
}
class Car
    {
        String name;
        int engine;
        String color;
        int milege;
        
        void setname(String newname )
        {
                this.name=newname;
        }

        void setcolor(String newcolor)
        {
            this.color=newcolor;
        }
        void setmilege(int newmilege)
        {
            this.milege=newmilege;

        }
        void setengine(int newengine)
        {
            this.engine=newengine;
        }

       void display()
       {
           System.out.println(name);
           System.out.println(engine);
           System.out.println(color);
           System.out.println(milege);
          
       }
    }