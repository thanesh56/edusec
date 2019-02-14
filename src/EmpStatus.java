import javax.swing.JInternalFrame;
class EmpStatus {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Employee Status Info","Name","Description","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "emp_status";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
