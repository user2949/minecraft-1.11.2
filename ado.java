public class ado extends afs {
	public ado(alu alu) {
		super(alu, alu, new String[]{"intact", "slightlyDamaged", "veryDamaged"});
	}

	@Override
	public int a(int integer) {
		return integer << 2;
	}
}
