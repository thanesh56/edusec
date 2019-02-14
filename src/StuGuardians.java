import javax.swing.JInternalFrame;
class StuGuardians {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Student Guardians Form","Name","Relation","Mobile No.","Phone No.","Qualification","Occupation","Income","Email","Home Address","Office Address","Is Emg Contact","Master Id","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "stu_guardians";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
