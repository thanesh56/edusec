import javax.swing.JInternalFrame;
class Users {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Registration Form","Login Id","Password","Type","Is Block","\
					Created At","Created By","Updated At","Updated By"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "users";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
