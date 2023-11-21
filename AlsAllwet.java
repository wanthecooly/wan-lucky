import static java.lang.System.out;
public class AlsAllwet {
    
    public static void main(String args[])  {
        for (int verse = 1; verse <= 3; verse++) {
            out.print(" Al's all wet.");
            out.println("oh, why is Al all wet? oh,");
            out.print("Al's all wet 'cause'" );
            out.println("he's standing in the rain");
            out.println("why is Al out in the rain");
            
            switch (verse) {
                case 1:
                  out.println("That's because he has no brain.");
                    break;
                case 2:
                    out.println("That's because he is a pain.");
                    break;
                case 3:
                    out.println("'cause this is the last refrain.");
                    break;
            }
            
            switch (verse){
                case 3:
                    out.println("Last refrain, last refrain,");
                case 2:
                    out.println("he's a pain, he's a pain");
                case 1:
                    out.println("has no brain, has no brain");
            }
            
            out.println("in the rain,in the rain");
            out.println("ohhhhhhhhhh...");
            out.println("");
        }
        
         out.print("Al's all wet");
         out.println("oh, why Al all wet? oh,");
         out.print("Al's all wet 'cause' ");
         out.println("he's standing in th rain");
    }
    
}