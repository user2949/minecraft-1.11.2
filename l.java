import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface l extends Comparable<l> {
	String c();

	String b(n n);

	List<String> b();

	void a(MinecraftServer minecraftServer, n n, String[] arr) throws cd;

	boolean a(MinecraftServer minecraftServer, n n);

	List<String> a(MinecraftServer minecraftServer, n n, String[] arr, @Nullable co co);

	boolean b(String[] arr, int integer);
}
