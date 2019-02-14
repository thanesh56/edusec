import javax.swing.JInternalFrame;
class Notice {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Notice Form","Title","Description","User Type","Date","File Path","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "notice";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
