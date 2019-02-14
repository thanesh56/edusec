import javax.swing.JInternalFrame;
class BankMaster {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Bank Master Form","Name","Alias","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "bank_master";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
	}
