
public class SpacedLogger implements Logger{

	@Override
	public void Log(String Log) {
		for(int i = 0;i < Log.length(); i++) {
			char a = Log.charAt(i);
			System.out.print(a + " ");
		}
			System.out.println();
	}

	@Override
	public void Error(String Error) {
		System.out.print("ERROR: ");
		for(int i = 0;i < Error.length(); i++) {
			char a = Error.charAt(i);
		System.out.print(a + " ");
		}
		System.out.println();
	}

}
