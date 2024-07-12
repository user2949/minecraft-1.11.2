package net.minecraft.client.main;

import bkp.e;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.authlib.properties.PropertyMap.Serializer;
import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;

public class Main {
	public static void main(String[] arr) {
		OptionParser optionParser2 = new OptionParser();
		optionParser2.allowsUnrecognizedOptions();
		optionParser2.accepts("demo");
		optionParser2.accepts("fullscreen");
		optionParser2.accepts("checkGlErrors");
		OptionSpec<String> optionSpec3 = optionParser2.accepts("server").withRequiredArg();
		OptionSpec<Integer> optionSpec4 = optionParser2.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(25565, new Integer[0]);
		OptionSpec<File> optionSpec5 = optionParser2.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo(new File("."), new File[0]);
		OptionSpec<File> optionSpec6 = optionParser2.accepts("assetsDir").withRequiredArg().ofType(File.class);
		OptionSpec<File> optionSpec7 = optionParser2.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
		OptionSpec<String> optionSpec8 = optionParser2.accepts("proxyHost").withRequiredArg();
		OptionSpec<Integer> optionSpec9 = optionParser2.accepts("proxyPort").withRequiredArg().defaultsTo("8080", new String[0]).ofType(Integer.class);
		OptionSpec<String> optionSpec10 = optionParser2.accepts("proxyUser").withRequiredArg();
		OptionSpec<String> optionSpec11 = optionParser2.accepts("proxyPass").withRequiredArg();
		OptionSpec<String> optionSpec12 = optionParser2.accepts("username").withRequiredArg().defaultsTo("Player" + bes.I() % 1000L, new String[0]);
		OptionSpec<String> optionSpec13 = optionParser2.accepts("uuid").withRequiredArg();
		OptionSpec<String> optionSpec14 = optionParser2.accepts("accessToken").withRequiredArg().required();
		OptionSpec<String> optionSpec15 = optionParser2.accepts("version").withRequiredArg().required();
		OptionSpec<Integer> optionSpec16 = optionParser2.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo(854, new Integer[0]);
		OptionSpec<Integer> optionSpec17 = optionParser2.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo(480, new Integer[0]);
		OptionSpec<String> optionSpec18 = optionParser2.accepts("userProperties").withRequiredArg().defaultsTo("{}", new String[0]);
		OptionSpec<String> optionSpec19 = optionParser2.accepts("profileProperties").withRequiredArg().defaultsTo("{}", new String[0]);
		OptionSpec<String> optionSpec20 = optionParser2.accepts("assetIndex").withRequiredArg();
		OptionSpec<String> optionSpec21 = optionParser2.accepts("userType").withRequiredArg().defaultsTo("legacy", new String[0]);
		OptionSpec<String> optionSpec22 = optionParser2.accepts("versionType").withRequiredArg().defaultsTo("release", new String[0]);
		OptionSpec<String> optionSpec23 = optionParser2.nonOptions();
		OptionSet optionSet24 = optionParser2.parse(arr);
		List<String> list25 = optionSet24.valuesOf(optionSpec23);
		if (!list25.isEmpty()) {
			System.out.println("Completely ignored arguments: " + list25);
		}

		String string26 = (String)optionSet24.valueOf(optionSpec8);
		Proxy proxy27 = Proxy.NO_PROXY;
		if (string26 != null) {
			try {
				proxy27 = new Proxy(Type.SOCKS, new InetSocketAddress(string26, (Integer)optionSet24.valueOf(optionSpec9)));
			} catch (Exception var48) {
			}
		}

		final String string28 = (String)optionSet24.valueOf(optionSpec10);
		final String string29 = (String)optionSet24.valueOf(optionSpec11);
		if (!proxy27.equals(Proxy.NO_PROXY) && a(string28) && a(string29)) {
			Authenticator.setDefault(new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(string28, string29.toCharArray());
				}
			});
		}

		int integer30 = (Integer)optionSet24.valueOf(optionSpec16);
		int integer31 = (Integer)optionSet24.valueOf(optionSpec17);
		boolean boolean32 = optionSet24.has("fullscreen");
		boolean boolean33 = optionSet24.has("checkGlErrors");
		boolean boolean34 = optionSet24.has("demo");
		String string35 = (String)optionSet24.valueOf(optionSpec15);
		Gson gson36 = new GsonBuilder().registerTypeAdapter(PropertyMap.class, new Serializer()).create();
		PropertyMap propertyMap37 = ok.a(gson36, (String)optionSet24.valueOf(optionSpec18), PropertyMap.class);
		PropertyMap propertyMap38 = ok.a(gson36, (String)optionSet24.valueOf(optionSpec19), PropertyMap.class);
		String string39 = (String)optionSet24.valueOf(optionSpec22);
		File file40 = (File)optionSet24.valueOf(optionSpec5);
		File file41 = optionSet24.has(optionSpec6) ? (File)optionSet24.valueOf(optionSpec6) : new File(file40, "assets/");
		File file42 = optionSet24.has(optionSpec7) ? (File)optionSet24.valueOf(optionSpec7) : new File(file40, "resourcepacks/");
		String string43 = optionSet24.has(optionSpec13) ? (String)optionSpec13.value(optionSet24) : (String)optionSpec12.value(optionSet24);
		String string44 = optionSet24.has(optionSpec20) ? (String)optionSpec20.value(optionSet24) : null;
		String string45 = (String)optionSet24.valueOf(optionSpec3);
		Integer integer46 = (Integer)optionSet24.valueOf(optionSpec4);
		bez bez47 = new bez((String)optionSpec12.value(optionSet24), string43, (String)optionSpec14.value(optionSet24), (String)optionSpec21.value(optionSet24));
		bkp bkp48 = new bkp(
			new e(bez47, propertyMap37, propertyMap38, proxy27),
			new bkp.a(integer30, integer31, boolean32, boolean33),
			new bkp.b(file40, file42, file41, string44),
			new bkp.c(boolean34, string35, string39),
			new bkp.d(string45, integer46)
		);
		Runtime.getRuntime().addShutdownHook(new Thread("Client Shutdown Thread") {
			public void run() {
				bes.G();
			}
		});
		Thread.currentThread().setName("Client thread");
		new bes(bkp48).a();
	}

	private static boolean a(String string) {
		return string != null && !string.isEmpty();
	}
}
