package de.appwerft.realm;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;

@Kroll.module(name = "Tirealm", id = "de.appwerft.realm")
public class RealmModule extends KrollModule {
	private static final String LCAT = "Realm 🔆🔅🔆";
	private static final int DEFAULT_PORT = 8082;
	private static boolean sentAnalytics = false;

	public RealmModule() {
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
		TiApplication instance = TiApplication.getInstance();
		String ip = instance.getAppProperties().getString("OBJECT_SERVER_IP",
				"127.0.0.1");
		instance.getAppProperties().setString("AUTH_URL",
				"http://" + ip + ":9080/auth");
		instance.getAppProperties().setString("REALM_URL",
				"real://" + ip + ":9080/~/realmtasks");
	}
}
