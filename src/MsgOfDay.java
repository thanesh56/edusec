import javax.swing.JInternalFrame;
class MsgOfDay {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Message Of Day Info","Details","User Type","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "msg_of_day";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
