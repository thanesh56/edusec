import javax.swing.JInternalFrame;
class NationalHolidays {	
	public JInternalFrame showGUI() {
		String[] labels  = {"National HoliDay Form","Name","Date","Remarks","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "national_holidays";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
