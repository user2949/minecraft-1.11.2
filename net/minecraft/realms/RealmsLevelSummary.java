package net.minecraft.realms;

public class RealmsLevelSummary implements Comparable<RealmsLevelSummary> {
	private final bbz levelSummary;

	public RealmsLevelSummary(bbz bbz) {
		this.levelSummary = bbz;
	}

	public int getGameMode() {
		return this.levelSummary.f().a();
	}

	public String getLevelId() {
		return this.levelSummary.a();
	}

	public boolean hasCheats() {
		return this.levelSummary.h();
	}

	public boolean isHardcore() {
		return this.levelSummary.g();
	}

	public boolean isRequiresConversion() {
		return this.levelSummary.d();
	}

	public String getLevelName() {
		return this.levelSummary.b();
	}

	public long getLastPlayed() {
		return this.levelSummary.e();
	}

	public int compareTo(bbz bbz) {
		return this.levelSummary.a(bbz);
	}

	public long getSizeOnDisk() {
		return this.levelSummary.c();
	}

	public int compareTo(RealmsLevelSummary realmsLevelSummary) {
		if (this.levelSummary.e() < realmsLevelSummary.getLastPlayed()) {
			return 1;
		} else {
			return this.levelSummary.e() > realmsLevelSummary.getLastPlayed() ? -1 : this.levelSummary.a().compareTo(realmsLevelSummary.getLevelId());
		}
	}
}
