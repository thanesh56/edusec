import javax.swing.JInternalFrame;
class StuStatus {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Student Status Info","Name","Description","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "stu_status";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
