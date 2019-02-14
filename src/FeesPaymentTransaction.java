import javax.swing.JInternalFrame;
class FeesPaymentTransaction {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Fees Payment Transaction Form","Collect Id","Student Id","Batch Id","Course Id","Section Id","Mode","Cheque No.","Cheque Date","Bank Id","Bank Branch","Amount","Date","Created At","Created By","Updated At","Updated By","Status"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "fees_payment_transaction";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
