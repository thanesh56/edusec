import javax.swing.JInternalFrame;
class StuAddress {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Student Address Form","Current Address","City","State","Country","Pincode","House No.","Phone No.","Permanet Address","City","State","Country","Pincode","House No.","Phone No."};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "stu_address";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
