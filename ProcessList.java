import javax.swing.JFrame;
/*
* Listar los procesos de Windows y mostrarlos  en un JList
* _______________________________
* @author L-EYER
* @see GlassFish Tools Bundle For Eclipse Version: 0.9.9
* _______________________________________________________
*
*/
public class ProcessList 
{
        public static void main(String[] args) {
                final JFrame init = new JFrame();
                init.setLayout(new java.awt.GridLayout(1,1));
                init.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                final  java.awt.List list = new java.awt.List();
                java.awt.Container container = init.getContentPane();
                                container.add(list);
                final String command = "CMD /C tasklist /nh";
                java.util.Vector< String > listProcess=new java.util.Vector< String >();
                try {
                        
                        final Process process = Runtime.getRuntime().exec(command);
                        java.io.BufferedReader reader = new java.io.BufferedReader(
                                        new java.io.InputStreamReader(
                                                        process.getInputStream()));
                                String pross=null;
                                String processName="";
                        while((pross=reader.readLine()) != null){
                                char[]array=pross.toCharArray();
                                for(int i=0;
                                i<array.length;
                                i++){
                                        processName += String.valueOf(array[i]);
                                                if(array[i]==' ')break;else continue;
                                }
                                listProcess.addElement(
                                                processName.trim().toUpperCase());
                                processName="";
                        }
                        for(int j = 0;
                        j< listProcess.size();
                        j++)
                                list.add(listProcess.get(j));
                        } catch (java.io.IOException e) {e.printStackTrace();System.exit(0);
                        
                }catch (Exception e) {
                System.err.println(e);System.exit(0);
                     }
                init.setSize(300,700);
                init.setLocationRelativeTo(new JFrame());
                init.setVisible(true);
        }
}