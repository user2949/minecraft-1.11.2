import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ol {
	public static final ListeningExecutorService a = MoreExecutors.listeningDecorator(
		Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Downloader %d").build())
	);
	private static final AtomicInteger b = new AtomicInteger(0);
	private static final Logger c = LogManager.getLogger();

	public static String a(Map<String, Object> map) {
		StringBuilder stringBuilder2 = new StringBuilder();

		for (Entry<String, Object> entry4 : map.entrySet()) {
			if (stringBuilder2.length() > 0) {
				stringBuilder2.append('&');
			}

			try {
				stringBuilder2.append(URLEncoder.encode((String)entry4.getKey(), "UTF-8"));
			} catch (UnsupportedEncodingException var6) {
				var6.printStackTrace();
			}

			if (entry4.getValue() != null) {
				stringBuilder2.append('=');

				try {
					stringBuilder2.append(URLEncoder.encode(entry4.getValue().toString(), "UTF-8"));
				} catch (UnsupportedEncodingException var5) {
					var5.printStackTrace();
				}
			}
		}

		return stringBuilder2.toString();
	}

	public static String a(URL uRL, Map<String, Object> map, boolean boolean3, @Nullable Proxy proxy) {
		return a(uRL, a(map), boolean3, proxy);
	}

	private static String a(URL uRL, String string, boolean boolean3, @Nullable Proxy proxy) {
		try {
			if (proxy == null) {
				proxy = Proxy.NO_PROXY;
			}

			HttpURLConnection httpURLConnection5 = (HttpURLConnection)uRL.openConnection(proxy);
			httpURLConnection5.setRequestMethod("POST");
			httpURLConnection5.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			httpURLConnection5.setRequestProperty("Content-Length", "" + string.getBytes().length);
			httpURLConnection5.setRequestProperty("Content-Language", "en-US");
			httpURLConnection5.setUseCaches(false);
			httpURLConnection5.setDoInput(true);
			httpURLConnection5.setDoOutput(true);
			DataOutputStream dataOutputStream6 = new DataOutputStream(httpURLConnection5.getOutputStream());
			dataOutputStream6.writeBytes(string);
			dataOutputStream6.flush();
			dataOutputStream6.close();
			BufferedReader bufferedReader7 = new BufferedReader(new InputStreamReader(httpURLConnection5.getInputStream()));
			StringBuffer stringBuffer9 = new StringBuffer();

			String string8;
			while ((string8 = bufferedReader7.readLine()) != null) {
				stringBuffer9.append(string8);
				stringBuffer9.append('\r');
			}

			bufferedReader7.close();
			return stringBuffer9.toString();
		} catch (Exception var9) {
			if (!boolean3) {
				c.error("Could not post to {}", new Object[]{uRL, var9});
			}

			return "";
		}
	}

	public static ListenableFuture<Object> a(File file, String string, Map<String, String> map, int integer, @Nullable ov ov, Proxy proxy) {
		return a.submit(new Runnable() {
			public void run() {
				HttpURLConnection httpURLConnection2 = null;
				InputStream inputStream3 = null;
				OutputStream outputStream4 = null;
				if (ov != null) {
					ov.b(dp.a("resourcepack.downloading"));
					ov.c(dp.a("resourcepack.requesting"));
				}

				try {
					byte[] arr5 = new byte[4096];
					URL uRL6 = new URL(string);
					httpURLConnection2 = (HttpURLConnection)uRL6.openConnection(proxy);
					httpURLConnection2.setInstanceFollowRedirects(true);
					float float7 = 0.0F;
					float float8 = (float)map.entrySet().size();

					for (Entry<String, String> entry10 : map.entrySet()) {
						httpURLConnection2.setRequestProperty((String)entry10.getKey(), (String)entry10.getValue());
						if (ov != null) {
							ov.a((int)(++float7 / float8 * 100.0F));
						}
					}

					inputStream3 = httpURLConnection2.getInputStream();
					float8 = (float)httpURLConnection2.getContentLength();
					int integer9 = httpURLConnection2.getContentLength();
					if (ov != null) {
						ov.c(dp.a("resourcepack.progress", String.format("%.2f", float8 / 1000.0F / 1000.0F)));
					}

					if (file.exists()) {
						long long10 = file.length();
						if (long10 == (long)integer9) {
							if (ov != null) {
								ov.a();
							}

							return;
						}

						ol.c.warn("Deleting {} as it does not match what we currently have ({} vs our {}).", new Object[]{file, integer9, long10});
						FileUtils.deleteQuietly(file);
					} else if (file.getParentFile() != null) {
						file.getParentFile().mkdirs();
					}

					outputStream4 = new DataOutputStream(new FileOutputStream(file));
					if (integer > 0 && float8 > (float)integer) {
						if (ov != null) {
							ov.a();
						}

						throw new IOException("Filesize is bigger than maximum allowed (file is " + float7 + ", limit is " + integer + ")");
					}

					while (true) {
						int integer10;
						if ((integer10 = inputStream3.read(arr5)) < 0) {
							if (ov != null) {
								ov.a();
							}

							return;
						}

						float7 += (float)integer10;
						if (ov != null) {
							ov.a((int)(float7 / float8 * 100.0F));
						}

						if (integer > 0 && float7 > (float)integer) {
							if (ov != null) {
								ov.a();
							}

							throw new IOException("Filesize was bigger than maximum allowed (got >= " + float7 + ", limit was " + integer + ")");
						}

						if (Thread.interrupted()) {
							ol.c.error("INTERRUPTED");
							if (ov != null) {
								ov.a();
							}
							break;
						}

						outputStream4.write(arr5, 0, integer10);
					}
				} catch (Throwable var16) {
					var16.printStackTrace();
					if (httpURLConnection2 != null) {
						InputStream inputStream6 = httpURLConnection2.getErrorStream();

						try {
							ol.c.error(IOUtils.toString(inputStream6));
						} catch (IOException var15) {
							var15.printStackTrace();
						}
					}

					if (ov != null) {
						ov.a();
					}

					return;
				} finally {
					IOUtils.closeQuietly(inputStream3);
					IOUtils.closeQuietly(outputStream4);
				}
			}
		});
	}

	public static int a() throws IOException {
		ServerSocket serverSocket1 = null;
		int integer2 = -1;

		try {
			serverSocket1 = new ServerSocket(0);
			integer2 = serverSocket1.getLocalPort();
		} finally {
			try {
				if (serverSocket1 != null) {
					serverSocket1.close();
				}
			} catch (IOException var8) {
			}
		}

		return integer2;
	}
}
