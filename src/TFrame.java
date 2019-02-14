import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
class TFrame implements ActionListener {
		JLabel[] jlabels;
	       	JTextField[] jtfields;
		JButton[] jbuttons; 
		JPasswordField[] jpasswords;
		JRadioButton[] jradiobuttons; 	
		ButtonGroup buttongroup;
		//JComboBox<String>[] jcombobox ; 
		JComboBox<String> jcombobox;
		String[] labels;
		String tablename; 	
		int comboval,radioval,tfval,passval = tfval = radioval = comboval = 0;
		DBLib dblib= new DBLib();
		public JInternalFrame showTFrame(String tablename,String[] btns,String... args) {
			labels = args;
			this.tablename = tablename;
			int yframe = 0;
			//A specialized layered pane to be used with JInternalFrames
			 JInternalFrame jiframe = new JInternalFrame("JInternalFrame",true,true,true,true);
			 jiframe.setLayout(null);
			 ////////////initialization////////
			 jlabels = new JLabel[args.length];
		     	 jtfields = new JTextField[args.length-1];
			 jpasswords = new JPasswordField[2];
			 jradiobuttons = new JRadioButton[2];
			 //jcombobox = new  JComboBox[2];
			 //////tittel defination///////////
			 jlabels[0] = new JLabel(args[0]); 
		 	 jlabels[0].setFont(new Font("serif",1,21));	
			 jlabels[0].setBounds(100,5,300,25);
			 jiframe.add(jlabels[0]);
			 for(int i = 1;i< args.length;i++) {
				//jlabel defination	
				jlabels[i] = new JLabel(args[i]);
					yframe = 45+(i-1)*25;
					jlabels[i].setBounds(80,yframe,100,20);
					if(args[i]=="Password"||args[i]=="Conform Password") {                   
						//jpasswordfield defination		
						jpasswords[passval] = new JPasswordField();	
                                		jpasswords[passval].setBounds(165,45+(i-1)*25,200,20);
                                		jiframe.add(jpasswords[passval]);
						passval++;
					}
                               		else if(args[i]=="Gender") {
						//jradiobuttons defination 
						jradiobuttons[radioval] = new JRadioButton("M",true);
						jradiobuttons[radioval].setBounds(165,45+(i-1)*25,50,20);
						radioval++;
						jradiobuttons[radioval] = new JRadioButton("F");
						jradiobuttons[radioval].setBounds(220,45+(i-1)*25,50,20);
						buttongroup = new ButtonGroup();
						buttongroup.add(jradiobuttons[0]);
						buttongroup.add(jradiobuttons[1]);
						jiframe.add(jradiobuttons[0]);
						jiframe.add(jradiobuttons[1]);
					
					
					}
					else if(args[i]=="Country") {
				
						//jcombobox defination
 						jcombobox = new JComboBox<String>(); 
						String[] arrstring = new String[]{"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Goa", "Gujarat", "Haryana", "Himanchal Pradesh", "Jammu & Kashmir", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalay", "Mizoram", "Nagaland", "Orissa", "Panjab", "rajasthan", "Sikkim", "Tamil Nadu", "Tripura", "Uttar Pradesh", "West Bengal", "Chhattisgarh", "Uttarakhand", "Jharkhand", "Telangana"};
        			        JComboBox<String> internalcombobox  = new JComboBox<String>(arrstring);		
					System.out.println(internalcombobox.get(i));
                			        
                                             	jcombobox.add(internalcombobox );
                    			      	//System.out.println(comboval);	
                			        //System.out.println(data);
						 jcombobox.setBounds(165,45+(i-1)*25,200,20);
						 jiframe.add(jcombobox);
						 comboval++; 	
					}
					else {
						//jtextfield defination
						jtfields[tfval] = new JTextField();
						jtfields[tfval].setBounds(165,45+(i-1)*25,200,20);
						jiframe.add(jtfields[tfval]);
						tfval++;
					}
				jiframe.add(jlabels[i]);
			}
		        //jbutton initialization
			jbuttons = new JButton[btns.length];	
			for(int i = 0;i< btns.length;i++){
				//jbuttons defination
				jbuttons[i] = new JButton(btns[i]);
				if(i<3) {
					yframe = 45+(args.length-1)*30;
					jbuttons[i].setBounds(80+i*95,yframe,90,25);
				}
				else if(i<6) {	
					yframe = 45+(i/3+args.length-1)*30; 
					jbuttons[i].setBounds(80+(i-3)*95,yframe,90,25);
				}
				else {
					yframe = 45+(i/3+args.length-1)*30;
					jbuttons[i].setBounds(80+(i-6)*95,yframe,90,25);
				}
				jbuttons[i].addActionListener(this);
				jiframe.add(jbuttons[i]);
			}
			jiframe.setSize(470,yframe+80);
			jiframe.setVisible(true);
			return jiframe;
		}	
		static int openFrameCount = 1;
		static final int xPosition = 30, yPosition = 30;

	/////////////////////Action method//////////////
	public void actionPerformed(ActionEvent e) {
		ArrayList<Object> colval = new ArrayList<Object>();
	    	//////////////////////////////////////////insert statement////////////////////////////////////////////// 
	        if(e.getActionCommand().equals("Insert")) {
			//System.out.println(jpasswords.length+"\n"+jtfields.length+"\n"+jlabels.length);
			int datacount = 0;
			int p = 0;
			int q = 0;
			int r = 0;
			int c = 0;
			do {	
				if((jlabels[datacount+1].getText()=="Password")||(jlabels[datacount+1].getText()=="Conform Password")){	
				
					if(!jpasswords[p].getText().trim().isEmpty()) {
						if(p>0){
							if(!((jpasswords[p-1].getText()).equals(jpasswords[p].getText()))) {	
								JOptionPane.showMessageDialog(jpasswords[p],jlabels[datacount+1].getText()+" not matched");
								break;

							}
						}
						datacount++;
						p++;	
					}	
					else {	
					       JOptionPane.showMessageDialog(jbuttons[0],jlabels[datacount+1].getText()+" Missing");			     
					       break;
					}
				}
				else if(jlabels[datacount+1].getText()=="Gender") {
					datacount++;
					r++;
				} 
				else if(jlabels[datacount+1].getText()=="Country"){
					datacount++;
					c++;
				}
				else {
			        	if(!jtfields[q].getText().trim().isEmpty()) {
						datacount++;
						q++;
					}
					else{
					       JOptionPane.showMessageDialog(jbuttons[0],jlabels[datacount+1].getText()+" Missing");				
				               break;	       
   					      
					}
				}
			} while((tfval+passval+radioval+comboval)!=datacount);
			int p2 = 0;
			int q2 = 0;
			int r2 = 0;
			int c2 = 0;
		        if((tfval+passval+radioval+comboval)==datacount) {
				for(int i = 0;i<datacount;i++) {
					//insertion of passwords
				    	if(jlabels[i+1].getText()=="Conform Password")
				    		continue;	    
				    	else if(jlabels[i+1].getText()=="Password"){
					        //System.out.println(jpasswords[p2].getText());
						colval.add(jpasswords[p2].getText().trim());
						p2++;
						continue;
					}
					//insertion of radio buttons
					else if(jlabels[i+1].getText()=="Gender") {
						if(jradiobuttons[r2].isSelected()){
							colval.add("M");
							r2++;
						}
						else {
							colval.add("F");
							r2++;
						}
					
					}
					//insertion of comboboxs
					else if(jlabels[i+1].getText()=="Country") {
						colval.add(jcombobox.getSelectedItem());
						c2++;
							
					}
					//insertion of textfields
					else 	{
				
						 //System.out.println(jtfields[q2].getText());
					 	 colval.add(jtfields[q2].getText().trim());	 
				     		 q2++;
					}	 
				}
				////////////////////////SQL Operation////////////////
			
				//dblib.getStatement("jdbc:mysql://localhost/edusec","root","");	
				//////////////////getColumnName//////////////
				ArrayList<String> colname = new ArrayList<String>();
				ArrayList<Integer> coltype = new ArrayList<Integer>();
				try {
					ResultSet rs = dblib.selectData("select * from "+tablename);
					ResultSetMetaData rsmd = rs.getMetaData();
		                        int ccount = rsmd.getColumnCount();
					for(int i = 2;i<=ccount;i++) {
						colname.add(rsmd.getColumnName(i));
						coltype.add(rsmd.getColumnType(i));
					}
				}
				catch(SQLException se) {JOptionPane.showMessageDialog(jbuttons[0],se+" in getcolumn&type");}
				String colname2 = new String("insert into "+tablename+"("+colname+") values(").replace("[","").replace("]","");
				////////////////getColumnValue/////////////
				for(int i = 0;i<coltype.size();i++){
					if(coltype.get(i)==4)
						colname2 = colname2+colval.get(i);
					else
						colname2 = colname2+"'"+colval.get(i)+"'";
					if(!(i+1 == coltype.size()))
						colname2 = colname2+",";
				
				} 
				colname2 = colname2+")";
				dblib.insUpdateData(colname2);
				JOptionPane.showMessageDialog(jbuttons[0],"Insertion Done");	
			}
			
		}
	    	///////////////////////////////////////update statement//////////////////////////////////////////////
	       	if(e.getActionCommand().equals("Show")) {
			new TSearch(tablename,labels);
	                // new UpdateAdmin().showGUI();
	        }        
	        ///////////////////////////////////////select statement//////////////////////////////////////////////
	        if(e.getActionCommand().equals("Search")) { 
		           new TSearch(tablename,labels);
	        }	
	    	///////////////////////////////////////cancel statement//////////////////////////////////////////////
	        if(e.getActionCommand().equals("Cancel")){
			   System.exit(0);
	         }
	 } 
}


