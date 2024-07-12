package net.minecraft.realms;

import com.google.common.collect.Lists;
import java.util.List;

public class RealmsAnvilLevelStorageSource {
	private final bby levelStorageSource;

	public RealmsAnvilLevelStorageSource(bby bby) {
		this.levelStorageSource = bby;
	}

	public String getName() {
		return this.levelStorageSource.a();
	}

	public boolean levelExists(String string) {
		return this.levelStorageSource.f(string);
	}

	public boolean convertLevel(String string, ov ov) {
		return this.levelStorageSource.a(string, ov);
	}

	public boolean requiresConversion(String string) {
		return this.levelStorageSource.b(string);
	}

	public boolean isNewLevelIdAcceptable(String string) {
		return this.levelStorageSource.d(string);
	}

	public boolean deleteLevel(String string) {
		return this.levelStorageSource.e(string);
	}

	public boolean isConvertible(String string) {
		return this.levelStorageSource.a(string);
	}

	public void renameLevel(String string1, String string2) {
		this.levelStorageSource.a(string1, string2);
	}

	public void clearAll() {
		this.levelStorageSource.d();
	}

	public List<RealmsLevelSummary> getLevelList() throws bbx {
		List<RealmsLevelSummary> list2 = Lists.newArrayList();

		for (bbz bbz4 : this.levelStorageSource.b()) {
			list2.add(new RealmsLevelSummary(bbz4));
		}

		return list2;
	}
}
