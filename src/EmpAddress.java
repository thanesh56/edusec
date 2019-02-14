import javax.swing.JInternalFrame;
class EmpAddress {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Employee Address Form","Current Address","City","State","Country","Pincode","House No.","Phone No.","Permanet Address","City","State","Country","Pincode","House No.","Phone No."};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "emp_address";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
