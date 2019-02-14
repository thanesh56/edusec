//package invoice_pack;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

 class TIndexInvoice extends JFrame  implements ActionListener {
	 TIndexInvoice() { showGUI(); }
   	 JMenu menus[];
   	 JMenuItem menuitm[];
	 JDesktopPane jdpan;
	 static int openFrameCount = 1; 
	 public void showGUI() {
	 this.setLayout(null);
         this.setDefaultCloseOperation(3);

	
	 // Make the main window positioned as 50 pixels from each edge of the
	 // screen.
	 int inset = 50;
	 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	 setBounds(inset, inset, screenSize.width - inset * 2,
			screenSize.height - inset * 2);
         // Add a Window Exit Listener
	 addWindowListener(new WindowAdapter() {
		 public void windowClosig(WindowEvent e) {
		    	 System.exit(0);
		 }
	 });
	 // Create and Set up the GUI.
	 jdpan = new JDesktopPane();
	 //A specialized layered pane to be used with JInternalFrames 
		 JInternalFrame frame = new Users().showGUI(); 
		 frame.setVisible(true);
	         //frame.setBackground(Color.green);
		 jdpan.add(frame);  
        	 try {                           
        		frame.setSelected(true); 					
        	 } catch (java.beans.PropertyVetoException err) {               
		 } 	
		 setContentPane(jdpan);
	
		 // Make dragging faster by setting drag mode to Outline
		 jdpan.putClientProperty("JDesktopPane.dragMode", "outline");
  		 //////////////JMenu defination /////////////  
	  	 JMenuBar jb = new JMenuBar();
	  	 menuitm = new JMenuItem[36];
	  	 String mtm[] = new String[]{"BankMaster","Batches","City","Country","Courses","DocumentCategory","EmpAddress","EmpCategory","EmpDepartment","EmpDesignation","EmpDocs","EmpInfo","EmpMaster","EmpStatus","Events","FessCategoryDetails","FeesColectCategory","FeesPaymentTransaction","Languages","LoginDetails","MsgOfDay","NationalHolidays","Nationality","Notice","Organigation","Section","State","StuAddress","StuCategory","StuDocs","StuGuardians","StuInfo","StuMaster","StuStatus","Users"};
	  	 for(int i = 0;i<mtm.length;i++) {
	        	  menuitm[i] = new JMenuItem(mtm[i]);
	        	  menuitm[i].addActionListener(this); 
	  	 } 
	 
	  	 menus = new JMenu[6];
	  	 String mnu[] = new String[]{"File","Edit","View","Bookmarks","Setting","Help"};
	  	 for(int i = 0;i<6;i++) {
			   menus[i] = new JMenu(mnu[i]);
		  	   if(i==0){
			  	 for(int j = 0;j<mtm.length;j++)
	 				 menus[i].add(menuitm[j]);	   
		  	   } 
	          	  jb.add(menus[i]);
	  	 }	
	  	 menus[0].setMnemonic(KeyEvent.VK_F);
	         this.setJMenuBar(jb);
		 
	 	 this.setVisible(true); 
	}
		static final int xPosition = 30, yPosition = 30;

	        public void actionPerformed(ActionEvent actionEvent) {
	   ////////////////////////////////Admin///////////////////////////////////////////
	        if(actionEvent.getActionCommand().equals("Admin")) {
	        	
			JInternalFrame frame = new BankMaster().showGUI();                           	
			 frame.setVisible(true);                                                	
			// Set the window's location.                                           	
			frame.setLocation(xPosition * openFrameCount, yPosition                 	
					* openFrameCount);                                      	
			 openFrameCount++;                                                      	
			 jdpan.add(frame);                                                      	
		         try {                                                                  	
		        	frame.setSelected(true); 						
		         } catch (java.beans.PropertyVetoException err) {                       	
			 } 	                                                             	
						                         	
	    	}
		if(actionEvent.getActionCommand().equals("Batches")) {
			JInternalFrame frame = new Batches().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
	                 } 	
	        }
	        if(actionEvent.getActionCommand().equals("City")) {
			JInternalFrame frame = new City().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);                                                              	       
	                 try {                                                                          	       
	                	frame.setSelected(true); 					       	       
	                 } catch (java.beans.PropertyVetoException err) {                               	       
	                 } 	                                                                     	       
	        }
	        if(actionEvent.getActionCommand().equals("Country")) {
			JInternalFrame frame = new Country().showGUI();                           			
	                 frame.setVisible(true);                                                        	
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);                                                              		
	                 try {                                                                          		
	                	frame.setSelected(true); 					       		
	                 } catch (java.beans.PropertyVetoException err) {                               		
	                 } 	                             			 
	        }
	        if (actionEvent.getActionCommand().equals("Courses")) {
		
		
			JInternalFrame frame = new Courses().showGUI();                           			
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;                                                              		
	                 jdpan.add(frame);                                                              		
	                 try {                                                                          		
	                	frame.setSelected(true); 					       		
	                 } catch (java.beans.PropertyVetoException err) {                               		
	                 } 
		}
	        if(actionEvent.getActionCommand().equals("DocumentCategory")) {
	        
			JInternalFrame frame = new DocumentCategory().showGUI();                           			
	                 frame.setVisible(true);                                                        		
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;                                                              		
	                 jdpan.add(frame);                                                              		
	                 try {                                                                          		
	                	frame.setSelected(true); 					       		
	                 } catch (java.beans.PropertyVetoException err) {                               		
	                 } 	  
		}
	        if(actionEvent.getActionCommand().equals("EmpAddress")) {
	        
			JInternalFrame frame = new EmpAddress().showGUI();                           			
	                 frame.setVisible(true);                                                        		
	                // Set the window's location.                                                   		
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                                                                          		
	                	frame.setSelected(true); 					       		
	                 } catch (java.beans.PropertyVetoException err) {                               		
	                 } 	                                                                     		
	        }
	        if(actionEvent.getActionCommand().equals("EmpCategory")) {
			JInternalFrame frame = new EmpCategory().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("EmpDepartment")) {
			JInternalFrame frame = new EmpDepartment().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("EmpDesignation")) {
			JInternalFrame frame = new EmpDesignation().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("EmpDocs")) {
			JInternalFrame frame = new EmpDocs().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("EmpInfo")) {
			JInternalFrame frame = new EmpInfo().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	

	        if(actionEvent.getActionCommand().equals("EmpMaster")) {
			JInternalFrame frame = new EmpStatus().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("Events")) {
			JInternalFrame frame = new Events().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	

	        if(actionEvent.getActionCommand().equals("FeesCategoryDetails")) {
			JInternalFrame frame = new FeesCategoryDetails().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("FeesCollectCategory")) {
			JInternalFrame frame = new FeesCollectCategory().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("FeesPaymentTransaction")) {
			JInternalFrame frame = new FeesPaymentTransaction().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("Languages")) {
			JInternalFrame frame = new Languages().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("LoginDetails")) {
			JInternalFrame frame = new LoginDetails().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	

	        if(actionEvent.getActionCommand().equals("MsgOfDay")) {
			JInternalFrame frame = new MsgOfDay().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("NationalHolidays")) {
			JInternalFrame frame = new NationalHolidays().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("Nationality")) {
			JInternalFrame frame = new Nationality().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("Notice")) {
			JInternalFrame frame = new Notice().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	

	        if(actionEvent.getActionCommand().equals("Organization")) {
			JInternalFrame frame = new Organization().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("Section")) {
			JInternalFrame frame = new Section().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("State")) {
			JInternalFrame frame = new State().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("StuAddress")) {
			JInternalFrame frame = new StuAddress().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("StuCategory")) {
			JInternalFrame frame = new StuCategory().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame); 
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("StuDocs")) {
			JInternalFrame frame = new StuDocs().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	

	        if(actionEvent.getActionCommand().equals("StuGuardians")) {
			JInternalFrame frame = new StuGuardians().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("StuInfo")) {
			JInternalFrame frame = new StuInfo().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("StuMaster")) {
			JInternalFrame frame = new StuMaster().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("StuStatus")) {
			JInternalFrame frame = new StuStatus().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	
	        if(actionEvent.getActionCommand().equals("Users")) {
			JInternalFrame frame = new Users().showGUI();                           	
	                 frame.setVisible(true);
	                // Set the window's location.
	                frame.setLocation(xPosition * openFrameCount, yPosition
                		* openFrameCount);
	                 openFrameCount++;
	                 jdpan.add(frame);  
	                 try {                           
	                	frame.setSelected(true); 					
	                 } catch (java.beans.PropertyVetoException err) {               
			 }
		}	                                                                               	  }
	  public static void main(String args[]) {
		new TIndexInvoice().showGUI();
	  }
	}
