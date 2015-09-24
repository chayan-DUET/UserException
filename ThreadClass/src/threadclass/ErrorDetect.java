/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadclass;

/**
 *
 * @author Chayan_pc
 */
public class ErrorDetect {
   private int start;
   private int end;
   private int len;
   
   public ErrorDetect(int start, int end)
   {
   this.start=start;
   this.end=end;
   }
    void lencal()throws NegetiveIndecat
    {
      if(end-start<0)
      {
          len=0;
      throw new NegetiveIndecat();
      }
      else
          len=end-start;
      }
   void print()
           {
        System.out.println(len);
         }
    }

