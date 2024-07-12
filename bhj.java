public class bhj extends bho {
	@Override
	public void b() {
		this.n.clear();
		this.n.add(new bfz(0, this.l / 2 - 155, this.m / 4 + 120 + 12, cah.a("gui.toTitle")));
		this.n.add(new bfz(1, this.l / 2 - 155 + 160, this.m / 4 + 120 + 12, cah.a("menu.quit")));
	}

	@Override
	protected void a(bfm bfm) {
		if (bfm.k == 0) {
			this.j.a(new bhv());
		} else if (bfm.k == 1) {
			this.j.n();
		}
	}

	@Override
	protected void a(char character, int integer) {
	}

	@Override
	public void a(int integer1, int integer2, float float3) {
		this.c();
		this.a(this.q, "Out of memory!", this.l / 2, this.m / 4 - 60 + 20, 16777215);
		this.c(this.q, "Minecraft has run out of memory.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 0, 10526880);
		this.c(this.q, "This could be caused by a bug in the game or by the", this.l / 2 - 140, this.m / 4 - 60 + 60 + 18, 10526880);
		this.c(this.q, "Java Virtual Machine not being allocated enough", this.l / 2 - 140, this.m / 4 - 60 + 60 + 27, 10526880);
		this.c(this.q, "memory.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 36, 10526880);
		this.c(this.q, "To prevent level corruption, the current game has quit.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 54, 10526880);
		this.c(this.q, "We've tried to free up enough memory to let you go back to", this.l / 2 - 140, this.m / 4 - 60 + 60 + 63, 10526880);
		this.c(this.q, "the main menu and back to playing, but this may not have worked.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 72, 10526880);
		this.c(this.q, "Please restart the game if you see this message again.", this.l / 2 - 140, this.m / 4 - 60 + 60 + 81, 10526880);
		super.a(integer1, integer2, float3);
	}
}
