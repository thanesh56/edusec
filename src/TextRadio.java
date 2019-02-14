import javax.swing.JInternalFrame;
class TextRadio {	
	public JInternalFrame showGUI() {
		String[] labels  = {"Registration Form","Gender"};
		String[] btns = {"Insert","Search","Cancel"};
		String tablename = "text_radio";
		return new TFrame().showTFrame(tablename,btns,labels);
	}
}
