public class LZW {
	private ArrayList<String> table;
	private FileReader fr;

	public LZW(String fileName) {
		fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
	}

}
